package com.example.aicndarakwacdc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Teacher1Login extends AppCompatActivity {
EditText Username,Password;
Button Login;
int Attempt=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher1_login);
        Username =findViewById(R.id.editTextTextPersonName2);
        Password=findViewById(R.id.editTextTextPassword);
        Login=findViewById(R.id.button);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if(Username.getText().toString().equals("aicndarakwacdc")&& Password.getText().toString().equals("@Ndarakwa2020CDC")){
                        startActivity(new Intent(Teacher1Login.this,Teacher1.class));
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Login unsuccessful,Password or Username Incorrect...Try Again!!" , Toast.LENGTH_LONG).show();
                    }

            }

        });
    }
}