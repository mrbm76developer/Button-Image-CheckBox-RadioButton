package com.practice.btnimgchkrdo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {
    ImageView imgShow;
    Button btnNextImage;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        SetupView();

        final int[] images = {R.drawable.check,
                R.drawable.iconfinder_bowling_1271431
                , R.drawable.iconfinder_cup_416372
                , R.drawable.iconfinder_equilizer_1646011
                , R.drawable.iconfinder_keditbookmarks_17999};
        btnNextImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    imgShow.setImageResource(images[i]);
                    i++;
                    if (i==images.length){
                        i=0;
                    }
            }
        });

    }

    private void SetupView() {
        imgShow = findViewById(R.id.imgShow);
        btnNextImage = findViewById(R.id.btnNextImages);
    }
}