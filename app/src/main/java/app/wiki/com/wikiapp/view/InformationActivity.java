package app.wiki.com.wikiapp.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Objects;

import app.wiki.com.wikiapp.R;
import app.wiki.com.wikiapp.databinding.ActivityInformationBinding;
import app.wiki.com.wikiapp.model.Pages;
import app.wiki.com.wikiapp.model.Thumbnail;
import app.wiki.com.wikiapp.viewmodel.WikiDataViewModel;

public class InformationActivity extends AppCompatActivity {
    ActivityInformationBinding mInformationBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        mInformationBinding = DataBindingUtil.setContentView(this, R.layout.activity_information);

        mInformationBinding.setLifecycleOwner(this);

        Pages page = Objects.requireNonNull(getIntent().getExtras()).getParcelable("wiki_data");

        Thumbnail imageUrl = getIntent().getExtras().getParcelable("wiki_data_image");

        WikiDataViewModel viewModel = new WikiDataViewModel();

        mInformationBinding.setViewModel(viewModel);

        loadData(page, imageUrl);
    }

    private void loadData(Pages page, Thumbnail thumbnail) {
        if (page != null) {
            mInformationBinding.getViewModel().mTitle.setValue(page.getTitle());

            if (thumbnail != null) {
                mInformationBinding.getViewModel().mImageUrl.setValue(thumbnail.getSource());
            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }
}
