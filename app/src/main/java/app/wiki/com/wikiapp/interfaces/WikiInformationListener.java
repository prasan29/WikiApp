package app.wiki.com.wikiapp.interfaces;

import app.wiki.com.wikiapp.model.Pages;
import app.wiki.com.wikiapp.model.WikiData;

public interface WikiInformationListener {
    void onInformationReceived(WikiData wikiData);

    void onInformationSelected(Pages page);
}
