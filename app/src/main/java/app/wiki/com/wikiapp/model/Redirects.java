package app.wiki.com.wikiapp.model;

public class Redirects {
    private String mIndex;

    private String mFrom;

    private String mTo;

    public String getIndex() {
        return mIndex;
    }

    public void setIndex(String mIndex) {
        this.mIndex = mIndex;
    }

    public String getFrom() {
        return mFrom;
    }

    public void setFrom(String from) {
        this.mFrom = from;
    }

    public String getTo() {
        return mTo;
    }

    public void setTo(String mTo) {
        this.mTo = mTo;
    }

    @Override
    public String toString() {
        return "ClassPojo [mIndex = " + mIndex + ", mFrom = " + mFrom + ", mTo = " + mTo + "]";
    }
}