package app.wiki.com.wikiapp.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClientHelper {
    private static final String BASE_URL = "https://en.wikipedia.org/";

    private static Retrofit mRetrofit;

    public static Retrofit getAPIClient() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(
                    GsonConverterFactory.create()).build();
        }

        return mRetrofit;
    }
}
