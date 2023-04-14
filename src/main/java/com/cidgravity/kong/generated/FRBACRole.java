
package com.cidgravity.kong.generated;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "comment",
        "created_at",
        "endpoint_permissions",
        "id",
        "is_default",
        "name"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class FRBACRole {

    @JsonProperty("comment")
    private String comment;
    @JsonProperty("created_at")
    private Integer created_at;
    @JsonProperty("endpoint_permissions")
    private List<FRBACEndpointPermission> endpoint_permissions = new ArrayList<FRBACEndpointPermission>();
    @JsonProperty("id")
    private String id;
    @JsonProperty("is_default")
    private Boolean is_default;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public FRBACRole withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @JsonProperty("created_at")
    public Integer getCreated_at() {
        return created_at;
    }

    @JsonProperty("created_at")
    public void setCreated_at(Integer created_at) {
        this.created_at = created_at;
    }

    public FRBACRole withCreated_at(Integer created_at) {
        this.created_at = created_at;
        return this;
    }

    @JsonProperty("endpoint_permissions")
    public List<FRBACEndpointPermission> getEndpoint_permissions() {
        return endpoint_permissions;
    }

    @JsonProperty("endpoint_permissions")
    public void setEndpoint_permissions(List<FRBACEndpointPermission> endpoint_permissions) {
        this.endpoint_permissions = endpoint_permissions;
    }

    public FRBACRole withEndpoint_permissions(List<FRBACEndpointPermission> endpoint_permissions) {
        this.endpoint_permissions = endpoint_permissions;
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

    public FRBACRole withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("is_default")
    public Boolean getIs_default() {
        return is_default;
    }

    @JsonProperty("is_default")
    public void setIs_default(Boolean is_default) {
        this.is_default = is_default;
    }

    public FRBACRole withIs_default(Boolean is_default) {
        this.is_default = is_default;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public FRBACRole withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FRBACRole.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null) ? "<null>" : this.comment));
        sb.append(',');
        sb.append("created_at");
        sb.append('=');
        sb.append(((this.created_at == null) ? "<null>" : this.created_at));
        sb.append(',');
        sb.append("endpoint_permissions");
        sb.append('=');
        sb.append(((this.endpoint_permissions == null) ? "<null>" : this.endpoint_permissions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("is_default");
        sb.append('=');
        sb.append(((this.is_default == null) ? "<null>" : this.is_default));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
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
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.created_at == null) ? 0 : this.created_at.hashCode()));
        result = ((result * 31) + ((this.comment == null) ? 0 : this.comment.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.is_default == null) ? 0 : this.is_default.hashCode()));
        result = ((result * 31) + ((this.endpoint_permissions == null) ? 0 : this.endpoint_permissions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FRBACRole) == false) {
            return false;
        }
        FRBACRole rhs = ((FRBACRole) other);
        return (((((((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))
                && ((this.created_at == rhs.created_at)
                        || ((this.created_at != null) && this.created_at.equals(rhs.created_at))))
                && ((this.comment == rhs.comment) || ((this.comment != null) && this.comment.equals(rhs.comment))))
                && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
                && ((this.is_default == rhs.is_default)
                        || ((this.is_default != null) && this.is_default.equals(rhs.is_default))))
                && ((this.endpoint_permissions == rhs.endpoint_permissions) || ((this.endpoint_permissions != null)
                        && this.endpoint_permissions.equals(rhs.endpoint_permissions))));
    }

}
