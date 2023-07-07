package com.example.musicplayer30;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    LottieAnimationView laView;
    Button play, pause;
    SeekBar seekBar;
    MediaPlayer player;
    boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=(Button) findViewById(R.id.playbtn);
        seekBar = findViewById(R.id.seekBar);
        pause=(Button) findViewById(R.id.pausebtn);
        int lottieAnimationView = R.id.lottieAnimationView;


        player=MediaPlayer.create(MainActivity.this, R.raw.softsong);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.start();
                Toast.makeText(MainActivity.this,"song play", Toast.LENGTH_SHORT).show();

            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.pause();
                Toast.makeText(MainActivity.this,"song pause", Toast.LENGTH_SHORT).show();
            }
        });



            }

        }