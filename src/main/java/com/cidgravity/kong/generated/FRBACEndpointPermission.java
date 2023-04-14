
package com.cidgravity.kong.generated;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "actions",
        "comment",
        "created_at",
        "endpoint",
        "negative",
        "role",
        "workspace"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class FRBACEndpointPermission {

    @JsonProperty("actions")
    private List<String> actions = new ArrayList<String>();
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("created_at")
    private Integer created_at;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endpoint")
    private String endpoint;
    @JsonProperty("negative")
    private Boolean negative;
    @JsonProperty("role")
    private RBACRole role;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("workspace")
    private String workspace;

    @JsonProperty("actions")
    public List<String> getActions() {
        return actions;
    }

    @JsonProperty("actions")
    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public FRBACEndpointPermission withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public FRBACEndpointPermission withComment(String comment) {
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

    public FRBACEndpointPermission withCreated_at(Integer created_at) {
        this.created_at = created_at;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endpoint")
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endpoint")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public FRBACEndpointPermission withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    @JsonProperty("negative")
    public Boolean getNegative() {
        return negative;
    }

    @JsonProperty("negative")
    public void setNegative(Boolean negative) {
        this.negative = negative;
    }

    public FRBACEndpointPermission withNegative(Boolean negative) {
        this.negative = negative;
        return this;
    }

    @JsonProperty("role")
    public RBACRole getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(RBACRole role) {
        this.role = role;
    }

    public FRBACEndpointPermission withRole(RBACRole role) {
        this.role = role;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("workspace")
    public String getWorkspace() {
        return workspace;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("workspace")
    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public FRBACEndpointPermission withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FRBACEndpointPermission.class.getName()).append('@')
                .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("actions");
        sb.append('=');
        sb.append(((this.actions == null) ? "<null>" : this.actions));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null) ? "<null>" : this.comment));
        sb.append(',');
        sb.append("created_at");
        sb.append('=');
        sb.append(((this.created_at == null) ? "<null>" : this.created_at));
        sb.append(',');
        sb.append("endpoint");
        sb.append('=');
        sb.append(((this.endpoint == null) ? "<null>" : this.endpoint));
        sb.append(',');
        sb.append("negative");
        sb.append('=');
        sb.append(((this.negative == null) ? "<null>" : this.negative));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null) ? "<null>" : this.role));
        sb.append(',');
        sb.append("workspace");
        sb.append('=');
        sb.append(((this.workspace == null) ? "<null>" : this.workspace));
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
        result = ((result * 31) + ((this.endpoint == null) ? 0 : this.endpoint.hashCode()));
        result = ((result * 31) + ((this.negative == null) ? 0 : this.negative.hashCode()));
        result = ((result * 31) + ((this.workspace == null) ? 0 : this.workspace.hashCode()));
        result = ((result * 31) + ((this.role == null) ? 0 : this.role.hashCode()));
        result = ((result * 31) + ((this.created_at == null) ? 0 : this.created_at.hashCode()));
        result = ((result * 31) + ((this.comment == null) ? 0 : this.comment.hashCode()));
        result = ((result * 31) + ((this.actions == null) ? 0 : this.actions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FRBACEndpointPermission) == false) {
            return false;
        }
        FRBACEndpointPermission rhs = ((FRBACEndpointPermission) other);
        return ((((((((this.endpoint == rhs.endpoint) || ((this.endpoint != null) && this.endpoint.equals(rhs.endpoint)))
                && ((this.negative == rhs.negative) || ((this.negative != null) && this.negative.equals(rhs.negative))))
                && ((this.workspace == rhs.workspace) || ((this.workspace != null) && this.workspace.equals(rhs.workspace))))
                && ((this.role == rhs.role) || ((this.role != null) && this.role.equals(rhs.role))))
                && ((this.created_at == rhs.created_at)
                        || ((this.created_at != null) && this.created_at.equals(rhs.created_at))))
                && ((this.comment == rhs.comment) || ((this.comment != null) && this.comment.equals(rhs.comment))))
                && ((this.actions == rhs.actions) || ((this.actions != null) && this.actions.equals(rhs.actions))));
    }

}
