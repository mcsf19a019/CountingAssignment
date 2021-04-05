package com.example.countingassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Seven extends AppCompatActivity {
    ImageView seven;
    ImageView six;
    MediaPlayer sevenmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
        six = findViewById(R.id.sixID);
        seven = findViewById(R.id.sevenID);
        seven.animate().rotationYBy(360).setDuration(2000);
        sevenmp = MediaPlayer.create(this,R.raw.sevenaudio);
        sevenmp.start();
    }

    public void again(View view) {
        seven.animate().rotationYBy(360).setDuration(2000);
        sevenmp.start();
    }

    public void GoToEight(View view) {
        Intent intent = new Intent(this,Eight.class);
        startActivity(intent);
    }

    public void GoToSix(View view) {
        finish();
        System.exit(0);
        six.animate().rotationYBy(360).setDuration(2000);
    }
}