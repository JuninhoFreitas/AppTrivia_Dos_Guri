package com.example.desafioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class TelaInicial extends AppCompatActivity {

    Button btnIniciar, btnSobre;
    EditText edtNome;
    public static String nome;
    public static String categoria;
    LinearLayout telaPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inicial);
        getSupportActionBar().hide();

        btnIniciar = findViewById(R.id.btnIniciar);
        btnSobre = findViewById(R.id.btnSobre);
        edtNome = findViewById(R.id.edtNome);
        telaPrincipal = findViewById(R.id.principalLayout);


        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nome = edtNome.getText().toString();
                verificarNome();
            }
        });
        btnSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirJanelaSobre();
            }
        });
    }

    private void proximaJanela() {
        Intent proximaJanela = new Intent(this, TelaDeTema.class);
        startActivity(proximaJanela);
    }

    private void abrirJanelaSobre(){
        Intent janelaSobre = new Intent(this, TelaSobre.class);
        startActivity(janelaSobre);
    }

    private void verificarNome() {
        if (nome.equals("")) {
            Toast.makeText(this, "Um nome é necessário", Toast.LENGTH_SHORT).show();
            return;
        } else {
            proximaJanela();
        }
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
        System.exit(0);
    }
}