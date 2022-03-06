package com.example.myfirstaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class Activity4 extends AppCompatActivity {
    GridView gridview;

    String[] name={ "hello","how","are","you","apple","banana","cat","dog","apple","banana","cat","dog","apple","banana","cat","dog","apple","banana","cat","dog"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        gridview=findViewById(R.id.gridvw);
        ArrayAdapter<String> adp= new ArrayAdapter<String>(Activity4.this, android.R.layout.select_dialog_multichoice, name);
        gridview.setAdapter(adp);
    }
}