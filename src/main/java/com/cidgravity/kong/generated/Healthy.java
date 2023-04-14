
package com.cidgravity.kong.generated;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "http_statuses",
        "interval",
        "successes"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class Healthy {

    @JsonProperty("http_statuses")
    private List<Integer> http_statuses = new ArrayList<Integer>();
    @JsonProperty("interval")
    private Integer interval;
    @JsonProperty("successes")
    private Integer successes;

    @JsonProperty("http_statuses")
    public List<Integer> getHttp_statuses() {
        return http_statuses;
    }

    @JsonProperty("http_statuses")
    public void setHttp_statuses(List<Integer> http_statuses) {
        this.http_statuses = http_statuses;
    }

    public Healthy withHttp_statuses(List<Integer> http_statuses) {
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

    public Healthy withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    @JsonProperty("successes")
    public Integer getSuccesses() {
        return successes;
    }

    @JsonProperty("successes")
    public void setSuccesses(Integer successes) {
        this.successes = successes;
    }

    public Healthy withSuccesses(Integer successes) {
        this.successes = successes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Healthy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("http_statuses");
        sb.append('=');
        sb.append(((this.http_statuses == null) ? "<null>" : this.http_statuses));
        sb.append(',');
        sb.append("interval");
        sb.append('=');
        sb.append(((this.interval == null) ? "<null>" : this.interval));
        sb.append(',');
        sb.append("successes");
        sb.append('=');
        sb.append(((this.successes == null) ? "<null>" : this.successes));
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
        result = ((result * 31) + ((this.interval == null) ? 0 : this.interval.hashCode()));
        result = ((result * 31) + ((this.successes == null) ? 0 : this.successes.hashCode()));
        result = ((result * 31) + ((this.http_statuses == null) ? 0 : this.http_statuses.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Healthy) == false) {
            return false;
        }
        Healthy rhs = ((Healthy) other);
        return ((((this.interval == rhs.interval) || ((this.interval != null) && this.interval.equals(rhs.interval)))
                && ((this.successes == rhs.successes) || ((this.successes != null) && this.successes.equals(rhs.successes))))
                && ((this.http_statuses == rhs.http_statuses)
                        || ((this.http_statuses != null) && this.http_statuses.equals(rhs.http_statuses))));
    }

}
