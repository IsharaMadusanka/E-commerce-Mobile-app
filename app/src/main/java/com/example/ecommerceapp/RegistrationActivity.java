package com.example.ecommerceapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.concurrent.locks.ReentrantLock;

public class RegistrationActivity extends AppCompatActivity {

    EditText name,email,password;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        getSupportActionBar().hide();

        auth=FirebaseAuth.getInstance();

        if (auth.getCurrentUser() !=null){
            startActivity(new Intent(RegistrationActivity.this,MainActivity.class));
            finish();
        }

        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);

    }

    public void signup(View view) {

        String userName=name.getText().toString();
        String userEmail=email.getText().toString();
        String userPassword=password.getText().toString();

        if (TextUtils.isEmpty(userName)){
            Toast.makeText(this, "Enter name", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(userEmail)){
            Toast.makeText(this, "Enter email Address", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(userPassword)){
            Toast.makeText(this, "Enter password", Toast.LENGTH_SHORT).show();
            return;
        }

        if (userPassword.length()<6){
            Toast.makeText(this, "Password Too Short", Toast.LENGTH_SHORT).show();
            return;
        }
        auth.createUserWithEmailAndPassword(userEmail,userPassword)
                        .addOnCompleteListener(RegistrationActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                           if (task.isSuccessful()){
                               Toast.makeText(RegistrationActivity.this, "Successfully Registered", Toast.LENGTH_SHORT).show();
                               startActivity(new Intent(RegistrationActivity.this,MainActivity.class));
                           }
                           else {
                               Toast.makeText(RegistrationActivity.this, "Registration Failed"+task.getException(), Toast.LENGTH_SHORT).show();
                           }
                            }
                        });

        //startActivity(new Intent(RegistrationActivity.this, MainActivity.class));
    }

    public void signin(View view) {
        startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
    }
}