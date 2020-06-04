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

public class IoT_club_info extends AppCompatActivity {
    Button iot1,iot2,iot3;
    LinearLayout iot_l;
    TextView iot_v1,iot_v2,iot_v3,iot_v4,iot_v5;
    ImageView iot_img1,iot_img2,iot_img3,iot_img4,iot_img5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_io_t_club_info);
        iot_l = findViewById(R.id.lin_layout_iot);
        iot_v1 = findViewById(R.id.iot_about_text);
        iot_v2 = findViewById(R.id.iot_eve_1_txt);
        iot_v3 = findViewById(R.id.iot_eve_2_txt);
        iot_v4 = findViewById(R.id.iot_eve_3_txt);
        iot_v5 = findViewById(R.id.iot_achieve_1_txt);

        iot1 = findViewById(R.id.iot_about);
        iot2 = findViewById(R.id.iot_eve_btn);
        iot3 =findViewById(R.id.iot_achieve_btn);

        iot_img1 = findViewById(R.id.iot_eve_1);
        iot_img2 = findViewById(R.id.iot_eve_2);
        iot_img3 = findViewById(R.id.iot_eve_3);
        iot_img4 = findViewById(R.id.iot_achieve_1);
        iot_img5 = findViewById(R.id.iot_achieve_2);

        iot1.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(iot_l);
                }
                visible = !visible;
                iot_v1.setVisibility(visible ? View.VISIBLE : View.GONE);
            }
        });

        iot2.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(iot_l);
                }
                visible = !visible;
                iot_img1.setVisibility(visible ? View.VISIBLE : View.GONE);
                iot_img2.setVisibility(visible ? View.VISIBLE : View.GONE);
                iot_img3.setVisibility(visible ? View.VISIBLE : View.GONE);
                iot_v2.setVisibility(visible ? View.VISIBLE : View.GONE);
                iot_v3.setVisibility(visible ? View.VISIBLE : View.GONE);
                iot_v4.setVisibility(visible ? View.VISIBLE : View.GONE);
            }
        });

        iot3.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(iot_l);
                }
                visible = !visible;
                iot_img4.setVisibility(visible ? View.VISIBLE : View.GONE);
                iot_img5.setVisibility(visible ? View.VISIBLE : View.GONE);
                iot_v5.setVisibility(visible ? View.VISIBLE : View.GONE);
            }
        });
    }
}
