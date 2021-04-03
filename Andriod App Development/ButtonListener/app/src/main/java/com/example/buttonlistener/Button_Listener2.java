package com.example.buttonlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Button_Listener2 extends AppCompatActivity implements View.OnClickListener {

    private Button loginButton,logoutButton;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button__listener2);

        loginButton = (Button) findViewById(R.id.loginButton);
        logoutButton = (Button) findViewById(R.id.logoutButton);
        textView = (TextView) findViewById(R.id.textID);

        loginButton.setOnClickListener(this);
        logoutButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.loginButton){
            textView.setText("Login Button is clicked");
        }else{
            textView.setText("Logout Button is clicked");
        }
    }
}