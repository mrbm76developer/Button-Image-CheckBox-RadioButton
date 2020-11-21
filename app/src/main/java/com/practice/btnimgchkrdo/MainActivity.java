package com.practice.btnimgchkrdo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button[] btns = new Button[15];
    Button btnReset;
    ArrayList<Button> buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetupView();
        //Methods One
    }


    /**
     * Different Methods Hide Buttons
     * View.OnClickListener onClick = new View.OnClickListener() {
     *
     * @Override public void onClick(View view) {
     * Button btn = (Button) view;
     * btn.setVisibility(View.INVISIBLE);
     * }
     * };
     * public void ResetButtons(View view){
     * Button btn = (Button) view;
     * for (Button btns:buttons ) {
     * btns.setVisibility(View.VISIBLE);
     * <p>
     * }
     * }And
     * for (int i = 0; i < 15; i++) {
     * btns[i].setOnClickListener(new View.OnClickListener() {
     * @Override public void onClick(View view) {
     * Button btn = (Button) view;
     * btn.setVisibility(View.INVISIBLE);
     * }
     * });
     * <p>
     * }And
     * public void HideBtn(View view){
     * Button btn=(Button) view;
     * btn.setVisibility(View.INVISIBLE);
     * }And
     * for (int i = 0; i < 15; i++) {
     * btns[i].setOnClickListener(onClick);
     * <p>
     * }And
     * buttons = new ArrayList<Button>();
     * for (int i = 0; i < btns.length; i++) {
     * btns[i].setOnClickListener(onClick);
     * buttons.add(btns[i]);
     * <p>
     * }
     */

    private void SetupView() {
        btns[0] = findViewById(R.id.btn1);
        btns[1] = findViewById(R.id.btn2);
        btns[2] = findViewById(R.id.btn3);
        btns[3] = findViewById(R.id.btn4);
        btns[4] = findViewById(R.id.btn5);
        btns[5] = findViewById(R.id.btn6);
        btns[6] = findViewById(R.id.btn7);
        btns[7] = findViewById(R.id.btn8);
        btns[8] = findViewById(R.id.btn9);
        btns[9] = findViewById(R.id.btn10);
        btns[10] = findViewById(R.id.btn11);
        btns[11] = findViewById(R.id.btn12);
        btns[12] = findViewById(R.id.btn13);
        btns[13] = findViewById(R.id.btn14);
        btns[14] = findViewById(R.id.btn15);
        btnReset = findViewById(R.id.btnReset);
    }
}