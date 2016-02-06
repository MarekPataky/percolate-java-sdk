package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TwitterBlocks implements Serializable {

    private static final long serialVersionUID = 6669960706326459027L;

    @JsonProperty("ids")
    protected List<Long> ids;

    @JsonProperty("next_cursor")
    protected Integer nextCursor;

    @JsonProperty("next_cursor_str")
    protected String nextCursorStr;

    @JsonProperty("previous_cursor")
    protected Integer previousCursor;

    @JsonProperty("previous_cursor_str")
    protected String previousCursorStr;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public Integer getNextCursor() {
        return nextCursor;
    }

    public void setNextCursor(Integer nextCursor) {
        this.nextCursor = nextCursor;
    }

    public String getNextCursorStr() {
        return nextCursorStr;
    }

    public void setNextCursorStr(String nextCursorStr) {
        this.nextCursorStr = nextCursorStr;
    }

    public Integer getPreviousCursor() {
        return previousCursor;
    }

    public void setPreviousCursor(Integer previousCursor) {
        this.previousCursor = previousCursor;
    }

    public String getPreviousCursorStr() {
        return previousCursorStr;
    }

    public void setPreviousCursorStr(String previousCursorStr) {
        this.previousCursorStr = previousCursorStr;
    }

}
