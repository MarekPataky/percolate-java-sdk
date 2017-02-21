package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SchemaField implements Serializable, HasExtraFields {

    private static final long serialVersionUID = 4387266474588592330L;

    @JsonIgnore
    public List<Asset> assets; // Set by clients when adding assets

    @JsonIgnore
    public List<String> stringArrayValues; // Set by clients when adding string array values

    @JsonIgnore
    public List<Term> terms; // Set by clients when adding terms

    @JsonIgnore
    public List<Link> links; // Set by clients when adding links

    @JsonIgnore
    public List<Topic> topics; // Set by clients when adding topics

    @JsonProperty("key")
    protected String key;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("label")
    protected String label;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("required")
    protected Boolean required;

    @JsonProperty("ext")
    protected LinkedHashMap<String, Object> ext;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public LinkedHashMap<String, Object> getExt() {
        return ext;
    }

    public void setExt(LinkedHashMap<String, Object> ext) {
        this.ext = ext;
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
