package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;

/**
 * Android version of {@link com.percolate.sdk.dto.FlagOwner}.  Implements {@link Parcelable}
 */
public class FlagOwner extends com.percolate.sdk.dto.FlagOwner implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.type);
        dest.writeSerializable(this.license);
    }

    public FlagOwner() {
    }

    protected FlagOwner(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.type = in.readString();
        this.license = (com.percolate.sdk.dto.License) in.readSerializable();
    }

    public static final Creator<FlagOwner> CREATOR = new Creator<FlagOwner>() {
        public FlagOwner createFromParcel(Parcel source) {
            return new FlagOwner(source);
        }

        public FlagOwner[] newArray(int size) {
            return new FlagOwner[size];
        }
    };
}
