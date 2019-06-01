package app.wiki.com.wikiapp.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import app.wiki.com.wikiapp.Constants;
import app.wiki.com.wikiapp.R;
import app.wiki.com.wikiapp.adapter.WikiItemAdapter;
import app.wiki.com.wikiapp.databinding.ActivityHomeBinding;
import app.wiki.com.wikiapp.interfaces.WikiInformationListener;
import app.wiki.com.wikiapp.model.Pages;
import app.wiki.com.wikiapp.model.WikiData;
import app.wiki.com.wikiapp.viewmodel.WikiViewModel;

public class HomeActivity extends AppCompatActivity implements WikiInformationListener {
    ActivityHomeBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        WikiViewModel wikiViewModel = new WikiViewModel(this, this);
        mBinding.setViewModel(wikiViewModel);
        mBinding.setLifecycleOwner(this);
    }

    @Override
    public void onInformationReceived(WikiData wikiData) {
        if (wikiData != null) {
            WikiItemAdapter adapter = new WikiItemAdapter(wikiData.getQuery().getPages(), this);
            for (Pages page : wikiData.getQuery().getPages()) {
                Log.e(Constants.TAG, page.getTitle());
            }
            mBinding.setAdapter(adapter);
            Toast.makeText(this, "WikiData Full", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "WikiData Null", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onInformationSelected(Pages page) {
        Intent intent = new Intent(this, InformationActivity.class);
        intent.putExtra("wiki_data_image", page.getThumbnail());
        intent.putExtra("wiki_data", page);
        startActivity(intent);
    }
}
