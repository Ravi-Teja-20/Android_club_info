package com.example.android_club_info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Null_splash_screen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_null_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent Splash = new Intent(Null_splash_screen.this, Null_club_info.class);
                startActivity(Splash);
                finish();

            }
        }, SPLASH_TIME_OUT);
    }
}
