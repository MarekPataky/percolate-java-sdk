package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StreamsInclude implements Serializable {

    private static final long serialVersionUID = 6913934210095835536L;

    @JsonProperty("channel")
    private List<StreamChannelData> channels;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public List<StreamChannelData> getChannels() {
        return channels;
    }

    public void setChannels(List<StreamChannelData> channels) {
        this.channels = channels;
    }
}
