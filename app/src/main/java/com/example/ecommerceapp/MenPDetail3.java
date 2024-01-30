package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenPDetail3 extends AppCompatActivity {

    Button button;
    private TextView quantityTextView;
    private int quantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men_pdetail3);

        // Find views
        quantityTextView = findViewById(R.id.quantityTextView);
        Button increaseButton = findViewById(R.id.increaseButton);
        Button decreaseButton = findViewById(R.id.decreaseButton);
        Button cartButton = findViewById(R.id.prb2);

        // Set initial quantity display
        displayQuantity();

        // Increase button click listener
        increaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseQuantity();
            }
        });

        // Decrease button click listener
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

    // Method to display the updated quantity in the TextView
    private void displayQuantity() {
        quantityTextView.setText(String.valueOf(quantity));
    }

    // Method to add the product to the cart
    private void addToCart() {
        Intent intent = new Intent(MenPDetail3.this, CartActivity.class);

        // Get product details
        String productName = "Nike Dunk Low"; // You can retrieve this dynamically
        int productQuantity = quantity; // Assuming you've stored the quantity
        double productPrice = 60.0;
        int productImageResId = R.drawable.men13;
        // Assuming you've stored the price

        // Put the product details in the intent
        intent.putExtra("productName", productName);
        intent.putExtra("productQuantity", productQuantity);
        intent.putExtra("productPrice", productPrice);
        intent.putExtra("productImageResId", productImageResId);

        startActivity(intent);
    }
}