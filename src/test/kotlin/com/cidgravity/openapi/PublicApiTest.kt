package com.cidgravity.openapi

import com.cidgravity.service.ALL_SERVICES
import com.cidgravity.shared.Util
import io.quarkus.test.junit.QuarkusTest
import io.swagger.v3.oas.models.security.SecurityScheme
import org.junit.jupiter.api.Test

@QuarkusTest
class PublicApiTest {
    @Test
    fun testPublicEndpointsAreProtectedByApiKey() {
        for (service in ALL_SERVICES) {
            for (endpoint in service.getEndpoints(Util.VisibilityEnum.PUBLIC)) {
                val securityTypes = endpoint.securities.map { security -> security.type }
                assert(securityTypes.contains(SecurityScheme.Type.APIKEY))
            }
        }
    }
}