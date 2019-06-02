package app.wiki.com.wikiapp.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import app.wiki.com.wikiapp.util.CircleTransform;

public class WikiDataViewModel extends ViewModel {
    public MutableLiveData<String> mTitle = new MutableLiveData<>();
    public MutableLiveData<String> mImageUrl = new MutableLiveData<>();
    public MutableLiveData<String> mDescription = new MutableLiveData<>();

    @BindingAdapter({"imageUrl"})
    public static void setImageUrl(ImageView view, String imagePath) {
        Picasso.get().load(imagePath).transform(CircleTransform.getInstance()).into(view);
    }
}
