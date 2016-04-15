package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstagramUsersInPhoto implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -2565579330704972172L;

    @JsonProperty("user")
    protected InstagramUserData user;

    @JsonProperty("position")
    protected InstagramPhotoPosition position;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public InstagramUserData getUser() {
        return user;
    }

    public void setUser(InstagramUserData user) {
        this.user = user;
    }

    public InstagramPhotoPosition getPosition() {
        return position;
    }

    public void setPosition(InstagramPhotoPosition position) {
        this.position = position;
    }

    @Override
    public Map<String, Object> getExtraFields() {
        if(extraFields == null) {
            extraFields = new HashMap<>();
        }
        return extraFields;
    }

    @Override
    @JsonAnySetter
    public void putExtraField(String key, Object value) {
        getExtraFields().put(key, value);
    }
}
