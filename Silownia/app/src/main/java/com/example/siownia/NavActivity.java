package com.example.siownia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NavActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);
    }

    public void wyloguj(View view) {
        {
            Intent switchActivityIntent = new Intent(this, MainActivity.class);
            startActivity(switchActivityIntent);
        }
    }

    public void Bmi(View view) {
        Intent switchActivityIntent = new Intent(this, BMIActivity.class);
        startActivity(switchActivityIntent);

    }

    public void trening(View view) {
        Intent switchActivityIntent = new Intent(this,  TreningActivity.class);
        startActivity(switchActivityIntent);
    }
}