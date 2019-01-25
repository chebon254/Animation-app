package com.example.annimationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        ImageView wallpaperprefect = findViewById(R.id.wallpaper);
        ImageView wallpaperprefect2 = findViewById(R.id.wallpaper2);
        wallpaperprefect.animate().alpha(0.5f).setDuration(2000);
        wallpaperprefect2.animate().alpha(1f).setDuration(2000);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
