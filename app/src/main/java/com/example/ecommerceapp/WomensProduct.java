package com.example.ecommerceapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class WomensProduct extends AppCompatActivity {


    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_womens_product);

        imageButton1 = findViewById(R.id.wp1btn);
        imageButton2 = findViewById(R.id.wp2btn);
        imageButton3 = findViewById(R.id.wp3btn);
        imageButton4 = findViewById(R.id.wp4btn);
        imageButton5 = findViewById(R.id.wp5btn);
        imageButton6 = findViewById(R.id.wp6btn);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomensProduct.this, WomenPDetail1.class);
                startActivity(intent);
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomensProduct.this, WomenPDetail2.class);
                startActivity(intent);
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomensProduct.this, WomenPDetail3.class);
                startActivity(intent);
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomensProduct.this, WomenPDetail4.class);
                startActivity(intent);
            }
        });

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomensProduct.this, WomenPDetail5.class);
                startActivity(intent);
            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WomensProduct.this, WomenPDetail6.class);
                startActivity(intent);
            }
        });

        // Retrieving product data and displaying it (from previous example)
        ImageView imageViewProduct = findViewById(R.id.receivedProductImage);
        TextView textViewProductName = findViewById(R.id.receivedProductName);
        TextView textViewProductPrice = findViewById(R.id.receivedProductPrice);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String productName = extras.getString("productName");
            String productPrice = extras.getString("productPrice");
            String productImageUri = extras.getString("productImage");

            textViewProductName.setText(productName);
            textViewProductPrice.setText(productPrice);

            if (productImageUri != null) {
                Uri imageUri = Uri.parse(productImageUri);
                Glide.with(this).load(imageUri).into(imageViewProduct);
            }
        }
    }
}
