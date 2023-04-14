package com.cidgravity.kong;

import java.util.HashSet;
import java.util.Set;

import com.cidgravity.kong.generated.Config;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "key_names",
})
public class JwtSecurityConfig extends Config {
    @JsonProperty("claims_to_verify")
    private Set<String> claimsToVerify;

    public JwtSecurityConfig withClaimsToVerify(Set<String> claimsToVerify) {
        this.claimsToVerify = claimsToVerify;
        return this;
    }

    public JwtSecurityConfig addClaimToVerify(String claimToVerify) {
        if (this.claimsToVerify == null) {
            this.claimsToVerify = new HashSet<>();
        }
        this.claimsToVerify.add(claimToVerify);
        return this;
    }

    public Set<String> getClaimsToVerify() {
        return claimsToVerify;
    }

    public void setClaimsToVerify(Set<String> claimsToVerify) {
        this.claimsToVerify = claimsToVerify;
    }
}
