package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.InstagramUserData;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramUser}.  Implements {@link Parcelable}
 */
public class InstagramUser extends com.percolate.sdk.dto.InstagramUser implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeSerializable(this.data);
    }

    public InstagramUser() {
    }

    protected InstagramUser(Parcel in) {
        this.meta = (com.percolate.sdk.dto.InstagramRequestMetaData) in.readSerializable();
        this.data = (InstagramUserData) in.readSerializable();
    }

    public static final Creator<InstagramUser> CREATOR = new Creator<InstagramUser>() {
        public InstagramUser createFromParcel(Parcel source) {
            return new InstagramUser(source);
        }

        public InstagramUser[] newArray(int size) {
            return new InstagramUser[size];
        }
    };
}
