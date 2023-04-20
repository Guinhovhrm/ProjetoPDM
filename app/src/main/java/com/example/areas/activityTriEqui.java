package com.example.areas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class activityTriEqui extends AppCompatActivity {
    DecimalFormat df = new DecimalFormat("0.00");
    Button btnCalcTriEqui;
    EditText edLadoTriEqui;
    TextView tvResultTriEqui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tri_equi);
        btnCalcTriEqui = findViewById(R.id.btnCalcTriEqui);
        edLadoTriEqui = findViewById(R.id.edLadoTriEqui);
        tvResultTriEqui = findViewById(R.id.tvResultTriEqui);

        btnCalcTriEqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cal cal = new Cal();
                String valStr = edLadoTriEqui.getText().toString();
                float valF = Float.parseFloat(valStr);
                valStr = String.valueOf(cal.CalTrianguloEquil(valF));
                tvResultTriEqui.setText(valStr);
            }
        });

    }
}