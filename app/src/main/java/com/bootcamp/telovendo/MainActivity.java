package com.bootcamp.telovendo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonIngreso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonIngreso=(Button)findViewById(R.id.buttonIngreso);

        buttonIngreso.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            Intent i = new Intent (MainActivity.this,MainActivity2.class);
        startActivity(i);
            }
        });
}}

