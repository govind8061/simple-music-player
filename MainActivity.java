package com.example.simplemusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton btnPlay,btnPause,btnStop;
    ImageView thumbnail;
    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay=findViewById(R.id.btnPlay);
        btnPause=findViewById(R.id.btnPause);
        btnStop=findViewById(R.id.btnStop);

        thumbnail=findViewById(R.id.thumbnail);

        music=MediaPlayer.create(MainActivity.this,R.raw.nain_bengali);


        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music.start();
            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (music.isPlaying()){
                    music.pause();
                }
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music.stop();
                music=MediaPlayer.create(MainActivity.this,R.raw.nain_bengali);
            }
        });


    }
}