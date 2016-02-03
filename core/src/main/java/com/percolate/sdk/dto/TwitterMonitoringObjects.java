package com.percolate.sdk.dto;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TwitterMonitoringObjects implements Serializable {

    private static final long serialVersionUID = 7493861292446960392L;

    @JsonProperty("data")
    private List<TwitterMonitoringObject> data;

    @JsonProperty("pagination")
    private PaginationData paginationData;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public List<TwitterMonitoringObject> getData() {
        return data;
    }

    public void setData(List<TwitterMonitoringObject> data) {
        this.data = data;
    }

    public PaginationData getPaginationData() {
        return paginationData;
    }

    public void setPaginationData(PaginationData paginationData) {
        this.paginationData = paginationData;
    }


}
