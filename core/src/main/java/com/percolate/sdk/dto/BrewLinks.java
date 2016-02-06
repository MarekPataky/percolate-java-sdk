package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrewLinks implements Serializable {

    private static final long serialVersionUID = -95774588881853668L;

    @JsonProperty("data")
    protected List<BrewLinkData> data = new ArrayList<>();

    @JsonProperty("pagination")
    protected PaginationData pagination;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public List<BrewLinkData> getData() {
        return data;
    }

    public void setData(List<BrewLinkData> data) {
        this.data = data;
    }

    public PaginationData getPagination() {
        return pagination;
    }

    public void setPagination(PaginationData pagination) {
        this.pagination = pagination;
    }

}
