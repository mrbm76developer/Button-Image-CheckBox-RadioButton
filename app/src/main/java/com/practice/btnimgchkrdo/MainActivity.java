package com.practice.btnimgchkrdo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button[] btns=new Button[15];
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetupView();

    }
    public void HideBtn(View view){
        Button btn=(Button) view;
        btn.setVisibility(View.INVISIBLE);
    }

    private void SetupView() {
        btns[0]=findViewById(R.id.btn1);
        btns[1]=findViewById(R.id.btn2);
        btns[2]=findViewById(R.id.btn3);
        btns[3]=findViewById(R.id.btn4);
        btns[4]=findViewById(R.id.btn5);
        btns[5]=findViewById(R.id.btn6);
        btns[6]=findViewById(R.id.btn7);
        btns[7]=findViewById(R.id.btn8);
        btns[8]=findViewById(R.id.btn9);
        btns[9]=findViewById(R.id.btn10);
        btns[10]=findViewById(R.id.btn11);
        btns[11]=findViewById(R.id.btn12);
        btns[12]=findViewById(R.id.btn13);
        btns[13]=findViewById(R.id.btn14);
        btns[14]=findViewById(R.id.btn15);
        btnReset=findViewById(R.id.btnReset);
    }
}