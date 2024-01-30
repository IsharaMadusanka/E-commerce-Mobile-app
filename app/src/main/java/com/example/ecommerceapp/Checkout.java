package com.example.ecommerceapp;

public class Checkout {
    private String name;
    private String address;
    private String phone;
    private String date;

    // Default constructor required for calls to DataSnapshot.getValue(Checkout.class)
    public Checkout() {
    }

    public Checkout(String name, String address, String phone, String date) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.date = date;
    }

    // Add getters and setters for the fields
    // ...
}
