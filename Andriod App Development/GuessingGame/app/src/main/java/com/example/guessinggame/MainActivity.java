package com.example.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText inputText;
    private Button testBtn;
    private TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.inputID);
        testBtn = findViewById(R.id.buttonID);
        resultText = findViewById(R.id.resultID);

        testBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        try {
            String s = inputText.getText().toString();
            int number = Integer.parseInt(s);
            Random random = new Random();
            int randomNumber = random.nextInt(5)+1;
            if(randomNumber == number){
                resultText.setText("Congratulations! You have won the game.");
            }else {
                resultText.setText("You have lost the game!! Random number was "+randomNumber);
            }
        } catch (Exception e){
            Toast.makeText(MainActivity.this,"Please Enter a valid Number",Toast.LENGTH_SHORT).show();
        }
    }
}