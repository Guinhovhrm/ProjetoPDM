package com.example.areas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityPontuacao extends AppCompatActivity {
    Button btnModificarPont, btnModificarPlayer, btnExcluir, btnVoltar;
    TextView tvJogador;
    TextView tvPontuacaoJogador;
    EditText edNovaPont, edNovoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pontuacao);
        Intent in;
        Bundle extras = getIntent().getExtras();
        String player = extras.getString("Player");
        String Pontuacao = extras.getString("Pontuacao");
        btnModificarPont = findViewById(R.id.btnModificarPont);
        btnModificarPlayer = findViewById(R.id.btnModificarPlayer);
        btnExcluir = findViewById(R.id.btnExcluir);
        btnVoltar = findViewById(R.id.btnVoltar);
        tvJogador = findViewById(R.id.tvJogador);
        tvPontuacaoJogador = findViewById(R.id.tvPontuacaoJogador);
        edNovaPont = findViewById(R.id.edNovaPont);
        edNovoPlayer = findViewById(R.id.edNovoPlayer);


        //------------??????????POR QUE NÃO FUNCIONA??????????------------

        tvJogador.setText(player);
        tvPontuacaoJogador.setText(Pontuacao);
        //------------??????????POR QUE NÃO FUNCIONA??????????------------

        btnModificarPont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pontuacaoNova = edNovaPont.getText().toString();
                tvPontuacaoJogador.setText(pontuacaoNova);

            }
        });
        btnModificarPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String playerNovo = edNovoPlayer.getText().toString();
                tvJogador.setText(playerNovo);

            }
        });
        btnExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvJogador.setText("");
                tvPontuacaoJogador.setText("");
            }
        });
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(ActivityPontuacao.this, Menu.class);
                startActivity(in);
            }
        });

    }
}