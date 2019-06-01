package app.wiki.com.wikiapp.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class Thumbnail implements Parcelable {
    public static final Creator<Thumbnail> CREATOR = new Creator<Thumbnail>() {
        @Override
        public Thumbnail createFromParcel(Parcel in) {
            return new Thumbnail(in);
        }

        @Override
        public Thumbnail[] newArray(int size) {
            return new Thumbnail[size];
        }
    };
    @SerializedName("width")
    private String width;
    @SerializedName("source")
    private String source;
    @SerializedName("height")
    private String height;

    protected Thumbnail(Parcel in) {
        width = in.readString();
        source = in.readString();
        height = in.readString();
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @NonNull
    @Override
    public String toString() {
        return "ClassPojo [width = " + width + ", source = " + source + ", height = " + height
                + "]";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(width);
        dest.writeString(source);
        dest.writeString(height);
    }
}