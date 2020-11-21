package com.practice.btnimgchkrdo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class CheckBoxRadioButtonActivity extends AppCompatActivity {
    RadioGroup rg1;
    RadioButton pic1;
    RadioButton pic2;
    RadioButton pic3;
    CheckBox chk1;
    CheckBox chk2;
    CheckBox chk3;
    Button btnColor;
    ImageView img1;
    LinearLayout mainLayout;
    int r, g, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_radio_button);
        SetupView();
        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chk1.isChecked()) {
                    r = 255;
                } else {
                    r = 0;
                }
                if (chk2.isChecked()) {
                    g = 255;
                } else {
                    g = 0;
                }
                if (chk3.isChecked()) {
                    b = 255;
                } else {
                    b = 0;
                }
                mainLayout.setBackgroundColor(Color.argb(255, r, g, b));
                if (r == 0 && g == 0 && b == 0) {
                    chk1.setTextColor(Color.WHITE);
                    chk2.setTextColor(Color.WHITE);
                    chk3.setTextColor(Color.WHITE);
                } else {
                    chk1.setTextColor(Color.BLACK);
                    chk2.setTextColor(Color.BLACK);
                    chk3.setTextColor(Color.BLACK);
                }
            }
        });
    }

    private void SetupView() {
        rg1 = findViewById(R.id.rg1);
        pic1 = findViewById(R.id.pic1);
        pic2 = findViewById(R.id.pic2);
        pic3 = findViewById(R.id.pic2);
        chk1 = findViewById(R.id.chkRed);
        chk2 = findViewById(R.id.chkGreen);
        chk3 = findViewById(R.id.chkBlue);
        btnColor = findViewById(R.id.btnColor);
        img1 = findViewById(R.id.imgShow);
        mainLayout = findViewById(R.id.mainLayout);
    }
}