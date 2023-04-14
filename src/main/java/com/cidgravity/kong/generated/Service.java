
package com.cidgravity.kong.generated;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "ca_certificates",
        "client_certificate",
        "connect_timeout",
        "created_at",
        "enabled",
        "host",
        "id",
        "name",
        "path",
        "port",
        "protocol",
        "read_timeout",
        "retries",
        "tags",
        "tls_verify",
        "tls_verify_depth",
        "updated_at",
        "url",
        "write_timeout"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class Service {

    @JsonProperty("ca_certificates")
    private List<String> ca_certificates = new ArrayList<String>();
    @JsonProperty("client_certificate")
    private Certificate client_certificate;
    @JsonProperty("connect_timeout")
    private Integer connect_timeout;
    @JsonProperty("created_at")
    private Integer created_at;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("host")
    private String host;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("path")
    private String path;
    @JsonProperty("port")
    private Integer port;
    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("read_timeout")
    private Integer read_timeout;
    @JsonProperty("retries")
    private Integer retries;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("tls_verify")
    private Boolean tls_verify;
    @JsonProperty("tls_verify_depth")
    private Integer tls_verify_depth;
    @JsonProperty("updated_at")
    private Integer updated_at;
    @JsonProperty("url")
    private String url;
    @JsonProperty("write_timeout")
    private Integer write_timeout;

    @JsonProperty("ca_certificates")
    public List<String> getCa_certificates() {
        return ca_certificates;
    }

    @JsonProperty("ca_certificates")
    public void setCa_certificates(List<String> ca_certificates) {
        this.ca_certificates = ca_certificates;
    }

    public Service withCa_certificates(List<String> ca_certificates) {
        this.ca_certificates = ca_certificates;
        return this;
    }

    @JsonProperty("client_certificate")
    public Certificate getClient_certificate() {
        return client_certificate;
    }

    @JsonProperty("client_certificate")
    public void setClient_certificate(Certificate client_certificate) {
        this.client_certificate = client_certificate;
    }

    public Service withClient_certificate(Certificate client_certificate) {
        this.client_certificate = client_certificate;
        return this;
    }

    @JsonProperty("connect_timeout")
    public Integer getConnect_timeout() {
        return connect_timeout;
    }

    @JsonProperty("connect_timeout")
    public void setConnect_timeout(Integer connect_timeout) {
        this.connect_timeout = connect_timeout;
    }

    public Service withConnect_timeout(Integer connect_timeout) {
        this.connect_timeout = connect_timeout;
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

    public Service withCreated_at(Integer created_at) {
        this.created_at = created_at;
        return this;
    }

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Service withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
    }

    public Service withHost(String host) {
        this.host = host;
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

    public Service withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Service withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    public Service withPath(String path) {
        this.path = path;
        return this;
    }

    @JsonProperty("port")
    public Integer getPort() {
        return port;
    }

    @JsonProperty("port")
    public void setPort(Integer port) {
        this.port = port;
    }

    public Service withPort(Integer port) {
        this.port = port;
        return this;
    }

    @JsonProperty("protocol")
    public String getProtocol() {
        return protocol;
    }

    @JsonProperty("protocol")
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Service withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    @JsonProperty("read_timeout")
    public Integer getRead_timeout() {
        return read_timeout;
    }

    @JsonProperty("read_timeout")
    public void setRead_timeout(Integer read_timeout) {
        this.read_timeout = read_timeout;
    }

    public Service withRead_timeout(Integer read_timeout) {
        this.read_timeout = read_timeout;
        return this;
    }

    @JsonProperty("retries")
    public Integer getRetries() {
        return retries;
    }

    @JsonProperty("retries")
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public Service withRetries(Integer retries) {
        this.retries = retries;
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

    public Service withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("tls_verify")
    public Boolean getTls_verify() {
        return tls_verify;
    }

    @JsonProperty("tls_verify")
    public void setTls_verify(Boolean tls_verify) {
        this.tls_verify = tls_verify;
    }

    public Service withTls_verify(Boolean tls_verify) {
        this.tls_verify = tls_verify;
        return this;
    }

    @JsonProperty("tls_verify_depth")
    public Integer getTls_verify_depth() {
        return tls_verify_depth;
    }

    @JsonProperty("tls_verify_depth")
    public void setTls_verify_depth(Integer tls_verify_depth) {
        this.tls_verify_depth = tls_verify_depth;
    }

    public Service withTls_verify_depth(Integer tls_verify_depth) {
        this.tls_verify_depth = tls_verify_depth;
        return this;
    }

    @JsonProperty("updated_at")
    public Integer getUpdated_at() {
        return updated_at;
    }

    @JsonProperty("updated_at")
    public void setUpdated_at(Integer updated_at) {
        this.updated_at = updated_at;
    }

    public Service withUpdated_at(Integer updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Service withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("write_timeout")
    public Integer getWrite_timeout() {
        return write_timeout;
    }

    @JsonProperty("write_timeout")
    public void setWrite_timeout(Integer write_timeout) {
        this.write_timeout = write_timeout;
    }

    public Service withWrite_timeout(Integer write_timeout) {
        this.write_timeout = write_timeout;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Service.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ca_certificates");
        sb.append('=');
        sb.append(((this.ca_certificates == null) ? "<null>" : this.ca_certificates));
        sb.append(',');
        sb.append("client_certificate");
        sb.append('=');
        sb.append(((this.client_certificate == null) ? "<null>" : this.client_certificate));
        sb.append(',');
        sb.append("connect_timeout");
        sb.append('=');
        sb.append(((this.connect_timeout == null) ? "<null>" : this.connect_timeout));
        sb.append(',');
        sb.append("created_at");
        sb.append('=');
        sb.append(((this.created_at == null) ? "<null>" : this.created_at));
        sb.append(',');
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null) ? "<null>" : this.enabled));
        sb.append(',');
        sb.append("host");
        sb.append('=');
        sb.append(((this.host == null) ? "<null>" : this.host));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null) ? "<null>" : this.path));
        sb.append(',');
        sb.append("port");
        sb.append('=');
        sb.append(((this.port == null) ? "<null>" : this.port));
        sb.append(',');
        sb.append("protocol");
        sb.append('=');
        sb.append(((this.protocol == null) ? "<null>" : this.protocol));
        sb.append(',');
        sb.append("read_timeout");
        sb.append('=');
        sb.append(((this.read_timeout == null) ? "<null>" : this.read_timeout));
        sb.append(',');
        sb.append("retries");
        sb.append('=');
        sb.append(((this.retries == null) ? "<null>" : this.retries));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null) ? "<null>" : this.tags));
        sb.append(',');
        sb.append("tls_verify");
        sb.append('=');
        sb.append(((this.tls_verify == null) ? "<null>" : this.tls_verify));
        sb.append(',');
        sb.append("tls_verify_depth");
        sb.append('=');
        sb.append(((this.tls_verify_depth == null) ? "<null>" : this.tls_verify_depth));
        sb.append(',');
        sb.append("updated_at");
        sb.append('=');
        sb.append(((this.updated_at == null) ? "<null>" : this.updated_at));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null) ? "<null>" : this.url));
        sb.append(',');
        sb.append("write_timeout");
        sb.append('=');
        sb.append(((this.write_timeout == null) ? "<null>" : this.write_timeout));
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
        result = ((result * 31) + ((this.tls_verify == null) ? 0 : this.tls_verify.hashCode()));
        result = ((result * 31) + ((this.connect_timeout == null) ? 0 : this.connect_timeout.hashCode()));
        result = ((result * 31) + ((this.tls_verify_depth == null) ? 0 : this.tls_verify_depth.hashCode()));
        result = ((result * 31) + ((this.created_at == null) ? 0 : this.created_at.hashCode()));
        result = ((result * 31) + ((this.enabled == null) ? 0 : this.enabled.hashCode()));
        result = ((result * 31) + ((this.url == null) ? 0 : this.url.hashCode()));
        result = ((result * 31) + ((this.tags == null) ? 0 : this.tags.hashCode()));
        result = ((result * 31) + ((this.path == null) ? 0 : this.path.hashCode()));
        result = ((result * 31) + ((this.retries == null) ? 0 : this.retries.hashCode()));
        result = ((result * 31) + ((this.protocol == null) ? 0 : this.protocol.hashCode()));
        result = ((result * 31) + ((this.client_certificate == null) ? 0 : this.client_certificate.hashCode()));
        result = ((result * 31) + ((this.updated_at == null) ? 0 : this.updated_at.hashCode()));
        result = ((result * 31) + ((this.port == null) ? 0 : this.port.hashCode()));
        result = ((result * 31) + ((this.ca_certificates == null) ? 0 : this.ca_certificates.hashCode()));
        result = ((result * 31) + ((this.write_timeout == null) ? 0 : this.write_timeout.hashCode()));
        result = ((result * 31) + ((this.host == null) ? 0 : this.host.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.read_timeout == null) ? 0 : this.read_timeout.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Service) == false) {
            return false;
        }
        Service rhs = ((Service) other);
        return ((((((((((((((((((((this.tls_verify == rhs.tls_verify)
                || ((this.tls_verify != null) && this.tls_verify.equals(rhs.tls_verify)))
                && ((this.connect_timeout == rhs.connect_timeout)
                        || ((this.connect_timeout != null) && this.connect_timeout.equals(rhs.connect_timeout))))
                && ((this.tls_verify_depth == rhs.tls_verify_depth)
                        || ((this.tls_verify_depth != null) && this.tls_verify_depth.equals(rhs.tls_verify_depth))))
                && ((this.created_at == rhs.created_at)
                        || ((this.created_at != null) && this.created_at.equals(rhs.created_at))))
                && ((this.enabled == rhs.enabled) || ((this.enabled != null) && this.enabled.equals(rhs.enabled))))
                && ((this.url == rhs.url) || ((this.url != null) && this.url.equals(rhs.url))))
                && ((this.tags == rhs.tags) || ((this.tags != null) && this.tags.equals(rhs.tags))))
                && ((this.path == rhs.path) || ((this.path != null) && this.path.equals(rhs.path))))
                && ((this.retries == rhs.retries) || ((this.retries != null) && this.retries.equals(rhs.retries))))
                && ((this.protocol == rhs.protocol) || ((this.protocol != null) && this.protocol.equals(rhs.protocol))))
                && ((this.client_certificate == rhs.client_certificate)
                        || ((this.client_certificate != null) && this.client_certificate.equals(rhs.client_certificate))))
                && ((this.updated_at == rhs.updated_at)
                        || ((this.updated_at != null) && this.updated_at.equals(rhs.updated_at))))
                && ((this.port == rhs.port) || ((this.port != null) && this.port.equals(rhs.port))))
                && ((this.ca_certificates == rhs.ca_certificates)
                        || ((this.ca_certificates != null) && this.ca_certificates.equals(rhs.ca_certificates))))
                && ((this.write_timeout == rhs.write_timeout)
                        || ((this.write_timeout != null) && this.write_timeout.equals(rhs.write_timeout))))
                && ((this.host == rhs.host) || ((this.host != null) && this.host.equals(rhs.host))))
                && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name))))
                && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
                && ((this.read_timeout == rhs.read_timeout)
                        || ((this.read_timeout != null) && this.read_timeout.equals(rhs.read_timeout))));
    }

}
