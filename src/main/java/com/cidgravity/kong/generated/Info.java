
package com.cidgravity.kong.generated;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "defaults",
        "select_tags"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class Info {

    @JsonProperty("defaults")
    private KongDefaults defaults;
    @JsonProperty("select_tags")
    private List<String> select_tags = new ArrayList<String>();

    @JsonProperty("defaults")
    public KongDefaults getDefaults() {
        return defaults;
    }

    @JsonProperty("defaults")
    public void setDefaults(KongDefaults defaults) {
        this.defaults = defaults;
    }

    public Info withDefaults(KongDefaults defaults) {
        this.defaults = defaults;
        return this;
    }

    @JsonProperty("select_tags")
    public List<String> getSelect_tags() {
        return select_tags;
    }

    @JsonProperty("select_tags")
    public void setSelect_tags(List<String> select_tags) {
        this.select_tags = select_tags;
    }

    public Info withSelect_tags(List<String> select_tags) {
        this.select_tags = select_tags;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Info.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("defaults");
        sb.append('=');
        sb.append(((this.defaults == null) ? "<null>" : this.defaults));
        sb.append(',');
        sb.append("select_tags");
        sb.append('=');
        sb.append(((this.select_tags == null) ? "<null>" : this.select_tags));
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
        result = ((result * 31) + ((this.defaults == null) ? 0 : this.defaults.hashCode()));
        result = ((result * 31) + ((this.select_tags == null) ? 0 : this.select_tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Info) == false) {
            return false;
        }
        Info rhs = ((Info) other);
        return (((this.defaults == rhs.defaults) || ((this.defaults != null) && this.defaults.equals(rhs.defaults)))
                && ((this.select_tags == rhs.select_tags)
                        || ((this.select_tags != null) && this.select_tags.equals(rhs.select_tags))));
    }

}
