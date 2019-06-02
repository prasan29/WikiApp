package app.wiki.com.wikiapp.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import app.wiki.com.wikiapp.util.CircleTransform;

/**
 * Class to be bound with Activity.
 */
public class WikiDataViewModel extends ViewModel {
    public MutableLiveData<String> mTitle = new MutableLiveData<>();
    public MutableLiveData<String> mImageUrl = new MutableLiveData<>();
    public MutableLiveData<String> mDescription = new MutableLiveData<>();

    /**
     * Method to bind image URL with the ImageView.
     *
     * @param view      - ImageView to have set by the fetched image.
     * @param imagePath - String image URL.
     */
    @BindingAdapter({"imageUrl"})
    public static void setImageUrl(ImageView view, String imagePath) {
        Picasso.get().load(imagePath).transform(CircleTransform.getInstance()).into(view);
    }
}
