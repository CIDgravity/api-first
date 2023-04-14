package com.cidgravity.openapi

import com.cidgravity.openapi.shared.*
import com.cidgravity.service.ALL_SERVICES
import com.cidgravity.shared.Util
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.SpecVersion
import io.swagger.v3.oas.models.info.Info

object FrontendApi : IApi {

    override val associatedServices = ALL_SERVICES.filter { service -> service.hasEndpointsExposedToFrontend() }

    override fun get(): OpenAPI? {
        if (associatedServices.isEmpty()) {
            return null
        }
        var openApi =
            OpenAPI()
                .specVersion(SpecVersion.V31)
                .info(
                    Info()
                        .title("Frontend API")
                        .version(OPENAPI_VERSION)
                        .description("This is the frontend API")
                        .contact(CONTACT)
                        .license(PROPRIETARY_LICENSE)
                        .termsOfService(TERMS_OF_SERVICE)
                )
                .servers(
                    listOf(
                        API_GATEWAY_SERVER
                    )
                )
        for (service in associatedServices) {
            openApi = openApi.addSecurityRequirements(service.getSecuritySchemes(Util.VisibilityEnum.FRONTEND))
            for ((key, schemasItem) in service.getSchemas(Util.VisibilityEnum.FRONTEND)) {
                openApi = openApi.addSchema(key, schemasItem)
            }
            for ((name, path) in service.getPaths(Util.VisibilityEnum.FRONTEND)) {
                openApi = openApi.addPath(name, path)
            }
        }
        return openApi
    }
}
