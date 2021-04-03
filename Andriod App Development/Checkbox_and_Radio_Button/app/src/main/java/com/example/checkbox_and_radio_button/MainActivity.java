package com.example.checkbox_and_radio_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn,radio;
    private TextView txt;
    private CheckBox cb1,cb2,cb3;
    private RadioButton genderBtn;
    private RadioGroup r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.show_btn);
        txt = findViewById(R.id.resText);
        cb1 = findViewById(R.id.sugarID);
        cb2 = findViewById(R.id.milkID);
        cb3 = findViewById(R.id.waterID);

        radio = findViewById(R.id.radio_btn);
        r = findViewById(R.id.radioBtnGroupID);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                if(cb1.isChecked()){
                    txt.setText(stringBuilder.append("Sugar is order"+"\n"));
                }
                else if(cb2.isChecked()){
                    txt.setText(stringBuilder.append("Milk is order"+"\n"));
                }
                else if(cb3.isChecked()){
                    txt.setText(stringBuilder.append("Water is order"+"\n"));
                }else{
                    txt.setText("");
                }
            }
        });

        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int select = r.getCheckedRadioButtonId();
                genderBtn = findViewById(select);
                String value = genderBtn.getText().toString();
                Toast.makeText(MainActivity.this,value+" is selected",Toast.LENGTH_SHORT).show();
            }
        });
    }
}