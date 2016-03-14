package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.Link;
import com.percolate.sdk.dto.Term;
import com.percolate.sdk.dto.Topic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.SchemaField}.  Implements {@link Parcelable}
 */
public class SchemaField extends com.percolate.sdk.dto.SchemaField implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.key);
        dest.writeString(this.type);
        dest.writeString(this.label);
        dest.writeString(this.description);
        dest.writeValue(this.required);
        dest.writeMap(this.ext);
        dest.writeMap(this.extraFields);
    }

    public SchemaField() {
    }

    protected SchemaField(Parcel in) {
        this.key = in.readString();
        this.type = in.readString();
        this.label = in.readString();
        this.description = in.readString();
        this.required = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.ext = new LinkedHashMap<>();
        in.readMap(this.ext, LinkedHashMap.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<SchemaField> CREATOR = new Creator<SchemaField>() {
        public SchemaField createFromParcel(Parcel source) {
            return new SchemaField(source);
        }

        public SchemaField[] newArray(int size) {
            return new SchemaField[size];
        }
    };
}
