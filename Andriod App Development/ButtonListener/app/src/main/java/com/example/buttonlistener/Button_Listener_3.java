package com.example.buttonlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Button_Listener_3 extends AppCompatActivity {

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button__listener_3);
        btn = (Button) findViewById(R.id.btnId);
        Handler handler = new Handler();
        btn.setOnClickListener(handler);
    }

    class Handler implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Toast toast = Toast.makeText(Button_Listener_3.this,"Login",Toast.LENGTH_LONG);
            toast.show();
        }
    }
}