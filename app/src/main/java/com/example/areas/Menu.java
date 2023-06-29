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
        int pont = 0; //por enquanto é 0, já que não tem o jogo

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setNomeUsuario(edNomeUser.getText().toString());
                user.setPontuacaoUsuario(pont);

            }
        });
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(Menu.this, Calculadora.class);
                startActivity(in);

            }
        });
        btnPont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                in = new Intent(Menu.this, ActivityPontuacao.class);
                in.putExtra("Player", user.getNomeUsuario());
                in.putExtra("Pontuacao", String.valueOf(user.getPontuacaoUsuario()));
                startActivity(in);
            }
        });



    }
}