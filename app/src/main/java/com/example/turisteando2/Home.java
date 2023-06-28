package com.example.turisteando2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    Button buttonhoteles;
    Button buttonrestaurantes;
    Button buttonturismo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        buttonhoteles=findViewById(R.id.botonhoteles);
        buttonrestaurantes=findViewById(R.id.botonrestaurantes);
        buttonturismo=findViewById(R.id.botonsitios);


        buttonhoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "hice click", Toast.LENGTH_SHORT).show();
            }
        });

    }
}