package com.georgestudenko.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayerActivity extends AppCompatActivity {

    boolean inPause = true;
    TextView playingNowSongName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        playingNowSongName = (TextView) findViewById(R.id.playingNowSongName);

//        if(getIntent()!=null){
//            String songName = getIntent().getStringExtra(Intent.EXTRA_TEXT);
//            playingNowSongName.setText(songName);
//        }

        ImageView play = (ImageView) findViewById(R.id.playButton);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img = (ImageView)v;

                if(inPause) {
                    img.setImageDrawable(getResources().getDrawable(R.drawable.pause));
                    inPause=false;
                }else{
                    img.setImageDrawable(getResources().getDrawable(R.drawable.play));
                    inPause=true;
                }
            }
        });

        Button viewArtists = (Button) findViewById(R.id.viewArtists);
        viewArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ArtistsActivity.class);
                v.getContext().startActivity(intent);
            }
        });

        Button viewAlbums = (Button) findViewById(R.id.viewAlbums);
        viewAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),AlbumsActivity.class);
                v.getContext().startActivity(intent);
            }
        });

        Button viewSongs = (Button) findViewById(R.id.viewSongs);
        viewSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),SongsActivity.class);
                v.getContext().startActivity(intent);
            }
        });
    }
}
