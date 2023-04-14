
package com.cidgravity.kong.generated;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "healthy",
        "type",
        "unhealthy"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class PassiveHealthcheck {

    @JsonProperty("healthy")
    private Healthy healthy;
    @JsonProperty("type")
    private String type;
    @JsonProperty("unhealthy")
    private Unhealthy unhealthy;

    @JsonProperty("healthy")
    public Healthy getHealthy() {
        return healthy;
    }

    @JsonProperty("healthy")
    public void setHealthy(Healthy healthy) {
        this.healthy = healthy;
    }

    public PassiveHealthcheck withHealthy(Healthy healthy) {
        this.healthy = healthy;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public PassiveHealthcheck withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("unhealthy")
    public Unhealthy getUnhealthy() {
        return unhealthy;
    }

    @JsonProperty("unhealthy")
    public void setUnhealthy(Unhealthy unhealthy) {
        this.unhealthy = unhealthy;
    }

    public PassiveHealthcheck withUnhealthy(Unhealthy unhealthy) {
        this.unhealthy = unhealthy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PassiveHealthcheck.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("healthy");
        sb.append('=');
        sb.append(((this.healthy == null) ? "<null>" : this.healthy));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("unhealthy");
        sb.append('=');
        sb.append(((this.unhealthy == null) ? "<null>" : this.unhealthy));
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
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.healthy == null) ? 0 : this.healthy.hashCode()));
        result = ((result * 31) + ((this.unhealthy == null) ? 0 : this.unhealthy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PassiveHealthcheck) == false) {
            return false;
        }
        PassiveHealthcheck rhs = ((PassiveHealthcheck) other);
        return ((((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))
                && ((this.healthy == rhs.healthy) || ((this.healthy != null) && this.healthy.equals(rhs.healthy))))
                && ((this.unhealthy == rhs.unhealthy) || ((this.unhealthy != null) && this.unhealthy.equals(rhs.unhealthy))));
    }

}
