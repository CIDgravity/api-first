package com.cidgravity.service

import com.cidgravity.openapi.shared.*
import com.cidgravity.shared.Util
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.PathItem
import io.swagger.v3.oas.models.SpecVersion
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.media.Schema
import io.swagger.v3.oas.models.security.SecurityScheme
import io.swagger.v3.oas.models.servers.Server
import java.net.URL

// IMPORTANT: register new services here, or they will be ignored
val ALL_SERVICES = listOf<IService>(SomeService)

// not-so-micro service
abstract class IService {

    /** IMPORTANT:
     * - must be UNIQUE across all the services: see [com.cidgravity.openapi.service.IServiceTest.testIDsAreUnique]
     * - there are forbidden ids: see [com.cidgravity.openapi.service.IServiceTest.testForbiddenIDs]
     **/
    abstract val id: String

    /**
     * true, if at least one route is public. Every public route must be protected by apiKey
     * @see [com.cidgravity.openapi.PublicApiTest.testPublicEndpointsAreProtectedByApiKey]
     */
    fun hasPublicEndpoints(): Boolean {
        return this.getEndpoints(Util.VisibilityEnum.PUBLIC).isNotEmpty()
    }

    fun hasEndpointsExposedToFrontend(): Boolean {
        return this.getEndpoints(Util.VisibilityEnum.FRONTEND).isNotEmpty()
    }

    // underlying host(s) that will ultimately receive the service requests
    // this may be different depending on dev/staging/prod
    // ends up in "server" in openapi and "targets" of upstream in kong
    // this isn't very important because it's set elsewhere by the infra team
    // it could be done via Gradle Environment and CI/CD environment variables but whatever
    abstract val servers: List<URL>

    abstract val endpoints: List<Util.StandardEndpoint>
    fun getEndpoints(visibilityEnum: Util.VisibilityEnum): List<Util.StandardEndpoint> {
        return when (visibilityEnum) {
            Util.VisibilityEnum.PUBLIC -> this.endpoints.filter { endpoint -> endpoint.isPublic }
                .map { endpoint -> endpoint.addFields(Util.VisibilityEnum.PUBLIC) }

            Util.VisibilityEnum.FRONTEND -> this.endpoints.filter { endpoint -> endpoint.isExposedToFrontend }
                .map { endpoint -> endpoint.addFields(Util.VisibilityEnum.FRONTEND) }

            Util.VisibilityEnum.INTERNAL -> this.endpoints.map { endpoint ->
                endpoint.addFields(
                    Util.VisibilityEnum.INTERNAL,
                )
            }
        }
    }

    /**
     * Return all the security schemes used in this service
     */
    fun getSecuritySchemes(visibilityEnum: Util.VisibilityEnum): Set<SecuritySchemeParams> {
        val endpoints = this.getEndpoints(visibilityEnum)
        val securitySchemes = mutableSetOf<SecuritySchemeParams>()
        for (endpoint in endpoints) {
            for (security in endpoint.securities) {
                when (visibilityEnum) {
                    Util.VisibilityEnum.PUBLIC -> securitySchemes.addAll(security.publicOpenApiSecurities)
                    Util.VisibilityEnum.FRONTEND -> securitySchemes.addAll(security.frontendOpenApiSecurities)
                    Util.VisibilityEnum.INTERNAL -> securitySchemes.addAll(security.internalOpenApiSecurities)
                }
            }
        }
        return securitySchemes
    }

    fun getSchemas(visibilityEnum: Util.VisibilityEnum): List<Pair<String, Schema<*>?>> {
        val schemas =
            this.getEndpoints(visibilityEnum).map { endpoint -> endpoint.openapiPath.getUsedSchemas() }.flatten()
        return schemas.map { schema ->
            Pair(schema.`$ref`.takeLastWhile { it != '/' }, cloneSchema(schema).`$ref`(null))
        }
    }

