package app.wiki.com.wikiapp.task;

import app.wiki.com.wikiapp.interfaces.WikiInformationListener;

public final class TaskHandler {
    private static TaskHandler mTaskHandler;
    private WikiInformationListener mListener;

    private TaskHandler(WikiInformationListener listener) {
        mListener = listener;
    }

    public static TaskHandler getInstance(WikiInformationListener listener) {
        if (mTaskHandler == null) {
            mTaskHandler = new TaskHandler(listener);
        }
        return mTaskHandler;
    }

    public void fetchWikiData(String query) {
        FetchWikiDataTask fetchWikiDataTask = new FetchWikiDataTask(mListener);
        fetchWikiDataTask.execute(query);
    }
}
