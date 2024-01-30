package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Kidsproduct extends AppCompatActivity {

    ImageButton imageButton;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidsproduct);

        ImageButton imageButton = findViewById(R.id.kp1btn);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kidsproduct.this, KidsPDetail1.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton2 = findViewById(R.id.kp2btn);

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kidsproduct.this, KidsPDetail2.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton3 = findViewById(R.id.kp3btn);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kidsproduct.this, KidsPDetail3.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton4 = findViewById(R.id.kp4btn);

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kidsproduct.this, KidsPDetail4.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton5 = findViewById(R.id.kp5btn);

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kidsproduct.this, KidsPDetail5.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton6 = findViewById(R.id.kp6btn);

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kidsproduct.this, KidsPDetail6.class);
                startActivity(intent);
            }
        });
    }
}