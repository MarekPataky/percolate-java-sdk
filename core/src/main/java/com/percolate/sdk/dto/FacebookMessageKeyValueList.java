package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookMessageKeyValueList implements Serializable {

    private static final long serialVersionUID = -8069980492365035119L;

    @JsonProperty("data")
    protected List<LinkedHashMap<String, Object>> data;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public List<LinkedHashMap<String, Object>> getData() {
        return data;
    }

    public void setData(List<LinkedHashMap<String, Object>> data) {
        this.data = data;
    }
}
