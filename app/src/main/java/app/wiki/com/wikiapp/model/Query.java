package app.wiki.com.wikiapp.model;

public class Query {
    private Pages[] mPages;

    private Redirects[] mRedirects;

    public Pages[] getPages() {
        return mPages;
    }

    public void setPages(Pages[] mPages) {
        this.mPages = mPages;
    }

    public Redirects[] getRedirects() {
        return mRedirects;
    }

    public void setRedirects(Redirects[] mRedirects) {
        this.mRedirects = mRedirects;
    }

    @Override
    public String toString() {
        return "ClassPojo [mPages = " + mPages + ", mRedirects = " + mRedirects + "]";
    }
}