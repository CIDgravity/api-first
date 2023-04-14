
package com.cidgravity.kong.generated;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "active",
        "passive",
        "threshold"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class Healthcheck {

    @JsonProperty("active")
    private ActiveHealthcheck active;
    @JsonProperty("passive")
    private PassiveHealthcheck passive;
    @JsonProperty("threshold")
    private Double threshold;

    @JsonProperty("active")
    public ActiveHealthcheck getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(ActiveHealthcheck active) {
        this.active = active;
    }

    public Healthcheck withActive(ActiveHealthcheck active) {
        this.active = active;
        return this;
    }

    @JsonProperty("passive")
    public PassiveHealthcheck getPassive() {
        return passive;
    }

    @JsonProperty("passive")
    public void setPassive(PassiveHealthcheck passive) {
        this.passive = passive;
    }

    public Healthcheck withPassive(PassiveHealthcheck passive) {
        this.passive = passive;
        return this;
    }

    @JsonProperty("threshold")
    public Double getThreshold() {
        return threshold;
    }

    @JsonProperty("threshold")
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public Healthcheck withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Healthcheck.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null) ? "<null>" : this.active));
        sb.append(',');
        sb.append("passive");
        sb.append('=');
        sb.append(((this.passive == null) ? "<null>" : this.passive));
        sb.append(',');
        sb.append("threshold");
        sb.append('=');
        sb.append(((this.threshold == null) ? "<null>" : this.threshold));
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
        result = ((result * 31) + ((this.active == null) ? 0 : this.active.hashCode()));
        result = ((result * 31) + ((this.threshold == null) ? 0 : this.threshold.hashCode()));
        result = ((result * 31) + ((this.passive == null) ? 0 : this.passive.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Healthcheck) == false) {
            return false;
        }
        Healthcheck rhs = ((Healthcheck) other);
        return ((((this.active == rhs.active) || ((this.active != null) && this.active.equals(rhs.active)))
                && ((this.threshold == rhs.threshold) || ((this.threshold != null) && this.threshold.equals(rhs.threshold))))
                && ((this.passive == rhs.passive) || ((this.passive != null) && this.passive.equals(rhs.passive))));
    }

}
