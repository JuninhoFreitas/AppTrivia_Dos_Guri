package com.example.desafioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class TelaDeTema extends AppCompatActivity {

    CheckBox ckbTema1, ckbTema2, ckbTema3, ckbTema4, ckbTema5;
    Button btnTema;
    public static boolean temasEscolhidos[] = new boolean[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_de_tema);
        getSupportActionBar().hide();

        ckbTema1 = findViewById(R.id.ckbTema1);
        ckbTema2 = findViewById(R.id.ckbTema2);
        ckbTema3 = findViewById(R.id.ckbTema3);
        ckbTema4 = findViewById(R.id.ckbTema4);
        ckbTema5 = findViewById(R.id.ckbTema5);
        btnTema = findViewById(R.id.btnIniciar);

        btnTema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                informarTemas();
            }
        });
    }

    private void informarTemas() {
        boolean nenhumFoiSelecionados = true;
        if (ckbTema1.isChecked()) {
            temasEscolhidos[0] = true;
            nenhumFoiSelecionados = false;
        } else {
            temasEscolhidos[0] = false;
        }
        if (ckbTema2.isChecked()) {
            temasEscolhidos[1] = true;
            nenhumFoiSelecionados = false;
        } else {
            temasEscolhidos[1] = false;
        }
        if (ckbTema3.isChecked()) {
            temasEscolhidos[2] = true;
            nenhumFoiSelecionados = false;
        } else {
            temasEscolhidos[2] = false;
        }
        if (ckbTema4.isChecked()) {
            temasEscolhidos[3] = true;
            nenhumFoiSelecionados = false;
        } else {
            temasEscolhidos[3] = false;
        }
        if (ckbTema5.isChecked()) {
            temasEscolhidos[4] = true;
            nenhumFoiSelecionados = false;
        } else {
            temasEscolhidos[4] = false;
        }
        if (nenhumFoiSelecionados) {
            Toast.makeText(this, "É necessário ao menos um tema.", Toast.LENGTH_SHORT).show();
            return;
        }
        startActivity(new Intent(this, TelaDePerguntas.class));
    }

    @Override
    public void onBackPressed() {
    }
}