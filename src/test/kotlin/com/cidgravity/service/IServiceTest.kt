package com.cidgravity.service

import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Test

@QuarkusTest
class IServiceTest {

    @Test
    fun testIDsAreUnique() {
        val allServicesHaveUniqueID = ALL_SERVICES.toSet().size == ALL_SERVICES.size
        assert(allServicesHaveUniqueID)
    }

    @Test
    fun testForbiddenIDs() {
        val forbiddenIDs = listOf("all", "public", "kong", "gateway", "api-gateway", "all", "frontend", "front")
        val serviceWithForbiddenID = ALL_SERVICES.find { service -> service.id in forbiddenIDs }
        assert(serviceWithForbiddenID == null) // no service has one of the forbidden id
    }

    @Test
    fun testAllPathsAreUnique() {
        val allEndpoints = ALL_SERVICES.map { service ->
            service.endpoints.map { endpoint -> endpoint.path }
        }.flatten()
        val allEndpointsAreUnique = allEndpoints.toSet().size == allEndpoints.size
        assert(allEndpointsAreUnique)
    }

    @Test
    fun testAtLeastOneSecurityPerEndpoint() {
        val allEndpoints = ALL_SERVICES.map { service -> service.endpoints }.flatten()
        val allSecuritiesPerEndpoints = allEndpoints.map { endpoint -> endpoint.securities }
        for (securities in allSecuritiesPerEndpoints) {
            assert(securities.isNotEmpty())
        }
    }

}