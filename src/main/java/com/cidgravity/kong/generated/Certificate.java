
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
        "cert_alt",
        "created_at",
        "id",
        "key",
        "key_alt",
        "snis",
        "tags"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class Certificate {

    @JsonProperty("cert")
    private String cert;
    @JsonProperty("cert_alt")
    private String cert_alt;
    @JsonProperty("created_at")
    private Integer created_at;
    @JsonProperty("id")
    private String id;
    @JsonProperty("key")
    private String key;
    @JsonProperty("key_alt")
    private String key_alt;
    @JsonProperty("snis")
    private List<String> snis = new ArrayList<String>();
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();

    @JsonProperty("cert")
    public String getCert() {
        return cert;
    }

    @JsonProperty("cert")
    public void setCert(String cert) {
        this.cert = cert;
    }

    public Certificate withCert(String cert) {
        this.cert = cert;
        return this;
    }

    @JsonProperty("cert_alt")
    public String getCert_alt() {
        return cert_alt;
    }

    @JsonProperty("cert_alt")
    public void setCert_alt(String cert_alt) {
        this.cert_alt = cert_alt;
    }

    public Certificate withCert_alt(String cert_alt) {
        this.cert_alt = cert_alt;
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

    public Certificate withCreated_at(Integer created_at) {
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

    public Certificate withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    public Certificate withKey(String key) {
        this.key = key;
        return this;
    }

    @JsonProperty("key_alt")
    public String getKey_alt() {
        return key_alt;
    }

    @JsonProperty("key_alt")
    public void setKey_alt(String key_alt) {
        this.key_alt = key_alt;
    }

    public Certificate withKey_alt(String key_alt) {
        this.key_alt = key_alt;
        return this;
    }

    @JsonProperty("snis")
    public List<String> getSnis() {
        return snis;
    }

    @JsonProperty("snis")
    public void setSnis(List<String> snis) {
        this.snis = snis;
    }

    public Certificate withSnis(List<String> snis) {
        this.snis = snis;
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

    public Certificate withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Certificate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("cert");
        sb.append('=');
        sb.append(((this.cert == null) ? "<null>" : this.cert));
        sb.append(',');
        sb.append("cert_alt");
        sb.append('=');
        sb.append(((this.cert_alt == null) ? "<null>" : this.cert_alt));
        sb.append(',');
        sb.append("created_at");
        sb.append('=');
        sb.append(((this.created_at == null) ? "<null>" : this.created_at));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null) ? "<null>" : this.key));
        sb.append(',');
        sb.append("key_alt");
        sb.append('=');
        sb.append(((this.key_alt == null) ? "<null>" : this.key_alt));
        sb.append(',');
        sb.append("snis");
        sb.append('=');
        sb.append(((this.snis == null) ? "<null>" : this.snis));
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
        result = ((result * 31) + ((this.key_alt == null) ? 0 : this.key_alt.hashCode()));
        result = ((result * 31) + ((this.snis == null) ? 0 : this.snis.hashCode()));
        result = ((result * 31) + ((this.created_at == null) ? 0 : this.created_at.hashCode()));
        result = ((result * 31) + ((this.cert == null) ? 0 : this.cert.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.key == null) ? 0 : this.key.hashCode()));
        result = ((result * 31) + ((this.cert_alt == null) ? 0 : this.cert_alt.hashCode()));
        result = ((result * 31) + ((this.tags == null) ? 0 : this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Certificate) == false) {
            return false;
        }
        Certificate rhs = ((Certificate) other);
        return (((((((((this.key_alt == rhs.key_alt) || ((this.key_alt != null) && this.key_alt.equals(rhs.key_alt)))
                && ((this.snis == rhs.snis) || ((this.snis != null) && this.snis.equals(rhs.snis))))
                && ((this.created_at == rhs.created_at)
                        || ((this.created_at != null) && this.created_at.equals(rhs.created_at))))
                && ((this.cert == rhs.cert) || ((this.cert != null) && this.cert.equals(rhs.cert))))
                && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
                && ((this.key == rhs.key) || ((this.key != null) && this.key.equals(rhs.key))))
                && ((this.cert_alt == rhs.cert_alt) || ((this.cert_alt != null) && this.cert_alt.equals(rhs.cert_alt))))
                && ((this.tags == rhs.tags) || ((this.tags != null) && this.tags.equals(rhs.tags))));
    }

}
