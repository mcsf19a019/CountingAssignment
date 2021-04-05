package com.example.countingassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Ten extends AppCompatActivity {
    ImageView ten;
    ImageView nine;
    MediaPlayer tenmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);
        nine = findViewById(R.id.nineID);
        ten = findViewById(R.id.tenID);
        ten.animate().rotationYBy(360).setDuration(2000);
        tenmp = MediaPlayer.create(this,R.raw.tenaudio);
        tenmp.start();
    }

    public void again(View view) {
        ten.animate().rotationYBy(360).setDuration(2000);
        tenmp.start();
    }

    public void GoToNice(View view) {
        finish();
        System.exit(0);
        nine.animate().rotationYBy(360).setDuration(2000);
    }
}