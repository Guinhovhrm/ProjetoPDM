package com.example.areas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activityTriEqui extends AppCompatActivity {

    Button btnCalcTriEqui;
    EditText edLadoTriEqui;
    TextView tvResultTriEqui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tri_equi);
    }
}