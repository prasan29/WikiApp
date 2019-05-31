package app.wiki.com.wikiapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import app.wiki.com.wikiapp.model.Pages;

public class WikiItemAdapter extends RecyclerView.Adapter<WikiItemAdapter.ViewHolder> {
    private Pages[] mPages;

    public WikiItemAdapter(Pages[] pages) {
        mPages = pages;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return mPages.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
//        private WikiItemBinding mItemBinding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
