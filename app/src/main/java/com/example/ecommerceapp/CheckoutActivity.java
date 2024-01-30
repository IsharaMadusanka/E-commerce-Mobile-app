package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CheckoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        Button confirmButton = findViewById(R.id.buttonConfirmOrder);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextName = findViewById(R.id.editTextName);
                EditText editAddress = findViewById(R.id.editAddress);
                EditText editPhone = findViewById(R.id.editPhone);
                EditText editDate = findViewById(R.id.editDate);

                String name = editTextName.getText().toString();
                String address = editAddress.getText().toString();
                String phone = editPhone.getText().toString();
                String date = editDate.getText().toString();

                if (name.isEmpty() || address.isEmpty() || phone.isEmpty() || date.isEmpty()) {
                    showMessage("Please fill in all fields");
                } else {
                    showMessage("Order Successful");
                    navigateToMainActivity();
                }
            }
        });
    }

    private void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void navigateToMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
