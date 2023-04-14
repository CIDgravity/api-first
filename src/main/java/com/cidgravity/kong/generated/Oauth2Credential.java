
package com.cidgravity.kong.generated;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "client_id",
        "client_secret",
        "consumer",
        "created_at",
        "hash_secret",
        "id",
        "name",
        "redirect_uris",
        "tags"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class Oauth2Credential {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_id")
    private String client_id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_secret")
    private String client_secret;
    @JsonProperty("consumer")
    private Consumer consumer;
    @JsonProperty("created_at")
    private Integer created_at;
    @JsonProperty("hash_secret")
    private Boolean hash_secret;
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    @JsonProperty("redirect_uris")
    private List<String> redirect_uris = new ArrayList<String>();
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_id")
    public String getClient_id() {
        return client_id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_id")
    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public Oauth2Credential withClient_id(String client_id) {
        this.client_id = client_id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_secret")
    public String getClient_secret() {
        return client_secret;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_secret")
    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public Oauth2Credential withClient_secret(String client_secret) {
        this.client_secret = client_secret;
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

    public Oauth2Credential withConsumer(Consumer consumer) {
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

    public Oauth2Credential withCreated_at(Integer created_at) {
        this.created_at = created_at;
        return this;
    }

    @JsonProperty("hash_secret")
    public Boolean getHash_secret() {
        return hash_secret;
    }

    @JsonProperty("hash_secret")
    public void setHash_secret(Boolean hash_secret) {
        this.hash_secret = hash_secret;
    }

    public Oauth2Credential withHash_secret(Boolean hash_secret) {
        this.hash_secret = hash_secret;
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

    public Oauth2Credential withId(String id) {
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

    public Oauth2Credential withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("redirect_uris")
    public List<String> getRedirect_uris() {
        return redirect_uris;
    }

    @JsonProperty("redirect_uris")
    public void setRedirect_uris(List<String> redirect_uris) {
        this.redirect_uris = redirect_uris;
    }

    public Oauth2Credential withRedirect_uris(List<String> redirect_uris) {
        this.redirect_uris = redirect_uris;
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

    public Oauth2Credential withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Oauth2Credential.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("client_id");
        sb.append('=');
        sb.append(((this.client_id == null) ? "<null>" : this.client_id));
        sb.append(',');
        sb.append("client_secret");
        sb.append('=');
        sb.append(((this.client_secret == null) ? "<null>" : this.client_secret));
        sb.append(',');
        sb.append("consumer");
        sb.append('=');
        sb.append(((this.consumer == null) ? "<null>" : this.consumer));
        sb.append(',');
        sb.append("created_at");
        sb.append('=');
        sb.append(((this.created_at == null) ? "<null>" : this.created_at));
        sb.append(',');
        sb.append("hash_secret");
        sb.append('=');
        sb.append(((this.hash_secret == null) ? "<null>" : this.hash_secret));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("redirect_uris");
        sb.append('=');
        sb.append(((this.redirect_uris == null) ? "<null>" : this.redirect_uris));
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
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.created_at == null) ? 0 : this.created_at.hashCode()));
        result = ((result * 31) + ((this.client_secret == null) ? 0 : this.client_secret.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.redirect_uris == null) ? 0 : this.redirect_uris.hashCode()));
        result = ((result * 31) + ((this.client_id == null) ? 0 : this.client_id.hashCode()));
        result = ((result * 31) + ((this.consumer == null) ? 0 : this.consumer.hashCode()));
        result = ((result * 31) + ((this.hash_secret == null) ? 0 : this.hash_secret.hashCode()));
        result = ((result * 31) + ((this.tags == null) ? 0 : this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Oauth2Credential) == false) {
            return false;
        }
        Oauth2Credential rhs = ((Oauth2Credential) other);
        return ((((((((((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))
                && ((this.created_at == rhs.created_at)
                        || ((this.created_at != null) && this.created_at.equals(rhs.created_at))))
                && ((this.client_secret == rhs.client_secret)
                        || ((this.client_secret != null) && this.client_secret.equals(rhs.client_secret))))
                && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
                && ((this.redirect_uris == rhs.redirect_uris)
                        || ((this.redirect_uris != null) && this.redirect_uris.equals(rhs.redirect_uris))))
                && ((this.client_id == rhs.client_id) || ((this.client_id != null) && this.client_id.equals(rhs.client_id))))
                && ((this.consumer == rhs.consumer) || ((this.consumer != null) && this.consumer.equals(rhs.consumer))))
                && ((this.hash_secret == rhs.hash_secret)
                        || ((this.hash_secret != null) && this.hash_secret.equals(rhs.hash_secret))))
                && ((this.tags == rhs.tags) || ((this.tags != null) && this.tags.equals(rhs.tags))));
    }

}
