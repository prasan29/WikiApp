package app.wiki.com.wikiapp.model;

public class Continue {
    private String mContinue;

    private String mGpsOffset;

    public String getContinue() {
        return mContinue;
    }

    public void setContinue(String continueString) {
        this.mContinue = continueString;
    }

    public String getGpsOffset() {
        return mGpsOffset;
    }

    public void setGpsOffset(String gpsoffset) {
        this.mGpsOffset = gpsoffset;
    }

    @Override
    public String toString() {
        return "ClassPojo [continue = " + mContinue + ", mGpsOffset = " + mGpsOffset + "]";
    }
}
