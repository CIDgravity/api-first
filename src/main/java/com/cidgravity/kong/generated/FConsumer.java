
package com.cidgravity.kong.generated;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "acls",
        "basicauth_credentials",
        "created_at",
        "custom_id",
        "hmacauth_credentials",
        "id",
        "jwt_secrets",
        "keyauth_credentials",
        "mtls_auth_credentials",
        "oauth2_credentials",
        "plugins",
        "tags",
        "username"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class FConsumer {

    @JsonProperty("acls")
    private List<ACLGroup> acls = new ArrayList<ACLGroup>();
    @JsonProperty("basicauth_credentials")
    private List<BasicAuth> basicauth_credentials = new ArrayList<BasicAuth>();
    @JsonProperty("created_at")
    private Integer created_at;
    @JsonProperty("custom_id")
    private String custom_id;
    @JsonProperty("hmacauth_credentials")
    private List<HMACAuth> hmacauth_credentials = new ArrayList<HMACAuth>();
    @JsonProperty("id")
    private String id;
    @JsonProperty("jwt_secrets")
    private List<JWTAuth> jwt_secrets = new ArrayList<JWTAuth>();
    @JsonProperty("keyauth_credentials")
    private List<KeyAuth> keyauth_credentials = new ArrayList<KeyAuth>();
    @JsonProperty("mtls_auth_credentials")
    private List<MTLSAuth> mtls_auth_credentials = new ArrayList<MTLSAuth>();
    @JsonProperty("oauth2_credentials")
    private List<Oauth2Credential> oauth2_credentials = new ArrayList<Oauth2Credential>();
    @JsonProperty("plugins")
    private List<FPlugin> plugins = new ArrayList<FPlugin>();
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("username")
    private String username;

    @JsonProperty("acls")
    public List<ACLGroup> getAcls() {
        return acls;
    }

    @JsonProperty("acls")
    public void setAcls(List<ACLGroup> acls) {
        this.acls = acls;
    }

    public FConsumer withAcls(List<ACLGroup> acls) {
        this.acls = acls;
        return this;
    }

    @JsonProperty("basicauth_credentials")
    public List<BasicAuth> getBasicauth_credentials() {
        return basicauth_credentials;
    }

    @JsonProperty("basicauth_credentials")
    public void setBasicauth_credentials(List<BasicAuth> basicauth_credentials) {
        this.basicauth_credentials = basicauth_credentials;
    }

    public FConsumer withBasicauth_credentials(List<BasicAuth> basicauth_credentials) {
        this.basicauth_credentials = basicauth_credentials;
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

    public FConsumer withCreated_at(Integer created_at) {
        this.created_at = created_at;
        return this;
    }

    @JsonProperty("custom_id")
    public String getCustom_id() {
        return custom_id;
    }

    @JsonProperty("custom_id")
    public void setCustom_id(String custom_id) {
        this.custom_id = custom_id;
    }

    public FConsumer withCustom_id(String custom_id) {
        this.custom_id = custom_id;
        return this;
    }

    @JsonProperty("hmacauth_credentials")
    public List<HMACAuth> getHmacauth_credentials() {
        return hmacauth_credentials;
    }

    @JsonProperty("hmacauth_credentials")
    public void setHmacauth_credentials(List<HMACAuth> hmacauth_credentials) {
        this.hmacauth_credentials = hmacauth_credentials;
    }

    public FConsumer withHmacauth_credentials(List<HMACAuth> hmacauth_credentials) {
        this.hmacauth_credentials = hmacauth_credentials;
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

    public FConsumer withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("jwt_secrets")
    public List<JWTAuth> getJwt_secrets() {
        return jwt_secrets;
    }

    @JsonProperty("jwt_secrets")
    public void setJwt_secrets(List<JWTAuth> jwt_secrets) {
        this.jwt_secrets = jwt_secrets;
    }

    public FConsumer withJwt_secrets(List<JWTAuth> jwt_secrets) {
        this.jwt_secrets = jwt_secrets;
        return this;
    }

    @JsonProperty("keyauth_credentials")
    public List<KeyAuth> getKeyauth_credentials() {
        return keyauth_credentials;
    }

    @JsonProperty("keyauth_credentials")
    public void setKeyauth_credentials(List<KeyAuth> keyauth_credentials) {
        this.keyauth_credentials = keyauth_credentials;
    }

    public FConsumer withKeyauth_credentials(List<KeyAuth> keyauth_credentials) {
        this.keyauth_credentials = keyauth_credentials;
        return this;
    }

    @JsonProperty("mtls_auth_credentials")
    public List<MTLSAuth> getMtls_auth_credentials() {
        return mtls_auth_credentials;
    }

    @JsonProperty("mtls_auth_credentials")
    public void setMtls_auth_credentials(List<MTLSAuth> mtls_auth_credentials) {
        this.mtls_auth_credentials = mtls_auth_credentials;
    }

    public FConsumer withMtls_auth_credentials(List<MTLSAuth> mtls_auth_credentials) {
        this.mtls_auth_credentials = mtls_auth_credentials;
        return this;
    }

    @JsonProperty("oauth2_credentials")
    public List<Oauth2Credential> getOauth2_credentials() {
        return oauth2_credentials;
    }

    @JsonProperty("oauth2_credentials")
    public void setOauth2_credentials(List<Oauth2Credential> oauth2_credentials) {
        this.oauth2_credentials = oauth2_credentials;
    }

    public FConsumer withOauth2_credentials(List<Oauth2Credential> oauth2_credentials) {
        this.oauth2_credentials = oauth2_credentials;
        return this;
    }

    @JsonProperty("plugins")
    public List<FPlugin> getPlugins() {
        return plugins;
    }

    @JsonProperty("plugins")
    public void setPlugins(List<FPlugin> plugins) {
        this.plugins = plugins;
    }

    public FConsumer withPlugins(List<FPlugin> plugins) {
        this.plugins = plugins;
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

    public FConsumer withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public FConsumer withUsername(String username) {
        this.username = username;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FConsumer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acls");
        sb.append('=');
        sb.append(((this.acls == null) ? "<null>" : this.acls));
        sb.append(',');
        sb.append("basicauth_credentials");
        sb.append('=');
        sb.append(((this.basicauth_credentials == null) ? "<null>" : this.basicauth_credentials));
        sb.append(',');
        sb.append("created_at");
        sb.append('=');
        sb.append(((this.created_at == null) ? "<null>" : this.created_at));
        sb.append(',');
        sb.append("custom_id");
        sb.append('=');
        sb.append(((this.custom_id == null) ? "<null>" : this.custom_id));
        sb.append(',');
        sb.append("hmacauth_credentials");
        sb.append('=');
        sb.append(((this.hmacauth_credentials == null) ? "<null>" : this.hmacauth_credentials));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("jwt_secrets");
        sb.append('=');
        sb.append(((this.jwt_secrets == null) ? "<null>" : this.jwt_secrets));
        sb.append(',');
        sb.append("keyauth_credentials");
        sb.append('=');
        sb.append(((this.keyauth_credentials == null) ? "<null>" : this.keyauth_credentials));
        sb.append(',');
        sb.append("mtls_auth_credentials");
        sb.append('=');
        sb.append(((this.mtls_auth_credentials == null) ? "<null>" : this.mtls_auth_credentials));
        sb.append(',');
        sb.append("oauth2_credentials");
        sb.append('=');
        sb.append(((this.oauth2_credentials == null) ? "<null>" : this.oauth2_credentials));
        sb.append(',');
        sb.append("plugins");
        sb.append('=');
        sb.append(((this.plugins == null) ? "<null>" : this.plugins));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null) ? "<null>" : this.tags));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null) ? "<null>" : this.username));
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
        result = ((result * 31) + ((this.hmacauth_credentials == null) ? 0 : this.hmacauth_credentials.hashCode()));
        result = ((result * 31) + ((this.mtls_auth_credentials == null) ? 0 : this.mtls_auth_credentials.hashCode()));
        result = ((result * 31) + ((this.acls == null) ? 0 : this.acls.hashCode()));
        result = ((result * 31) + ((this.plugins == null) ? 0 : this.plugins.hashCode()));
        result = ((result * 31) + ((this.custom_id == null) ? 0 : this.custom_id.hashCode()));
        result = ((result * 31) + ((this.created_at == null) ? 0 : this.created_at.hashCode()));
        result = ((result * 31) + ((this.basicauth_credentials == null) ? 0 : this.basicauth_credentials.hashCode()));
        result = ((result * 31) + ((this.tags == null) ? 0 : this.tags.hashCode()));
        result = ((result * 31) + ((this.oauth2_credentials == null) ? 0 : this.oauth2_credentials.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.jwt_secrets == null) ? 0 : this.jwt_secrets.hashCode()));
        result = ((result * 31) + ((this.keyauth_credentials == null) ? 0 : this.keyauth_credentials.hashCode()));
        result = ((result * 31) + ((this.username == null) ? 0 : this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FConsumer) == false) {
            return false;
        }
        FConsumer rhs = ((FConsumer) other);
        return ((((((((((((((this.hmacauth_credentials == rhs.hmacauth_credentials)
                || ((this.hmacauth_credentials != null) && this.hmacauth_credentials.equals(rhs.hmacauth_credentials)))
                && ((this.mtls_auth_credentials == rhs.mtls_auth_credentials) || ((this.mtls_auth_credentials != null)
                        && this.mtls_auth_credentials.equals(rhs.mtls_auth_credentials))))
                && ((this.acls == rhs.acls) || ((this.acls != null) && this.acls.equals(rhs.acls))))
                && ((this.plugins == rhs.plugins) || ((this.plugins != null) && this.plugins.equals(rhs.plugins))))
                && ((this.custom_id == rhs.custom_id) || ((this.custom_id != null) && this.custom_id.equals(rhs.custom_id))))
                && ((this.created_at == rhs.created_at)
                        || ((this.created_at != null) && this.created_at.equals(rhs.created_at))))
                && ((this.basicauth_credentials == rhs.basicauth_credentials) || ((this.basicauth_credentials != null)
                        && this.basicauth_credentials.equals(rhs.basicauth_credentials))))
                && ((this.tags == rhs.tags) || ((this.tags != null) && this.tags.equals(rhs.tags))))
                && ((this.oauth2_credentials == rhs.oauth2_credentials)
                        || ((this.oauth2_credentials != null) && this.oauth2_credentials.equals(rhs.oauth2_credentials))))
                && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
                && ((this.jwt_secrets == rhs.jwt_secrets)
                        || ((this.jwt_secrets != null) && this.jwt_secrets.equals(rhs.jwt_secrets))))
                && ((this.keyauth_credentials == rhs.keyauth_credentials)
                        || ((this.keyauth_credentials != null) && this.keyauth_credentials.equals(rhs.keyauth_credentials))))
                && ((this.username == rhs.username) || ((this.username != null) && this.username.equals(rhs.username))));
    }

}
