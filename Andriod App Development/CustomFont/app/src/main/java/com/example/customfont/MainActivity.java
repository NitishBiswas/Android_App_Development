package com.example.customfont;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text1,text2;
    private Typeface typeface1,typeface2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text1ID);
        text2 = findViewById(R.id.text2ID);

        typeface1 = Typeface.createFromAsset(getAssets(),"font/AlexBrush.ttf");
        text1.setTypeface(typeface1);
        typeface2 = Typeface.createFromAsset(getAssets(),"font/Rubik_Italic.ttf");
        text2.setTypeface(typeface2);

    }
}