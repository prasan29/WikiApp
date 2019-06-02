package app.wiki.com.wikiapp.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

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
            if (wikiData.getQuery() != null) {
                Pages[] pages = wikiData.getQuery().getPages();
                if (pages != null) {
                    WikiItemAdapter adapter = new WikiItemAdapter(pages, this);
                    mBinding.setAdapter(adapter);
                } else {
                    Toast.makeText(this, "Error loading the page!", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "Error loading the page!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Error fetching the data!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onInformationSelected(Pages page) {
        Intent intent = new Intent(this, InformationActivity.class);
        intent.putExtra("wiki_data_image", page.getThumbnail());
        intent.putExtra("wiki_data", page);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }
}
