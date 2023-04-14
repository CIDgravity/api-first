
package com.cidgravity.kong.generated;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "document",
        "id",
        "implementation",
        "version"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class FServiceVersion {

    @JsonProperty("document")
    private FDocument document;
    @JsonProperty("id")
    private String id;
    @JsonProperty("implementation")
    private Implementation implementation;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    private String version;

    @JsonProperty("document")
    public FDocument getDocument() {
        return document;
    }

    @JsonProperty("document")
    public void setDocument(FDocument document) {
        this.document = document;
    }

    public FServiceVersion withDocument(FDocument document) {
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

    public FServiceVersion withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("implementation")
    public Implementation getImplementation() {
        return implementation;
    }

    @JsonProperty("implementation")
    public void setImplementation(Implementation implementation) {
        this.implementation = implementation;
    }

    public FServiceVersion withImplementation(Implementation implementation) {
        this.implementation = implementation;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public FServiceVersion withVersion(String version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FServiceVersion.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("document");
        sb.append('=');
        sb.append(((this.document == null) ? "<null>" : this.document));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("implementation");
        sb.append('=');
        sb.append(((this.implementation == null) ? "<null>" : this.implementation));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null) ? "<null>" : this.version));
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
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.version == null) ? 0 : this.version.hashCode()));
        result = ((result * 31) + ((this.document == null) ? 0 : this.document.hashCode()));
        result = ((result * 31) + ((this.implementation == null) ? 0 : this.implementation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FServiceVersion) == false) {
            return false;
        }
        FServiceVersion rhs = ((FServiceVersion) other);
        return (((((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))
                && ((this.version == rhs.version) || ((this.version != null) && this.version.equals(rhs.version))))
                && ((this.document == rhs.document) || ((this.document != null) && this.document.equals(rhs.document))))
                && ((this.implementation == rhs.implementation)
                        || ((this.implementation != null) && this.implementation.equals(rhs.implementation))));
    }

}
