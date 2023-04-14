
package com.cidgravity.kong.generated;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "description",
        "document",
        "id",
        "name",
        "versions"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class FServicePackage {

    @JsonProperty("description")
    private String description;
    @JsonProperty("document")
    private FDocument document;
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    @JsonProperty("versions")
    private List<FServiceVersion> versions = new ArrayList<FServiceVersion>();

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public FServicePackage withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("document")
    public FDocument getDocument() {
        return document;
    }

    @JsonProperty("document")
    public void setDocument(FDocument document) {
        this.document = document;
    }

    public FServicePackage withDocument(FDocument document) {
        this.document = document;
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

    public FServicePackage withId(String id) {
        this.id = id;
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

    public FServicePackage withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("versions")
    public List<FServiceVersion> getVersions() {
        return versions;
    }

    @JsonProperty("versions")
    public void setVersions(List<FServiceVersion> versions) {
        this.versions = versions;
    }

    public FServicePackage withVersions(List<FServiceVersion> versions) {
        this.versions = versions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FServicePackage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null) ? "<null>" : this.description));
        sb.append(',');
        sb.append("document");
        sb.append('=');
        sb.append(((this.document == null) ? "<null>" : this.document));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("versions");
        sb.append('=');
        sb.append(((this.versions == null) ? "<null>" : this.versions));
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
        result = ((result * 31) + ((this.description == null) ? 0 : this.description.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.versions == null) ? 0 : this.versions.hashCode()));
        result = ((result * 31) + ((this.document == null) ? 0 : this.document.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FServicePackage) == false) {
            return false;
        }
        FServicePackage rhs = ((FServicePackage) other);
        return ((((((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))
                && ((this.description == rhs.description)
                        || ((this.description != null) && this.description.equals(rhs.description))))
                && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
                && ((this.versions == rhs.versions) || ((this.versions != null) && this.versions.equals(rhs.versions))))
                && ((this.document == rhs.document) || ((this.document != null) && this.document.equals(rhs.document))));
    }

}
