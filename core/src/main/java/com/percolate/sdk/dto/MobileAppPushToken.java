package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MobileAppPushToken implements Serializable {

    private static final long serialVersionUID = -1641817014316211475L;

    @JsonProperty("data")
    protected MobileAppPushTokenData mobileAppPushTokenData;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public MobileAppPushTokenData getMobileAppPushTokenData() {
        return mobileAppPushTokenData;
    }

    public void setMobileAppPushTokenData(MobileAppPushTokenData mobileAppPushTokenData) {
        this.mobileAppPushTokenData = mobileAppPushTokenData;
    }
}
