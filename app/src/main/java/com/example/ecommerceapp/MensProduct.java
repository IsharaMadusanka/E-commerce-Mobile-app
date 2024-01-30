package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MensProduct extends AppCompatActivity {

    ImageButton imageButton;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mens_product);

        ImageButton imageButton = findViewById(R.id.mp1btn);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MensProduct.this, MenPDeatil1.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton2 = findViewById(R.id.mp3btn);

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MensProduct.this, MenPDetail2.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton3 = findViewById(R.id.mp4btn);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MensProduct.this, MenPDetail3.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton4 = findViewById(R.id.mp5btn);

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MensProduct.this, MenPDetail4.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton5 = findViewById(R.id.mp6btn);

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MensProduct.this, MenPDetail5.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton6 = findViewById(R.id.mp7btn);

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MensProduct.this, MenPDetail6.class);
                startActivity(intent);
            }
        });
    }
}