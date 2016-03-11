package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.InteractionData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Interactions}.  Implements {@link Parcelable}
 */
public class Interactions extends com.percolate.sdk.dto.Interactions implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public Interactions() {
    }

    protected Interactions(Parcel in) {
        this.meta = (com.percolate.sdk.dto.InteractionsMetaData) in.readSerializable();
        this.data = new ArrayList<InteractionData>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<Interactions> CREATOR = new Creator<Interactions>() {
        public Interactions createFromParcel(Parcel source) {
            return new Interactions(source);
        }

        public Interactions[] newArray(int size) {
            return new Interactions[size];
        }
    };
}
