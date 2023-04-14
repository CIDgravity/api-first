
package com.cidgravity.kong.generated;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "algorithm",
        "client_certificate",
        "created_at",
        "hash_fallback",
        "hash_fallback_header",
        "hash_fallback_query_arg",
        "hash_fallback_uri_capture",
        "hash_on",
        "hash_on_cookie",
        "hash_on_cookie_path",
        "hash_on_header",
        "hash_on_query_arg",
        "hash_on_uri_capture",
        "healthchecks",
        "host_header",
        "id",
        "name",
        "slots",
        "tags"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class Upstream {

    @JsonProperty("algorithm")
    private String algorithm;
    @JsonProperty("client_certificate")
    private Certificate client_certificate;
    @JsonProperty("created_at")
    private Integer created_at;
    @JsonProperty("hash_fallback")
    private String hash_fallback;
    @JsonProperty("hash_fallback_header")
    private String hash_fallback_header;
    @JsonProperty("hash_fallback_query_arg")
    private String hash_fallback_query_arg;
    @JsonProperty("hash_fallback_uri_capture")
    private String hash_fallback_uri_capture;
    @JsonProperty("hash_on")
    private String hash_on;
    @JsonProperty("hash_on_cookie")
    private String hash_on_cookie;
    @JsonProperty("hash_on_cookie_path")
    private String hash_on_cookie_path;
    @JsonProperty("hash_on_header")
    private String hash_on_header;
    @JsonProperty("hash_on_query_arg")
    private String hash_on_query_arg;
    @JsonProperty("hash_on_uri_capture")
    private String hash_on_uri_capture;
    @JsonProperty("healthchecks")
    private Healthcheck healthchecks;
    @JsonProperty("host_header")
    private String host_header;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("slots")
    private Integer slots;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();

    @JsonProperty("algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    @JsonProperty("algorithm")
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public Upstream withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
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

    public Upstream withClient_certificate(Certificate client_certificate) {
        this.client_certificate = client_certificate;
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

    public Upstream withCreated_at(Integer created_at) {
        this.created_at = created_at;
        return this;
    }

    @JsonProperty("hash_fallback")
    public String getHash_fallback() {
        return hash_fallback;
    }

    @JsonProperty("hash_fallback")
    public void setHash_fallback(String hash_fallback) {
        this.hash_fallback = hash_fallback;
    }

    public Upstream withHash_fallback(String hash_fallback) {
        this.hash_fallback = hash_fallback;
        return this;
    }

    @JsonProperty("hash_fallback_header")
    public String getHash_fallback_header() {
        return hash_fallback_header;
    }

    @JsonProperty("hash_fallback_header")
    public void setHash_fallback_header(String hash_fallback_header) {
        this.hash_fallback_header = hash_fallback_header;
    }

    public Upstream withHash_fallback_header(String hash_fallback_header) {
        this.hash_fallback_header = hash_fallback_header;
        return this;
    }

    @JsonProperty("hash_fallback_query_arg")
    public String getHash_fallback_query_arg() {
        return hash_fallback_query_arg;
    }

    @JsonProperty("hash_fallback_query_arg")
    public void setHash_fallback_query_arg(String hash_fallback_query_arg) {
        this.hash_fallback_query_arg = hash_fallback_query_arg;
    }

    public Upstream withHash_fallback_query_arg(String hash_fallback_query_arg) {
        this.hash_fallback_query_arg = hash_fallback_query_arg;
        return this;
    }

    @JsonProperty("hash_fallback_uri_capture")
    public String getHash_fallback_uri_capture() {
        return hash_fallback_uri_capture;
    }

    @JsonProperty("hash_fallback_uri_capture")
    public void setHash_fallback_uri_capture(String hash_fallback_uri_capture) {
        this.hash_fallback_uri_capture = hash_fallback_uri_capture;
    }

    public Upstream withHash_fallback_uri_capture(String hash_fallback_uri_capture) {
        this.hash_fallback_uri_capture = hash_fallback_uri_capture;
        return this;
    }

    @JsonProperty("hash_on")
    public String getHash_on() {
        return hash_on;
    }

    @JsonProperty("hash_on")
    public void setHash_on(String hash_on) {
        this.hash_on = hash_on;
    }

    public Upstream withHash_on(String hash_on) {
        this.hash_on = hash_on;
        return this;
    }

    @JsonProperty("hash_on_cookie")
    public String getHash_on_cookie() {
        return hash_on_cookie;
    }

    @JsonProperty("hash_on_cookie")
    public void setHash_on_cookie(String hash_on_cookie) {
        this.hash_on_cookie = hash_on_cookie;
    }

    public Upstream withHash_on_cookie(String hash_on_cookie) {
        this.hash_on_cookie = hash_on_cookie;
        return this;
    }

    @JsonProperty("hash_on_cookie_path")
    public String getHash_on_cookie_path() {
        return hash_on_cookie_path;
    }

    @JsonProperty("hash_on_cookie_path")
    public void setHash_on_cookie_path(String hash_on_cookie_path) {
        this.hash_on_cookie_path = hash_on_cookie_path;
    }

    public Upstream withHash_on_cookie_path(String hash_on_cookie_path) {
        this.hash_on_cookie_path = hash_on_cookie_path;
        return this;
    }

    @JsonProperty("hash_on_header")
    public String getHash_on_header() {
        return hash_on_header;
    }

    @JsonProperty("hash_on_header")
    public void setHash_on_header(String hash_on_header) {
        this.hash_on_header = hash_on_header;
    }

    public Upstream withHash_on_header(String hash_on_header) {
        this.hash_on_header = hash_on_header;
        return this;
    }

    @JsonProperty("hash_on_query_arg")
    public String getHash_on_query_arg() {
        return hash_on_query_arg;
    }

    @JsonProperty("hash_on_query_arg")
    public void setHash_on_query_arg(String hash_on_query_arg) {
        this.hash_on_query_arg = hash_on_query_arg;
    }

    public Upstream withHash_on_query_arg(String hash_on_query_arg) {
        this.hash_on_query_arg = hash_on_query_arg;
        return this;
    }

    @JsonProperty("hash_on_uri_capture")
    public String getHash_on_uri_capture() {
        return hash_on_uri_capture;
    }

    @JsonProperty("hash_on_uri_capture")
    public void setHash_on_uri_capture(String hash_on_uri_capture) {
        this.hash_on_uri_capture = hash_on_uri_capture;
    }

    public Upstream withHash_on_uri_capture(String hash_on_uri_capture) {
        this.hash_on_uri_capture = hash_on_uri_capture;
        return this;
    }

    @JsonProperty("healthchecks")
    public Healthcheck getHealthchecks() {
        return healthchecks;
    }

    @JsonProperty("healthchecks")
    public void setHealthchecks(Healthcheck healthchecks) {
        this.healthchecks = healthchecks;
    }

    public Upstream withHealthchecks(Healthcheck healthchecks) {
        this.healthchecks = healthchecks;
        return this;
    }

    @JsonProperty("host_header")
    public String getHost_header() {
        return host_header;
    }

    @JsonProperty("host_header")
    public void setHost_header(String host_header) {
        this.host_header = host_header;
    }

    public Upstream withHost_header(String host_header) {
        this.host_header = host_header;
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

    public Upstream withId(String id) {
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

    public Upstream withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("slots")
    public Integer getSlots() {
        return slots;
    }

    @JsonProperty("slots")
    public void setSlots(Integer slots) {
        this.slots = slots;
    }

    public Upstream withSlots(Integer slots) {
        this.slots = slots;
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

    public Upstream withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Upstream.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("algorithm");
        sb.append('=');
        sb.append(((this.algorithm == null) ? "<null>" : this.algorithm));
        sb.append(',');
        sb.append("client_certificate");
        sb.append('=');
        sb.append(((this.client_certificate == null) ? "<null>" : this.client_certificate));
        sb.append(',');
        sb.append("created_at");
        sb.append('=');
        sb.append(((this.created_at == null) ? "<null>" : this.created_at));
        sb.append(',');
        sb.append("hash_fallback");
        sb.append('=');
        sb.append(((this.hash_fallback == null) ? "<null>" : this.hash_fallback));
        sb.append(',');
        sb.append("hash_fallback_header");
        sb.append('=');
        sb.append(((this.hash_fallback_header == null) ? "<null>" : this.hash_fallback_header));
        sb.append(',');
        sb.append("hash_fallback_query_arg");
        sb.append('=');
        sb.append(((this.hash_fallback_query_arg == null) ? "<null>" : this.hash_fallback_query_arg));
        sb.append(',');
        sb.append("hash_fallback_uri_capture");
        sb.append('=');
        sb.append(((this.hash_fallback_uri_capture == null) ? "<null>" : this.hash_fallback_uri_capture));
        sb.append(',');
        sb.append("hash_on");
        sb.append('=');
        sb.append(((this.hash_on == null) ? "<null>" : this.hash_on));
        sb.append(',');
        sb.append("hash_on_cookie");
        sb.append('=');
        sb.append(((this.hash_on_cookie == null) ? "<null>" : this.hash_on_cookie));
        sb.append(',');
        sb.append("hash_on_cookie_path");
        sb.append('=');
        sb.append(((this.hash_on_cookie_path == null) ? "<null>" : this.hash_on_cookie_path));
        sb.append(',');
        sb.append("hash_on_header");
        sb.append('=');
        sb.append(((this.hash_on_header == null) ? "<null>" : this.hash_on_header));
        sb.append(',');
        sb.append("hash_on_query_arg");
        sb.append('=');
        sb.append(((this.hash_on_query_arg == null) ? "<null>" : this.hash_on_query_arg));
        sb.append(',');
        sb.append("hash_on_uri_capture");
        sb.append('=');
        sb.append(((this.hash_on_uri_capture == null) ? "<null>" : this.hash_on_uri_capture));
        sb.append(',');
        sb.append("healthchecks");
        sb.append('=');
        sb.append(((this.healthchecks == null) ? "<null>" : this.healthchecks));
        sb.append(',');
        sb.append("host_header");
        sb.append('=');
        sb.append(((this.host_header == null) ? "<null>" : this.host_header));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("slots");
        sb.append('=');
        sb.append(((this.slots == null) ? "<null>" : this.slots));
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
        result = ((result * 31) + ((this.hash_on_cookie == null) ? 0 : this.hash_on_cookie.hashCode()));
        result = ((result * 31) + ((this.hash_on == null) ? 0 : this.hash_on.hashCode()));
        result = ((result * 31) + ((this.healthchecks == null) ? 0 : this.healthchecks.hashCode()));
        result = ((result * 31) + ((this.created_at == null) ? 0 : this.created_at.hashCode()));
        result = ((result * 31) + ((this.hash_fallback_uri_capture == null) ? 0 : this.hash_fallback_uri_capture.hashCode()));
        result = ((result * 31) + ((this.hash_on_uri_capture == null) ? 0 : this.hash_on_uri_capture.hashCode()));
        result = ((result * 31) + ((this.host_header == null) ? 0 : this.host_header.hashCode()));
        result = ((result * 31) + ((this.tags == null) ? 0 : this.tags.hashCode()));
        result = ((result * 31) + ((this.hash_fallback_query_arg == null) ? 0 : this.hash_fallback_query_arg.hashCode()));
        result = ((result * 31) + ((this.hash_fallback == null) ? 0 : this.hash_fallback.hashCode()));
        result = ((result * 31) + ((this.slots == null) ? 0 : this.slots.hashCode()));
        result = ((result * 31) + ((this.client_certificate == null) ? 0 : this.client_certificate.hashCode()));
        result = ((result * 31) + ((this.hash_on_header == null) ? 0 : this.hash_on_header.hashCode()));
        result = ((result * 31) + ((this.hash_on_cookie_path == null) ? 0 : this.hash_on_cookie_path.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.hash_fallback_header == null) ? 0 : this.hash_fallback_header.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.algorithm == null) ? 0 : this.algorithm.hashCode()));
        result = ((result * 31) + ((this.hash_on_query_arg == null) ? 0 : this.hash_on_query_arg.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Upstream) == false) {
            return false;
        }
        Upstream rhs = ((Upstream) other);
        return ((((((((((((((((((((this.hash_on_cookie == rhs.hash_on_cookie)
                || ((this.hash_on_cookie != null) && this.hash_on_cookie.equals(rhs.hash_on_cookie)))
                && ((this.hash_on == rhs.hash_on) || ((this.hash_on != null) && this.hash_on.equals(rhs.hash_on))))
                && ((this.healthchecks == rhs.healthchecks)
                        || ((this.healthchecks != null) && this.healthchecks.equals(rhs.healthchecks))))
                && ((this.created_at == rhs.created_at)
                        || ((this.created_at != null) && this.created_at.equals(rhs.created_at))))
                && ((this.hash_fallback_uri_capture == rhs.hash_fallback_uri_capture)
                        || ((this.hash_fallback_uri_capture != null)
                                && this.hash_fallback_uri_capture.equals(rhs.hash_fallback_uri_capture))))
                && ((this.hash_on_uri_capture == rhs.hash_on_uri_capture)
                        || ((this.hash_on_uri_capture != null) && this.hash_on_uri_capture.equals(rhs.hash_on_uri_capture))))
                && ((this.host_header == rhs.host_header)
                        || ((this.host_header != null) && this.host_header.equals(rhs.host_header))))
                && ((this.tags == rhs.tags) || ((this.tags != null) && this.tags.equals(rhs.tags))))
                && ((this.hash_fallback_query_arg == rhs.hash_fallback_query_arg) || ((this.hash_fallback_query_arg != null)
                        && this.hash_fallback_query_arg.equals(rhs.hash_fallback_query_arg))))
                && ((this.hash_fallback == rhs.hash_fallback)
                        || ((this.hash_fallback != null) && this.hash_fallback.equals(rhs.hash_fallback))))
                && ((this.slots == rhs.slots) || ((this.slots != null) && this.slots.equals(rhs.slots))))
                && ((this.client_certificate == rhs.client_certificate)
                        || ((this.client_certificate != null) && this.client_certificate.equals(rhs.client_certificate))))
                && ((this.hash_on_header == rhs.hash_on_header)
                        || ((this.hash_on_header != null) && this.hash_on_header.equals(rhs.hash_on_header))))
                && ((this.hash_on_cookie_path == rhs.hash_on_cookie_path)
                        || ((this.hash_on_cookie_path != null) && this.hash_on_cookie_path.equals(rhs.hash_on_cookie_path))))
                && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name))))
                && ((this.hash_fallback_header == rhs.hash_fallback_header)
                        || ((this.hash_fallback_header != null) && this.hash_fallback_header.equals(rhs.hash_fallback_header))))
                && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
                && ((this.algorithm == rhs.algorithm) || ((this.algorithm != null) && this.algorithm.equals(rhs.algorithm))))
                && ((this.hash_on_query_arg == rhs.hash_on_query_arg)
                        || ((this.hash_on_query_arg != null) && this.hash_on_query_arg.equals(rhs.hash_on_query_arg))));
    }

}
