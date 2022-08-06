package com.example.socketsearch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatButton button = findViewById(R.id.btn);
        button.setOnClickListener(view ->{
            Intent intent = new Intent(getApplicationContext(),SearchScreen.class);
            startActivity(intent);
        });
    }
}