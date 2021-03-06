package com.example.android_club_info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Null_club_info extends AppCompatActivity {
    Button nb1,nb2,nb3,nb4;
    TextView ntv1,ntv2,ntv3,ntv4,ntv5,ntv6,ntv7;
    ImageView ni1,ni2,ni3,ni4,ni5;
    LinearLayout nl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_null_club_info);
        nl = findViewById(R.id.lin_layout_null);

        nb1 = findViewById(R.id.null_about);
        nb2 = findViewById(R.id.null_eve_btn);
        nb3 =  findViewById(R.id.null_achieve_btn);
        nb4 = findViewById(R.id.null_team_btn);

        ntv1 = findViewById(R.id.null_about_text);
        ntv2= findViewById(R.id.null_eve_1_txt);
        ntv3= findViewById(R.id.null_eve_2_txt);
        ntv4= findViewById(R.id.null_eve_3_txt);
        ntv5= findViewById(R.id.null_achieve_1_txt);
        ntv6= findViewById(R.id.null_achieve_2_txt);
        ntv7 = findViewById(R.id.null_team_txt);

        ni1 = findViewById(R.id.null_eve_1);
        ni2 = findViewById(R.id.null_eve_2);
        ni3 = findViewById(R.id.null_eve_3);
        ni4 = findViewById(R.id.null_achieve_1);
        ni5 = findViewById(R.id.null_achieve_2);

        nb1.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(nl);
                }
                visible = !visible;
                ntv1.setVisibility(visible ? View.VISIBLE : View.GONE);
            }
        });

        nb2.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(nl);
                }
                visible = !visible;
                ni1.setVisibility(visible ? View.VISIBLE : View.GONE);
                ni2.setVisibility(visible ? View.VISIBLE : View.GONE);
                ni3.setVisibility(visible ? View.VISIBLE : View.GONE);
                ntv2.setVisibility(visible ? View.VISIBLE : View.GONE);
                ntv3.setVisibility(visible ? View.VISIBLE : View.GONE);
                ntv4.setVisibility(visible ? View.VISIBLE : View.GONE);
            }
        });

        nb3.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(nl);
                }
                visible = !visible;
                ni4.setVisibility(visible ? View.VISIBLE : View.GONE);
                ni5.setVisibility(visible ? View.VISIBLE : View.GONE);
                ntv5.setVisibility(visible ? View.VISIBLE : View.GONE);
                ntv6.setVisibility(visible ? View.VISIBLE : View.GONE);
            }
        });

        nb4.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(nl);
                }
                visible = !visible;
                ntv7.setVisibility(visible ? View.VISIBLE : View.GONE);
            }
        });
    }
}
