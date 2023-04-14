package com.cidgravity.service

import com.cidgravity.openapi.shared.V1
import com.cidgravity.shared.Util
import com.cidgravity.shared.Util.StandardEndpoint
import io.swagger.v3.oas.models.PathItem
import java.net.URL

object AppService : IService() {
    override val id: String = "app"
    override val servers: List<URL> = listOf(
        URL("https://app.example.com")
    )
    override val endpoints: List<StandardEndpoint> = listOf(
        StandardEndpoint(
            path = "/front/${V1}/getFooByName",
            openapiPath = getFooByName(),
            isPublic = true,
            isExposedToFrontend = true,
            securities = setOf(Util.oauth2Security(withXAddressIdHeader = true))
        )
    )

    private fun getFooByName(): PathItem {
        return PathItem()
    }
}
