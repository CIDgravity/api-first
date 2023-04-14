
package com.cidgravity.kong.generated;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "_config",
        "config",
        "consumer",
        "created_at",
        "enabled",
        "id",
        "name",
        "ordering",
        "protocols",
        "route",
        "run_on",
        "service",
        "tags"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class FPlugin {

    @JsonProperty("_config")
    private String _config;
    @JsonProperty("config")
    private Config config;
    @JsonProperty("consumer")
    private String consumer;
    @JsonProperty("created_at")
    private Integer created_at;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    @JsonProperty("ordering")
    private PluginOrdering ordering;
    @JsonProperty("protocols")
    private List<String> protocols = new ArrayList<String>();
    @JsonProperty("route")
    private String route;
    @JsonProperty("run_on")
    private String run_on;
    @JsonProperty("service")
    private String service;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();

    @JsonProperty("_config")
    public String get_config() {
        return _config;
    }

    @JsonProperty("_config")
    public void set_config(String _config) {
        this._config = _config;
    }

    public FPlugin with_config(String _config) {
        this._config = _config;
        return this;
    }

    @JsonProperty("config")
    public Config getConfig() {
        return config;
    }

    @JsonProperty("config")
    public void setConfig(Config config) {
        this.config = config;
    }

    public FPlugin withConfig(Config config) {
        this.config = config;
        return this;
    }

    @JsonProperty("consumer")
    public String getConsumer() {
        return consumer;
    }

    @JsonProperty("consumer")
    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public FPlugin withConsumer(String consumer) {
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

    public FPlugin withCreated_at(Integer created_at) {
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

    public FPlugin withEnabled(Boolean enabled) {
        this.enabled = enabled;
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

    public FPlugin withId(String id) {
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

    public FPlugin withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("ordering")
    public PluginOrdering getOrdering() {
        return ordering;
    }

    @JsonProperty("ordering")
    public void setOrdering(PluginOrdering ordering) {
        this.ordering = ordering;
    }

    public FPlugin withOrdering(PluginOrdering ordering) {
        this.ordering = ordering;
        return this;
    }

    @JsonProperty("protocols")
    public List<String> getProtocols() {
        return protocols;
    }

    @JsonProperty("protocols")
    public void setProtocols(List<String> protocols) {
        this.protocols = protocols;
    }

    public FPlugin withProtocols(List<String> protocols) {
        this.protocols = protocols;
        return this;
    }

    @JsonProperty("route")
    public String getRoute() {
        return route;
    }

    @JsonProperty("route")
    public void setRoute(String route) {
        this.route = route;
    }

    public FPlugin withRoute(String route) {
        this.route = route;
        return this;
    }

    @JsonProperty("run_on")
    public String getRun_on() {
        return run_on;
    }

    @JsonProperty("run_on")
    public void setRun_on(String run_on) {
        this.run_on = run_on;
    }

    public FPlugin withRun_on(String run_on) {
        this.run_on = run_on;
        return this;
    }

    @JsonProperty("service")
    public String getService() {
        return service;
    }

    @JsonProperty("service")
    public void setService(String service) {
        this.service = service;
    }

    public FPlugin withService(String service) {
        this.service = service;
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

    public FPlugin withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FPlugin.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_config");
        sb.append('=');
        sb.append(((this._config == null) ? "<null>" : this._config));
        sb.append(',');
        sb.append("config");
        sb.append('=');
        sb.append(((this.config == null) ? "<null>" : this.config));
        sb.append(',');
        sb.append("consumer");
        sb.append('=');
        sb.append(((this.consumer == null) ? "<null>" : this.consumer));
        sb.append(',');
        sb.append("created_at");
        sb.append('=');
        sb.append(((this.created_at == null) ? "<null>" : this.created_at));
        sb.append(',');
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null) ? "<null>" : this.enabled));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("ordering");
        sb.append('=');
        sb.append(((this.ordering == null) ? "<null>" : this.ordering));
        sb.append(',');
        sb.append("protocols");
        sb.append('=');
        sb.append(((this.protocols == null) ? "<null>" : this.protocols));
        sb.append(',');
        sb.append("route");
        sb.append('=');
        sb.append(((this.route == null) ? "<null>" : this.route));
        sb.append(',');
        sb.append("run_on");
        sb.append('=');
        sb.append(((this.run_on == null) ? "<null>" : this.run_on));
        sb.append(',');
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null) ? "<null>" : this.service));
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
        result = ((result * 31) + ((this.ordering == null) ? 0 : this.ordering.hashCode()));
        result = ((result * 31) + ((this.created_at == null) ? 0 : this.created_at.hashCode()));
        result = ((result * 31) + ((this._config == null) ? 0 : this._config.hashCode()));
        result = ((result * 31) + ((this.enabled == null) ? 0 : this.enabled.hashCode()));
        result = ((result * 31) + ((this.tags == null) ? 0 : this.tags.hashCode()));
        result = ((result * 31) + ((this.route == null) ? 0 : this.route.hashCode()));
        result = ((result * 31) + ((this.service == null) ? 0 : this.service.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.protocols == null) ? 0 : this.protocols.hashCode()));
        result = ((result * 31) + ((this.config == null) ? 0 : this.config.hashCode()));
        result = ((result * 31) + ((this.consumer == null) ? 0 : this.consumer.hashCode()));
        result = ((result * 31) + ((this.run_on == null) ? 0 : this.run_on.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FPlugin) == false) {
            return false;
        }
        FPlugin rhs = ((FPlugin) other);
        return ((((((((((((((this.ordering == rhs.ordering) || ((this.ordering != null) && this.ordering.equals(rhs.ordering)))
                && ((this.created_at == rhs.created_at)
                        || ((this.created_at != null) && this.created_at.equals(rhs.created_at))))
                && ((this._config == rhs._config) || ((this._config != null) && this._config.equals(rhs._config))))
                && ((this.enabled == rhs.enabled) || ((this.enabled != null) && this.enabled.equals(rhs.enabled))))
                && ((this.tags == rhs.tags) || ((this.tags != null) && this.tags.equals(rhs.tags))))
                && ((this.route == rhs.route) || ((this.route != null) && this.route.equals(rhs.route))))
                && ((this.service == rhs.service) || ((this.service != null) && this.service.equals(rhs.service))))
                && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name))))
                && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
                && ((this.protocols == rhs.protocols) || ((this.protocols != null) && this.protocols.equals(rhs.protocols))))
                && ((this.config == rhs.config) || ((this.config != null) && this.config.equals(rhs.config))))
                && ((this.consumer == rhs.consumer) || ((this.consumer != null) && this.consumer.equals(rhs.consumer))))
                && ((this.run_on == rhs.run_on) || ((this.run_on != null) && this.run_on.equals(rhs.run_on))));
    }

}
