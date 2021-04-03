package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryDetails extends AppCompatActivity {

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
            String countryName = bundle.getString("name");
            showDetails(countryName);
        }

    }
    void showDetails(String countryName){
        if(countryName.equals("bangladesh")){
            imageView.setImageResource(R.drawable.bangladesh_flag);
            textView.setText(R.string.bangladesh_details);
        }
        else if(countryName.equals("india")){
            imageView.setImageResource(R.drawable.india_flag);
            textView.setText(R.string.india_details);
        }
        else if(countryName.equals("bhutan")){
            imageView.setImageResource(R.drawable.bhutan_flag);
            textView.setText(R.string.bhutan_details);
        }
    }
}