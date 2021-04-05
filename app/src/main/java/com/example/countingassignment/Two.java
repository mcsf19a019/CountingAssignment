package com.example.countingassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Two extends AppCompatActivity {
    ImageView two;
    ImageView one;
    MediaPlayer twomp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        one = findViewById(R.id.oneID);
        two = findViewById(R.id.twoID);
        two.animate().rotationYBy(360).setDuration(2000);
        twomp = MediaPlayer.create(this,R.raw.twoaudio);
        twomp.start();
    }

    public void GoToThree(View view) {
        Intent intent = new Intent(this,Three.class);
        startActivity(intent);
    }

    public void GoToOne(View view) {
        finish();
        System.exit(0);
        one.animate().rotationYBy(360).setDuration(2000);
    }

    public void again(View view) {
        two.animate().rotationYBy(360).setDuration(2000);
        twomp.start();
    }
}