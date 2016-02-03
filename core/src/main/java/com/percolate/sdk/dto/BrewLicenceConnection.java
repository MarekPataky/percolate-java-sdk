package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrewLicenceConnection implements Serializable {

    private static final long serialVersionUID = 7688380520853872L;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("total_channels")
    private Integer totalChannels;

    @JsonProperty("name")
    private String name;

    @JsonProperty("primary")
    private boolean primary;

    @JsonProperty("approved")
    private boolean approved;

    @JsonProperty("priority")
    private Integer priority;

    @JsonProperty("license_id")
    private Integer licenseId;

    @JsonProperty("type")
    private String type;

    @JsonProperty("order")
    private Integer order;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public Integer getTotalChannels() {
        return totalChannels;
    }

    public void setTotalChannels(Integer totalChannels) {
        this.totalChannels = totalChannels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(Integer licenseId) {
        this.licenseId = licenseId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }


}
