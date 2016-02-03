package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InteractionsMetaData implements Serializable {

    private static final long serialVersionUID = -1727114334506910922L;

    @JsonProperty("query")
    private InteractionsMetaDataQuery query;

    @JsonProperty("total")
    private Long total;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public InteractionsMetaDataQuery getQuery() {
        return query;
    }

    public void setQuery(InteractionsMetaDataQuery query) {
        this.query = query;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
