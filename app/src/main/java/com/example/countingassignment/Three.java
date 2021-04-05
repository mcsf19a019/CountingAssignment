package com.example.countingassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Three extends AppCompatActivity {
    ImageView three;
    ImageView two;
    MediaPlayer threemp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        two = findViewById(R.id.twoID);
        three = findViewById(R.id.threeID);
        three.animate().rotationYBy(360).setDuration(2000);
        threemp = MediaPlayer.create(this,R.raw.threeaudio);
        threemp.start();
    }

    public void again(View view) {
        three.animate().rotationYBy(360).setDuration(2000);
        threemp.start();
    }

    public void GoToFour(View view) {
        Intent intent = new Intent(this,Four.class);
        startActivity(intent);
    }

    public void GoToTwo(View view) {
        finish();
        System.exit(0);
        two.animate().rotationYBy(360).setDuration(2000);
    }
}