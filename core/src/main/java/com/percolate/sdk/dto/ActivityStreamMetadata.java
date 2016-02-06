package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActivityStreamMetadata implements Serializable {

    private static final long serialVersionUID = 7583076661503256595L;

    @JsonProperty("value")
    protected Object value;

    @JsonProperty("key")
    protected String key;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
