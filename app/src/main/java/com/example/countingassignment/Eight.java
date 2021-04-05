package com.example.countingassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Eight extends AppCompatActivity {
    ImageView eight;
    ImageView seven;
    MediaPlayer eightmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        seven = findViewById(R.id.sevenID);
        eight = findViewById(R.id.eightID);
        eight.animate().rotationYBy(360).setDuration(2000);
        eightmp = MediaPlayer.create(this,R.raw.eightaudio);
        eightmp.start();
    }

    public void again(View view) {
        eight.animate().rotationYBy(360).setDuration(2000);
        eightmp.start();
    }

    public void GoToNine(View view) {
        Intent intent = new Intent(this,Nine.class);
        startActivity(intent);
    }

    public void GoToSeven(View view) {
        finish();
        System.exit(0);
        seven.animate().rotationYBy(360).setDuration(2000);
    }
}