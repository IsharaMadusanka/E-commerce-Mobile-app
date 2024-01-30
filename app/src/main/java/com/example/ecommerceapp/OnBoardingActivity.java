package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class OnBoardingActivity extends AppCompatActivity {

    ViewPager viewPager;
    SliderAdapter sliderAdapter;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_on_boarding);
        getSupportActionBar().hide();

        viewPager = findViewById(R.id.slider);
        sliderAdapter = new SliderAdapter(this);
        viewPager.setAdapter(sliderAdapter);


        button = findViewById(R.id.btnMain);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(OnBoardingActivity.this, MainActivity.class);
            startActivity(intent);

        });
    }
}
