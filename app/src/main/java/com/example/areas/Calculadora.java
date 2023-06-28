package com.example.areas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calculadora extends AppCompatActivity {

    Button btnQuadrado, btnTriangulo, btnTriEqui, btnHex, btnRetangulo, btnTrap, btnCirc;
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        btnQuadrado = findViewById(R.id.btnQuadrado);
        btnTriangulo = findViewById(R.id.btnTriangulo);
        btnTriEqui = findViewById(R.id.btnTriEqui);
        btnHex = findViewById(R.id.btnHex);
        btnRetangulo = findViewById(R.id.btnRetangulo);
        btnTrap = findViewById(R.id.btnTrap);
        btnCirc = findViewById(R.id.btnCirc);

        btnQuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(Calculadora.this, ActivityQuadrado.class);
                startActivity(in);
            }
        });
        btnTriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(Calculadora.this, ActivityTriangulo.class);
                startActivity(in);
            }
        });
        btnTriEqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(Calculadora.this, ActivityTriEqui.class);
                startActivity(in);

            }
        });
        btnHex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(Calculadora.this, ActivityHexagono.class);
                startActivity(in);
            }
        });
        btnRetangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(Calculadora.this, ActivityRetangulo.class);
                startActivity(in);

            }
        });
        btnTrap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(Calculadora.this, ActivityTrapezio.class);
                startActivity(in);
            }
        });
        btnCirc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(Calculadora.this, ActivityCirculo.class);
                startActivity(in);

            }
        });



    }

}
