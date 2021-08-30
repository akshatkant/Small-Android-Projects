package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.IDNA;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void calCurrency(View view)
    {
        EditText editText = (EditText)findViewById(R.id.editText);
        Log.i("Info", "Button Pressed");
        String amountInPounds = editText.getText().toString();
        Double amountInDollar = Double.parseDouble(amountInPounds)*1.3;
        String amountInDollarString = String.format("%.2f",amountInDollar);
        Toast.makeText(this, editText.getText().toString() + " is " + amountInDollarString + "$", Toast.LENGTH_SHORT).show();

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }
}