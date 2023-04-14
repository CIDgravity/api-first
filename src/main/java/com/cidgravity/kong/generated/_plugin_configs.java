
package com.cidgravity.kong.generated;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({

})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class _plugin_configs {

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_plugin_configs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _plugin_configs) == false) {
            return false;
        }
        _plugin_configs rhs = ((_plugin_configs) other);
        return true;
    }

}
