package com.georgestudenko.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import static com.georgestudenko.musicplayer.R.drawable.play;


public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ImageView play1 = (ImageView) findViewById(R.id.play1);
        ImageView play2 = (ImageView) findViewById(R.id.play2);
        ImageView play3 = (ImageView) findViewById(R.id.play3);
        ImageView play4 = (ImageView) findViewById(R.id.play4);
        ImageView play5 = (ImageView) findViewById(R.id.play5);
        ImageView play6 = (ImageView) findViewById(R.id.play6);
        ImageView play7 = (ImageView) findViewById(R.id.play7);
        ImageView play8 = (ImageView) findViewById(R.id.play8);
        ImageView play9 = (ImageView) findViewById(R.id.play9);
        ImageView play10 = (ImageView) findViewById(R.id.play10);

        SongPlayOnClickListener listener = new SongPlayOnClickListener();
        play1.setOnClickListener(listener);
        play2.setOnClickListener(listener);
        play3.setOnClickListener(listener);
        play4.setOnClickListener(listener);
        play5.setOnClickListener(listener);
        play6.setOnClickListener(listener);
        play7.setOnClickListener(listener);
        play8.setOnClickListener(listener);
        play9.setOnClickListener(listener);
        play10.setOnClickListener(listener);

    }
}
