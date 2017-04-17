package com.georgestudenko.musicplayer;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        ArtistOnClickListener listener = new ArtistOnClickListener();
        RelativeLayout artist1 = (RelativeLayout) findViewById(R.id.artist1);
        RelativeLayout artist2 = (RelativeLayout) findViewById(R.id.artist2);
        RelativeLayout artist3 = (RelativeLayout) findViewById(R.id.artist3);
        RelativeLayout artist4 = (RelativeLayout) findViewById(R.id.artist4);
        RelativeLayout artist5 = (RelativeLayout) findViewById(R.id.artist5);
        RelativeLayout artist6 = (RelativeLayout) findViewById(R.id.artist6);
        RelativeLayout artist7 = (RelativeLayout) findViewById(R.id.artist7);
        RelativeLayout artist8 = (RelativeLayout) findViewById(R.id.artist8);

        artist1.setOnClickListener(listener);
        artist2.setOnClickListener(listener);
        artist3.setOnClickListener(listener);
        artist4.setOnClickListener(listener);
        artist5.setOnClickListener(listener);
        artist6.setOnClickListener(listener);
        artist7.setOnClickListener(listener);
        artist8.setOnClickListener(listener);

    }

    // TODO: Implement this method to query the content provider with a cursor loader to load real data
    public void getArtistsMetaDataFromDevice(){
        // implement a cursorLoader
        ContentResolver resolver = getContentResolver();
        Cursor cursor = resolver.query(MediaStore.Audio.Artists.INTERNAL_CONTENT_URI,null,null,null,MediaStore.Audio.ArtistColumns.ARTIST);
    }
}
