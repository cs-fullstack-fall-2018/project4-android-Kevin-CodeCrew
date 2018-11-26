package com.the3wcircus.familycooks;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Date;

/**
 * A custom adapter to use with the RecyclerView widget.
 */
public class RecipeListAdapter extends RecyclerView.Adapter<RecipeListAdapter.RecipeHolder> {

    @Override
    public RecipeHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recipe_item_layout, viewGroup, false);

        return new RecipeHolder(view);
    }

    @Override
    public void onBindViewHolder(RecipeHolder itemViewHolder, int position) {

        //Here you can fill your row view
    }

    @Override
    public int getItemCount() {

        return 0;
    }

    class RecipeHolder extends RecyclerView.ViewHolder {

        public RecipeHolder(View itemView) {
            super(itemView);
        }
    }


}
