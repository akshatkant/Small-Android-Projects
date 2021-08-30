package com.example.practise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText n1,n2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        textView = findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Submitted", Toast.LENGTH_SHORT).show();
                String s = n1.getText().toString();
                int a = Integer.parseInt(s);
                String t = n2.getText().toString();
                int b = Integer.parseInt(t);
                int c =  a +  b;
                textView.setText("The sum is " + c);

            }


        });


    }
}