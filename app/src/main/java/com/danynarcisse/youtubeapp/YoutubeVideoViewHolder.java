package com.danynarcisse.youtubeapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Dany on 3/16/2018.
 */


public class YoutubeVideoViewHolder  extends RecyclerView.ViewHolder{

    public TextView title;
    public TextView description;

    public YoutubeVideoViewHolder(View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.titleTextView);
        description = itemView.findViewById(R.id.descriptionTextView);
    }

    public void Bind(Result result)
    {
        title.setText(result.snippet.title.toString());
        description.setText(result.snippet.description.toString());
    }
}
