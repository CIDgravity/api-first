package com.cidgravity.openapi.shared

import com.cidgravity.kong.ApiKeySecurityConfig
import io.swagger.v3.oas.models.security.OAuthFlow
import io.swagger.v3.oas.models.security.OAuthFlows
import io.swagger.v3.oas.models.security.Scopes
import io.swagger.v3.oas.models.security.SecurityScheme

/**
 * @see [com.cidgravity.openapi.service.IService.getApi]
 */
data class SecuritySchemeParams(
    val KEY: String,
    val SECURITY_SCHEME: SecurityScheme
)

object ApiSecurity {

    fun apiKey(): SecuritySchemeParams {
        val securityScheme =
            SecurityScheme()
                .type(SecurityScheme.Type.APIKEY)
                .`in`(SecurityScheme.In.HEADER)
                .name(ApiKeySecurityConfig.KEY_NAME)
        return SecuritySchemeParams(
            "ApiKeyAuth",
            securityScheme
        )
    }

    /**
     * TODO: test this with Auth0 & make URL configurable by environment
     * For now we don't really use this to generate frontend
     * It's only important for the gateway extensions for the api-gateway
     */
    fun oauth2(): SecuritySchemeParams {
        val securityScheme =
            SecurityScheme()
                .type(SecurityScheme.Type.OAUTH2)
                .flows(
                    OAuthFlows()
                        .authorizationCode(
                            OAuthFlow()
                                .authorizationUrl("https://example.com/oauth/authorize")
                                .tokenUrl("https://example.com/oauth/token")
                                .scopes(
                                    Scopes()
                                        .addString("read", "Grants read access")
                                        .addString("write", "Grants write access")
                                        .addString("admin", "Grants admin access")
                                        .addString("openid", "Open Id Connect")
                                )
                        )
                )
        return SecuritySchemeParams(
            "OAuth2",
            securityScheme
        )

    }

    fun xAddressIdHeader(): SecuritySchemeParams {
        val securityScheme =
            SecurityScheme()
                .type(SecurityScheme.Type.APIKEY)
                .`in`(SecurityScheme.In.HEADER)
                .name("X-Address-ID")
        return SecuritySchemeParams(
            "XAddressID",
            securityScheme
        )
    }
}