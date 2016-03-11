package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Facets implements Serializable {

    private static final long serialVersionUID = -502807027675904076L;

    @JsonProperty("tags")
    protected LinkedHashMap<String, Integer> tags = new LinkedHashMap<>();

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public LinkedHashMap<String, Integer> getTags() {
        return this.tags;
    }

    public void setTags(LinkedHashMap<String, Integer> tags) {
        this.tags = tags;
    }
}
