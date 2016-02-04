package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.OAuthTokenData}.  Implements {@link Parcelable}
 */
public class OAuthTokenData extends com.percolate.sdk.dto.OAuthTokenData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.tokenUID);
        dest.writeString(this.licenseTokenUID);
        dest.writeString(this.scopeUID);
    }

    public OAuthTokenData() {
    }

    protected OAuthTokenData(Parcel in) {
        this.tokenUID = in.readString();
        this.licenseTokenUID = in.readString();
        this.scopeUID = in.readString();
    }

    public static final Creator<OAuthTokenData> CREATOR = new Creator<OAuthTokenData>() {
        public OAuthTokenData createFromParcel(Parcel source) {
            return new OAuthTokenData(source);
        }

        public OAuthTokenData[] newArray(int size) {
            return new OAuthTokenData[size];
        }
    };
}
