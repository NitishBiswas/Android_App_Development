package com.example.countryprofile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bangladeshBtn,indiaBtn,bhutanBtn;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshBtn = findViewById(R.id.bangladeshBtnID);
        indiaBtn = findViewById(R.id.indiaBtnID);
        bhutanBtn = findViewById(R.id.bhutanBtnID);

        bangladeshBtn.setOnClickListener(this);
        bhutanBtn.setOnClickListener(this);
        indiaBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.bangladeshBtnID){
            intent = new Intent(MainActivity.this,CountryDetails.class);
            intent.putExtra("name","bangladesh");
            startActivity(intent);
        }
        if(v.getId() == R.id.indiaBtnID){
            intent = new Intent(MainActivity.this,CountryDetails.class);
            intent.putExtra("name","india");
            startActivity(intent);
        }
        if(v.getId() == R.id.bhutanBtnID){
            intent = new Intent(MainActivity.this,CountryDetails.class);
            intent.putExtra("name","bhutan");
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertBulder = new AlertDialog.Builder(this);

        alertBulder.setTitle("Exit");
        alertBulder.setMessage("Do you want to exit ?");
        alertBulder.setIcon(R.drawable.question);
        alertBulder.setCancelable(false);
        alertBulder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertBulder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertBulder.create();
        alertDialog.show();

    }
}