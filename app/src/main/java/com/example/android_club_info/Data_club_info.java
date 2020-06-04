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

public class Data_club_info extends AppCompatActivity {
    Button dcb1,dcb2,dcb3;
    TextView dtv1,dtv2,dtv3,dtv4,dtv5;
    ImageView dim1,dim2,dim3,dim4;
    LinearLayout dcl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_club_info);
        dcl = findViewById(R.id.lin_layout_data);

        dcb1 = findViewById(R.id.data_about);
        dcb2 = findViewById(R.id.data_eve_btn);
        dcb3 = findViewById(R.id.data_achieve_btn);

        dtv1 = findViewById(R.id.data_about_text);
        dtv2 = findViewById(R.id.data_eve_1_txt);
        dtv3 = findViewById(R.id.data_eve_2_txt);
        dtv4 = findViewById(R.id.data_eve_3_txt);
        dtv5 = findViewById(R.id.data_achieve_1_txt);

        dim1 = findViewById(R.id.data_eve_1);
        dim2 = findViewById(R.id.data_eve_2);
        dim3 = findViewById(R.id.data_eve_3);
        dim4 = findViewById(R.id.data_achieve_1);

        dcb1.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(dcl);
                }
                visible = !visible;
                dtv1.setVisibility(visible ? View.VISIBLE : View.GONE);
            }
        });

        dcb2.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(dcl);
                }
                visible = !visible;
                dim1.setVisibility(visible ? View.VISIBLE : View.GONE);
                dim2.setVisibility(visible ? View.VISIBLE : View.GONE);
                dim3.setVisibility(visible ? View.VISIBLE : View.GONE);
                dtv2.setVisibility(visible ? View.VISIBLE : View.GONE);
                dtv3.setVisibility(visible ? View.VISIBLE : View.GONE);
                dtv4.setVisibility(visible ? View.VISIBLE : View.GONE);
            }
        });

        dcb3.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(dcl);
                }
                visible = !visible;
                dim4.setVisibility(visible ? View.VISIBLE : View.GONE);
                dtv5.setVisibility(visible ? View.VISIBLE : View.GONE);
            }
        });
    }
}