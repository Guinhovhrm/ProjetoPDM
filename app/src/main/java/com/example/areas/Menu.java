package com.example.areas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Menu extends AppCompatActivity {

    Button btnSalvar, btnPont, btnPlay, btnCalc;
    EditText edNomeUser;
    Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnPont = findViewById(R.id.btnPont);
        btnCalc = findViewById(R.id.btnCalc);
        edNomeUser = findViewById(R.id.edNomeUser);
        Usuario user = new Usuario();

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setNomeUsuario(edNomeUser.toString());

            }
        });
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(Menu.this, Calculadora.class);
                startActivity(in);

            }
        });



    }
}