package app.wiki.com.wikiapp.task;

import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.util.Log;

import app.wiki.com.wikiapp.interfaces.WikiInformationListener;
import app.wiki.com.wikiapp.model.WikiData;
import app.wiki.com.wikiapp.network.APIClientHelper;
import app.wiki.com.wikiapp.network.WikiAPIInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static app.wiki.com.wikiapp.Constants.TAG;

/**
 * Task Class for API calls.
 */
public class FetchWikiDataTask extends AsyncTask<String, Void, Void> {
    private WikiInformationListener mListener;

    FetchWikiDataTask(WikiInformationListener listener) {
        mListener = listener;
    }

    @Override
    protected Void doInBackground(String... strings) {

        WikiAPIInterface wikiAPIService = APIClientHelper.getAPIClient().create(
                WikiAPIInterface.class);

        wikiAPIService.getWikiInformation(strings[0]).enqueue(
                new WikiCallback(wikiData -> mListener.onInformationReceived(wikiData)));
        return null;
    }

    /**
     * Interface to receive event callback with WikiData object.
     */
    private interface IWikiDataEvent {
        /**
         * Method to receive information event.
         *
         * @param wikiData - WikiData object received from JSON data.
         */
        void onWikiDataEvent(WikiData wikiData);
    }

    /**
     * Class for Response callbacks.
     */
    private class WikiCallback implements Callback<WikiData> {
        IWikiDataEvent mIWikiDataEvent;

        WikiCallback(IWikiDataEvent listener) {
            mIWikiDataEvent = listener;
        }

        @Override
        public void onResponse(@NonNull Call<WikiData> call, @NonNull Response<WikiData> response) {
            mIWikiDataEvent.onWikiDataEvent(response.body());
        }

        @Override
        public void onFailure(@NonNull Call<WikiData> call, @NonNull Throwable t) {
            Log.e(TAG, t.getLocalizedMessage());
        }
    }
}
