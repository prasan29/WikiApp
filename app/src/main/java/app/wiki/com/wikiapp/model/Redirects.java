package app.wiki.com.wikiapp.model;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class Redirects {
    @SerializedName("index")
    private String index;

    @SerializedName("from")
    private String from;

    @SerializedName("to")
    private String to;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @NonNull
    @Override
    public String toString() {
        return "ClassPojo [index = " + index + ", from = " + from + ", to = " + to + "]";
    }
}