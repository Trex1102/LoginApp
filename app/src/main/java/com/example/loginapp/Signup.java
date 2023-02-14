package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button login = findViewById(R.id.login_button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userName = findViewById(R.id.username_field);
                EditText password = findViewById(R.id.password_field);
                EditText userMail = findViewById(R.id.user_email_field);
                EditText confirmPassword = findViewById(R.id.confirm_password_field);

                String username = userName.getText().toString();
                String password_ = password.getText().toString();
                String user_mail = userMail.getText().toString();
                String confirm_password = confirmPassword.getText().toString();

                if(username.isEmpty() || password_.isEmpty() || user_mail.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Error: Invalid Username or Password or User mail Entered", Toast.LENGTH_LONG).show();
                }
                else if(password_.length() < 8){
                    Toast.makeText(getApplicationContext(), "Error: Set password with more than 8 characters", Toast.LENGTH_LONG).show();
                }

                else if(!password_.equals(confirm_password)){
                    Toast.makeText(getApplicationContext(), "Error: Passwords don't match", Toast.LENGTH_LONG).show();
                }

                else {
                    // start a Intent

                    Intent loginIntent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(loginIntent);
                }
            }
        });
    }
}