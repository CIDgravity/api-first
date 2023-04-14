
package com.cidgravity.kong.generated;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "created_at",
        "destinations",
        "expression",
        "headers",
        "hosts",
        "https_redirect_status_code",
        "id",
        "methods",
        "name",
        "path_handling",
        "paths",
        "plugins",
        "preserve_host",
        "priority",
        "protocols",
        "regex_priority",
        "request_buffering",
        "response_buffering",
        "service",
        "snis",
        "sources",
        "strip_path",
        "tags",
        "updated_at"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class FRoute {

    @JsonProperty("created_at")
    private Integer created_at;
    @JsonProperty("destinations")
    private List<CIDRPort> destinations = new ArrayList<CIDRPort>();
    @JsonProperty("expression")
    private String expression;
    @JsonProperty("headers")
    private Headers__1 headers;
    @JsonProperty("hosts")
    private List<String> hosts = new ArrayList<String>();
    @JsonProperty("https_redirect_status_code")
    private Integer https_redirect_status_code;
    @JsonProperty("id")
    private String id;
    @JsonProperty("methods")
    private List<String> methods = new ArrayList<String>();
    @JsonProperty("name")
    private String name;
    @JsonProperty("path_handling")
    private String path_handling;
    @JsonProperty("paths")
    private List<String> paths = new ArrayList<String>();
    @JsonProperty("plugins")
    private List<FPlugin> plugins = new ArrayList<FPlugin>();
    @JsonProperty("preserve_host")
    private Boolean preserve_host;
    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("protocols")
    private List<String> protocols = new ArrayList<String>();
    @JsonProperty("regex_priority")
    private Integer regex_priority;
    @JsonProperty("request_buffering")
    private Boolean request_buffering;
    @JsonProperty("response_buffering")
    private Boolean response_buffering;
    @JsonProperty("service")
    private Service service;
    @JsonProperty("snis")
    private List<String> snis = new ArrayList<String>();
    @JsonProperty("sources")
    private List<CIDRPort> sources = new ArrayList<CIDRPort>();
    @JsonProperty("strip_path")
    private Boolean strip_path;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("updated_at")
    private Integer updated_at;

    @JsonProperty("created_at")
    public Integer getCreated_at() {
        return created_at;
    }

    @JsonProperty("created_at")
    public void setCreated_at(Integer created_at) {
        this.created_at = created_at;
    }

    public FRoute withCreated_at(Integer created_at) {
        this.created_at = created_at;
        return this;
    }

    @JsonProperty("destinations")
    public List<CIDRPort> getDestinations() {
        return destinations;
    }

    @JsonProperty("destinations")
    public void setDestinations(List<CIDRPort> destinations) {
        this.destinations = destinations;
    }

    public FRoute withDestinations(List<CIDRPort> destinations) {
        this.destinations = destinations;
        return this;
    }

    @JsonProperty("expression")
    public String getExpression() {
        return expression;
    }

    @JsonProperty("expression")
    public void setExpression(String expression) {
        this.expression = expression;
    }

    public FRoute withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    @JsonProperty("headers")
    public Headers__1 getHeaders() {
        return headers;
    }

    @JsonProperty("headers")
    public void setHeaders(Headers__1 headers) {
        this.headers = headers;
    }

    public FRoute withHeaders(Headers__1 headers) {
        this.headers = headers;
        return this;
    }

    @JsonProperty("hosts")
    public List<String> getHosts() {
        return hosts;
    }

    @JsonProperty("hosts")
    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public FRoute withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    @JsonProperty("https_redirect_status_code")
    public Integer getHttps_redirect_status_code() {
        return https_redirect_status_code;
    }

    @JsonProperty("https_redirect_status_code")
    public void setHttps_redirect_status_code(Integer https_redirect_status_code) {
        this.https_redirect_status_code = https_redirect_status_code;
    }

    public FRoute withHttps_redirect_status_code(Integer https_redirect_status_code) {
        this.https_redirect_status_code = https_redirect_status_code;
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

    public FRoute withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("methods")
    public List<String> getMethods() {
        return methods;
    }

    @JsonProperty("methods")
    public void setMethods(List<String> methods) {
        this.methods = methods;
    }

    public FRoute withMethods(List<String> methods) {
        this.methods = methods;
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

    public FRoute withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("path_handling")
    public String getPath_handling() {
        return path_handling;
    }

    @JsonProperty("path_handling")
    public void setPath_handling(String path_handling) {
        this.path_handling = path_handling;
    }

    public FRoute withPath_handling(String path_handling) {
        this.path_handling = path_handling;
        return this;
    }

    @JsonProperty("paths")
    public List<String> getPaths() {
        return paths;
    }

    @JsonProperty("paths")
    public void setPaths(List<String> paths) {
        this.paths = paths;
    }

    public FRoute withPaths(List<String> paths) {
        this.paths = paths;
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

    public FRoute withPlugins(List<FPlugin> plugins) {
        this.plugins = plugins;
        return this;
    }

    @JsonProperty("preserve_host")
    public Boolean getPreserve_host() {
        return preserve_host;
    }

    @JsonProperty("preserve_host")
    public void setPreserve_host(Boolean preserve_host) {
        this.preserve_host = preserve_host;
    }

    public FRoute withPreserve_host(Boolean preserve_host) {
        this.preserve_host = preserve_host;
        return this;
    }

    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public FRoute withPriority(Integer priority) {
        this.priority = priority;
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

    public FRoute withProtocols(List<String> protocols) {
        this.protocols = protocols;
        return this;
    }

    @JsonProperty("regex_priority")
    public Integer getRegex_priority() {
        return regex_priority;
    }

    @JsonProperty("regex_priority")
    public void setRegex_priority(Integer regex_priority) {
        this.regex_priority = regex_priority;
    }

    public FRoute withRegex_priority(Integer regex_priority) {
        this.regex_priority = regex_priority;
        return this;
    }

    @JsonProperty("request_buffering")
    public Boolean getRequest_buffering() {
        return request_buffering;
    }

    @JsonProperty("request_buffering")
    public void setRequest_buffering(Boolean request_buffering) {
        this.request_buffering = request_buffering;
    }

    public FRoute withRequest_buffering(Boolean request_buffering) {
        this.request_buffering = request_buffering;
        return this;
    }

    @JsonProperty("response_buffering")
    public Boolean getResponse_buffering() {
        return response_buffering;
    }

    @JsonProperty("response_buffering")
    public void setResponse_buffering(Boolean response_buffering) {
        this.response_buffering = response_buffering;
    }

    public FRoute withResponse_buffering(Boolean response_buffering) {
        this.response_buffering = response_buffering;
        return this;
    }

    @JsonProperty("service")
    public Service getService() {
        return service;
    }

    @JsonProperty("service")
    public void setService(Service service) {
        this.service = service;
    }

    public FRoute withService(Service service) {
        this.service = service;
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

    public FRoute withSnis(List<String> snis) {
        this.snis = snis;
        return this;
    }

    @JsonProperty("sources")
    public List<CIDRPort> getSources() {
        return sources;
    }

    @JsonProperty("sources")
    public void setSources(List<CIDRPort> sources) {
        this.sources = sources;
    }

    public FRoute withSources(List<CIDRPort> sources) {
        this.sources = sources;
        return this;
    }

    @JsonProperty("strip_path")
    public Boolean getStrip_path() {
        return strip_path;
    }

    @JsonProperty("strip_path")
    public void setStrip_path(Boolean strip_path) {
        this.strip_path = strip_path;
    }

    public FRoute withStrip_path(Boolean strip_path) {
        this.strip_path = strip_path;
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

    public FRoute withTags(List<String> tags) {
        this.tags = tags;
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

    public FRoute withUpdated_at(Integer updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FRoute.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("created_at");
        sb.append('=');
        sb.append(((this.created_at == null) ? "<null>" : this.created_at));
        sb.append(',');
        sb.append("destinations");
        sb.append('=');
        sb.append(((this.destinations == null) ? "<null>" : this.destinations));
        sb.append(',');
        sb.append("expression");
        sb.append('=');
        sb.append(((this.expression == null) ? "<null>" : this.expression));
        sb.append(',');
        sb.append("headers");
        sb.append('=');
        sb.append(((this.headers == null) ? "<null>" : this.headers));
        sb.append(',');
        sb.append("hosts");
        sb.append('=');
        sb.append(((this.hosts == null) ? "<null>" : this.hosts));
        sb.append(',');
        sb.append("https_redirect_status_code");
        sb.append('=');
        sb.append(((this.https_redirect_status_code == null) ? "<null>" : this.https_redirect_status_code));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("methods");
        sb.append('=');
        sb.append(((this.methods == null) ? "<null>" : this.methods));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("path_handling");
        sb.append('=');
        sb.append(((this.path_handling == null) ? "<null>" : this.path_handling));
        sb.append(',');
        sb.append("paths");
        sb.append('=');
        sb.append(((this.paths == null) ? "<null>" : this.paths));
        sb.append(',');
        sb.append("plugins");
        sb.append('=');
        sb.append(((this.plugins == null) ? "<null>" : this.plugins));
        sb.append(',');
        sb.append("preserve_host");
        sb.append('=');
        sb.append(((this.preserve_host == null) ? "<null>" : this.preserve_host));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null) ? "<null>" : this.priority));
        sb.append(',');
        sb.append("protocols");
        sb.append('=');
        sb.append(((this.protocols == null) ? "<null>" : this.protocols));
        sb.append(',');
        sb.append("regex_priority");
        sb.append('=');
        sb.append(((this.regex_priority == null) ? "<null>" : this.regex_priority));
        sb.append(',');
        sb.append("request_buffering");
        sb.append('=');
        sb.append(((this.request_buffering == null) ? "<null>" : this.request_buffering));
        sb.append(',');
        sb.append("response_buffering");
        sb.append('=');
        sb.append(((this.response_buffering == null) ? "<null>" : this.response_buffering));
        sb.append(',');
        sb.append("service");
        sb.append('=');
        sb.append(((this.service == null) ? "<null>" : this.service));
        sb.append(',');
        sb.append("snis");
        sb.append('=');
        sb.append(((this.snis == null) ? "<null>" : this.snis));
        sb.append(',');
        sb.append("sources");
        sb.append('=');
        sb.append(((this.sources == null) ? "<null>" : this.sources));
        sb.append(',');
        sb.append("strip_path");
        sb.append('=');
        sb.append(((this.strip_path == null) ? "<null>" : this.strip_path));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null) ? "<null>" : this.tags));
        sb.append(',');
        sb.append("updated_at");
        sb.append('=');
        sb.append(((this.updated_at == null) ? "<null>" : this.updated_at));
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
        result = ((result * 31) + ((this.request_buffering == null) ? 0 : this.request_buffering.hashCode()));
        result = ((result * 31) + ((this.sources == null) ? 0 : this.sources.hashCode()));
        result = ((result * 31) + ((this.methods == null) ? 0 : this.methods.hashCode()));
        result = ((result * 31) + ((this.plugins == null) ? 0 : this.plugins.hashCode()));
        result = ((result * 31) + ((this.https_redirect_status_code == null) ? 0 : this.https_redirect_status_code.hashCode()));
        result = ((result * 31) + ((this.created_at == null) ? 0 : this.created_at.hashCode()));
        result = ((result * 31) + ((this.response_buffering == null) ? 0 : this.response_buffering.hashCode()));
        result = ((result * 31) + ((this.updated_at == null) ? 0 : this.updated_at.hashCode()));
        result = ((result * 31) + ((this.regex_priority == null) ? 0 : this.regex_priority.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.protocols == null) ? 0 : this.protocols.hashCode()));
        result = ((result * 31) + ((this.headers == null) ? 0 : this.headers.hashCode()));
        result = ((result * 31) + ((this.path_handling == null) ? 0 : this.path_handling.hashCode()));
        result = ((result * 31) + ((this.expression == null) ? 0 : this.expression.hashCode()));
        result = ((result * 31) + ((this.hosts == null) ? 0 : this.hosts.hashCode()));
        result = ((result * 31) + ((this.destinations == null) ? 0 : this.destinations.hashCode()));
        result = ((result * 31) + ((this.preserve_host == null) ? 0 : this.preserve_host.hashCode()));
        result = ((result * 31) + ((this.priority == null) ? 0 : this.priority.hashCode()));
        result = ((result * 31) + ((this.strip_path == null) ? 0 : this.strip_path.hashCode()));
        result = ((result * 31) + ((this.tags == null) ? 0 : this.tags.hashCode()));
        result = ((result * 31) + ((this.snis == null) ? 0 : this.snis.hashCode()));
        result = ((result * 31) + ((this.paths == null) ? 0 : this.paths.hashCode()));
        result = ((result * 31) + ((this.service == null) ? 0 : this.service.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FRoute) == false) {
            return false;
        }
        FRoute rhs = ((FRoute) other);
        return (((((((((((((((((((((((((this.request_buffering == rhs.request_buffering)
                || ((this.request_buffering != null) && this.request_buffering.equals(rhs.request_buffering)))
                && ((this.sources == rhs.sources) || ((this.sources != null) && this.sources.equals(rhs.sources))))
                && ((this.methods == rhs.methods) || ((this.methods != null) && this.methods.equals(rhs.methods))))
                && ((this.plugins == rhs.plugins) || ((this.plugins != null) && this.plugins.equals(rhs.plugins))))
                && ((this.https_redirect_status_code == rhs.https_redirect_status_code)
                        || ((this.https_redirect_status_code != null)
                                && this.https_redirect_status_code.equals(rhs.https_redirect_status_code))))
                && ((this.created_at == rhs.created_at)
                        || ((this.created_at != null) && this.created_at.equals(rhs.created_at))))
                && ((this.response_buffering == rhs.response_buffering)
                        || ((this.response_buffering != null) && this.response_buffering.equals(rhs.response_buffering))))
                && ((this.updated_at == rhs.updated_at)
                        || ((this.updated_at != null) && this.updated_at.equals(rhs.updated_at))))
                && ((this.regex_priority == rhs.regex_priority)
                        || ((this.regex_priority != null) && this.regex_priority.equals(rhs.regex_priority))))
                && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id))))
                && ((this.protocols == rhs.protocols) || ((this.protocols != null) && this.protocols.equals(rhs.protocols))))
                && ((this.headers == rhs.headers) || ((this.headers != null) && this.headers.equals(rhs.headers))))
                && ((this.path_handling == rhs.path_handling)
                        || ((this.path_handling != null) && this.path_handling.equals(rhs.path_handling))))
                && ((this.expression == rhs.expression)
                        || ((this.expression != null) && this.expression.equals(rhs.expression))))
                && ((this.hosts == rhs.hosts) || ((this.hosts != null) && this.hosts.equals(rhs.hosts))))
                && ((this.destinations == rhs.destinations)
                        || ((this.destinations != null) && this.destinations.equals(rhs.destinations))))
                && ((this.preserve_host == rhs.preserve_host)
                        || ((this.preserve_host != null) && this.preserve_host.equals(rhs.preserve_host))))
                && ((this.priority == rhs.priority) || ((this.priority != null) && this.priority.equals(rhs.priority))))
                && ((this.strip_path == rhs.strip_path)
                        || ((this.strip_path != null) && this.strip_path.equals(rhs.strip_path))))
                && ((this.tags == rhs.tags) || ((this.tags != null) && this.tags.equals(rhs.tags))))
                && ((this.snis == rhs.snis) || ((this.snis != null) && this.snis.equals(rhs.snis))))
                && ((this.paths == rhs.paths) || ((this.paths != null) && this.paths.equals(rhs.paths))))
                && ((this.service == rhs.service) || ((this.service != null) && this.service.equals(rhs.service))))
                && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name))));
    }

}
