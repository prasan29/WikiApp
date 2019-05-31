package app.wiki.com.wikiapp.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import app.wiki.com.wikiapp.R;
import app.wiki.com.wikiapp.databinding.ActivityHomeBinding;
import app.wiki.com.wikiapp.viewmodel.WikiViewModel;

public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        WikiViewModel wikiViewModel = new WikiViewModel(this.getApplication());
        mBinding.setViewModel(wikiViewModel);
        mBinding.setLifecycleOwner(this);

        setRecycler();
    }

    private void setRecycler() {
        //Todo: Fetch Wiki data and load the RecyclerView
    }
}
