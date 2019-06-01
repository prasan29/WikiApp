package app.wiki.com.wikiapp.viewmodel;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import app.wiki.com.wikiapp.interfaces.WikiInformationListener;
import app.wiki.com.wikiapp.task.TaskHandler;

public class WikiViewModel extends ViewModel {
    public MutableLiveData<String> mSearchText = new MutableLiveData<>();
    private TaskHandler mTaskHandler;

    public WikiViewModel(LifecycleOwner lifeCycleOwner, WikiInformationListener listener) {
        mTaskHandler = TaskHandler.getInstance(listener);
        mSearchText.observe(lifeCycleOwner, WikiViewModel.this::populateList);
    }

    private void populateList(String query) {
        mTaskHandler.fetchWikiData(query);
    }

}
