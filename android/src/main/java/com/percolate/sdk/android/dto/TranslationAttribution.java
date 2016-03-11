package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.TranslationAttribution}.  Implements {@link Parcelable}
 */
public class TranslationAttribution extends com.percolate.sdk.dto.TranslationAttribution implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.text);
        dest.writeString(this.image);
        dest.writeString(this.link);
        dest.writeMap(this.extraFields);
    }

    public TranslationAttribution() {
    }

    protected TranslationAttribution(Parcel in) {
        this.text = in.readString();
        this.image = in.readString();
        this.link = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<TranslationAttribution> CREATOR = new Creator<TranslationAttribution>() {
        public TranslationAttribution createFromParcel(Parcel source) {
            return new TranslationAttribution(source);
        }

        public TranslationAttribution[] newArray(int size) {
            return new TranslationAttribution[size];
        }
    };
}
