package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstagramSingleMonitoringObject implements Serializable {

    private static final long serialVersionUID = 1851219957906612730L;

    @JsonProperty("data")
    private InstagramMonitoringObject data;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public InstagramMonitoringObject getData() {
        return data;
    }

    public void setData(InstagramMonitoringObject data) {
        this.data = data;
    }
}
