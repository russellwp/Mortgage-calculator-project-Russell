package com.example.william.mortgage_calculator_project_russell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Button pay_button;
    private Button mor_button;
    String text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pay_button = (Button) findViewById(R.id.paySum);
        pay_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText hVal = (EditText) findViewById(R.id.homeValue);
                String homeString = hVal.getText().toString();
                int home_value = Integer.parseInt(homeString);

                EditText lVal = (EditText) findViewById(R.id.loanValue);
                String loanValString = lVal.getText().toString();
                int loan_value = Integer.parseInt(loanValString);

                EditText iVal = (EditText) findViewById(R.id.interestRate);
                String interestString = iVal.getText().toString();
                int interest_rate = Integer.parseInt(interestString);

                EditText lTerm = (EditText) findViewById(R.id.loanTerm);
                String lTermString = lTerm.getText().toString();
                int loan_term = Integer.parseInt(lTermString);

                EditText pTax = (EditText) findViewById(R.id.propertyTax);
                String propertyString = pTax.getText().toString();
                int property_tax = Integer.parseInt(propertyString);

                EditText aInsurance = (EditText) findViewById(R.id.annualInsurance);
                String insuranceString = aInsurance.getText().toString();
                int annual_insurance = Integer.parseInt(insuranceString);

                Intent i = new Intent(v.getContext(), paymentSummary.class);

                Bundle bundle = i.getExtras();
                bundle.putString("propertySring", "text");
                i.putExtra("propertyString", "text");
                i.putExtras(bundle);
                startActivity(i);

            }
        });

        mor_button = (Button) findViewById(R.id.morSum);
        mor_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText hVal = (EditText) findViewById(R.id.homeValue);
                String homeString = hVal.getText().toString();
                int home_value = Integer.parseInt(homeString);

                EditText lVal = (EditText) findViewById(R.id.loanValue);
                String loanValString = lVal.getText().toString();
                int loan_value = Integer.parseInt(loanValString);

                EditText iVal = (EditText) findViewById(R.id.interestRate);
                String interestString = iVal.getText().toString();
                int interest_rate = Integer.parseInt(interestString);

                EditText lTerm = (EditText) findViewById(R.id.loanTerm);
                String lTermString = lTerm.getText().toString();
                int loan_term = Integer.parseInt(lTermString);

                EditText pTax = (EditText) findViewById(R.id.propertyTax);
                String propertyString = pTax.getText().toString();
                int property_tax = Integer.parseInt(propertyString);

                EditText aInsurance = (EditText) findViewById(R.id.annualInsurance);
                String insuranceString = aInsurance.getText().toString();
                int annual_insurance = Integer.parseInt(insuranceString);

                Intent i = new Intent(MainActivity.this, mortgageSummary.class);
                Bundle b=new Bundle();
                b.putInt("homValue",home_value);
                startActivity(i);





                /*Bundle bundle = new Bundle();
                bundle.putInt(homeString, home_value);
                bundle.putInt(loanValString, loan_value);
                bundle.putInt(interestString, interest_rate);
                bundle.putInt(lTermString, loan_term);
                bundle.putInt(propertyString, property_tax);
                bundle.putInt(insuranceString, property_tax);

                bundle.putString(new String (text), propertyString);

                i.putExtra("name",property_tax);
                startActivity(i);*/
            }
        });

    }
}
