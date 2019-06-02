package app.wiki.com.wikiapp.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Helper Class for API Client.
 */
public class APIClientHelper {
    private static final String BASE_URL = "https://en.wikipedia.org//w/";

    private static Retrofit mRetrofit;

    /**
     * Method to get the Retrofit object.
     *
     * @return - Retrofit object for API operations.
     */
    public static Retrofit getAPIClient() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return mRetrofit;
    }
}
