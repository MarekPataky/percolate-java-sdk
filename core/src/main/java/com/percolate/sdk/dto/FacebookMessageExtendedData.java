package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookMessageExtendedData implements Serializable {

    private static final long serialVersionUID = -5549405235141235537L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("created_time")
    private String createdTime;

    @JsonProperty("from")
    private FacebookUser from;

    @JsonProperty("to")
    private FacebookUserDataList to;

    @JsonProperty("message")
    private String message;

    @JsonProperty("shares")
    private FacebookMessageKeyValueList shares;

    @JsonProperty("tags")
    private FacebookMessageKeyValueList tags;

    @JsonProperty("attachments")
    private FacebookMessageAttachments attachments;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public FacebookUser getFrom() {
        return from;
    }

    public void setFrom(FacebookUser from) {
        this.from = from;
    }

    public FacebookUserDataList getTo() {
        return to;
    }

    public void setTo(FacebookUserDataList to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public FacebookMessageKeyValueList getShares() {
        return shares;
    }

    public void setShares(FacebookMessageKeyValueList shares) {
        this.shares = shares;
    }

    public FacebookMessageKeyValueList getTags() {
        return tags;
    }

    public void setTags(FacebookMessageKeyValueList tags) {
        this.tags = tags;
    }

    public FacebookMessageAttachments getAttachments() {
        return attachments;
    }

    public void setAttachments(FacebookMessageAttachments attachments) {
        this.attachments = attachments;
    }

}
