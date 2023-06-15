package com.example.areas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityTrapezio extends AppCompatActivity {

    Button btnCalcTrapezio;
    EditText edBaseMenorT, edBaseMaiorT, edAlturaT;
    TextView tvResultTrapezio;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezio);
        btnCalcTrapezio = findViewById(R.id.btnCalcTrapezio);
        edBaseMaiorT = findViewById(R.id.edBaseMaiorT);
        edBaseMenorT = findViewById(R.id.edBaseMenorT);
        edAlturaT = findViewById(R.id.edAlturaT);
        tvResultTrapezio = findViewById(R.id.tvResultTrapezio);

        btnCalcTrapezio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cal cal = new Cal();
                String baseMeStr = edBaseMenorT.getText().toString();
                String baseMaStr = edBaseMaiorT.getText().toString();
                String alturaStr = edAlturaT.getText().toString();
                float baseMeF = Float.parseFloat(baseMeStr);
                float baseMaF = Float.parseFloat(baseMaStr);
                float alturaF = Float.parseFloat(alturaStr);
                String valStr = String.valueOf(cal.Caltrapezio(alturaF, baseMeF, baseMaF));
                tvResultTrapezio.setText(valStr);
            }
        });

    }
}