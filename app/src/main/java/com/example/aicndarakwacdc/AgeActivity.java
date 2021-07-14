package com.example.aicndarakwacdc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AgeActivity extends AppCompatActivity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_age);
        spinner=(Spinner)findViewById(R.id.spinner);
        String [] ages = {"age","3-5","6-8","9-11","12-14","15-18","19+"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,ages);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 1:
                        Intent intent = new Intent(AgeActivity.this,cdc1.class);
                        startActivity(intent);
                        break;
                    case 2:
                        Intent intent1 = new Intent(AgeActivity.this,cdc2.class);
                        startActivity(intent1);
                        break;
                    case 3:
                        Intent intent2 = new Intent(AgeActivity.this,cdc3.class);
                        startActivity(intent2);
                        break;
                    case 4:
                        Intent intent3 = new Intent(AgeActivity.this,cdc4.class);
                        startActivity(intent3);
                        break;
                    case 5:
                        Intent intent4 = new Intent(AgeActivity.this,cdc5.class);
                        startActivity(intent4);
                        break;
                    case 6:
                        Intent intent5 = new Intent(AgeActivity.this,cdc6.class);
                        startActivity(intent5);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}