package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstagramUser implements Serializable {

    private static final long serialVersionUID = -2983231878313103195L;

    @JsonProperty("meta")
    protected InstagramRequestMetaData meta;

    @JsonProperty("data")
    protected InstagramUserData data;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public InstagramRequestMetaData getMeta() {
        return meta;
    }

    public void setMeta(InstagramRequestMetaData meta) {
        this.meta = meta;
    }

    public InstagramUserData getData() {
        return data;
    }

    public void setData(InstagramUserData data) {
        this.data = data;
    }


    public Map<String, Object> getExtraFields() {
        if(extraFields == null) {
            extraFields = new HashMap<>();
        }
        return extraFields;
    }

    @JsonAnySetter
    public void putExtraField(String key, Object value) {
        getExtraFields().put(key, value);
    }
}
