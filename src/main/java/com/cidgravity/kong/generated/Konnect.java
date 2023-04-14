
package com.cidgravity.kong.generated;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "runtime_group_name"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class Konnect {

    @JsonProperty("runtime_group_name")
    private String runtime_group_name;

    @JsonProperty("runtime_group_name")
    public String getRuntime_group_name() {
        return runtime_group_name;
    }

    @JsonProperty("runtime_group_name")
    public void setRuntime_group_name(String runtime_group_name) {
        this.runtime_group_name = runtime_group_name;
    }

    public Konnect withRuntime_group_name(String runtime_group_name) {
        this.runtime_group_name = runtime_group_name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Konnect.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("runtime_group_name");
        sb.append('=');
        sb.append(((this.runtime_group_name == null) ? "<null>" : this.runtime_group_name));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.runtime_group_name == null) ? 0 : this.runtime_group_name.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Konnect) == false) {
            return false;
        }
        Konnect rhs = ((Konnect) other);
        return ((this.runtime_group_name == rhs.runtime_group_name)
                || ((this.runtime_group_name != null) && this.runtime_group_name.equals(rhs.runtime_group_name)));
    }

}
