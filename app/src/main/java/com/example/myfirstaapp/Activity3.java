package com.example.myfirstaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Activity3 extends AppCompatActivity {
    ListView listview;

    String[] name={"apple","banana","cat","dog","apple","banana","cat","dog","apple","banana","cat","dog","apple","banana","cat","dog"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        listview=findViewById(R.id.listvw);
        ArrayAdapter<String> adp= new ArrayAdapter<String>(Activity3.this, android.R.layout.select_dialog_multichoice, name);
        listview.setAdapter(adp);



    }
}