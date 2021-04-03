package com.example.d_51_cse_diu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button rollBtn1, rollBtn2, rollBtn5, rollBtn6, rollBtn7, rollBtn9, rollBtn10, rollBtn11, rollBtn13, rollBtn14, rollBtn16, rollBtn17;
    private Button rollBtn18, rollBtn19, rollBtn21, rollBtn23, rollBtn25, rollBtn28, rollBtn29, rollBtn31, rollBtn33, rollBtn34, rollBtn37, rollBtn39;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollBtn1 = findViewById(R.id.rollOneBtn);
        rollBtn2 = findViewById(R.id.rollTwoBtn);
        rollBtn5 = findViewById(R.id.rollFiveBtn);
        rollBtn6 = findViewById(R.id.rollSixBtn);
        rollBtn7 = findViewById(R.id.rollSevenBtn);
        rollBtn9 = findViewById(R.id.rollNineBtn);
        rollBtn10 = findViewById(R.id.rollTenBtn);
        rollBtn11 = findViewById(R.id.rollElevenBtn);
        rollBtn13 = findViewById(R.id.rollThirteenBtn);
        rollBtn14 = findViewById(R.id.rollFourteenBtn);
        rollBtn16 = findViewById(R.id.rollSixteenBtn);
        rollBtn17 = findViewById(R.id.rollSeventeenBtn);
        rollBtn18 = findViewById(R.id.rollEighteenBtn);
        rollBtn19 = findViewById(R.id.rollNineteenBtn);
        rollBtn21 = findViewById(R.id.rollTwentyOneBtn);
        rollBtn23 = findViewById(R.id.rollTwentyThreeBtn);
        rollBtn25 = findViewById(R.id.rollTwentyFiveBtn);
        rollBtn28 = findViewById(R.id.rollTwentyEightBtn);
        rollBtn29 = findViewById(R.id.rollTwentyNineBtn);
        rollBtn31 = findViewById(R.id.rollThirtyOneBtn);
        rollBtn33 = findViewById(R.id.rollThirtyThreeBtn);
        rollBtn34 = findViewById(R.id.rollThirtyFourBtn);
        rollBtn37 = findViewById(R.id.rollThirtySevenBtn);
        rollBtn39 = findViewById(R.id.rollThirtyNineBtn);

        rollBtn1.setOnClickListener(this);
        rollBtn2.setOnClickListener(this);
        rollBtn5.setOnClickListener(this);
        rollBtn6.setOnClickListener(this);
        rollBtn7.setOnClickListener(this);
        rollBtn9.setOnClickListener(this);
        rollBtn10.setOnClickListener(this);
        rollBtn11.setOnClickListener(this);
        rollBtn13.setOnClickListener(this);
        rollBtn14.setOnClickListener(this);
        rollBtn16.setOnClickListener(this);
        rollBtn17.setOnClickListener(this);
        rollBtn18.setOnClickListener(this);
        rollBtn19.setOnClickListener(this);
        rollBtn21.setOnClickListener(this);
        rollBtn23.setOnClickListener(this);
        rollBtn25.setOnClickListener(this);
        rollBtn28.setOnClickListener(this);
        rollBtn29.setOnClickListener(this);
        rollBtn31.setOnClickListener(this);
        rollBtn33.setOnClickListener(this);
        rollBtn34.setOnClickListener(this);
        rollBtn37.setOnClickListener(this);
        rollBtn39.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.rollOneBtn){
            Intent intent = new Intent(MainActivity.this,roll_1.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollTwoBtn){
            Intent intent = new Intent(MainActivity.this,roll_2.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollFiveBtn){
            Intent intent = new Intent(MainActivity.this,roll_5.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollSixBtn){
            Intent intent = new Intent(MainActivity.this,roll_6.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollSevenBtn){
            Intent intent = new Intent(MainActivity.this,roll_7.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollNineBtn){
            Intent intent = new Intent(MainActivity.this,roll_9.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollTenBtn){
            Intent intent = new Intent(MainActivity.this,roll_10.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollElevenBtn){
            Intent intent = new Intent(MainActivity.this,roll_11.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollThirteenBtn){
            Intent intent = new Intent(MainActivity.this,roll_13.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollFourteenBtn){
            Intent intent = new Intent(MainActivity.this,roll_14.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollSixteenBtn){
            Intent intent = new Intent(MainActivity.this,roll_16.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollSeventeenBtn){
            Intent intent = new Intent(MainActivity.this,roll_17.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollEighteenBtn){
            Intent intent = new Intent(MainActivity.this,roll_18.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollNineteenBtn){
            Intent intent = new Intent(MainActivity.this,roll_19.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollTwentyOneBtn){
            Intent intent = new Intent(MainActivity.this,roll_21.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollTwentyThreeBtn){
            Intent intent = new Intent(MainActivity.this,roll_23.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollTwentyFiveBtn){
            Intent intent = new Intent(MainActivity.this,roll_25.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollTwentyEightBtn){
            Intent intent = new Intent(MainActivity.this,roll_28.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollTwentyNineBtn){
            Intent intent = new Intent(MainActivity.this,roll_29.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollThirtyOneBtn){
            Intent intent = new Intent(MainActivity.this,roll_31.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollThirtyThreeBtn){
            Intent intent = new Intent(MainActivity.this,roll_33.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollThirtyFourBtn){
            Intent intent = new Intent(MainActivity.this,roll_34.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollThirtySevenBtn){
            Intent intent = new Intent(MainActivity.this,roll_37.class);
            startActivity(intent);
        }else if(v.getId()==R.id.rollThirtyNineBtn){
            Intent intent = new Intent(MainActivity.this,roll_39.class);
            startActivity(intent);
        }
    }
}