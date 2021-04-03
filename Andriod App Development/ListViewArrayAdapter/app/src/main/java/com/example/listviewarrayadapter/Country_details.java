package com.example.listviewarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Country_details extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_details);

        imageView = findViewById(R.id.imageID);
        textView = findViewById(R.id.textID);

        Bundle bundle = getIntent().getExtras();
        if(!bundle.isEmpty()){
            String country_name = bundle.getString("name");
            showDetails(country_name);
        }

    }

    void showDetails(String country_name){
        if(country_name.equals("Bangladesh")){
            imageView.setImageResource(R.drawable.bangladesh_flag);
            textView.setText(R.string.bangladesh_details);
        }
        if(country_name.equals("India")){
            imageView.setImageResource(R.drawable.india_flag);
            textView.setText(R.string.india_details);
        }
        if(country_name.equals("Bhutan")){
            imageView.setImageResource(R.drawable.bhutan_flag);
            textView.setText(R.string.bhutan_details);
        }
    }

}