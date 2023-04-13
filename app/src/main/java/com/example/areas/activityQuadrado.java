package com.example.areas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activityQuadrado extends AppCompatActivity {

    Button btnCalcQdrd;
    EditText edValorQdrd;
    TextView tvResultQdrd;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadrado);
        btnCalcQdrd = findViewById(R.id.btnCalcQdrd);
        edValorQdrd = findViewById(R.id.edValorQdrd);
        tvResultQdrd = findViewById(R.id.tvResultQdrd);
        btnCalcQdrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cal cal = new Cal();
                String valStr = edValorQdrd.getText().toString();
                float valF = Float.parseFloat(valStr);
                valStr = String.valueOf(cal.CalQuadrado(valF));
                tvResultQdrd.setText(valStr);





            }
        });
    }
}