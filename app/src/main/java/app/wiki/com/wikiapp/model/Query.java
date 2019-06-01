package app.wiki.com.wikiapp.model;

import com.google.gson.annotations.SerializedName;

public class Query {
    @SerializedName("pages")
    private Pages[] pages;

    @SerializedName("redirects")
    private Redirects[] redirects;

    public Pages[] getPages() {
        return pages;
    }

    public void setPages(Pages[] pages) {
        this.pages = pages;
    }

    public Redirects[] getRedirects() {
        return redirects;
    }

    public void setRedirects(Redirects[] redirects) {
        this.redirects = redirects;
    }

    @Override
    public String toString() {
        return "ClassPojo [pages = " + pages + ", redirects = " + redirects + "]";
    }
}