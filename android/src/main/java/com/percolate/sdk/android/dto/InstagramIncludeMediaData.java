package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.InstagramMonitoringObjectMetaData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramIncludeMediaData}.  Implements {@link Parcelable}
 */
public class InstagramIncludeMediaData extends com.percolate.sdk.dto.InstagramIncludeMediaData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        this.activity = new ArrayList<>();
        dest.writeList(this.activity);
        dest.writeValue(this.relatedPostSetId);
        dest.writeSerializable(this.xobj);
        dest.writeSerializable(this.meta);
        dest.writeMap(this.extraFields);
    }

    public InstagramIncludeMediaData() {
    }

    protected InstagramIncludeMediaData(Parcel in) {
        this.id = in.readString();
        this.activity = new ArrayList<Object>();
        in.readList(this.activity, List.class.getClassLoader());
        this.relatedPostSetId = (Long) in.readValue(Long.class.getClassLoader());
        this.xobj = (com.percolate.sdk.dto.InstagramMediaData) in.readSerializable();
        this.meta = (InstagramMonitoringObjectMetaData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<InstagramIncludeMediaData> CREATOR = new Creator<InstagramIncludeMediaData>() {
        public InstagramIncludeMediaData createFromParcel(Parcel source) {
            return new InstagramIncludeMediaData(source);
        }

        public InstagramIncludeMediaData[] newArray(int size) {
            return new InstagramIncludeMediaData[size];
        }
    };
}
