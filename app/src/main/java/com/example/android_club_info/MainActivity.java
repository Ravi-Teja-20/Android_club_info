package com.example.android_club_info;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   /* ViewGroup v1;
    Button b1,b2,b3,b4;
    TextView an_tv1,an_tv2,an_tv3,an_tv4,an_tv5,an_tv6,an_tv7;
    ImageView eve1,eve2,eve3,achieve1,achieve2;*/
   ImageView app1,app2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        app1 = findViewById(R.id.andy_app_1);
        app2 = findViewById(R.id.andy_app_2);
      /*  v1 = findViewById(R.id.lin_layout_1);
        b1 = findViewById(R.id.andy_about);
        b2 = findViewById(R.id.andy_eve_btn);
        b3 = findViewById(R.id.andy_achieve_btn);
        b4 = findViewById(R.id.andy_team_btn);
        an_tv1 = findViewById(R.id.andy_about_text);
        an_tv2 = findViewById(R.id.andy_eve_1_txt);
        an_tv3 = findViewById(R.id.andy_eve_2_txt);
        an_tv4 = findViewById(R.id.andy_eve_3_txt);
        an_tv5 = findViewById(R.id.andy_achieve_1_txt);
        an_tv6 = findViewById(R.id.andy_achieve_2_txt);
        an_tv7 = findViewById(R.id.andy_team_txt);
        eve1 =findViewById(R.id.andy_eve_1);
        eve2 = findViewById(R.id.andy_eve_2);
        eve3 = findViewById(R.id.andy_eve_3);
        achieve1 = findViewById(R.id.andy_achieve_1);
        achieve2 = findViewById(R.id.andy_achieve_2);

        b1.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(v1);
                }
                visible = !visible;
                an_tv1.setVisibility(visible ? View.VISIBLE : View.GONE);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(v1);
                }
                visible = !visible;
                eve1.setVisibility(visible ? View.VISIBLE : View.GONE);
                eve2.setVisibility(visible ? View.VISIBLE : View.GONE);
                eve3.setVisibility(visible ? View.VISIBLE : View.GONE);
                an_tv2.setVisibility(visible ? View.VISIBLE : View.GONE);
                an_tv3.setVisibility(visible ? View.VISIBLE : View.GONE);
                an_tv4.setVisibility(visible ? View.VISIBLE : View.GONE);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(v1);
                }
                visible = !visible;
                achieve1.setVisibility(visible ? View.VISIBLE : View.GONE);
                achieve2.setVisibility(visible ? View.VISIBLE : View.GONE);
                an_tv5.setVisibility(visible ? View.VISIBLE : View.GONE);
                an_tv6.setVisibility(visible ? View.VISIBLE : View.GONE);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(v1);
                }
                visible = !visible;
                an_tv7.setVisibility(visible ? View.VISIBLE : View.GONE);
            }
        }); */
    }
    public void career_guide(View view){
        Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.androidclubagi.career"));
        startActivity(i1);
    }

    public void eventium(View view){
        Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/apps/details?id=com.andro.myappyy"));
        startActivity(i2);
    }
}
