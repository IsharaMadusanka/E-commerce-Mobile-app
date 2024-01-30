package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        Intent intent = getIntent();
        String productName = intent.getStringExtra("productName");
        int productQuantity = intent.getIntExtra("productQuantity", 0);
        double productPrice = intent.getDoubleExtra("productPrice", 0.0);
        int productImageResId = intent.getIntExtra("productImageResId", 0);

        // Update the UI with the retrieved data
        TextView productNameTextView = findViewById(R.id.cartProductNameTextView);
        TextView quantityTextView = findViewById(R.id.cartQuantityTextView);
        TextView priceTextView = findViewById(R.id.cartPriceTextView);
        ImageView productImageView = findViewById(R.id.cartProductImageView);

        productNameTextView.setText("Product Name: " + productName);
        quantityTextView.setText("Quantity: " + String.valueOf(productQuantity));
        productImageView.setImageResource(productImageResId);

        // Calculate the total price based on the quantity
        double totalPrice = productPrice * productQuantity;
        priceTextView.setText("Total Price: $" + String.valueOf(totalPrice));


    }

    public void billing(View view) {
        startActivity(new Intent(CartActivity.this,CheckoutActivity.class));



    }
}