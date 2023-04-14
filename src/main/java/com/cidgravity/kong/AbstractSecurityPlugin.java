package com.cidgravity.kong;

import com.cidgravity.kong.generated.FPlugin;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_EMPTY)
abstract public class AbstractSecurityPlugin extends FPlugin {
}
