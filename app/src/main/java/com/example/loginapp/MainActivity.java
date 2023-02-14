package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // signup intent
        TextView signUpTextView = findViewById(R.id.sign_up_text_view_2);

        signUpTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent signupIntent = new Intent(getApplicationContext(),Signup.class);
                startActivity(signupIntent);
            }
        });


        // homepage intent

        Button login = findViewById(R.id.login_button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userName = findViewById(R.id.username_field);
                EditText password = findViewById(R.id.password_field);

                String username = userName.getText().toString();
                String password_ = password.getText().toString();

                //check username password
                if(username.isEmpty() || password_.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Error: Invalid Username or Password Entered", Toast.LENGTH_LONG).show();
                }

                else if(password_.length() < 8){
                    Toast.makeText(getApplicationContext(), "Error: Set password with more than 8 characters", Toast.LENGTH_LONG).show();
                }

                else {
                    // start a Intent

                    Intent homepageIntent = new Intent(getApplicationContext(), Homepage.class);

                    homepageIntent.putExtra("com.example.loginapp.Saikat", username);
                    startActivity(homepageIntent);
                }

            }
        });

    }
}