package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookMentionPicture implements Serializable {

    private static final long serialVersionUID = -221662608585538150L;

    @JsonProperty("data")
    protected FacebookMentionPictureData data;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public FacebookMentionPictureData getData() {
        return data;
    }

    public void setData(FacebookMentionPictureData data) {
        this.data = data;
    }
}
