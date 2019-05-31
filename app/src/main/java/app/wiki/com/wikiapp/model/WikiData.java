package app.wiki.com.wikiapp.model;

public class WikiData {
    private String mBatchComplete;

    private Continue mContinue;

    private Query mQuery;

    public String getBatchComplete() {
        return mBatchComplete;
    }

    public void setBatchComplete(String mBatchComplete) {
        this.mBatchComplete = mBatchComplete;
    }

    public Continue getContinue() {
        return mContinue;
    }

    public void setContinue(Continue continueObject) {
        this.mContinue = continueObject;
    }

    public Query getQuery() {
        return mQuery;
    }

    public void setQuery(Query mQuery) {
        this.mQuery = mQuery;
    }

    @Override
    public String toString() {
        return "ClassPojo [mBatchComplete = " + mBatchComplete + ", continue = " + mContinue + ", mQuery = " + mQuery + "]";
    }
}