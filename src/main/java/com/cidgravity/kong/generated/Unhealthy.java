
package com.cidgravity.kong.generated;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "http_failures",
        "http_statuses",
        "interval",
        "tcp_failures",
        "timeouts"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class Unhealthy {

    @JsonProperty("http_failures")
    private Integer http_failures;
    @JsonProperty("http_statuses")
    private List<Integer> http_statuses = new ArrayList<Integer>();
    @JsonProperty("interval")
    private Integer interval;
    @JsonProperty("tcp_failures")
    private Integer tcp_failures;
    @JsonProperty("timeouts")
    private Integer timeouts;

    @JsonProperty("http_failures")
    public Integer getHttp_failures() {
        return http_failures;
    }

    @JsonProperty("http_failures")
    public void setHttp_failures(Integer http_failures) {
        this.http_failures = http_failures;
    }

    public Unhealthy withHttp_failures(Integer http_failures) {
        this.http_failures = http_failures;
        return this;
    }

    @JsonProperty("http_statuses")
    public List<Integer> getHttp_statuses() {
        return http_statuses;
    }

    @JsonProperty("http_statuses")
    public void setHttp_statuses(List<Integer> http_statuses) {
        this.http_statuses = http_statuses;
    }

    public Unhealthy withHttp_statuses(List<Integer> http_statuses) {
        this.http_statuses = http_statuses;
        return this;
    }

    @JsonProperty("interval")
    public Integer getInterval() {
        return interval;
    }

    @JsonProperty("interval")
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public Unhealthy withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    @JsonProperty("tcp_failures")
    public Integer getTcp_failures() {
        return tcp_failures;
    }

    @JsonProperty("tcp_failures")
    public void setTcp_failures(Integer tcp_failures) {
        this.tcp_failures = tcp_failures;
    }

    public Unhealthy withTcp_failures(Integer tcp_failures) {
        this.tcp_failures = tcp_failures;
        return this;
    }

    @JsonProperty("timeouts")
    public Integer getTimeouts() {
        return timeouts;
    }

    @JsonProperty("timeouts")
    public void setTimeouts(Integer timeouts) {
        this.timeouts = timeouts;
    }

    public Unhealthy withTimeouts(Integer timeouts) {
        this.timeouts = timeouts;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Unhealthy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("http_failures");
        sb.append('=');
        sb.append(((this.http_failures == null) ? "<null>" : this.http_failures));
        sb.append(',');
        sb.append("http_statuses");
        sb.append('=');
        sb.append(((this.http_statuses == null) ? "<null>" : this.http_statuses));
        sb.append(',');
        sb.append("interval");
        sb.append('=');
        sb.append(((this.interval == null) ? "<null>" : this.interval));
        sb.append(',');
        sb.append("tcp_failures");
        sb.append('=');
        sb.append(((this.tcp_failures == null) ? "<null>" : this.tcp_failures));
        sb.append(',');
        sb.append("timeouts");
        sb.append('=');
        sb.append(((this.timeouts == null) ? "<null>" : this.timeouts));
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
        result = ((result * 31) + ((this.timeouts == null) ? 0 : this.timeouts.hashCode()));
        result = ((result * 31) + ((this.interval == null) ? 0 : this.interval.hashCode()));
        result = ((result * 31) + ((this.http_failures == null) ? 0 : this.http_failures.hashCode()));
        result = ((result * 31) + ((this.http_statuses == null) ? 0 : this.http_statuses.hashCode()));
        result = ((result * 31) + ((this.tcp_failures == null) ? 0 : this.tcp_failures.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Unhealthy) == false) {
            return false;
        }
        Unhealthy rhs = ((Unhealthy) other);
        return ((((((this.timeouts == rhs.timeouts) || ((this.timeouts != null) && this.timeouts.equals(rhs.timeouts)))
                && ((this.interval == rhs.interval) || ((this.interval != null) && this.interval.equals(rhs.interval))))
                && ((this.http_failures == rhs.http_failures)
                        || ((this.http_failures != null) && this.http_failures.equals(rhs.http_failures))))
                && ((this.http_statuses == rhs.http_statuses)
                        || ((this.http_statuses != null) && this.http_statuses.equals(rhs.http_statuses))))
                && ((this.tcp_failures == rhs.tcp_failures)
                        || ((this.tcp_failures != null) && this.tcp_failures.equals(rhs.tcp_failures))));
    }

}
