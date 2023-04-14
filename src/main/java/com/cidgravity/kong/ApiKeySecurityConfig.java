package com.cidgravity.kong;

import java.util.Collections;
import java.util.List;

import com.cidgravity.kong.generated.Config;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * See <a href="https://docs.konghq.com/hub/kong-inc/key-auth/">kong plugin documentation</a>.
 */
@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "key_names",
})
public class ApiKeySecurityConfig extends Config {

    public static String KEY_NAME = "X-API-KEY";

    @JsonProperty("key_names")
    private List<String> keyNames;

    public ApiKeySecurityConfig() {
        this.setKeyNames(Collections.singletonList(KEY_NAME));
    }

    public ApiKeySecurityConfig withKeyNames(List<String> keyNames) {
        this.setKeyNames(keyNames);
        return this;
    }

    public List<String> getKeyNames() {
        return keyNames;
    }

    public void setKeyNames(List<String> keyNames) {
        this.keyNames = keyNames;
    }
}
