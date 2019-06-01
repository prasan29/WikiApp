package app.wiki.com.wikiapp.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class Pages implements Parcelable {
    @SerializedName("thumbnail")
    private Thumbnail thumbnail;

    @SerializedName("ns")
    private String ns;

    @SerializedName("terms")
    private Terms terms;

    @SerializedName("index")
    private String index;

    @SerializedName("pageid")
    private String pageid;

    @SerializedName("title")
    private String title;

    protected Pages(Parcel in) {
        ns = in.readString();
        index = in.readString();
        pageid = in.readString();
        title = in.readString();
    }

    public static final Creator<Pages> CREATOR = new Creator<Pages>() {
        @Override
        public Pages createFromParcel(Parcel in) {
            return new Pages(in);
        }

        @Override
        public Pages[] newArray(int size) {
            return new Pages[size];
        }
    };

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public Terms getTerms() {
        return terms;
    }

    public void setTerms(Terms terms) {
        this.terms = terms;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getPageid() {
        return pageid;
    }

    public void setPageid(String pageid) {
        this.pageid = pageid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @NonNull
    @Override
    public String toString() {
        return "ClassPojo [thumbnail = " + thumbnail + ", ns = " + ns + ", terms = " + terms
                + ", index = " + index + ", pageid = " + pageid + ", title = " + title + "]";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ns);
        dest.writeString(index);
        dest.writeString(pageid);
        dest.writeString(title);
    }
}