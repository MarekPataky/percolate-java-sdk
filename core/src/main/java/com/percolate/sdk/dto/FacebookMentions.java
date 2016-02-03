package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookMentions implements Serializable {

    private static final long serialVersionUID = 1598302510558778617L;

    @JsonProperty("data")
    List<FacebookMention> mentions;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public List<FacebookMention> getMentions() {
        return mentions;
    }

    public void setMentions(List<FacebookMention> mentions) {
        this.mentions = mentions;
    }
}
