package com.georgestudenko.musicplayer;

import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * Created by george on 17/04/2017.
 */

public class ArtistOnClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        RelativeLayout relativeLayout=(RelativeLayout)v;
        TextView tv = (TextView)relativeLayout.getChildAt(1);
        String artistName = tv.getText().toString();
        Intent intent = new Intent(v.getContext(),AlbumsActivity.class);
        intent.putExtra(Intent.EXTRA_TEXT,artistName);
        v.getContext().startActivity(intent);
    }
}
