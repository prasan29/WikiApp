package app.wiki.com.wikiapp.network;

import app.wiki.com.wikiapp.model.WikiData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Interface for handling API calls.
 */
public interface WikiAPIInterface {
    @GET("api.php?action=query&format=json&prop=pageimages%7Cpageterms&generator=prefixsearch"
            + "&redirects=1&formatversion=2&piprop=thumbnail&pithumbsize=50&pilimit=10&wbptterms"
            + "=description&gpslimit=10&")
    Call<WikiData> getWikiInformation(@Query("gpssearch") String query);
}
