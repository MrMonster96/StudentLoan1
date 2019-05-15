package com.example.studentloan;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IntroScreen extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_screen);
        getSupportActionBar().hide();
    viewPager = findViewById(R.id.viewPager);
    IntroAdapter introAdapter =new IntroAdapter(getSupportFragmentManager());
    viewPager.setAdapter(introAdapter);

    }
}
