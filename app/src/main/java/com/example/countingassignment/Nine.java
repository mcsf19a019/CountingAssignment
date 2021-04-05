package com.example.countingassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Nine extends AppCompatActivity {
    ImageView nine;
    ImageView eight;
    MediaPlayer ninemp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);
        eight = findViewById(R.id.eightID);
        nine = findViewById(R.id.nineID);
        nine.animate().rotationYBy(360).setDuration(2000);
        ninemp = MediaPlayer.create(this,R.raw.nineaudio);
        ninemp.start();
    }

    public void again(View view) {
        nine.animate().rotationYBy(360).setDuration(2000);
        ninemp.start();
    }

    public void GoToTen(View view) {
        Intent intent = new Intent(this,Ten.class);
        startActivity(intent);
    }

    public void GoToEight(View view) {
        finish();
        System.exit(0);
        eight.animate().rotationYBy(360).setDuration(2000);
    }
}