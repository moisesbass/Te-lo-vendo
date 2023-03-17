package com.bootcamp.telovendo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button buttonRegresar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        buttonRegresar=(Button)findViewById(R.id.buttonRegresar);
        buttonRegresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent i = new Intent (MainActivity2.this,MainActivity.class);
                startActivity(i);
            }
        });
    }}


