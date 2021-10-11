package com.example.donoroncallloginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this, login.class);
            startActivity(intent);

        });
        button =(Button) findViewById(R.id.button2);
        button.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,register.class);
            startActivity(intent);
        });
    }
}