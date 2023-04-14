package com.cidgravity.openapi

import com.cidgravity.openapi.shared.*
import com.cidgravity.service.ALL_SERVICES
import com.cidgravity.shared.Util
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.SpecVersion
import io.swagger.v3.oas.models.info.Info

object PublicApi : IApi {

    override val associatedServices = ALL_SERVICES.filter { service -> service.hasPublicEndpoints() }

    override fun get(): OpenAPI? {
        if (associatedServices.isEmpty()) {
            return null
        }
        var openApi =
            OpenAPI()
                .specVersion(SpecVersion.V31)
                .info(
                    Info()
                        .title("Public API")
                        .version(OPENAPI_VERSION)
                        .description("This is the public API")
                        .contact(CONTACT)
                        .license(OSS_LICENSE)
                        .termsOfService(TERMS_OF_SERVICE)
                        .addXLogo()
                )
                .servers(
                    listOf(
                        API_GATEWAY_SERVER
                    )
                )
        for (service in associatedServices) {
            openApi = openApi.addSecurityRequirements(service.getSecuritySchemes(Util.VisibilityEnum.PUBLIC))
            for ((key, schemasItem) in service.getSchemas(Util.VisibilityEnum.PUBLIC)) {
                openApi = openApi.addSchema(key, schemasItem)
            }
            for ((name, path) in service.getPaths(Util.VisibilityEnum.PUBLIC)) {
                openApi = openApi.addPath(name, path)
            }
        }
        return openApi
    }
}
