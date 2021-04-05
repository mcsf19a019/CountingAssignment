package com.example.countingassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Five extends AppCompatActivity {
    ImageView five;
    ImageView four;
    MediaPlayer fivemp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        four = findViewById(R.id.fourID);
        five = findViewById(R.id.fiveID);
        five.animate().rotationYBy(360).setDuration(2000);
        fivemp = MediaPlayer.create(this,R.raw.fiveaudio);
        fivemp.start();
    }

    public void again(View view) {
        five.animate().rotationYBy(360).setDuration(2000);
        fivemp.start();
    }
    public void GoToSix(View view) {
        Intent intent = new Intent(this,Six.class);
        startActivity(intent);
    }
    public void GoToFour(View view) {
        finish();
        System.exit(0);
        four.animate().rotationYBy(360).setDuration(2000);
    }
}