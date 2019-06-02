package app.wiki.com.wikiapp.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import app.wiki.com.wikiapp.R;
import app.wiki.com.wikiapp.databinding.WikiItemBinding;
import app.wiki.com.wikiapp.interfaces.WikiInformationListener;
import app.wiki.com.wikiapp.model.Pages;
import app.wiki.com.wikiapp.viewmodel.WikiItemViewModel;

/**
 * Adapter Class for binding data and View on an item of the RecyclerView.
 */
public class WikiItemAdapter extends RecyclerView.Adapter<WikiItemAdapter.WikiViewHolder> {
    private Pages[] mPages;
    private WikiInformationListener mListener;

    public WikiItemAdapter(Pages[] pages, WikiInformationListener listener) {
        mPages = pages;
        mListener = listener;
    }

    @NonNull
    @Override
    public WikiViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        WikiItemBinding itemBinding = DataBindingUtil.inflate(
                LayoutInflater.from(viewGroup.getContext()),
                R.layout.wiki_item, viewGroup, false);
        return new WikiViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull WikiViewHolder wikiViewHolder, int i) {
        WikiItemViewModel viewModel = new WikiItemViewModel();

        viewModel.mWikiContent.setValue(mPages[i].getTitle());

        if (mPages[i].getThumbnail() != null) {
            viewModel.mImageUrl.setValue(mPages[i].getThumbnail().getSource());
        }

        wikiViewHolder.mItemBinding.wikiItem.setOnClickListener(
                (v) -> mListener.onInformationSelected(mPages[i]));

        wikiViewHolder.bind(viewModel);
    }

    @Override
    public int getItemCount() {
        return mPages.length;
    }

    /**
     * Class holding View for the Adapter to bind the data with.
     */
    class WikiViewHolder extends RecyclerView.ViewHolder {
        private WikiItemBinding mItemBinding;

        /**
         * Constructor for WikiViewHolder
         *
         * @param itemBinding - Binding object for Data binding into an item.
         */
        WikiViewHolder(@NonNull WikiItemBinding itemBinding) {
            super(itemBinding.getRoot());
            mItemBinding = itemBinding;
        }

        /**
         * Method to bind the ViewModel into the item View.
         *
         * @param amfmPresetItemViewModel - WikiItemViewModel object for item Data binding.
         */
        void bind(WikiItemViewModel amfmPresetItemViewModel) {
            mItemBinding.setViewModel(amfmPresetItemViewModel);
            mItemBinding.executePendingBindings();
        }
    }
}
