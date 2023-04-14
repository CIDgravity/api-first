
package com.cidgravity.kong.generated;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "created_at",
        "id",
        "tags",
        "target",
        "upstream",
        "weight"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class Target {

    @JsonProperty("created_at")
    private Double created_at;
    @JsonProperty("id")
    private String id;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("target")
    private String target;
    @JsonProperty("upstream")
    private Upstream upstream;
    @JsonProperty("weight")
    private Integer weight;

    @JsonProperty("created_at")
    public Double getCreated_at() {
        return created_at;
    }

    @JsonProperty("created_at")
    public void setCreated_at(Double created_at) {
        this.created_at = created_at;
    }

    public Target withCreated_at(Double created_at) {
        this.created_at = created_at;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Target withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Target withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("target")
    public String getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(String target) {
        this.target = target;
    }

    public Target withTarget(String target) {
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

    public Target withUpstream(Upstream upstream) {
        this.upstream = upstream;
        return this;
    }

    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Target withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Target.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("created_at");
        sb.append('=');
        sb.append(((this.created_at == null) ? "<null>" : this.created_at));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null) ? "<null>" : this.tags));
        sb.append(',');
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null) ? "<null>" : this.target));
        sb.append(',');
        sb.append("upstream");
        sb.append('=');
        sb.append(((this.upstream == null) ? "<null>" : this.upstream));
        sb.append(',');
        sb.append("weight");
        sb.append('=');
        sb.append(((this.weight == null) ? "<null>" : this.weight));
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
        result = ((result * 31) + ((this.upstream == null) ? 0 : this.upstream.hashCode()));
        result = ((result * 31) + ((this.created_at == null) ? 0 : this.created_at.hashCode()));
        result = ((result * 31) + ((this.weight == null) ? 0 : this.weight.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.tags == null) ? 0 : this.tags.hashCode()));
        result = ((result * 31) + ((this.target == null) ? 0 : this.target.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Target) == false) {
            return false;
        }
        Target rhs = ((Target) other);
        return (((((((this.upstream == rhs.upstream) || ((this.upstream != null) && this.upstream.equals(rhs.upstream)))
                && ((this.created_at == rhs.created_at)
                        || ((this.created_at != null) && this.created_at.equals(rhs.created_at))))
                && ((this.weight == rhs.weight) || ((this.weight != null) && this.weight.equals(rhs.weight))))
                && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
                && ((this.tags == rhs.tags) || ((this.tags != null) && this.tags.equals(rhs.tags))))
                && ((this.target == rhs.target) || ((this.target != null) && this.target.equals(rhs.target))));
    }

}
