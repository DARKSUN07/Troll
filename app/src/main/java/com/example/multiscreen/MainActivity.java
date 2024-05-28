package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    public static final String NAME = "com.example.multiscreen.MainActivity.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void openActivity(View view){
//        Toast.makeText(this, "Magic", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        editText1 = findViewById(R.id.editText1);
        String name = editText1.getText().toString();
        intent.putExtra(NAME, name);
        startActivity(intent);
    }
}