package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstagramRecentMedia implements Serializable {

    private static final long serialVersionUID = 5997348676516800625L;

    @JsonProperty("meta")
    private InstagramRequestMetaData meta;

    @JsonProperty("data")
    private List<InstagramMediaData> data;

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

    public List<InstagramMediaData> getData() {
        return data;
    }

    public void setData(List<InstagramMediaData> data) {
        this.data = data;
    }
}
