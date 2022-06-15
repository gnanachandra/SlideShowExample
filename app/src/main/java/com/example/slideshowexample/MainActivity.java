package com.example.slideshowexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable animi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView =(ImageView) findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.slideshow);
        animi = (AnimationDrawable) imageView.getBackground();
    }
}