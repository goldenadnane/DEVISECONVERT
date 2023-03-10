package com.example.myapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.lang.Number;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void DhsenDollars(View v) {

        double taux=0.11;
        num1=(EditText) findViewById(R.id.dhs1);
        num2=findViewById(R.id.dollars1);
        double dh=Double.parseDouble(num1.getText().toString());
        double s=dh*taux;
        num2.setText(String.valueOf(s));
        num2.toString();


    }

    public void DollarsenDHS(View v1){
        double taux=9.05;
        num2=(EditText) findViewById(R.id.dollars1);
        num1=findViewById(R.id.dhs1);
        double dollar=Double.parseDouble(num2.getText().toString());
        double s=dollar*taux;
        num1.setText(String.valueOf(s));
        num1.toString();


    }

}