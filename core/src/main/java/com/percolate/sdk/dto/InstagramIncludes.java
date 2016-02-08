package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstagramIncludes implements Serializable {

    private static final long serialVersionUID = 390131722143510937L;

    @JsonProperty("instagram:post")
    protected List<InstagramIncludeMediaData> posts;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public List<InstagramIncludeMediaData> getPosts() {
        return posts;
    }

    public void setPosts(List<InstagramIncludeMediaData> posts) {
        this.posts = posts;
    }

}