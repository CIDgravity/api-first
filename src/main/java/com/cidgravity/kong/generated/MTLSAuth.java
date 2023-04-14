
package com.cidgravity.kong.generated;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "ca_certificate",
        "consumer",
        "created_at",
        "id",
        "subject_name",
        "tags"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class MTLSAuth {

    @JsonProperty("ca_certificate")
    private CACertificate ca_certificate;
    @JsonProperty("consumer")
    private Consumer consumer;
    @JsonProperty("created_at")
    private Integer created_at;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subject_name")
    private String subject_name;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();

    @JsonProperty("ca_certificate")
    public CACertificate getCa_certificate() {
        return ca_certificate;
    }

    @JsonProperty("ca_certificate")
    public void setCa_certificate(CACertificate ca_certificate) {
        this.ca_certificate = ca_certificate;
    }

    public MTLSAuth withCa_certificate(CACertificate ca_certificate) {
        this.ca_certificate = ca_certificate;
        return this;
    }

    @JsonProperty("consumer")
    public Consumer getConsumer() {
        return consumer;
    }

    @JsonProperty("consumer")
    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public MTLSAuth withConsumer(Consumer consumer) {
        this.consumer = consumer;
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

    public MTLSAuth withCreated_at(Integer created_at) {
        this.created_at = created_at;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public MTLSAuth withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subject_name")
    public String getSubject_name() {
        return subject_name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subject_name")
    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public MTLSAuth withSubject_name(String subject_name) {
        this.subject_name = subject_name;
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

    public MTLSAuth withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MTLSAuth.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ca_certificate");
        sb.append('=');
        sb.append(((this.ca_certificate == null) ? "<null>" : this.ca_certificate));
        sb.append(',');
        sb.append("consumer");
        sb.append('=');
        sb.append(((this.consumer == null) ? "<null>" : this.consumer));
        sb.append(',');
        sb.append("created_at");
        sb.append('=');
        sb.append(((this.created_at == null) ? "<null>" : this.created_at));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("subject_name");
        sb.append('=');
        sb.append(((this.subject_name == null) ? "<null>" : this.subject_name));
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
        result = ((result * 31) + ((this.ca_certificate == null) ? 0 : this.ca_certificate.hashCode()));
        result = ((result * 31) + ((this.subject_name == null) ? 0 : this.subject_name.hashCode()));
        result = ((result * 31) + ((this.created_at == null) ? 0 : this.created_at.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.consumer == null) ? 0 : this.consumer.hashCode()));
        result = ((result * 31) + ((this.tags == null) ? 0 : this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MTLSAuth) == false) {
            return false;
        }
        MTLSAuth rhs = ((MTLSAuth) other);
        return (((((((this.ca_certificate == rhs.ca_certificate)
                || ((this.ca_certificate != null) && this.ca_certificate.equals(rhs.ca_certificate)))
                && ((this.subject_name == rhs.subject_name)
                        || ((this.subject_name != null) && this.subject_name.equals(rhs.subject_name))))
                && ((this.created_at == rhs.created_at)
                        || ((this.created_at != null) && this.created_at.equals(rhs.created_at))))
                && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
                && ((this.consumer == rhs.consumer) || ((this.consumer != null) && this.consumer.equals(rhs.consumer))))
                && ((this.tags == rhs.tags) || ((this.tags != null) && this.tags.equals(rhs.tags))));
    }

}
