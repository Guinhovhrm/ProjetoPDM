package com.example.areas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnQuadrado, btnTriangulo, btnTriEqui, btnHex, btnRetangulo, btnTrap, btnCirc;
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
                in = new Intent(MainActivity.this, ActivityQuadrado.class);
                startActivity(in);
            }
        });
        btnTriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(MainActivity.this, ActivityTriangulo.class);
                startActivity(in);
            }
        });
        btnTriEqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(MainActivity.this, ActivityTriEqui.class);
                startActivity(in);

            }
        });
        btnHex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(MainActivity.this, ActivityHexagono.class);
                startActivity(in);
            }
        });
        btnRetangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(MainActivity.this, ActivityRetangulo.class);
                startActivity(in);

            }
        });
        btnTrap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(MainActivity.this, ActivityTrapezio.class);
                startActivity(in);
            }
        });
        btnCirc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(MainActivity.this, ActivityCirculo.class);
                startActivity(in);

            }
        });



    }

}
