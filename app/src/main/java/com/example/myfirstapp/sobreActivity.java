package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class sobreActivity extends AppCompatActivity {
    private TextView txtContador;
    private Integer contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
        Intent intent = getIntent();
        this.contador = intent.getIntExtra("contador", 0);
        txtContador = findViewById(R.id.textContadorSobre);
        txtContador.setText(String.valueOf(this.contador));
    }
}
