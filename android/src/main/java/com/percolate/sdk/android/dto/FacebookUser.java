package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookUser}.  Implements {@link Parcelable}
 */
public class FacebookUser extends com.percolate.sdk.dto.FacebookUser implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.about);
        dest.writeString(this.link);
        dest.writeString(this.name);
        dest.writeString(this.website);
        dest.writeString(this.gender);
        dest.writeList(this.recentActivity);
        dest.writeMap(this.location);
        dest.writeMap(this.hometown);
        dest.writeMap(this.extraFields);
    }

    public FacebookUser() {
    }

    protected FacebookUser(Parcel in) {
        this.id = in.readString();
        this.about = in.readString();
        this.link = in.readString();
        this.name = in.readString();
        this.website = in.readString();
        this.gender = in.readString();
        this.recentActivity = new ArrayList<>();
        in.readList(this.recentActivity, List.class.getClassLoader());
        this.location = new LinkedHashMap<>();
        in.readMap(this.location, LinkedHashMap.class.getClassLoader());
        this.hometown = new LinkedHashMap<>();
        in.readMap(this.hometown, LinkedHashMap.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<FacebookUser> CREATOR = new Creator<FacebookUser>() {
        public FacebookUser createFromParcel(Parcel source) {
            return new FacebookUser(source);
        }

        public FacebookUser[] newArray(int size) {
            return new FacebookUser[size];
        }
    };
}
