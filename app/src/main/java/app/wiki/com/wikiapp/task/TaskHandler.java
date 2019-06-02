package app.wiki.com.wikiapp.task;

import app.wiki.com.wikiapp.interfaces.WikiInformationListener;

/**
 * Class for handling Tasks of API calls.
 */
public final class TaskHandler {
    private static TaskHandler mTaskHandler;
    private WikiInformationListener mListener;

    /**
     * Constructor for TaskHandler.
     *
     * @param listener - WikiInformationListener for receiving callback for WikiData.
     */
    private TaskHandler(WikiInformationListener listener) {
        mListener = listener;
    }

    /**
     * Method to get the TaskHandler SingleTon object.
     *
     * @param listener - WikiInformationListener for receiving callback for WikiData.
     * @return - TaskHandler object.
     */
    public static TaskHandler getInstance(WikiInformationListener listener) {
        if (mTaskHandler == null) {
            mTaskHandler = new TaskHandler(listener);
        }
        return mTaskHandler;
    }

    /**
     * Method to fetch the WikiData.
     *
     * @param query - Query string for loading thelist of Wiki pages.
     */
    public void fetchWikiData(String query) {
        FetchWikiDataTask fetchWikiDataTask = new FetchWikiDataTask(mListener);
        fetchWikiDataTask.execute(query);
    }
}
