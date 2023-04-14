
package com.cidgravity.kong.generated;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "_format_version",
        "_info",
        "_konnect",
        "_plugin_configs",
        "_transform",
        "_workspace",
        "ca_certificates",
        "certificates",
        "consumers",
        "plugins",
        "rbac_roles",
        "routes",
        "service_packages",
        "services",
        "upstreams",
        "vaults"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class Kong_json_schema {

    @JsonProperty("_format_version")
    private String _format_version;
    @JsonProperty("_info")
    private Info _info;
    @JsonProperty("_konnect")
    private Konnect _konnect;
    @JsonProperty("_plugin_configs")
    private com.cidgravity.kong.generated._plugin_configs _plugin_configs;
    @JsonProperty("_transform")
    private Boolean _transform;
    @JsonProperty("_workspace")
    private String _workspace;
    @JsonProperty("ca_certificates")
    private List<FCACertificate> ca_certificates = new ArrayList<FCACertificate>();
    @JsonProperty("certificates")
    private List<FCertificate> certificates = new ArrayList<FCertificate>();
    @JsonProperty("consumers")
    private List<FConsumer> consumers = new ArrayList<FConsumer>();
    @JsonProperty("plugins")
    private List<FPlugin> plugins = new ArrayList<FPlugin>();
    @JsonProperty("rbac_roles")
    private List<FRBACRole> rbac_roles = new ArrayList<FRBACRole>();
    @JsonProperty("routes")
    private List<FRoute> routes = new ArrayList<FRoute>();
    @JsonProperty("service_packages")
    private List<FServicePackage> service_packages = new ArrayList<FServicePackage>();
    @JsonProperty("services")
    private List<FService> services = new ArrayList<FService>();
    @JsonProperty("upstreams")
    private List<FUpstream> upstreams = new ArrayList<FUpstream>();
    @JsonProperty("vaults")
    private List<FVault> vaults = new ArrayList<FVault>();

    @JsonProperty("_format_version")
    public String get_format_version() {
        return _format_version;
    }

    @JsonProperty("_format_version")
    public void set_format_version(String _format_version) {
        this._format_version = _format_version;
    }

    public Kong_json_schema with_format_version(String _format_version) {
        this._format_version = _format_version;
        return this;
    }

    @JsonProperty("_info")
    public Info get_info() {
        return _info;
    }

    @JsonProperty("_info")
    public void set_info(Info _info) {
        this._info = _info;
    }

    public Kong_json_schema with_info(Info _info) {
        this._info = _info;
        return this;
    }

    @JsonProperty("_konnect")
    public Konnect get_konnect() {
        return _konnect;
    }

    @JsonProperty("_konnect")
    public void set_konnect(Konnect _konnect) {
        this._konnect = _konnect;
    }

    public Kong_json_schema with_konnect(Konnect _konnect) {
        this._konnect = _konnect;
        return this;
    }

    @JsonProperty("_plugin_configs")
    public com.cidgravity.kong.generated._plugin_configs get_plugin_configs() {
        return _plugin_configs;
    }

    @JsonProperty("_plugin_configs")
    public void set_plugin_configs(com.cidgravity.kong.generated._plugin_configs _plugin_configs) {
        this._plugin_configs = _plugin_configs;
    }

    public Kong_json_schema with_plugin_configs(com.cidgravity.kong.generated._plugin_configs _plugin_configs) {
        this._plugin_configs = _plugin_configs;
        return this;
    }

    @JsonProperty("_transform")
    public Boolean get_transform() {
        return _transform;
    }

    @JsonProperty("_transform")
    public void set_transform(Boolean _transform) {
        this._transform = _transform;
    }

    public Kong_json_schema with_transform(Boolean _transform) {
        this._transform = _transform;
        return this;
    }

    @JsonProperty("_workspace")
    public String get_workspace() {
        return _workspace;
    }

    @JsonProperty("_workspace")
    public void set_workspace(String _workspace) {
        this._workspace = _workspace;
    }

    public Kong_json_schema with_workspace(String _workspace) {
        this._workspace = _workspace;
        return this;
    }

    @JsonProperty("ca_certificates")
    public List<FCACertificate> getCa_certificates() {
        return ca_certificates;
    }

    @JsonProperty("ca_certificates")
    public void setCa_certificates(List<FCACertificate> ca_certificates) {
        this.ca_certificates = ca_certificates;
    }

    public Kong_json_schema withCa_certificates(List<FCACertificate> ca_certificates) {
        this.ca_certificates = ca_certificates;
        return this;
    }

    @JsonProperty("certificates")
    public List<FCertificate> getCertificates() {
        return certificates;
    }

    @JsonProperty("certificates")
    public void setCertificates(List<FCertificate> certificates) {
        this.certificates = certificates;
    }

    public Kong_json_schema withCertificates(List<FCertificate> certificates) {
        this.certificates = certificates;
        return this;
    }

    @JsonProperty("consumers")
    public List<FConsumer> getConsumers() {
        return consumers;
    }

    @JsonProperty("consumers")
    public void setConsumers(List<FConsumer> consumers) {
        this.consumers = consumers;
    }

    public Kong_json_schema withConsumers(List<FConsumer> consumers) {
        this.consumers = consumers;
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

    public Kong_json_schema withPlugins(List<FPlugin> plugins) {
        this.plugins = plugins;
        return this;
    }

    @JsonProperty("rbac_roles")
    public List<FRBACRole> getRbac_roles() {
        return rbac_roles;
    }

    @JsonProperty("rbac_roles")
    public void setRbac_roles(List<FRBACRole> rbac_roles) {
        this.rbac_roles = rbac_roles;
    }

    public Kong_json_schema withRbac_roles(List<FRBACRole> rbac_roles) {
        this.rbac_roles = rbac_roles;
        return this;
    }

    @JsonProperty("routes")
    public List<FRoute> getRoutes() {
        return routes;
    }

    @JsonProperty("routes")
    public void setRoutes(List<FRoute> routes) {
        this.routes = routes;
    }

    public Kong_json_schema withRoutes(List<FRoute> routes) {
        this.routes = routes;
        return this;
    }

    @JsonProperty("service_packages")
    public List<FServicePackage> getService_packages() {
        return service_packages;
    }

    @JsonProperty("service_packages")
    public void setService_packages(List<FServicePackage> service_packages) {
        this.service_packages = service_packages;
    }

    public Kong_json_schema withService_packages(List<FServicePackage> service_packages) {
        this.service_packages = service_packages;
        return this;
    }

    @JsonProperty("services")
    public List<FService> getServices() {
        return services;
    }

    @JsonProperty("services")
    public void setServices(List<FService> services) {
        this.services = services;
    }

    public Kong_json_schema withServices(List<FService> services) {
        this.services = services;
        return this;
    }

    @JsonProperty("upstreams")
    public List<FUpstream> getUpstreams() {
        return upstreams;
    }

    @JsonProperty("upstreams")
    public void setUpstreams(List<FUpstream> upstreams) {
        this.upstreams = upstreams;
    }

    public Kong_json_schema withUpstreams(List<FUpstream> upstreams) {
        this.upstreams = upstreams;
        return this;
    }

    @JsonProperty("vaults")
    public List<FVault> getVaults() {
        return vaults;
    }

    @JsonProperty("vaults")
    public void setVaults(List<FVault> vaults) {
        this.vaults = vaults;
    }

    public Kong_json_schema withVaults(List<FVault> vaults) {
        this.vaults = vaults;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Kong_json_schema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("_format_version");
        sb.append('=');
        sb.append(((this._format_version == null) ? "<null>" : this._format_version));
        sb.append(',');
        sb.append("_info");
        sb.append('=');
        sb.append(((this._info == null) ? "<null>" : this._info));
        sb.append(',');
        sb.append("_konnect");
        sb.append('=');
        sb.append(((this._konnect == null) ? "<null>" : this._konnect));
        sb.append(',');
        sb.append("_plugin_configs");
        sb.append('=');
        sb.append(((this._plugin_configs == null) ? "<null>" : this._plugin_configs));
        sb.append(',');
        sb.append("_transform");
        sb.append('=');
        sb.append(((this._transform == null) ? "<null>" : this._transform));
        sb.append(',');
        sb.append("_workspace");
        sb.append('=');
        sb.append(((this._workspace == null) ? "<null>" : this._workspace));
        sb.append(',');
        sb.append("ca_certificates");
        sb.append('=');
        sb.append(((this.ca_certificates == null) ? "<null>" : this.ca_certificates));
        sb.append(',');
        sb.append("certificates");
        sb.append('=');
        sb.append(((this.certificates == null) ? "<null>" : this.certificates));
        sb.append(',');
        sb.append("consumers");
        sb.append('=');
        sb.append(((this.consumers == null) ? "<null>" : this.consumers));
        sb.append(',');
        sb.append("plugins");
        sb.append('=');
        sb.append(((this.plugins == null) ? "<null>" : this.plugins));
        sb.append(',');
        sb.append("rbac_roles");
        sb.append('=');
        sb.append(((this.rbac_roles == null) ? "<null>" : this.rbac_roles));
        sb.append(',');
        sb.append("routes");
        sb.append('=');
        sb.append(((this.routes == null) ? "<null>" : this.routes));
        sb.append(',');
        sb.append("service_packages");
        sb.append('=');
        sb.append(((this.service_packages == null) ? "<null>" : this.service_packages));
        sb.append(',');
        sb.append("services");
        sb.append('=');
        sb.append(((this.services == null) ? "<null>" : this.services));
        sb.append(',');
        sb.append("upstreams");
        sb.append('=');
        sb.append(((this.upstreams == null) ? "<null>" : this.upstreams));
        sb.append(',');
        sb.append("vaults");
        sb.append('=');
        sb.append(((this.vaults == null) ? "<null>" : this.vaults));
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
        result = ((result * 31) + ((this._info == null) ? 0 : this._info.hashCode()));
        result = ((result * 31) + ((this._konnect == null) ? 0 : this._konnect.hashCode()));
        result = ((result * 31) + ((this.plugins == null) ? 0 : this.plugins.hashCode()));
        result = ((result * 31) + ((this.upstreams == null) ? 0 : this.upstreams.hashCode()));
        result = ((result * 31) + ((this.rbac_roles == null) ? 0 : this.rbac_roles.hashCode()));
        result = ((result * 31) + ((this.vaults == null) ? 0 : this.vaults.hashCode()));
        result = ((result * 31) + ((this.services == null) ? 0 : this.services.hashCode()));
        result = ((result * 31) + ((this._workspace == null) ? 0 : this._workspace.hashCode()));
        result = ((result * 31) + ((this.routes == null) ? 0 : this.routes.hashCode()));
        result = ((result * 31) + ((this._transform == null) ? 0 : this._transform.hashCode()));
        result = ((result * 31) + ((this._plugin_configs == null) ? 0 : this._plugin_configs.hashCode()));
        result = ((result * 31) + ((this.certificates == null) ? 0 : this.certificates.hashCode()));
        result = ((result * 31) + ((this.ca_certificates == null) ? 0 : this.ca_certificates.hashCode()));
        result = ((result * 31) + ((this.service_packages == null) ? 0 : this.service_packages.hashCode()));
        result = ((result * 31) + ((this.consumers == null) ? 0 : this.consumers.hashCode()));
        result = ((result * 31) + ((this._format_version == null) ? 0 : this._format_version.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Kong_json_schema) == false) {
            return false;
        }
        Kong_json_schema rhs = ((Kong_json_schema) other);
        return (((((((((((((((((this._info == rhs._info) || ((this._info != null) && this._info.equals(rhs._info)))
                && ((this._konnect == rhs._konnect) || ((this._konnect != null) && this._konnect.equals(rhs._konnect))))
                && ((this.plugins == rhs.plugins) || ((this.plugins != null) && this.plugins.equals(rhs.plugins))))
                && ((this.upstreams == rhs.upstreams) || ((this.upstreams != null) && this.upstreams.equals(rhs.upstreams))))
                && ((this.rbac_roles == rhs.rbac_roles)
                        || ((this.rbac_roles != null) && this.rbac_roles.equals(rhs.rbac_roles))))
                && ((this.vaults == rhs.vaults) || ((this.vaults != null) && this.vaults.equals(rhs.vaults))))
                && ((this.services == rhs.services) || ((this.services != null) && this.services.equals(rhs.services))))
                && ((this._workspace == rhs._workspace)
                        || ((this._workspace != null) && this._workspace.equals(rhs._workspace))))
                && ((this.routes == rhs.routes) || ((this.routes != null) && this.routes.equals(rhs.routes))))
                && ((this._transform == rhs._transform)
                        || ((this._transform != null) && this._transform.equals(rhs._transform))))
                && ((this._plugin_configs == rhs._plugin_configs)
                        || ((this._plugin_configs != null) && this._plugin_configs.equals(rhs._plugin_configs))))
                && ((this.certificates == rhs.certificates)
                        || ((this.certificates != null) && this.certificates.equals(rhs.certificates))))
                && ((this.ca_certificates == rhs.ca_certificates)
                        || ((this.ca_certificates != null) && this.ca_certificates.equals(rhs.ca_certificates))))
                && ((this.service_packages == rhs.service_packages)
                        || ((this.service_packages != null) && this.service_packages.equals(rhs.service_packages))))
                && ((this.consumers == rhs.consumers) || ((this.consumers != null) && this.consumers.equals(rhs.consumers))))
                && ((this._format_version == rhs._format_version)
                        || ((this._format_version != null) && this._format_version.equals(rhs._format_version))));
    }

}
