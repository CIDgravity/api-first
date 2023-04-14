
package com.cidgravity.kong.generated;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "concurrency",
        "healthy",
        "http_path",
        "https_sni",
        "https_verify_certificate",
        "timeout",
        "type",
        "unhealthy"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class ActiveHealthcheck {

    @JsonProperty("concurrency")
    private Integer concurrency;
    @JsonProperty("healthy")
    private Healthy healthy;
    @JsonProperty("http_path")
    private String http_path;
    @JsonProperty("https_sni")
    private String https_sni;
    @JsonProperty("https_verify_certificate")
    private Boolean https_verify_certificate;
    @JsonProperty("timeout")
    private Integer timeout;
    @JsonProperty("type")
    private String type;
    @JsonProperty("unhealthy")
    private Unhealthy unhealthy;

    @JsonProperty("concurrency")
    public Integer getConcurrency() {
        return concurrency;
    }

    @JsonProperty("concurrency")
    public void setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
    }

    public ActiveHealthcheck withConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

    @JsonProperty("healthy")
    public Healthy getHealthy() {
        return healthy;
    }

    @JsonProperty("healthy")
    public void setHealthy(Healthy healthy) {
        this.healthy = healthy;
    }

    public ActiveHealthcheck withHealthy(Healthy healthy) {
        this.healthy = healthy;
        return this;
    }

    @JsonProperty("http_path")
    public String getHttp_path() {
        return http_path;
    }

    @JsonProperty("http_path")
    public void setHttp_path(String http_path) {
        this.http_path = http_path;
    }

    public ActiveHealthcheck withHttp_path(String http_path) {
        this.http_path = http_path;
        return this;
    }

    @JsonProperty("https_sni")
    public String getHttps_sni() {
        return https_sni;
    }

    @JsonProperty("https_sni")
    public void setHttps_sni(String https_sni) {
        this.https_sni = https_sni;
    }

    public ActiveHealthcheck withHttps_sni(String https_sni) {
        this.https_sni = https_sni;
        return this;
    }

    @JsonProperty("https_verify_certificate")
    public Boolean getHttps_verify_certificate() {
        return https_verify_certificate;
    }

    @JsonProperty("https_verify_certificate")
    public void setHttps_verify_certificate(Boolean https_verify_certificate) {
        this.https_verify_certificate = https_verify_certificate;
    }

    public ActiveHealthcheck withHttps_verify_certificate(Boolean https_verify_certificate) {
        this.https_verify_certificate = https_verify_certificate;
        return this;
    }

    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public ActiveHealthcheck withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public ActiveHealthcheck withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("unhealthy")
    public Unhealthy getUnhealthy() {
        return unhealthy;
    }

    @JsonProperty("unhealthy")
    public void setUnhealthy(Unhealthy unhealthy) {
        this.unhealthy = unhealthy;
    }

    public ActiveHealthcheck withUnhealthy(Unhealthy unhealthy) {
        this.unhealthy = unhealthy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ActiveHealthcheck.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("concurrency");
        sb.append('=');
        sb.append(((this.concurrency == null) ? "<null>" : this.concurrency));
        sb.append(',');
        sb.append("healthy");
        sb.append('=');
        sb.append(((this.healthy == null) ? "<null>" : this.healthy));
        sb.append(',');
        sb.append("http_path");
        sb.append('=');
        sb.append(((this.http_path == null) ? "<null>" : this.http_path));
        sb.append(',');
        sb.append("https_sni");
        sb.append('=');
        sb.append(((this.https_sni == null) ? "<null>" : this.https_sni));
        sb.append(',');
        sb.append("https_verify_certificate");
        sb.append('=');
        sb.append(((this.https_verify_certificate == null) ? "<null>" : this.https_verify_certificate));
        sb.append(',');
        sb.append("timeout");
        sb.append('=');
        sb.append(((this.timeout == null) ? "<null>" : this.timeout));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("unhealthy");
        sb.append('=');
        sb.append(((this.unhealthy == null) ? "<null>" : this.unhealthy));
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
        result = ((result * 31) + ((this.https_sni == null) ? 0 : this.https_sni.hashCode()));
        result = ((result * 31) + ((this.healthy == null) ? 0 : this.healthy.hashCode()));
        result = ((result * 31) + ((this.unhealthy == null) ? 0 : this.unhealthy.hashCode()));
        result = ((result * 31) + ((this.http_path == null) ? 0 : this.http_path.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.https_verify_certificate == null) ? 0 : this.https_verify_certificate.hashCode()));
        result = ((result * 31) + ((this.timeout == null) ? 0 : this.timeout.hashCode()));
        result = ((result * 31) + ((this.concurrency == null) ? 0 : this.concurrency.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActiveHealthcheck) == false) {
            return false;
        }
        ActiveHealthcheck rhs = ((ActiveHealthcheck) other);
        return (((((((((this.https_sni == rhs.https_sni) || ((this.https_sni != null) && this.https_sni.equals(rhs.https_sni)))
                && ((this.healthy == rhs.healthy) || ((this.healthy != null) && this.healthy.equals(rhs.healthy))))
                && ((this.unhealthy == rhs.unhealthy) || ((this.unhealthy != null) && this.unhealthy.equals(rhs.unhealthy))))
                && ((this.http_path == rhs.http_path) || ((this.http_path != null) && this.http_path.equals(rhs.http_path))))
                && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))))
                && ((this.https_verify_certificate == rhs.https_verify_certificate) || ((this.https_verify_certificate != null)
                        && this.https_verify_certificate.equals(rhs.https_verify_certificate))))
                && ((this.timeout == rhs.timeout) || ((this.timeout != null) && this.timeout.equals(rhs.timeout))))
                && ((this.concurrency == rhs.concurrency)
                        || ((this.concurrency != null) && this.concurrency.equals(rhs.concurrency))));
    }

}
