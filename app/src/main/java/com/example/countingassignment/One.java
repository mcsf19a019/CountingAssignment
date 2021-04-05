package com.example.countingassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class One extends AppCompatActivity {
    ImageView one;
    MediaPlayer onemp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        one = findViewById(R.id.oneID);
        one.animate().rotationYBy(360).setDuration(2000);
        onemp = MediaPlayer.create(this,R.raw.oneaudio);
        onemp.start();

    }

    public void GoToTwo(View view) {
        Intent intent = new Intent(this,Two.class);
        startActivity(intent);
    }

    public void again(View view) {
        one.animate().rotationYBy(360).setDuration(2000);
        onemp.start();
    }
}