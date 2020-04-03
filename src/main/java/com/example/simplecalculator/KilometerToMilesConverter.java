package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KilometerToMilesConverter extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button covertBtn;

    float kilometer;
    float miles;
    float KILOMETER = (float) 0.621371;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilometer_to_miles_converter);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.convertedValue);
        covertBtn = findViewById(R.id.converterBtn);


    }
}