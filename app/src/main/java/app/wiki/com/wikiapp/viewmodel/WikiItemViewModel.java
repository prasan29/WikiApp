package app.wiki.com.wikiapp.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

public class WikiItemViewModel extends AndroidViewModel {
    public MutableLiveData<String> mWikiContent = new MutableLiveData<>();

    public WikiItemViewModel(@NonNull Application application) {
        super(application);
    }
}
