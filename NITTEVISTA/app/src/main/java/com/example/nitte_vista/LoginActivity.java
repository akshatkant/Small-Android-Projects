package com.example.nitte_vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    TextInputLayout inputEmail,inputPassword;
    Button btnLogin;
    TextView forgotPassword,createNewAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);

        inputEmail=findViewById(R.id.inputEmail);
        inputPassword=findViewById(R.id.inputPassword);
        btnLogin=findViewById(R.id.btnRegister);
        forgotPassword = findViewById(R.id.forgotPassword);
        createNewAccount = findViewById(R.id.createNewAccount);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Login Successful!!", Toast.LENGTH_SHORT).show();
            }
        });

        createNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                 startActivity(intent);
                 finish();


            }
        });








    }
}