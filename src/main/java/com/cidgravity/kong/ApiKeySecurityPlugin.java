package com.cidgravity.kong;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ApiKeySecurityPlugin extends AbstractSecurityPlugin {
    public ApiKeySecurityPlugin() {
        this.setName("key-auth");
    }

    public ApiKeySecurityPlugin withConfig(ApiKeySecurityConfig config) {
        this.setConfig(config);
        return this;
    }
}
