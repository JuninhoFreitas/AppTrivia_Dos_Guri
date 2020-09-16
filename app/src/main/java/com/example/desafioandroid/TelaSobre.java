package com.example.desafioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaSobre extends AppCompatActivity {

    Button btnMenuPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_sobre);
        getSupportActionBar().hide();
        btnMenuPrincipal = findViewById(R.id.btnMenuPrincipal);

        btnMenuPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuPrincipal();
            }
        });
    }

    private void menuPrincipal(){
        Intent janelaPrincipal = new Intent(this, TelaInicial.class);
        startActivity(janelaPrincipal);
    }
}