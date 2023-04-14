package com.cidgravity.kong;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class JwtSecurityPlugin extends AbstractSecurityPlugin {
    public JwtSecurityPlugin() {
        this.setName("jwt");
    }

    public JwtSecurityPlugin withConfig(JwtSecurityConfig config) {
        this.setConfig(config);
        return this;
    }
}
