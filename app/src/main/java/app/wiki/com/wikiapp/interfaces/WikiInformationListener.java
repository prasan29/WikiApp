package app.wiki.com.wikiapp.interfaces;

import app.wiki.com.wikiapp.model.Pages;
import app.wiki.com.wikiapp.model.WikiData;

/**
 * Interface to receive Wiki information as a Callback.
 */
public interface WikiInformationListener {
    /**
     * Callback method called when the Wiki data is received.
     *
     * @param wikiData - WikiData Class parsed from JSON data.
     */
    void onInformationReceived(WikiData wikiData);

    /**
     * Callback method when an item is selected.
     *
     * @param page - Selected page data from the item.
     */
    void onInformationSelected(Pages page);
}
