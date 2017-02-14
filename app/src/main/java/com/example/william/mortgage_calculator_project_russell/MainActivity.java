package com.example.william.mortgage_calculator_project_russell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Scanner;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button calc_button;
    int mortgageRate;
    Scanner reader = new Scanner(System.in);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        calc_button = (Button)findViewById(R.id.calcButton);
        calc_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                EditText hVal = (EditText)findViewById(R.id.homeValue);
                String homeString = hVal.getText().toString();
                int home_value = Integer.parseInt(homeString);

                EditText lVal = (EditText)findViewById(R.id.loanValue);
                String loanValString = lVal.getText().toString();
                int loan_value = Integer.parseInt(loanValString);

                EditText iVal = (EditText)findViewById(R.id.interestRate);
                String interestString = iVal.getText().toString();
                int interest_rate = Integer.parseInt(interestString);

                EditText lTerm = (EditText)findViewById(R.id.loanTerm);
                String lTermString = lTerm.getText().toString();
                int loan_term = Integer.parseInt(homeString);

                EditText pTax = (EditText)findViewById(R.id.propertyTax);
                String propertyString = pTax.getText().toString();
                int property_tax = Integer.parseInt(homeString);

                EditText aInsurance = (EditText)findViewById(R.id.annualInsurance);
                String insuranceString = aInsurance.getText().toString();
                int annual_insurance = Integer.parseInt(homeString);




                /*interest rate, loan term, loan value
                M = loanValue * (interestRate * (1+interestRate)^loanTerm)/((1+interestRate)^loanTerm - 1)
                 */
                mortgageRate = loan_value * (((interest_rate * (1+interest_rate)^(loan_term))/((1+interest_rate^loan_term) - 1)));
                String textM = Integer.toString(mortgageRate);
                TextView tv = (TextView)findViewById(R.id.finalRate);
                tv.setText(textM);
                tv.setVisibility(View.VISIBLE);
                /*mortgageRate = 10;
                TextView tv = (TextView)findViewById(R.id.finalRate);
                tv.setText(Integer.toString(mortgageRate));*/

            }
        });
    }

}
