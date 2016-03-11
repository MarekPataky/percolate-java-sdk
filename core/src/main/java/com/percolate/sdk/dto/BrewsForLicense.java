package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrewsForLicense implements Serializable {

    private static final long serialVersionUID = -1807753700970904760L;

    @JsonProperty("pagination")
    protected PaginationData pagination;

    @JsonProperty("data")
    protected List<BrewLicenceConnection> data = new ArrayList<>();

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public PaginationData getPagination() {
        return pagination;
    }

    public void setPagination(PaginationData pagination) {
        this.pagination = pagination;
    }

    public List<BrewLicenceConnection> getData() {
        return data;
    }

    public void setData(List<BrewLicenceConnection> data) {
        this.data = data;
    }

}
