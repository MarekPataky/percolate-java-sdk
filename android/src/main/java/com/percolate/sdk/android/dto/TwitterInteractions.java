package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.TwitterInteractions}.  Implements {@link Parcelable}
 */
public class TwitterInteractions extends com.percolate.sdk.dto.TwitterInteractions implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public TwitterInteractions() {
    }

    protected TwitterInteractions(Parcel in) {
        this.data = (com.percolate.sdk.dto.TwitterMonitoringObject) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<TwitterInteractions> CREATOR = new Creator<TwitterInteractions>() {
        public TwitterInteractions createFromParcel(Parcel source) {
            return new TwitterInteractions(source);
        }

        public TwitterInteractions[] newArray(int size) {
            return new TwitterInteractions[size];
        }
    };
}
