package com.danynarcisse.youtubeapp;

import android.content.Intent;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Dany on 3/16/2018.
 */


public class YoutubeVideoViewHolder  extends RecyclerView.ViewHolder{

    public TextView title;
    public TextView description;
    public ImageView miniature;
    public RelativeLayout space;

    public YoutubeVideoViewHolder(final View itemView) {
        super(itemView);


        //Get all data of xml, and binds the view and code.
        title = itemView.findViewById(R.id.titleTextView);
        description = itemView.findViewById(R.id.descriptionTextView);
        miniature = itemView.findViewById(R.id.miniatureImageView);
        space = itemView.findViewById(R.id.layout);

        space.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("debug","Clicking");
                Intent intent = new Intent(v.getContext(), VideoActivity.class);
                //intent.putExtra("IS_SHOW",isShow);
                v.getContext().startActivity(intent);
            }
        });
    }

    public void Bind(Result result)
    {
        title.setText(result.snippet.title.toString());
        description.setText(result.snippet.description.toString());
    }
}
