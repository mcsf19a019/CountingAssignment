package com.example.countingassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Four extends AppCompatActivity {
    ImageView four;
    ImageView three;
    MediaPlayer fourmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        three = findViewById(R.id.threeID);
        four = findViewById(R.id.fourID);
        four.animate().rotationYBy(360).setDuration(2000);
        fourmp = MediaPlayer.create(this,R.raw.fouraudio);
        fourmp.start();
    }

    public void again(View view) {
        four.animate().rotationYBy(360).setDuration(2000);
        fourmp.start();
    }

    public void GoToFive(View view) {
        Intent intent = new Intent(this,Five.class);
        startActivity(intent);
    }

    public void GoToThree(View view) {
        finish();
        System.exit(0);
        three.animate().rotationYBy(360).setDuration(2000);
    }
}