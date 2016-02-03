package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TwitterRelationship implements Serializable {

    private static final long serialVersionUID = -112592603356726870L;

    @JsonProperty("source")
    private TwitterRelationshipStatus source;

    @JsonProperty("target")
    private TwitterRelationshipStatus target;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public TwitterRelationshipStatus getSource() {
        return source;
    }

    public void setSource(TwitterRelationshipStatus source) {
        this.source = source;
    }

    public TwitterRelationshipStatus getTarget() {
        return target;
    }

    public void setTarget(TwitterRelationshipStatus target) {
        this.target = target;
    }

}
