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
public class Services implements Serializable {

    private static final long serialVersionUID = -7087020580042995262L;

    @JsonProperty("analytics")
    protected LinkedHashMap<String, Integer> analytics;

    @JsonProperty("type")
    protected String type;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public LinkedHashMap<String, Integer> getAnalytics() {
        return analytics;
    }

    public void setAnalytics(LinkedHashMap<String, Integer> analytics) {
        this.analytics = analytics;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
