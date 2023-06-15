package com.example.areas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityHexagono extends AppCompatActivity {

    Button btnCalcHex;
    EditText edLadoHex;
    TextView tvResultHex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexagono);
        btnCalcHex = findViewById(R.id.btnCalcHex);
        edLadoHex = findViewById(R.id.edLadoHex);
        tvResultHex = findViewById(R.id.tvResultHex);
        btnCalcHex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cal cal = new Cal();
                String valStr = edLadoHex.getText().toString();
                float valF = Float.parseFloat(valStr);
                valStr = String.valueOf(cal.CalHexagono(valF));
                tvResultHex.setText(valStr);
            }
        });
    }
}