package com.danynarcisse.youtubeapp;

import com.squareup.picasso.Picasso;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


/**
 * Created by Dany on 3/16/2018.
 */


public class MyAdapter extends RecyclerView.Adapter<YoutubeVideoViewHolder> {
    private final List<Result> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<Result> myDataset) {
        mDataset = myDataset;
    }


    // Create new views (invoked by the layout manager)
    @Override
    public YoutubeVideoViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.element_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        YoutubeVideoViewHolder vh = new YoutubeVideoViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(YoutubeVideoViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Result result = this.mDataset.get(position);
        holder.title.setText(result.snippet.description.toString()); //(result.snippet.description.toString());
        holder.description.setText(result.snippet.description.toString());
        Picasso.get().load(result.snippet.thumbnails.get("medium").url).into(holder.miniature);
        //holder.Bind(result);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset == null ? 0 : mDataset.size();
    }
}
