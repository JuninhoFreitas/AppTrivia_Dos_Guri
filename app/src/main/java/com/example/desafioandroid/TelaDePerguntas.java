package com.example.desafioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class TelaDePerguntas extends AppCompatActivity {

    Button btnR1, btnR2, btnR3, btnR4, btnAjudaPeq, btnAjudaMed;
    TextView txtPergunta, txtNomeJogador, txtAcertos, txtMoedas;
    String respostaCerta = "";
    String alternativa1, alternativa2, alternativa3, alternativa4; // São enviados como respostas
    public static String nome;
    int contQuestao = 0;                           // Indica a quantidade de questões disponiveis
    public static int maximoDeQuestoes = 10;       // AVISO MANTER ENTRE (1 - 9)
    int respondidas[] = new int[maximoDeQuestoes]; // Indica quais perguntas já foram respondidas
    int jaForam = 0;                               // Indica o número de perguntas já respondidas
    public static int acertos = 0;                 // Conta os pontos
    public static int moedas = 0;                  // Conta as moedas que serão usadas para comprar ajudas
    int moedasGanhasPorAcerto = 10;                // Determina recompernsa ao acertar
    int ordemRandomica[] = new int[4];             // Usado para as alternativas não ficarem sempre na mesma posição
    int questao = 0;                               // Indica a atual questão
    int precoAjudaPeq = 15;                        // Preco de ajuda pequena
    int precoAjudaMed = 25;                        // Consumivel de ajuda Média
    int opcoesRetiradas[] = new int[3];            // Indica quais já foram retiradas
    int retiradas = 0;                             // Indica quantas já foram retiradas

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_de_pergunta);
        getSupportActionBar().hide();

        btnR1 = findViewById(R.id.btnR1);
        btnR2 = findViewById(R.id.btnR2);
        btnR3 = findViewById(R.id.btnR3);
        btnR4 = findViewById(R.id.btnR4);
        btnAjudaPeq = findViewById(R.id.btnAjudaPeq);
        btnAjudaMed = findViewById(R.id.btnAjudaMed);
        txtPergunta = findViewById(R.id.txtPergunta);
        txtNomeJogador = findViewById(R.id.txtNomeJogador);
        txtAcertos = findViewById(R.id.txtAcertos);
        txtMoedas = findViewById(R.id.txtMoedas);

        acertos = 0;
        moedas = 0;
        respondidas = new int[maximoDeQuestoes];

        nome = ""+ TelaInicial.nome;
        txtNomeJogador.setText(" " + nome + ".");
        txtAcertos.setText(" " + acertos + ".");
        txtMoedas.setText(" " + moedas + ".");

        limparArrayRespondidas(); // pq preenchido com 0 da ruim
        atualizarPreco();
        deixarBotoesVisiveis();
        contQuestao = Questoes.carregarPerguntas();
        sortearPergunta();
        verificarAjuda();

        btnR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verificarAcerto(alternativa1);
                proximaPergunta();
            }
        });
        btnR2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verificarAcerto(alternativa2);
                proximaPergunta();
            }
        });
        btnR3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verificarAcerto(alternativa3);
                proximaPergunta();
            }
        });
        btnR4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verificarAcerto(alternativa4);
                proximaPergunta();
            }
        });
        btnAjudaPeq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ajudarPouco();
            }
        });
        btnAjudaMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ajudar();
            }
        });
    }

    private void sortearPergunta() {
        boolean precisaSortear = true;
        while (precisaSortear) {
            questao = new Random().nextInt(contQuestao);
            boolean naoFoiFeita = true;
            for (int i = 0; i < maximoDeQuestoes; i++) {
                if (respondidas[i] == questao) {
                    naoFoiFeita = false;
                }
            }
            if (naoFoiFeita) {
                precisaSortear = false;
                respondidas[jaForam] = questao;
                jaForam ++;
            }
        }
        respostaCerta = Questoes.perguntasRespostas[questao][5];
        sortearOrdemDasOpcoes();
        colocarTextoNaTela();
    }

    private void colocarTextoNaTela() {
        // Pergunta
        txtPergunta.setText(Questoes.perguntasRespostas[questao][0]);

        // Botão 1
        if (Questoes.perguntasRespostas[questao][ordemRandomica[0]].equals("")){
            btnR1.setVisibility(View.GONE);
        } else {
            btnR1.setText(Questoes.perguntasRespostas[questao][ordemRandomica[0]]);
        }

        // Botão 2
        if (Questoes.perguntasRespostas[questao][ordemRandomica[1]].equals("")){
            btnR2.setVisibility(View.GONE);
        } else {
            btnR2.setText(Questoes.perguntasRespostas[questao][ordemRandomica[1]]);
        }

        // Botão 3
        if (Questoes.perguntasRespostas[questao][ordemRandomica[2]].equals("")){
            btnR3.setVisibility(View.GONE);
        } else {
            btnR3.setText(Questoes.perguntasRespostas[questao][ordemRandomica[2]]);
        }

        // Botão 4
        if (Questoes.perguntasRespostas[questao][ordemRandomica[3]].equals("")){
            btnR4.setVisibility(View.GONE);
        } else {
            btnR4.setText(Questoes.perguntasRespostas[questao][ordemRandomica[3]]);
        }
    }

    private void deixarBotoesVisiveis() {
        btnR1.setVisibility(View.VISIBLE);
        btnR2.setVisibility(View.VISIBLE);
        btnR3.setVisibility(View.VISIBLE);
        btnR4.setVisibility(View.VISIBLE);
    }

    private void verificarAcerto(String resposta) {
        if (resposta.equals(respostaCerta)) {
            acertos++;
            moedas += moedasGanhasPorAcerto;
            txtAcertos.setText(" " + acertos + ".");
            txtMoedas.setText(" " + moedas + ".");
            verificarAjuda();
        }
    }

    private void proximaPergunta() {
        if (jaForam == maximoDeQuestoes) {
            startActivity(new Intent(this, TelaResultado.class));
        } else {
            limparOpcoesRetiradas();
            deixarBotoesVisiveis();
            sortearPergunta();
        }
    }

    private void limparOpcoesRetiradas() {
            opcoesRetiradas = new int[3];
            retiradas = 0;
    }

    private void sortearOrdemDasOpcoes() {
        int foramSorteados = 0;
        ordemRandomica = new int[4]; // Limpa a ordem
        while (foramSorteados < 4) {
            int numeroSorteado = new Random().nextInt(4);
            numeroSorteado ++;
            boolean repetido = false;
            for (int i = 0; i < 4; i++) {
                if (ordemRandomica[i] == numeroSorteado) {
                    repetido = true;
                }
            }
            if (!repetido) {
                ordemRandomica[foramSorteados] = numeroSorteado;
                foramSorteados ++;
            }
        }
        alternativa1 = Questoes.perguntasRespostas[questao][ordemRandomica[0]];
        alternativa2 = Questoes.perguntasRespostas[questao][ordemRandomica[1]];
        alternativa3 = Questoes.perguntasRespostas[questao][ordemRandomica[2]];
        alternativa4 = Questoes.perguntasRespostas[questao][ordemRandomica[3]];
    }

    private void ajudarPouco() {
        if (moedas >= precoAjudaPeq) {
            if (retiradas == 3) {
                Toast.makeText(this, "Não há mais opções\nerradas a serem retiradas.", Toast.LENGTH_SHORT).show();
                return;
            }
            boolean precisaRetirar = true;
            while (precisaRetirar) {
                int numeroSorteado = new Random().nextInt(4);
                numeroSorteado++;
                boolean repetida = false;
                for (int i = 0; i < 3; i++) {
                    if (opcoesRetiradas[i] == numeroSorteado) {
                        repetida = true;
                    }
                }
                if (!repetida) {
                    if (numeroSorteado == 1 && alternativa1 != respostaCerta) {
                        opcoesRetiradas[retiradas] = numeroSorteado;
                        btnR1.setVisibility(View.GONE);
                        precisaRetirar = false;
                        retiradas ++;
                    } else if (numeroSorteado == 2 && alternativa2 != respostaCerta) {
                        opcoesRetiradas[retiradas] = numeroSorteado;
                        btnR2.setVisibility(View.GONE);
                        precisaRetirar = false;
                        retiradas ++;
                    } else if (numeroSorteado == 3 && alternativa3 != respostaCerta) {
                        opcoesRetiradas[retiradas] = numeroSorteado;
                        btnR3.setVisibility(View.GONE);
                        precisaRetirar = false;
                        retiradas ++;
                    } else if (numeroSorteado == 4 && alternativa4 != respostaCerta) {
                        opcoesRetiradas[retiradas] = numeroSorteado;
                        btnR4.setVisibility(View.GONE);
                        precisaRetirar = false;
                        retiradas ++;
                    }
                }
            }
            moedas -= precoAjudaPeq;
            verificarAjuda();
            txtMoedas.setText(" " + moedas + ".");
        } else {
            Toast.makeText(this, "Moedas insuficientes.", Toast.LENGTH_SHORT).show();
        }
    }

    private void ajudar() {
        if (moedas >= precoAjudaMed) {
            int tirou = 0;
            if (retiradas == 3) {
                Toast.makeText(this, "Não há mais opções\nerradas a serem retiradas.", Toast.LENGTH_SHORT).show();
                return;
            } else if (retiradas == 2) {
                tirou = 1;
            }
            while (tirou < 2) {
                int numeroSorteado = new Random().nextInt(4);
                numeroSorteado ++;
                boolean repetida = false;
                for (int i = 0; i < 3; i++) {
                    if (opcoesRetiradas[i] == numeroSorteado) {
                        repetida = true;
                    }
                }
                if (!repetida) {
                    if (numeroSorteado == 1 && alternativa1 != respostaCerta) {
                        opcoesRetiradas[retiradas] = numeroSorteado;
                        btnR1.setVisibility(View.GONE);
                        tirou ++;
                        retiradas ++;
                    } else if (numeroSorteado == 2 && alternativa2 != respostaCerta) {
                        opcoesRetiradas[retiradas] = numeroSorteado;
                        btnR2.setVisibility(View.GONE);
                        tirou ++;
                        retiradas ++;
                    } else if (numeroSorteado == 3 && alternativa3 != respostaCerta) {
                        opcoesRetiradas[retiradas] = numeroSorteado;
                        btnR3.setVisibility(View.GONE);
                        tirou ++;
                        retiradas ++;
                    } else if (numeroSorteado == 4 && alternativa4 != respostaCerta) {
                        opcoesRetiradas[retiradas] = numeroSorteado;
                        btnR4.setVisibility(View.GONE);
                        tirou ++;
                        retiradas ++;
                    }
                }
            }
            moedas -= precoAjudaMed;
            verificarAjuda();
            txtMoedas.setText(" " + moedas + ".");
        } else {
            Toast.makeText(this, "Moedas insuficientes.", Toast.LENGTH_SHORT).show();
        }
    }

    private void verificarAjuda() {
        if (moedas < precoAjudaPeq) {
            btnAjudaPeq.setBackgroundResource(R.drawable.ajuda_pequena_indisponivel);
        } else {
            btnAjudaPeq.setBackgroundResource(R.drawable.ajuda_pequena_disponivel);
        }
        if (moedas < precoAjudaMed) {
            btnAjudaMed.setBackgroundResource(R.drawable.ajuda_media_indisponivel);
        } else {
            btnAjudaMed.setBackgroundResource(R.drawable.ajuda_media_disponivel);
        }
    }

    private void atualizarPreco() {
        btnAjudaPeq.setText("\n      " + precoAjudaPeq);
        btnAjudaMed.setText("\n      " + precoAjudaMed);
    }

    private void limparArrayRespondidas() {
        for (int i = 0; i < maximoDeQuestoes; i++) {
            respondidas[i] = -1;
        }
    }

    @Override
    public void onBackPressed() {
    }
}