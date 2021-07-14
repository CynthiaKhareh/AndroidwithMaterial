package com.example.aicndarakwacdc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class cdc3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cdc3);
        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        String [] ages = {"SELECT CATEGORY","Student","aic ndarakwa cdc teacher"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,ages);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 1:
                        Intent intent = new Intent(cdc3.this,Student3.class);
                        startActivity(intent);
                        break;
                    case 2:
                        Intent intent1 = new Intent(cdc3.this,Teacher3Login.class);
                        startActivity(intent1);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}