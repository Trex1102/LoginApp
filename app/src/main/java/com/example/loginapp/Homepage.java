package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        if(getIntent().hasExtra("com.example.loginapp.Saikat")){
            TextView userName = findViewById(R.id.textTwo);
            String text = getIntent().getExtras().getString("com.example.loginapp.Saikat");
            userName.setText(text);
        }
    }
}