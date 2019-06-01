package app.wiki.com.wikiapp.model;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class Continue {
    @SerializedName("continue")
    private String mContinue;

    @SerializedName("gpsoffset")
    private String gpsoffset;

    public String getContinue() {
        return mContinue;
    }

    public void setContinue(String continueObj) {
        this.mContinue = continueObj;
    }

    public String getGpsoffset() {
        return gpsoffset;
    }

    public void setGpsoffset(String gpsoffset) {
        this.gpsoffset = gpsoffset;
    }

    @NonNull
    @Override
    public String toString() {
        return "ClassPojo [continue = " + mContinue + ", gpsoffset = " + gpsoffset + "]";
    }
}
