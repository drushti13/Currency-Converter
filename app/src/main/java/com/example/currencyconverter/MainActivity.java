package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void onClick1(View view)
    {
        Log.i("Info", "Button Pressed");
        EditText editText = findViewById(R.id.editText);
        String amountInDollar = editText.getText().toString();
        double d = Double.parseDouble(amountInDollar);
        Double amountInRs = d * 83.3;
        String finalAmount = String.valueOf(amountInRs);

        Log.i("Amount", finalAmount);
        Toast.makeText(this, editText.getText().toString() + " $ in Rupees is " + finalAmount, Toast.LENGTH_SHORT).show();
    }
    public void onClick2(View view)
    {
        EditText editText2= findViewById(R.id.editText2);
        String amountInRs2= editText2.getText().toString();
        double d2= Double.parseDouble(amountInRs2);
        Double amountInDollar2=d2 * 0.012;
        String finalAmount2 = String.valueOf(amountInDollar2);

        Log.i("Amount",finalAmount2);
        Toast.makeText(this, editText2.getText().toString()+" Rs in Dollars is $"+finalAmount2, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}