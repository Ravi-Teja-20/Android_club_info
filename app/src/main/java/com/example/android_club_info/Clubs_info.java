package com.example.android_club_info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Clubs_info extends AppCompatActivity {
    Button club1,club2,club3,club4,club5,club6,club7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs_info);
        club1 = findViewById(R.id.android_club_btn);
        club2 = findViewById(R.id.iot_club_btn);
        club3 = findViewById(R.id.data_club_btn);
        club4 = findViewById(R.id.malai_club_btn);
        club5 = findViewById(R.id.null_club_btn);
        club6 = findViewById(R.id.cloud_club_btn);
        club7 = findViewById(R.id.web_club_btn);

        club1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Clubs_info.this, Android_splash_screen.class);
                startActivity(c);
            }
        });

        club2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Clubs_info.this, iot_splash_screen.class);
                startActivity(c);
            }
        });

        club3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Clubs_info.this, Data_splash_screen.class);
                startActivity(c);
            }
        });

        club4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Clubs_info.this, Malai_splash_screen.class);
                startActivity(c);
            }
        });

        club5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Clubs_info.this, Null_splash_screen.class);
                startActivity(c);
            }
        });

        club6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Clubs_info.this, Cloud_splash_screen.class);
                startActivity(c);
            }
        });

        club7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Clubs_info.this, Web_splash_screen.class);
                startActivity(c);
            }
        });
    }
}
