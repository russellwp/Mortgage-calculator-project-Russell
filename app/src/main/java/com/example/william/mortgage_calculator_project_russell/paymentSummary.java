package com.example.william.mortgage_calculator_project_russell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;

public class paymentSummary extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String a = intent.getStringExtra("propertyString");
        int y = Integer.parseInt(a);
        int x = 8;
        int z = y*x;
        String b = Integer.toString(z);

        TextView tv = (TextView) findViewById(R.id.finalRate);
        tv.setText(b);
    }
}

