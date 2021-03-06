package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Translation}.  Implements {@link Parcelable}
 */
public class Translation extends com.percolate.sdk.dto.Translation implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public Translation() {
    }

    protected Translation(Parcel in) {
        this.data = (com.percolate.sdk.dto.TranslationData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Translation> CREATOR = new Creator<Translation>() {
        public Translation createFromParcel(Parcel source) {
            return new Translation(source);
        }

        public Translation[] newArray(int size) {
            return new Translation[size];
        }
    };
}
