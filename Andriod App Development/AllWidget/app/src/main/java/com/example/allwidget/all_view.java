package com.example.allwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;

import android.webkit.WebView;

import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import android.widget.ZoomControls;


public class all_view extends AppCompatActivity {

    private Button sendBtn,facebookBtn,playBtn,pauseBtn;
    private EditText editText;
    private Typeface typeface;
    private TextView textView;
    private WebView webView;
    private VideoView videoView;
    private ZoomControls zoomControls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_view);

        sendBtn = findViewById(R.id.sendBtnID);
        editText = findViewById(R.id.editTextID);
        textView = findViewById(R.id.textviewID);
        facebookBtn = findViewById(R.id.facebookID);
        videoView = findViewById(R.id.videoID);
        playBtn = findViewById(R.id.playBtnID);
        pauseBtn = findViewById(R.id.pauseBtnID);

        zoomControls = findViewById(R.id.zoomID);
        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x = videoView.getScaleX();
                float y = videoView.getScaleY();

                videoView.setScaleX(x+1);
                videoView.setScaleY(y+1);
            }
        });
        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x = videoView.getScaleX();
                float y = videoView.getScaleY();
                if(x>1&&y>1){
                    videoView.setScaleX(x-1);
                    videoView.setScaleY(y-1);
                }
            }
        });

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);
                videoView.setVideoURI(uri);
                MediaController mediaController = new MediaController(all_view.this);
                videoView.setMediaController(mediaController);
                videoView.start();
            }
        });
        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.pause();
            }
        });

        facebookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(all_view.this,Facebook.class);
                startActivity(intent);

            }
        });

        typeface = Typeface.createFromAsset(getAssets(),"font/rubik_italic.ttf");
        textView.setTypeface(typeface);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                if(s.isEmpty()){
                    Toast.makeText(all_view.this, "Please enter any comments", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(all_view.this,"Sending...",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}