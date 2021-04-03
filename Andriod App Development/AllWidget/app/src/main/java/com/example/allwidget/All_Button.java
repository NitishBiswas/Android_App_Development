package com.example.allwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;


public class All_Button extends AppCompatActivity {

    private ImageButton imgButton;
    private CheckBox ch1,ch2;
    private RadioGroup radioGroup;
    private RadioButton gender;
    private Button button;
    private RatingBar ratingBar;
    private SeekBar seekBar;
    private Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all__button);

        imgButton = findViewById(R.id.imgBtnID);

        ch1 = findViewById(R.id.loveID);
        ch2 = findViewById(R.id.youID);

        button = findViewById(R.id.showRadioID);

        ratingBar = findViewById(R.id.ratingBarID);

        seekBar = findViewById(R.id.seekBarID);

        aSwitch = findViewById(R.id.switchID);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(All_Button.this, "WiFi On", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(All_Button.this, "WiFi Off", Toast.LENGTH_SHORT).show();
                }
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(All_Button.this, "SeekBar = "+progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(All_Button.this,rating+" Star",Toast.LENGTH_SHORT).show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioGroup = findViewById(R.id.radioGroupID);

                int check = radioGroup.getCheckedRadioButtonId();
                gender = findViewById(check);
                Toast.makeText(All_Button.this,gender.getText().toString()+" is clicked",Toast.LENGTH_SHORT).show();
            }
        });

        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(All_Button.this,"Facebook Image is clicked",Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void check(View view) {
        if(view.getId()==R.id.loveID){
            if(ch1.isChecked()){
                Toast.makeText(All_Button.this,"Love is checked",Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(All_Button.this,"Love is unchecked",Toast.LENGTH_SHORT).show();
            }
        }else if(view.getId()==R.id.youID){
            if(ch2.isChecked()){
                Toast.makeText(All_Button.this,"You is checked",Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(All_Button.this,"You is unchecked",Toast.LENGTH_SHORT).show();
            }
        }
    }
}