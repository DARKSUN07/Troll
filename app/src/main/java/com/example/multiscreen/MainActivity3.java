package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView3 = findViewById(R.id.textView3);
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity2.NAME2);
        textView3.setText(name+"\nchal aab\nGand Mara\n⤜(⚆ᗜ⚆)⤏");


    }
}