package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstagramMonitoringObjects implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -731785363175190478L;

    @JsonProperty("pagination")
    protected PaginationData paginationData;

    @JsonProperty("data")
    protected List<InstagramMonitoringObject> data;

    @JsonProperty("include")
    protected InstagramIncludes includes;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public PaginationData getPaginationData() {
        return paginationData;
    }

    public void setPaginationData(PaginationData paginationData) {
        this.paginationData = paginationData;
    }

    public List<InstagramMonitoringObject> getData() {
        return data;
    }

    public void setData(List<InstagramMonitoringObject> data) {
        this.data = data;
    }

    public InstagramIncludes getIncludes() {
        return includes;
    }

    public void setIncludes(InstagramIncludes includes) {
        this.includes = includes;
    }

    @Override
    public Map<String, Object> getExtraFields() {
        if(extraFields == null) {
            extraFields = new HashMap<>();
        }
        return extraFields;
    }

    @Override
    @JsonAnySetter
    public void putExtraField(String key, Object value) {
        getExtraFields().put(key, value);
    }
}
