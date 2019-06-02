package app.wiki.com.wikiapp.viewmodel;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import app.wiki.com.wikiapp.interfaces.WikiInformationListener;
import app.wiki.com.wikiapp.task.TaskHandler;

public class WikiViewModel extends ViewModel {
    public MutableLiveData<String> mSearchText = new MutableLiveData<>();
    private TaskHandler mTaskHandler;

    /**
     * Constructor for WikiViewModel.
     *
     * @param lifeCycleOwner - LifeCycleOwner object for LiveData scope.
     * @param listener       - WikiInformationListener for receiving callback for WikiData.
     */
    public WikiViewModel(LifecycleOwner lifeCycleOwner, WikiInformationListener listener) {
        mTaskHandler = TaskHandler.getInstance(listener);
        mSearchText.observe(lifeCycleOwner, query -> {
            if (!"".equals(query)) {
                WikiViewModel.this.populateList(query);
            }
        });
    }

    /**
     * Method to fetch the Wiki information using the query.
     *
     * @param query - String query.
     */
    private void populateList(String query) {
        mTaskHandler.fetchWikiData(query);
    }

}
