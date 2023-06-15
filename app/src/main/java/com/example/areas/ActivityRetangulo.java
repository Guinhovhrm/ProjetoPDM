package com.example.areas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityRetangulo extends AppCompatActivity {

    Button btnCalcRetangulo;
    EditText edBaseRetangulo, edAlturaRetangulo;
    TextView tvResultRetangulo;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retangulo);
        btnCalcRetangulo = findViewById(R.id.btnCalcRetangulo);
        edBaseRetangulo = findViewById(R.id.edBaseRetangulo);
        edAlturaRetangulo = findViewById(R.id.edAlturaRetangulo);
        tvResultRetangulo = findViewById(R.id.tvResultRetangulo);

        btnCalcRetangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cal cal = new Cal();
                String baseStr = edBaseRetangulo.getText().toString();
                String alturaStr = edAlturaRetangulo.getText().toString();
                float baseF = Float.parseFloat(baseStr);
                float alturaF = Float.parseFloat(alturaStr);
                String valStr = String.valueOf(cal.CalRetangulo(alturaF, baseF));
                tvResultRetangulo.setText(valStr);
            }
        });

    }
}