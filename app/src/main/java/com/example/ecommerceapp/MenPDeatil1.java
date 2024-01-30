package com.example.ecommerceapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MenPDeatil1 extends AppCompatActivity {

    Button button;
    private TextView quantityTextView;
    private int quantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men_pdeatil1);


        quantityTextView = findViewById(R.id.quantityTextView);
        Button increaseButton = findViewById(R.id.increaseButton);
        Button decreaseButton = findViewById(R.id.decreaseButton);
        Button cartButton = findViewById(R.id.prb1);


        displayQuantity();


        increaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseQuantity();
            }
        });


        decreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseQuantity();
            }
        });

        // Cart button click listener
        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addToCart();
            }
        });
    }

    // Method to increase the quantity by 1
    private void increaseQuantity() {
        quantity++;
        displayQuantity();
    }

    // Method to decrease the quantity by 1, ensuring it doesn't go below 1
    private void decreaseQuantity() {
        if (quantity > 1) {
            quantity--;
            displayQuantity();
        }
    }


    private void displayQuantity() {
        quantityTextView.setText(String.valueOf(quantity));
    }


    private void addToCart() {
        Intent intent = new Intent(MenPDeatil1.this, CartActivity.class);


        String productName = "Nike Air Force";
        int productQuantity = quantity;
        double productPrice = 25.0;
        int productImageResId = R.drawable.product4;



        intent.putExtra("productName", productName);
        intent.putExtra("productQuantity", productQuantity);
        intent.putExtra("productPrice", productPrice);
        intent.putExtra("productImageResId", productImageResId);

        startActivity(intent);
    }
}
