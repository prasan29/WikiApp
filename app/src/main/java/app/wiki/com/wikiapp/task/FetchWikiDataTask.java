package app.wiki.com.wikiapp.task;

import android.os.AsyncTask;

import app.wiki.com.wikiapp.model.WikiData;
import app.wiki.com.wikiapp.interfaces.WikiInformationListener;

public class FetchWikiDataTask extends AsyncTask<Void, Void, WikiData> {
    private WikiInformationListener mListener;

    public FetchWikiDataTask(WikiInformationListener listener) {
        mListener = listener;
    }

    @Override
    protected WikiData doInBackground(Void... voids) {
        // TODO: Fetch the Wiki data and return.
        return null;
    }

    @Override
    protected void onPostExecute(WikiData wikiData) {
        super.onPostExecute(wikiData);
        mListener.onInformationReceived(wikiData);
    }
}
