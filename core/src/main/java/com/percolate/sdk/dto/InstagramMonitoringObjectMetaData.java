package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstagramMonitoringObjectMetaData implements Serializable {

    private static final long serialVersionUID = -3615282804419551717L;

    @JsonProperty("platform")
    private String platform;

    @JsonProperty("type")
    private String type;

    @JsonProperty("parent_xid")
    private String parentXid;

    @JsonProperty("parent_shortcode")
    private String parentShortcode;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParentXid() {
        return parentXid;
    }

    public void setParentXid(String parentXid) {
        this.parentXid = parentXid;
    }

    public String getParentShortcode() {
        return parentShortcode;
    }

    public void setParentShortcode(String parentShortcode) {
        this.parentShortcode = parentShortcode;
    }

}
