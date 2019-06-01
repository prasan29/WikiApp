package app.wiki.com.wikiapp.model;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class WikiData {
    private String batchcomplete;

    @SerializedName("continue")
    private Continue mCcontinue;

    @SerializedName("query")
    private Query query;

    public String getBatchcomplete() {
        return batchcomplete;
    }

    public void setBatchcomplete(String batchcomplete) {
        this.batchcomplete = batchcomplete;
    }

    public Continue getContinue() {
        return mCcontinue;
    }

    public void setContinue(Continue continueObj) {
        this.mCcontinue = continueObj;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    @NonNull
    @Override
    public String toString() {
        return "ClassPojo [batchcomplete = " + batchcomplete + ", continue = " + mCcontinue
                + ", query = " + query + "]";
    }
}
