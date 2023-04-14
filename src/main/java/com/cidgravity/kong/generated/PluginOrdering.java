
package com.cidgravity.kong.generated;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "after",
        "before"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class PluginOrdering {

    @JsonProperty("after")
    private After after;
    @JsonProperty("before")
    private Before before;

    @JsonProperty("after")
    public After getAfter() {
        return after;
    }

    @JsonProperty("after")
    public void setAfter(After after) {
        this.after = after;
    }

    public PluginOrdering withAfter(After after) {
        this.after = after;
        return this;
    }

    @JsonProperty("before")
    public Before getBefore() {
        return before;
    }

    @JsonProperty("before")
    public void setBefore(Before before) {
        this.before = before;
    }

    public PluginOrdering withBefore(Before before) {
        this.before = before;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PluginOrdering.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("after");
        sb.append('=');
        sb.append(((this.after == null) ? "<null>" : this.after));
        sb.append(',');
        sb.append("before");
        sb.append('=');
        sb.append(((this.before == null) ? "<null>" : this.before));
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
        result = ((result * 31) + ((this.before == null) ? 0 : this.before.hashCode()));
        result = ((result * 31) + ((this.after == null) ? 0 : this.after.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PluginOrdering) == false) {
            return false;
        }
        PluginOrdering rhs = ((PluginOrdering) other);
        return (((this.before == rhs.before) || ((this.before != null) && this.before.equals(rhs.before)))
                && ((this.after == rhs.after) || ((this.after != null) && this.after.equals(rhs.after))));
    }

}
