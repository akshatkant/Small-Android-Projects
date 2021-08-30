package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.IDNA;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;
    String message;

    public void guess(View view) {

        EditText editText = (EditText) findViewById(R.id.editText);

        Log.i("Info","Button Pressed");

        Log.i("Entered Number",editText.getText().toString());
        Log.i("Random Number",Integer.toString(randomNumber));


        int guessValue = Integer.parseInt(editText.getText().toString());



        if(guessValue>randomNumber)
        {
            message= "Lower";
        }

        else if (guessValue<randomNumber)
        {
            message="Higher";
        }

        else

        {
            message = "You got it!";
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();


    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber=rand.nextInt(20)+1;



    }
}