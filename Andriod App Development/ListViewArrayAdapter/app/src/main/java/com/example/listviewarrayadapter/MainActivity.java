package com.example.listviewarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewID);

        String [] country_names = getResources().getStringArray(R.array.country_name);

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,R.layout.country_name,R.id.textViewID,country_names);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = country_names[position];
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,Country_details.class);
                intent.putExtra("name",value);
                startActivity(intent);
            }
        });

    }
}