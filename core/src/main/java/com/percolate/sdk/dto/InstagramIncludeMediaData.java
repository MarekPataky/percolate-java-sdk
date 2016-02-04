package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstagramIncludeMediaData implements Serializable {

    private static final long serialVersionUID = -2952987534564201254L;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("activity")
    protected List<Object> activity;

    @JsonProperty("related_post_set_id")
    protected Long relatedPostSetId;

    @JsonProperty("xobj")
    protected InstagramMediaData xobj;

    @JsonProperty("meta")
    protected InstagramMonitoringObjectMetaData meta;

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

    public List<Object> getActivity() {
        return activity;
    }

    public void setActivity(List<Object> activity) {
        this.activity = activity;
    }

    public Long getRelatedPostSetId() {
        return relatedPostSetId;
    }

    public void setRelatedPostSetId(Long relatedPostSetId) {
        this.relatedPostSetId = relatedPostSetId;
    }

    public InstagramMediaData getXobj() {
        return xobj;
    }

    public void setXobj(InstagramMediaData xobj) {
        this.xobj = xobj;
    }

    public InstagramMonitoringObjectMetaData getMeta() {
        return meta;
    }

    public void setMeta(InstagramMonitoringObjectMetaData meta) {
        this.meta = meta;
    }

}
