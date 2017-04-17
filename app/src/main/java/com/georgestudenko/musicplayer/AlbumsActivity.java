package com.georgestudenko.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import static com.georgestudenko.musicplayer.R.id.artist1;
import static com.georgestudenko.musicplayer.R.id.artist2;
import static com.georgestudenko.musicplayer.R.style.artistName;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        if(getIntent()!=null) {
            String artistName = getIntent().getStringExtra(Intent.EXTRA_TEXT);
            setTitle(artistName + " Albums");
        }

        AlbumOnClicklistener listener = new AlbumOnClicklistener();

        RelativeLayout album1 = (RelativeLayout) findViewById(R.id.album1);
        RelativeLayout album2 = (RelativeLayout) findViewById(R.id.album2);

        album1.setOnClickListener(listener);
        album2.setOnClickListener(listener);
    }
}
