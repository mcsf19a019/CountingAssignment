package com.example.countingassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Six extends AppCompatActivity {
    ImageView six;
    ImageView five;
    MediaPlayer sixmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        five = findViewById(R.id.fiveID);
        six = findViewById(R.id.sixID);
        six.animate().rotationYBy(360).setDuration(2000);
        sixmp = MediaPlayer.create(this,R.raw.sixaudio);
        sixmp.start();
    }

    public void again(View view) {
        six.animate().rotationYBy(360).setDuration(2000);
        sixmp.start();
    }

    public void GoToSeven(View view) {
        Intent intent = new Intent(this,Seven.class);
        startActivity(intent);
    }

    public void GoToFive(View view) {
        finish();
        System.exit(0);
        five.animate().rotationYBy(360).setDuration(2000);
    }
}