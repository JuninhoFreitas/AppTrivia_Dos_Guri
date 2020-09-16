package com.example.desafioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaResultado extends AppCompatActivity {

    Button btnJogarNovamente, btnMenuPrincipal, btnSair;
    TextView txtResultado,txtAcertos;
    TelaDePerguntas functionP = new TelaDePerguntas();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_resultado);
        getSupportActionBar().hide();

        txtAcertos = findViewById(R.id.txtAcertos);
        txtResultado = findViewById(R.id.txtResultado);
        btnJogarNovamente = findViewById(R.id.btnJogarNovamente);
        btnMenuPrincipal = findViewById(R.id.btnMenuPrincipal);
        btnSair = findViewById(R.id.btnSair);
        StringBuilder builder = new StringBuilder();
        //Inserindo os textos dentro dos textview
        builder.append("Acertos:").append(functionP.acertos).append("/" + TelaDePerguntas.maximoDeQuestoes + ".");
        txtAcertos.setText(builder.toString());

        informarResultado();

        //Listener dos botões
        btnMenuPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuPrincipal();
            }
        });
        btnJogarNovamente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuJogarNovamente();
            }
        });
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sairApp();
            }
        });
    }

    private void menuJogarNovamente(){
        Intent janelaPerguntas = new Intent(this, TelaDePerguntas.class);
        startActivity(janelaPerguntas);
    }

    private void menuPrincipal(){
        Intent janelaPrincipal = new Intent(this, TelaInicial.class);
        startActivity(janelaPrincipal);
    }

    private void sairApp(){
        finishAffinity();
        System.exit(0);
    }

    public void informarResultado(){
        String textoResultado = "";
        if (TelaDePerguntas.acertos == TelaDePerguntas.maximoDeQuestoes){
            textoResultado = "Parabéns " + TelaDePerguntas.nome + ".\nVocê acertou todas\nas respostas! ";
        }else if (TelaDePerguntas.acertos == (TelaDePerguntas.maximoDeQuestoes - 1)){
            textoResultado = TelaDePerguntas.nome + ", você acertou quase todas as respostas!\nFaltou somente uma...\nGostaria de tentar novamente?";
        } else if (TelaDePerguntas.acertos > 1) {
            textoResultado =  TelaDePerguntas.nome + ", você acertou " + TelaDePerguntas.acertos + " respostas.\nGostaria de tentar novamente?";
        } else if (TelaDePerguntas.acertos == 1) {
            textoResultado =  TelaDePerguntas.nome + ", você acertou apenas uma resposta.\nGostaria de tentar novamente?";
        }   else {
            textoResultado =  TelaDePerguntas.nome + ", você acertou nenhuma resposta.\nGostaria de tentar novamente?";
        }
        txtResultado.setText(textoResultado);
    }

    @Override
    public void onBackPressed() {
    }
}