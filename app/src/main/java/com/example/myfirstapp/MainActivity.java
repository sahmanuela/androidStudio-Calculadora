package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int contador = 0;

    private TextView textContador;

    private Button buttonMais;

    private Button buttonMenos;

    private Button buttonSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        textContador = findViewById(R.id.textContador);
        buttonMenos = findViewById(R.id.buttonMenos);
        buttonMais = findViewById(R.id.buttonMais);
        buttonSobre = findViewById(R.id.buttonSobre);

        textContador.setText(String.valueOf(this.getContador())); //retorno da função > converte para string
    }

    public Integer getContador(){
        return this.contador;
    }


    public void adicionar(View view){
        this.contador++;
        textContador.setText(String.valueOf(this.getContador()));
    }

    public void subtrair(View view){
        this.contador--;
        textContador.setText(String.valueOf(this.getContador()));
    }

    public void abreSobre(View view) {
        Intent i = new Intent(MainActivity.this, sobreActivity.class);
        i.putExtra("contador", this.getContador());
        startActivity(i);
    }
}