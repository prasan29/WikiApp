package app.wiki.com.wikiapp.task;

import static app.wiki.com.wikiapp.Constants.TAG;

import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import app.wiki.com.wikiapp.Constants;
import app.wiki.com.wikiapp.interfaces.WikiInformationListener;
import app.wiki.com.wikiapp.model.WikiData;
import app.wiki.com.wikiapp.network.APIClientHelper;
import app.wiki.com.wikiapp.network.WikiAPIInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FetchWikiDataTask extends AsyncTask<String, Void, Void> {
    private WikiInformationListener mListener;

    FetchWikiDataTask(WikiInformationListener listener) {
        mListener = listener;
    }

    private static void display(WikiData wikiData) {
        if (wikiData != null) {
            Log.v(TAG + "_debug", wikiData.toString());
        } else {
            Log.v(TAG + "_debug", "WikiData null");
        }
    }

    @Override
    protected Void doInBackground(String... strings) {

        WikiAPIInterface wikiAPIService = APIClientHelper.getAPIClient().create(
                WikiAPIInterface.class);

        wikiAPIService.getWikiInformation(strings[0]).enqueue(
                new WikiCallback(wikiData -> mListener.onInformationReceived(wikiData)));
        return null;
    }

    private WikiData getSampleData() {
        try {
            JSONObject jsonObject = new JSONObject(Constants.DATA);
            return new Gson().fromJson(jsonObject.toString(), WikiData.class);
        } catch (JSONException e) {
            Log.e(TAG, e.getLocalizedMessage(), e);
        }

        return null;
    }

    private interface IWikiDataEvent {
        void onWikiDataEvent(WikiData wikiData);
    }

    private class WikiCallback implements Callback<WikiData> {
        IWikiDataEvent mIWikiDataEvent;

        WikiCallback(IWikiDataEvent listener) {
            mIWikiDataEvent = listener;
        }

        @Override
        public void onResponse(@NonNull Call<WikiData> call, @NonNull Response<WikiData> response) {
            display(response.body());
            mIWikiDataEvent.onWikiDataEvent(response.body());
        }

        @Override
        public void onFailure(@NonNull Call<WikiData> call, @NonNull Throwable t) {
            Log.e(TAG, t.getLocalizedMessage());
            //TODO: Remove. Only for testing.
            mIWikiDataEvent.onWikiDataEvent(null);
        }
    }
}
