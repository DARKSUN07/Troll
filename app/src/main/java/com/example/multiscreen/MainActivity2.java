package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView textView2;
    public static final String NAME2 = "com.example.multiscreen.MainActivity.NAME2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2 = findViewById(R.id.textView2);
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.NAME);
        textView2.setText(name+" click below to see the magic");
    }
    public void openActivity2(View view){
//        Toast.makeText(this, "This button is working", Toast.LENGTH_SHORT).show();
        Intent intent2 = new Intent(this, MainActivity3.class);
        Intent intent = getIntent();
        String name2 = intent.getStringExtra(MainActivity.NAME);
        intent2.putExtra(NAME2, name2);
        startActivity(intent2);


    }
}