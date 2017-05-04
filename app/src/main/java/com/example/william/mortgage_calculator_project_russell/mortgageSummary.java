package com.example.william.mortgage_calculator_project_russell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;

public class mortgageSummary extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        intent.getIntExtra("name",0);
        /*Bundle extras = intent.getExtras();
        extras.putString("text", "propertyString");
        intent.putExtras(extras);

        String a = intent.getIntExtra("name");
        int y = Integer.parseInt(a);
        int x = 7;
        int z = y*x;
        String b = Integer.toString(z);

        TextView tv = (TextView) findViewById(R.id.finalRate);
        tv.setText(b);*/

        Bundle b = intent.getExtras();

        int a = b.getInt("homValue");
        String x = Integer.toString(a);
        /*String name = b.getString("name");
        int x = Integer.parseInt(name);
        int y = 7*x;
        String name2 = Integer.toString(y);*/


        EditText et = (EditText) findViewById(R.id.summary);
        et.setText(x);
    }
}



               /*interest rate, loan term, loan value
                M = loanValue * (interestRate * (1+interestRate)^loanTerm)/((1+interestRate)^loanTerm - 1)
                 */
                /*mortgageRate = loan_value * (((interest_rate * (1 + interest_rate) ^ (loan_term)) / ((1 + interest_rate ^ loan_term) - 1)));
                String textM = Integer.toString(mortgageRate);
                TextView tv = (TextView) findViewById(R.id.finalRate);
                tv.setText(textM);
                tv.setVisibility(View.VISIBLE);*/
                /*mortgageRate = 10;
                TextView tv = (TextView)findViewById(R.id.finalRate);
                tv.setText(Integer.toString(mortgageRate));*/
