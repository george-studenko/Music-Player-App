package com.georgestudenko.musciplayer;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
    }

    // TODO: Implement this method to query the content provider with a cursor loader to load real data
    public void getArtistsMetaDataFromDevice(){
        // implement a cursorLoader
        ContentResolver resolver = getContentResolver();
        Cursor cursor = resolver.query(MediaStore.Audio.Artists.INTERNAL_CONTENT_URI,null,null,null,MediaStore.Audio.ArtistColumns.ARTIST);
    }
}
