
package com.cidgravity.kong.generated;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "cert",
        "cert_digest",
        "created_at",
        "id",
        "tags"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class FCACertificate {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cert")
    private String cert;
    @JsonProperty("cert_digest")
    private String cert_digest;
    @JsonProperty("created_at")
    private Integer created_at;
    @JsonProperty("id")
    private String id;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cert")
    public String getCert() {
        return cert;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cert")
    public void setCert(String cert) {
        this.cert = cert;
    }

    public FCACertificate withCert(String cert) {
        this.cert = cert;
        return this;
    }

    @JsonProperty("cert_digest")
    public String getCert_digest() {
        return cert_digest;
    }

    @JsonProperty("cert_digest")
    public void setCert_digest(String cert_digest) {
        this.cert_digest = cert_digest;
    }

    public FCACertificate withCert_digest(String cert_digest) {
        this.cert_digest = cert_digest;
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

    public FCACertificate withCreated_at(Integer created_at) {
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

    public FCACertificate withId(String id) {
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

    public FCACertificate withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FCACertificate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("cert");
        sb.append('=');
        sb.append(((this.cert == null) ? "<null>" : this.cert));
        sb.append(',');
        sb.append("cert_digest");
        sb.append('=');
        sb.append(((this.cert_digest == null) ? "<null>" : this.cert_digest));
        sb.append(',');
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
        result = ((result * 31) + ((this.created_at == null) ? 0 : this.created_at.hashCode()));
        result = ((result * 31) + ((this.cert == null) ? 0 : this.cert.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.cert_digest == null) ? 0 : this.cert_digest.hashCode()));
        result = ((result * 31) + ((this.tags == null) ? 0 : this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FCACertificate) == false) {
            return false;
        }
        FCACertificate rhs = ((FCACertificate) other);
        return ((((((this.created_at == rhs.created_at)
                || ((this.created_at != null) && this.created_at.equals(rhs.created_at)))
                && ((this.cert == rhs.cert) || ((this.cert != null) && this.cert.equals(rhs.cert))))
                && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
                && ((this.cert_digest == rhs.cert_digest)
                        || ((this.cert_digest != null) && this.cert_digest.equals(rhs.cert_digest))))
                && ((this.tags == rhs.tags) || ((this.tags != null) && this.tags.equals(rhs.tags))));
    }

}
