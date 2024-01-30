package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;
    ImageButton imageButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ImageButton imageButton = findViewById(R.id.imgbtn);
        ImageButton imageButton2 = findViewById(R.id.cartbt);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MensProduct.class);
                startActivity(intent);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });



    }
    public void men(View view) {
        startActivity(new Intent(MainActivity.this, MensProduct.class));
    }
    public void Women(View view) {
        startActivity(new Intent(MainActivity.this, WomensProduct.class));
    }
    public void Kids(View view) {
        startActivity(new Intent(MainActivity.this, Kidsproduct.class));
    }

}