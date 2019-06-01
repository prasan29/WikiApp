package app.wiki.com.wikiapp.model;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class Terms {
    @SerializedName("description")
    private String[] description;

    public String[] getDescription() {
        return description;
    }

    public void setDescription(String[] description) {
        this.description = description;
    }

    @NonNull
    @Override
    public String toString() {
        return "ClassPojo [description = " + description + "]";
    }
}