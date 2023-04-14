package com.cidgravity.shared

import com.cidgravity.gateway.KongSecurity
import com.cidgravity.kong.AbstractSecurityPlugin
import com.cidgravity.openapi.shared.*
import io.swagger.v3.oas.models.PathItem
import io.swagger.v3.oas.models.PathItem.HttpMethod
import io.swagger.v3.oas.models.security.SecurityScheme
import kotlin.io.path.Path
import kotlin.io.path.pathString

object Util {

    enum class VisibilityEnum {
        PUBLIC,
        FRONTEND,
        INTERNAL
    }

    /**
     * @param type JWT (oauth2) or apiKey
     * @param publicOpenApiSecurities openapi securities that will be used to generate the public openapi (see [com.cidgravity.openapi.PublicApi.get])
     * @param internalOpenApiSecurities openapi securities that will be used to generate the internal openapi (see [com.cidgravity.service.IService.getApi])
     * @param kongSecurities Kong (api gateway) securities that will be used to generate the kong description file (see [com.cidgravity.gateway.KongApi.get])
     */
    data class StandardSecurity(
        val type: SecurityScheme.Type,
        val publicOpenApiSecurities: Set<SecuritySchemeParams>, // AND operator applied between them
        val frontendOpenApiSecurities: Set<SecuritySchemeParams>, // AND operator applied between them
        val internalOpenApiSecurities: Set<SecuritySchemeParams>, // AND operator applied between them
        val kongSecurities: Set<AbstractSecurityPlugin> // AND operator applied between them

    ) {
        /**
         * Important as it is used in a set and as key in a map
         */
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as StandardSecurity

            if (type != other.type) return false

            return true
        }

        /**
         * Important as it is used in a set and as key in a map
         */
        override fun hashCode(): Int {
            return type.hashCode()
        }
    }

    val apiKeySecurity = StandardSecurity(
        type = SecurityScheme.Type.APIKEY,
        publicOpenApiSecurities = setOf(ApiSecurity.apiKey()),
        frontendOpenApiSecurities = setOf(),
        kongSecurities = setOf(KongSecurity.apiKey()),
        internalOpenApiSecurities = setOf(ApiSecurity.xAddressIdHeader())
    )

    fun oauth2Security(): StandardSecurity {
        return StandardSecurity(
            type = SecurityScheme.Type.OAUTH2,
            publicOpenApiSecurities = setOf(),
            frontendOpenApiSecurities = setOf(ApiSecurity.oauth2()),
            kongSecurities = setOf(KongSecurity.jwt()),
            internalOpenApiSecurities = setOf()
        )
    }

    fun getPrefixedPath(pathName: String, type: SecurityScheme.Type): String {
        val prefix = getPathPrefix(type)
        return Path(
            prefix,
            pathName
        ).pathString
    }

    private fun getPathPrefix(type: SecurityScheme.Type): String {
        val prefix = when (type) {
            SecurityScheme.Type.APIKEY -> "/api"
            SecurityScheme.Type.OAUTH2 -> "/jwt"
            SecurityScheme.Type.HTTP -> TODO()
            SecurityScheme.Type.OPENIDCONNECT -> TODO()
            SecurityScheme.Type.MUTUALTLS -> TODO()
        }
        return prefix
    }

    /* default is private */
    class StandardEndpoint(
        val path: String,
        val openapiPath: PathItem,
        val securities: Set<StandardSecurity>,
        val isExposedToFrontend: Boolean = securities.map { security -> security.type }
            .contains(SecurityScheme.Type.OAUTH2),
        val isPublic: Boolean = false,
    ) {

        val methods: MutableList<HttpMethod> = mutableListOf()
        // Default to exposition to frontend is if the endpoint is protected by oauth2

        fun addFields(visibilityEnum: VisibilityEnum): StandardEndpoint {
            return when (visibilityEnum) {
                VisibilityEnum.PUBLIC -> StandardEndpoint(
                    path = this.path,
                    openapiPath = this.openapiPath
                        .clone()
                        .addSecurities(
                            securities
                                .map { security -> security.publicOpenApiSecurities }.toSet()
                        )
                        .addCodeSamples(path),
                    securities = this.securities,
                    isExposedToFrontend = this.isExposedToFrontend,
                    isPublic = this.isPublic
                )

                VisibilityEnum.FRONTEND ->
                    StandardEndpoint(
                        path = this.path,
                        openapiPath = this.openapiPath
                            .clone()
                            .addSecurities(
                                securities
                                    .map { security -> security.frontendOpenApiSecurities }.toSet()
                            ),
                        securities = this.securities,
                        isExposedToFrontend = this.isExposedToFrontend,
                        isPublic = this.isPublic
                    )

                VisibilityEnum.INTERNAL ->
                    StandardEndpoint(
                        path = this.path,
                        openapiPath = this.openapiPath
                            .clone()
                            .addSecurities(securities.map { security -> security.internalOpenApiSecurities }.toSet()),
                        securities = this.securities,
                        isExposedToFrontend = this.isExposedToFrontend,
                        isPublic = this.isPublic
                    )
            }
        }

        init {
            this.validate()
            if (openapiPath.post != null) {
                this.methods.add(HttpMethod.POST)
            }
            if (openapiPath.get != null) {
                this.methods.add(HttpMethod.GET)
            }
            if (openapiPath.put != null) {
                this.methods.add(HttpMethod.PUT)
            }
            if (openapiPath.patch != null) {
                this.methods.add(HttpMethod.PATCH)
            }
            if (openapiPath.patch != null) {
                this.methods.add(HttpMethod.PATCH)
            }
            if (openapiPath.delete != null) {
                this.methods.add(HttpMethod.DELETE)
            }
            if (openapiPath.head != null) {
                this.methods.add(HttpMethod.HEAD)
            }
            if (openapiPath.options != null) {
                this.methods.add(HttpMethod.OPTIONS)
            }
            if (openapiPath.trace != null) {
                this.methods.add(HttpMethod.TRACE)
            }
        }

        private fun validate() {
            if (this.securities.isEmpty()) throw IllegalArgumentException("securities cannot be null")
        }
    }

}