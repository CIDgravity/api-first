package com.cidgravity.gateway

import com.cidgravity.kong.*

/**
 * For now, OAuth2 security is handled directly by services behind Kong
 * The reason is, the plugin to handle them in Kong is proprietary
 */
object KongSecurity {
    fun apiKey(): ApiKeySecurityPlugin {
        return ApiKeySecurityPlugin()
            .withConfig(
                ApiKeySecurityConfig()
            )

    }

    fun jwt(): AbstractSecurityPlugin {
        return JwtSecurityPlugin()
            .withConfig(
                JwtSecurityConfig()
                    .addClaimToVerify("exp")
            )
    }

}