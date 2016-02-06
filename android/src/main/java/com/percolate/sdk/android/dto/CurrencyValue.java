package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.CurrencyValue}.  Implements {@link Parcelable}
 */
public class CurrencyValue extends com.percolate.sdk.dto.CurrencyValue implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.currency);
        dest.writeString(this.amount);
    }

    public CurrencyValue() {
    }

    protected CurrencyValue(Parcel in) {
        this.currency = in.readString();
        this.amount = in.readString();
    }

    public static final Creator<CurrencyValue> CREATOR = new Creator<CurrencyValue>() {
        public CurrencyValue createFromParcel(Parcel source) {
            return new CurrencyValue(source);
        }

        public CurrencyValue[] newArray(int size) {
            return new CurrencyValue[size];
        }
    };
}
