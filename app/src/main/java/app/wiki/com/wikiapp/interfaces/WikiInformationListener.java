package app.wiki.com.wikiapp.interfaces;

import app.wiki.com.wikiapp.model.WikiData;

public interface WikiInformationListener {
    void onInformationReceived(WikiData wikiData);
}
