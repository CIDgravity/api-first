
package com.cidgravity.kong.generated;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "route",
        "service",
        "target",
        "upstream"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class KongDefaults {

    @JsonProperty("route")
    private Route route;
    @JsonProperty("service")
    private Service service;
    @JsonProperty("target")
    private Target target;
    @JsonProperty("upstream")
    private Upstream upstream;

    @JsonProperty("route")
    public Route getRoute() {
        return route;
    }

    @JsonProperty("route")
    public void setRoute(Route route) {
        this.route = route;
    }

    public KongDefaults withRoute(Route route) {
        this.route = route;
        return this;
    }

    @JsonProperty("service")
    public Service getService() {
        return service;
    }

    @JsonProperty("service")
    public void setService(Service service) {
        this.service = service;
    }

    public KongDefaults withService(Service service) {
        this.service = service;
        return this;
    }

    @JsonProperty("target")
    public Target getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(Target target) {
        this.target = target;
    }

    public KongDefaults withTarget(Target target) {
        this.target = target;
        return this;
    }

    @JsonProperty("upstream")
    public Upstream getUpstream() {
        return upstream;
    }

    @JsonProperty("upstream")
    public void setUpstream(Upstream upstream) {
        this.upstream = upstream;
    }

    public KongDefaults withUpstream(Upstream upstream) {
        this.upstream = upstream;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KongDefaults.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("route");
        sb.append('=');
        sb.append(((this.route == null) ? "<null>" : this.route));
        sb.append(',');
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null) ? "<null>" : this.service));
        sb.append(',');
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null) ? "<null>" : this.target));
        sb.append(',');
        sb.append("upstream");
        sb.append('=');
        sb.append(((this.upstream == null) ? "<null>" : this.upstream));
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
        result = ((result * 31) + ((this.route == null) ? 0 : this.route.hashCode()));
        result = ((result * 31) + ((this.upstream == null) ? 0 : this.upstream.hashCode()));
        result = ((result * 31) + ((this.service == null) ? 0 : this.service.hashCode()));
        result = ((result * 31) + ((this.target == null) ? 0 : this.target.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KongDefaults) == false) {
            return false;
        }
        KongDefaults rhs = ((KongDefaults) other);
        return (((((this.route == rhs.route) || ((this.route != null) && this.route.equals(rhs.route)))
                && ((this.upstream == rhs.upstream) || ((this.upstream != null) && this.upstream.equals(rhs.upstream))))
                && ((this.service == rhs.service) || ((this.service != null) && this.service.equals(rhs.service))))
                && ((this.target == rhs.target) || ((this.target != null) && this.target.equals(rhs.target))));
    }

}
