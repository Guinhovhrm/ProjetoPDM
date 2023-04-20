package com.example.areas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activityCirculo extends AppCompatActivity {

    Button btnCalcCirc;
    EditText edRaioCirc;
    TextView tvResultCirc;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
        btnCalcCirc = findViewById(R.id.btnCalcCirc);
        edRaioCirc = findViewById(R.id.edRaioCirc);
        tvResultCirc = findViewById(R.id.tvResultCirc);

        btnCalcCirc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cal cal = new Cal();
                String valStr = edRaioCirc.getText().toString();
                float valF = Float.parseFloat(valStr);
                valStr = String.valueOf(cal.CalCirculo(valF));
                tvResultCirc.setText(valStr);

            }
        });

    }
}