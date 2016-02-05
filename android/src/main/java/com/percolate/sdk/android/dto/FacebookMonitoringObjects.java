package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.PaginationData;

import java.util.ArrayList;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookMonitoringObjects}.  Implements {@link Parcelable}
 */
public class FacebookMonitoringObjects extends com.percolate.sdk.dto.FacebookMonitoringObjects implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.data);
        dest.writeSerializable(this.paginationData);
    }

    public FacebookMonitoringObjects() {
    }

    protected FacebookMonitoringObjects(Parcel in) {
        this.data = new ArrayList<com.percolate.sdk.dto.FacebookMonitoringObject>();
        in.readList(this.data, List.class.getClassLoader());
        this.paginationData = (PaginationData) in.readSerializable();
    }

    public static final Creator<FacebookMonitoringObjects> CREATOR = new Creator<FacebookMonitoringObjects>() {
        public FacebookMonitoringObjects createFromParcel(Parcel source) {
            return new FacebookMonitoringObjects(source);
        }

        public FacebookMonitoringObjects[] newArray(int size) {
            return new FacebookMonitoringObjects[size];
        }
    };
}
