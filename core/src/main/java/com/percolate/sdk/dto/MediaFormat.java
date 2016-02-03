package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MediaFormat implements Serializable {

    private static final long serialVersionUID = -4849494254932997755L;

    @JsonProperty("profile")
    private String profile;

    @JsonProperty("url")
    private String url;

    @JsonProperty("metadata")
    private VideoFormatMetaData metaData;

    @JsonProperty("content_type")
    private String contentType;

    @JsonProperty("file_size")
    private String fileSize;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public VideoFormatMetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(VideoFormatMetaData metaData) {
        this.metaData = metaData;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }
}
