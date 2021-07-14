package com.example.aicndarakwacdc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Student2 extends AppCompatActivity {
    CardView cardView1,cardView2,cardView3,cardView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_student2);
        cardView1=findViewById(R.id.cardview1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Student2.this,RetrieveSpiritual2.class));
            }
        });
        cardView2=findViewById(R.id.cardview2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Student2.this,RetrievePhysical2.class));
            }
        });
        cardView3=findViewById(R.id.cardview3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Student2.this,RetrieveSocio2.class));
            }
        });
        cardView4=findViewById(R.id.cardview4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Student2.this,RetrieveCognitive2.class));
            }
        });
    }
}