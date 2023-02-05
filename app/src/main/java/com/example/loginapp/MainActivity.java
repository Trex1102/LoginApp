package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = findViewById(R.id.login_button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userName = findViewById(R.id.username_field);
                EditText password = findViewById(R.id.password_field);

                String username = userName.getText().toString();
                String password_ = password.getText().toString();

                // start a Intent

                Intent startIntent = new Intent(getApplicationContext(),Homepage.class);

                startIntent.putExtra("com.example.loginapp.Saikat" , username);
                startActivity(startIntent);
            }
        });

    }
}