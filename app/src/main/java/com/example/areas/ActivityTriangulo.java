package com.example.areas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityTriangulo extends AppCompatActivity {

    Button btnCalcTriangulo;
    EditText edBaseTriangulo, edAlturaTriangulo;
    TextView tvResultTriangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
        btnCalcTriangulo = findViewById(R.id.btnCalcTriangulo);
        edBaseTriangulo = findViewById(R.id.edBaseTriangulo);
        edAlturaTriangulo = findViewById(R.id.edAlturaTriangulo);
        tvResultTriangulo = findViewById(R.id.tvResultTriangulo);

        btnCalcTriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cal cal = new Cal();
                String baseStr = edBaseTriangulo.getText().toString();
                String alturaStr = edAlturaTriangulo.getText().toString();
                float baseF = Float.parseFloat(baseStr);
                float alturaF = Float.parseFloat(alturaStr);
                String valStr = String.valueOf(cal.CalTriangulo(alturaF, baseF));
                tvResultTriangulo.setText(valStr);
            }
        });


    }
}