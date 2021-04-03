package com.example.allwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class All_Picker extends AppCompatActivity {

    private DatePicker datePicker;
    private Button button,showTime;
    private DatePickerDialog datePickerDialog;
    private TimePicker timePicker;
    private TimePickerDialog timePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all__picker);

        datePicker = findViewById(R.id.datePickerID);
        button = findViewById(R.id.showID);

        showTime = findViewById(R.id.showTimeID);
        timePicker = findViewById(R.id.timeID);
        int currentHour = timePicker.getCurrentHour();
        int currentMinute = timePicker.getCurrentMinute();
        showTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(All_Picker.this, currentHour+" : "+currentMinute, Toast.LENGTH_SHORT).show();

                timePickerDialog = new TimePickerDialog(All_Picker.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Toast.makeText(All_Picker.this, hourOfDay+" : "+minute, Toast.LENGTH_SHORT).show();

                    }
                },currentHour,currentMinute,false);
                timePickerDialog.show();
            }
        });

        int currentDay = datePicker.getDayOfMonth();
        int currentMonth = datePicker.getMonth()+1;
        int currentYear = datePicker.getYear();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(All_Picker.this, currentDay+"/"+currentMonth+"/"+currentYear, Toast.LENGTH_SHORT).show();

                datePickerDialog = new DatePickerDialog(All_Picker.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        Toast.makeText(All_Picker.this, year+"/"+(month+1)+"/"+dayOfMonth, Toast.LENGTH_SHORT).show();
                    }},currentDay,currentMonth,currentYear);
                datePickerDialog.show();
            }
        });

    }
}