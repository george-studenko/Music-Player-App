package com.georgestudenko.musicplayer;

import android.content.Intent;
import android.view.View;


/**
 * Created by george on 18/04/2017.
 */

public class SongPlayOnClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext(),PlayerActivity.class);
        v.getContext().startActivity(intent);
    }
}