    private fun getOpenApiServers(): List<Server> {
        return servers.map { server -> Server().url(server.toString()) }
    }

    /**
     * For Kong
     * An endpoint is assigned to one or many securities.
     * WARNING: This algorithm isn't designed to handle the case when there is no security. We do not support endpoints with no security at the moment.
     * @see [com.cidgravity.service.IServiceTest.testAtLeastOneSecurityPerEndpoint]
     */
    fun getEndpointsBySecurities(): Map<Util.StandardSecurity, List<Util.StandardEndpoint>> {
        val endpointsBySecurities = mutableMapOf<Util.StandardSecurity, MutableList<Util.StandardEndpoint>>()
        this.endpoints.forEach { endpoint ->
            val securities = endpoint.securities
            assert(securities.isNotEmpty())
            for (security in securities) {
                val listOfEndpoints: MutableList<Util.StandardEndpoint>? = endpointsBySecurities[security]
                if (listOfEndpoints != null) {
                    listOfEndpoints.add(endpoint)
                } else {
                    endpointsBySecurities[security] = mutableListOf(endpoint)
                }
            }
        }
        return endpointsBySecurities
    }

    fun getPaths(visibilityEnum: Util.VisibilityEnum): List<Pair<String, PathItem>> {
        val paths = mutableListOf<Pair<String, PathItem>>()
        val visibleEndpoints = this.getEndpoints(visibilityEnum)
        when(visibilityEnum) {
            Util.VisibilityEnum.PUBLIC ->
                for(endpoint in visibleEndpoints) {
                    paths.add(
                        Pair(
                            Util.getPrefixedPath(endpoint.path, SecurityScheme.Type.APIKEY),
                            endpoint.openapiPath
                        )
                    )
                }
            Util.VisibilityEnum.FRONTEND ->
                for(endpoint in visibleEndpoints) {
                    paths.add(
                        Pair(
                            Util.getPrefixedPath(endpoint.path, SecurityScheme.Type.OAUTH2),
                            endpoint.openapiPath
                        )
                    )
                }

            Util.VisibilityEnum.INTERNAL ->
                for (endpoint in visibleEndpoints) {
                    for (security in endpoint.securities) {
                        paths.add(
                            Pair(
                                Util.getPrefixedPath(endpoint.path, security.type),
                                endpoint.openapiPath
                            )
                        )
                    }
                }

        }
        return paths
    }

    /** Get the service's OpenAPI.
     * @param withSecurity Use `withSecurity=[com.cidgravity.openapi.shared.SecurityEnum.NONE]` for generating the server stub of the service behind the gateway
     * because, it does not need to contain any security definitions, except for X-Address-ID
     * @see [com.cidgravity.openapi.shared.SecurityEnum]
     **/
    fun getApi(): OpenAPI {
        var openApi = OpenAPI()
            .specVersion(SpecVersion.V31)
            .info(
                Info()
                    .title("CIDgravity '$id' service's OpenAPI")
                    .version(OPENAPI_VERSION)
                    .description(
                        """
                            |This is the CIDgravity '$id' service's API without security definition (except for X-Address-ID). 
                            |It is aimed to be consumed by generators to generate the server's stub.
                            |The service is behind an api gateway that is supposed to have handled security already.
                            |""".trimMargin()
                    )
                    .contact(CONTACT)
                    .license(PROPRIETARY_LICENSE)
            )
            .servers(
                getOpenApiServers()
            )
        openApi = openApi.addSecurityRequirements(getSecuritySchemes(Util.VisibilityEnum.INTERNAL))
        for ((key, schemasItem) in getSchemas(Util.VisibilityEnum.INTERNAL)) {
            openApi = openApi.addSchema(key, schemasItem)
        }
        for ((name, path) in getPaths(Util.VisibilityEnum.INTERNAL)) {
            openApi = openApi.addPath(name, path)
        }
        return openApi
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as IService

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}
