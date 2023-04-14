
package com.cidgravity.kong.generated;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
        "kong",
        "type"
})
@Generated("jsonschema2pojo")
@io.quarkus.runtime.annotations.RegisterForReflection
public class Implementation {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kong")
    private Kong kong;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private String type;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kong")
    public Kong getKong() {
        return kong;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kong")
    public void setKong(Kong kong) {
        this.kong = kong;
    }

    public Implementation withKong(Kong kong) {
        this.kong = kong;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Implementation withType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Implementation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("kong");
        sb.append('=');
        sb.append(((this.kong == null) ? "<null>" : this.kong));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
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
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.kong == null) ? 0 : this.kong.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Implementation) == false) {
            return false;
        }
        Implementation rhs = ((Implementation) other);
        return (((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))
                && ((this.kong == rhs.kong) || ((this.kong != null) && this.kong.equals(rhs.kong))));
    }

}
