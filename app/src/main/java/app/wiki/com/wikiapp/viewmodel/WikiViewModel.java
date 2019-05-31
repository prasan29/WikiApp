package app.wiki.com.wikiapp.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

public class WikiViewModel extends AndroidViewModel {
    public MutableLiveData<String> mSearchText = new MutableLiveData<>();

    public WikiViewModel(@NonNull Application application) {
        super(application);
    }
}
