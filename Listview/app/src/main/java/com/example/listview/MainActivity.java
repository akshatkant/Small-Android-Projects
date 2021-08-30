package com.example.listview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] arr ={"option 1","option 2","option 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
       // ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arr);
        //listView.setAdapter(ad);
        AkshatAdapter ad = new AkshatAdapter(this,R.layout.my_akshat_layout,arr);
        listView.setAdapter(ad);
    }
}