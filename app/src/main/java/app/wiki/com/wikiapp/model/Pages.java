package app.wiki.com.wikiapp.model;

public class Pages {
    private Thumbnail mThumbnail;

    private String mNs;

    private Terms mTerms;

    private String mIndex;

    private String mPageId;

    private String mTitle;

    public Thumbnail getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.mThumbnail = thumbnail;
    }

    public String getNs() {
        return mNs;
    }

    public void setNs(String ns) {
        this.mNs = ns;
    }

    public Terms getTerms() {
        return mTerms;
    }

    public void setTerms(Terms terms) {
        this.mTerms = terms;
    }

    public String getIndex() {
        return mIndex;
    }

    public void setIndex(String index) {
        this.mIndex = index;
    }

    public String getPageId() {
        return mPageId;
    }

    public void setPageId(String pageId) {
        this.mPageId = pageId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    @Override
    public String toString() {
        return "ClassPojo [mThumbnail = " + mThumbnail + ", mNs = " + mNs + ", mTerms = " + mTerms + ", mIndex = " + mIndex + ", mPageId = " + mPageId + ", mTitle = " + mTitle + "]";
    }
}
