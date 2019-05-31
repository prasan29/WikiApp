package app.wiki.com.wikiapp.model;

public class Terms {
    private String[] mDescription;

    public String[] getDescription() {
        return mDescription;
    }

    public void setmDescription(String[] description) {
        this.mDescription = description;
    }

    @Override
    public String toString() {
        return "ClassPojo [mDescription = " + mDescription + "]";
    }
}
