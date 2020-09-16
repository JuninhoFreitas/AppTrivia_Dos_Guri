package com.example.desafioandroid;

public class Questoes {

    public static String perguntasRespostas[][] = new String[50][6];

    public static int carregarPerguntas() {
        int contQuestao = 0;

        // Geografia
        if (TelaDeTema.temasEscolhidos[0]) {
            // Pergunta 1
            perguntasRespostas[contQuestao][0] = "Qual é a capital do Acre?";
            perguntasRespostas[contQuestao][1] = "Amazonia";
            perguntasRespostas[contQuestao][2] = "Rio Branco";
            perguntasRespostas[contQuestao][3] = "Rondonia";
            perguntasRespostas[contQuestao][4] = "Macapá";
            perguntasRespostas[contQuestao][5] = "Rio Branco"; // Resposta certa Por extenso
            contQuestao ++;
            //Pergunta 2
            perguntasRespostas[contQuestao][0] = "Qual desses Países não é Europeu?";
            perguntasRespostas[contQuestao][1] = "Casaquistão";
            perguntasRespostas[contQuestao][2] = "Macedonia";
            perguntasRespostas[contQuestao][3] = "Grecia";
            perguntasRespostas[contQuestao][4] = "Polonia";
            perguntasRespostas[contQuestao][5] = "Casaquistão";
            contQuestao ++;
            // Pergunta 3
            perguntasRespostas[contQuestao][0] = "O Brasil é de que continente?";
            perguntasRespostas[contQuestao][1] = "America do sul";
            perguntasRespostas[contQuestao][2] = "America do norte";
            perguntasRespostas[contQuestao][3] = "America central";
            perguntasRespostas[contQuestao][4] = "Europa";
            perguntasRespostas[contQuestao][5] = "America do sul";
            contQuestao ++;
            // Pergunta 4
            perguntasRespostas[contQuestao][0] = "Qual desses não é ilha?";
            perguntasRespostas[contQuestao][1] = "Libia";
            perguntasRespostas[contQuestao][2] = "Barbados";
            perguntasRespostas[contQuestao][3] = "Indonesia";
            perguntasRespostas[contQuestao][4] = "Madagasgar";
            perguntasRespostas[contQuestao][5] = "Libia";
            contQuestao ++;
            // Pergunta 5
            perguntasRespostas[contQuestao][0] = "Qual a capital da Guatemala?";
            perguntasRespostas[contQuestao][1] = "Guatemala";
            perguntasRespostas[contQuestao][2] = "La paz";
            perguntasRespostas[contQuestao][3] = "São tome";
            perguntasRespostas[contQuestao][4] = "Porto pricipe";
            perguntasRespostas[contQuestao][5] = "Guatemala";
            contQuestao ++;
            // Pergunta 6
            perguntasRespostas[contQuestao][0] = "Qual desses países não é africano?";
            perguntasRespostas[contQuestao][1] = "Arábia Saudita";
            perguntasRespostas[contQuestao][2] = "Egito";
            perguntasRespostas[contQuestao][3] = "Madagascar";
            perguntasRespostas[contQuestao][4] = "Africa do sul";
            perguntasRespostas[contQuestao][5] = "Arábia Saudita";
            contQuestao ++;
            // Pergunta 7
            perguntasRespostas[contQuestao][0] = "Quantos países tem a América? (todas juntas)";
            perguntasRespostas[contQuestao][1] = "37";
            perguntasRespostas[contQuestao][2] = "40";
            perguntasRespostas[contQuestao][3] = "75";
            perguntasRespostas[contQuestao][4] = "23";
            perguntasRespostas[contQuestao][5] = "37";
            contQuestao ++;
            // Pergunta 8
            perguntasRespostas[contQuestao][0] = "Qual a capital do México?";
            perguntasRespostas[contQuestao][1] = "Cidade do México";
            perguntasRespostas[contQuestao][2] = "Espanho";
            perguntasRespostas[contQuestao][3] = "Del México";
            perguntasRespostas[contQuestao][4] = "Tihuana";
            perguntasRespostas[contQuestao][5] = "Cidade do México";
            contQuestao ++;
            // Pergunta 9
            perguntasRespostas[contQuestao][0] = "O Haiti é um país do Caribe. Sua capital é...";
            perguntasRespostas[contQuestao][1] = "Porto Príncipe";
            perguntasRespostas[contQuestao][2] = "Porto Feliz";
            perguntasRespostas[contQuestao][3] = "Porto de Galinhas";
            perguntasRespostas[contQuestao][4] = "Porto Rico";
            perguntasRespostas[contQuestao][5] = "Porto Príncipe";
            contQuestao ++;
            // Pergunta 10
            perguntasRespostas[contQuestao][0] = "O que existe em comum entre o México, o Panamá e a Guatemala?";
            perguntasRespostas[contQuestao][1] = "Possuem capitais com o mesmo nome do país";
            perguntasRespostas[contQuestao][2] = "Estão localizados na América do Norte";
            perguntasRespostas[contQuestao][3] = "Usam o português como uma das língua oficiais";
            perguntasRespostas[contQuestao][4] = "Estão localizados na América Central";
            perguntasRespostas[contQuestao][5] = "Possuem capitais com o mesmo nome do país";
            contQuestao ++;
        }

        // História
        if (TelaDeTema.temasEscolhidos[1]) {
            // Pergunta 1
            perguntasRespostas[contQuestao][0] = "Quando começou o governo de Vargas?";
            perguntasRespostas[contQuestao][1] = "1930";
            perguntasRespostas[contQuestao][2] = "1932";
            perguntasRespostas[contQuestao][3] = "1935";
            perguntasRespostas[contQuestao][4] = "1962";
            perguntasRespostas[contQuestao][5] = "1930";
            contQuestao++;
            // Pergunta 2
            perguntasRespostas[contQuestao][0] = "Qual foi a frase que Getúlio Vargas pronunciou antes de se suicidar?";
            perguntasRespostas[contQuestao][1] = "Saio da vida para entrar na história";
            perguntasRespostas[contQuestao][2] = "Saio de casa pra morte";
            perguntasRespostas[contQuestao][3] = "Saio do trabalho pra morte";
            perguntasRespostas[contQuestao][4] = "Entrei na eternidade para sair da vida";
            perguntasRespostas[contQuestao][5] = "Saio da vida para entrar na história";
            contQuestao++;
            // Pergunta 3
            perguntasRespostas[contQuestao][0] = "Com quem Afrodite traía Hefesto?";
            perguntasRespostas[contQuestao][1] = "Ares";
            perguntasRespostas[contQuestao][2] = "Poseidon";
            perguntasRespostas[contQuestao][3] = "Cronos";
            perguntasRespostas[contQuestao][4] = "Zeus";
            perguntasRespostas[contQuestao][5] = "Ares";
            contQuestao++;
            // Pergunta 4
            perguntasRespostas[contQuestao][0] = "Quais os 3 deuses principais?";
            perguntasRespostas[contQuestao][1] = "Zeus, Hades e Poseidon";
            perguntasRespostas[contQuestao][2] = "Gaia, Cronos e Atlas";
            perguntasRespostas[contQuestao][3] = "Perseu, Hércules e Annabeth";
            perguntasRespostas[contQuestao][4] = "Hebe, Perséfone e Hades";
            perguntasRespostas[contQuestao][5] = "Zeus, Hades e Poseidon";
            contQuestao++;
            // Pergunta 5
            perguntasRespostas[contQuestao][0] = "Com qual desses países foi assinado o Tratado de Comércio, Navegações e Amizade?";
            perguntasRespostas[contQuestao][1] = "Inglaterra ";
            perguntasRespostas[contQuestao][2] = "Espanha";
            perguntasRespostas[contQuestao][3] = "Brasil";
            perguntasRespostas[contQuestao][4] = "França";
            perguntasRespostas[contQuestao][5] = "Inglaterra ";
            contQuestao++;
            // Pergunta 6
            perguntasRespostas[contQuestao][0] = "Quais foram os principais participantes da guerra fria?\n";
            perguntasRespostas[contQuestao][1] = "Rússia e Estados Unidos ";
            perguntasRespostas[contQuestao][2] = "URSS e Estados Unidos";
            perguntasRespostas[contQuestao][3] = "Estados Unidos e Cuba";
            perguntasRespostas[contQuestao][4] = "Japão e China";
            perguntasRespostas[contQuestao][5] = "Rússia e Estados Unidos ";
            contQuestao++;
            // Pergunta 7
            perguntasRespostas[contQuestao][0] = "Qual o nome do plano americano que foi decisivo na luta contra o avanço soviético?";
            perguntasRespostas[contQuestao][1] = "Plano Marshall";
            perguntasRespostas[contQuestao][2] = "Plano de Versalhes";
            perguntasRespostas[contQuestao][3] = "Plano exversal";
            perguntasRespostas[contQuestao][4] = "Plano Understand";
            perguntasRespostas[contQuestao][5] = "Plano Marshall";
            contQuestao++;
            // Pergunta 8
            perguntasRespostas[contQuestao][0] = "Qual foi o período em que ocorreu a guerra fria?";
            perguntasRespostas[contQuestao][1] = "1947 à 1991";
            perguntasRespostas[contQuestao][2] = "1940 à 1993";
            perguntasRespostas[contQuestao][3] = "1937 à 1999";
            perguntasRespostas[contQuestao][4] = "1991 à 2003";
            perguntasRespostas[contQuestao][5] = "1947 à 1991";
            contQuestao++;
            // Pergunta 9
            perguntasRespostas[contQuestao][0] = "Em qual mar o Rio Nilo deságua?\n";
            perguntasRespostas[contQuestao][1] = "Mar Mediterrânio";
            perguntasRespostas[contQuestao][2] = "Golfo Pérsico";
            perguntasRespostas[contQuestao][3] = "Mar Vermelho";
            perguntasRespostas[contQuestao][4] = "Mar Negro";
            perguntasRespostas[contQuestao][5] = "Mar Mediterrânio";
            contQuestao++;
            // Pergunta 10
            perguntasRespostas[contQuestao][0] = "O deus Rá é o deus ___, representado por um homem com cabeça de falcão, e com um disco solar na cabeça.";
            perguntasRespostas[contQuestao][1] = "Sol";
            perguntasRespostas[contQuestao][2] = "Água";
            perguntasRespostas[contQuestao][3] = "Ar";
            perguntasRespostas[contQuestao][4] = "Terra";
            perguntasRespostas[contQuestao][5] = "Sol";
            contQuestao++;
        }

        // Religião
        if (TelaDeTema.temasEscolhidos[2]) {
            // Pergunta 1
            perguntasRespostas[contQuestao][0] = "A bíblia relata o nome de um dos discípulos de João Batista que seguiram Jesus, quem era?";
            perguntasRespostas[contQuestao][1] = "André";
            perguntasRespostas[contQuestao][2] = "Pedro";
            perguntasRespostas[contQuestao][3] = "Tiago";
            perguntasRespostas[contQuestao][4] = "João";
            perguntasRespostas[contQuestao][5] = "André";
            contQuestao++;
            // Pergunta 2
            perguntasRespostas[contQuestao][0] = "Qual era a profissão de Jesus Cristo?";
            perguntasRespostas[contQuestao][1] = "Carpinteiro";
            perguntasRespostas[contQuestao][2] = "Pescador";
            perguntasRespostas[contQuestao][3] = "Pastor de ovelhas";
            perguntasRespostas[contQuestao][4] = "A bíblia não relata a profissão de Jesus";
            perguntasRespostas[contQuestao][5] = "Carpinteiro";
            contQuestao++;
            // Pergunta 3
            perguntasRespostas[contQuestao][0] = "Segundo as palavras de Jesus, do que Nicodemos precisava?";
            perguntasRespostas[contQuestao][1] = "Nascer de novo";
            perguntasRespostas[contQuestao][2] = "Ler a Torá";
            perguntasRespostas[contQuestao][3] = "Oferecer sacrifícios ao Senhor";
            perguntasRespostas[contQuestao][4] = "Ser curado da lepra";
            perguntasRespostas[contQuestao][5] = "Nascer de novo";
            contQuestao++;
            // Pergunta 4
            perguntasRespostas[contQuestao][0] = "Qual discípulo é considerado por Jesus a \"Pedra\" fundamental da Igreja?";
            perguntasRespostas[contQuestao][1] = "Pedro";
            perguntasRespostas[contQuestao][2] = "João";
            perguntasRespostas[contQuestao][3] = "Paulo";
            perguntasRespostas[contQuestao][4] = "Tadeu";
            perguntasRespostas[contQuestao][5] = "Pedro";
            contQuestao++;
            // Pergunta 5
            perguntasRespostas[contQuestao][0] = "Qual discípulo de Jesus era publicano? E qual era seu nome romano/judeu?";
            perguntasRespostas[contQuestao][1] = "Mateus/Levi";
            perguntasRespostas[contQuestao][2] = "Mateus/Davi";
            perguntasRespostas[contQuestao][3] = "Lucas/Saulo";
            perguntasRespostas[contQuestao][4] = "Marcos/Lucas";
            perguntasRespostas[contQuestao][5] = "Mateus/Levi";
            contQuestao++;
            // Pergunta 6
            perguntasRespostas[contQuestao][0] = "Qual o primeiro e maior mandamento ensinado por Jesus?";
            perguntasRespostas[contQuestao][1] = "Amar a Deus sobre todas as coisas";
            perguntasRespostas[contQuestao][2] = "Amar o próximo como a si mesmo";
            perguntasRespostas[contQuestao][3] = "Dar todos os bens aos pobres";
            perguntasRespostas[contQuestao][4] = "Ser fiel nos dízimos e nas ofertas";
            perguntasRespostas[contQuestao][5] = "Amar a Deus sobre todas as coisas";
            contQuestao++;
            // Pergunta 7
            perguntasRespostas[contQuestao][0] = "Qual discípulo foi incrédulo em relação a ressurreição de Jesus?";
            perguntasRespostas[contQuestao][1] = "Tomé";
            perguntasRespostas[contQuestao][2] = "Judas";
            perguntasRespostas[contQuestao][3] = "Pedro";
            perguntasRespostas[contQuestao][4] = "João";
            perguntasRespostas[contQuestao][5] = "Tomé";
            contQuestao++;
            // Pergunta 8
            perguntasRespostas[contQuestao][0] = "Quando Jesus subiu aos Céus, sua missão não estava totalmente cumprida, faltava seus discípulos receberem uma promessa dada pelo próprio Messias, qual era a promessa?";
            perguntasRespostas[contQuestao][1] = "O Espírito Santo";
            perguntasRespostas[contQuestao][2] = "Dom de curas";
            perguntasRespostas[contQuestao][3] = "Línguas Estranhas";
            perguntasRespostas[contQuestao][4] = "Autoridade sobre demônios";
            perguntasRespostas[contQuestao][5] = "O Espírito Santo";
            contQuestao++;
            // Pergunta 9
            perguntasRespostas[contQuestao][0] = "Após se cumprir a promessa, os que creram receberam poder para iniciar suas missões, conforme Jesus ordenou, mas em qual dia específico se cumpriu a promessa?";
            perguntasRespostas[contQuestao][1] = "Pentecostes";
            perguntasRespostas[contQuestao][2] = "Páscoa";
            perguntasRespostas[contQuestao][3] = "Shabbat";
            perguntasRespostas[contQuestao][4] = "Bar Mitzvah";
            perguntasRespostas[contQuestao][5] = "Pentecostes";
            contQuestao++;
            // Pergunta 10
            perguntasRespostas[contQuestao][0] = "Quais os povos especificados por Jesus a ser pregado o Evangelho?";
            perguntasRespostas[contQuestao][1] = "Todos";
            perguntasRespostas[contQuestao][2] = "Os Judeus";
            perguntasRespostas[contQuestao][3] = "Os Romanos";
            perguntasRespostas[contQuestao][4] = "Os Gentios";
            perguntasRespostas[contQuestao][5] = "Todos";
            contQuestao++;
        }

        // Matemática
        if (TelaDeTema.temasEscolhidos[3]) {
            // Pergunta 1
            perguntasRespostas[contQuestao][0] = "Leandro tem 40 balas chupou 12 e deu 10 para sua irmã. Com quantas balas ele ficou?";
            perguntasRespostas[contQuestao][1] = "18";
            perguntasRespostas[contQuestao][2] = "15";
            perguntasRespostas[contQuestao][3] = "14";
            perguntasRespostas[contQuestao][4] = "16";
            perguntasRespostas[contQuestao][5] = "18";
            contQuestao++;
            // Pergunta 2
            perguntasRespostas[contQuestao][0] = "Quantos números 1 eu tenho de 1 até 191?";
            perguntasRespostas[contQuestao][1] = "132";
            perguntasRespostas[contQuestao][2] = "140";
            perguntasRespostas[contQuestao][3] = "136";
            perguntasRespostas[contQuestao][4] = "150";
            perguntasRespostas[contQuestao][5] = "132";
            contQuestao++;
            // Pergunta 3
            perguntasRespostas[contQuestao][0] = "Pedro tem 30 anos e tem mais três irmãos: Bianca de 27, Victor de 23 e Alex de 18. Qual a diferença de idade entre Pedro e irmão caçula?";
            perguntasRespostas[contQuestao][1] = "12";
            perguntasRespostas[contQuestao][2] = "13";
            perguntasRespostas[contQuestao][3] = "11";
            perguntasRespostas[contQuestao][4] = "14";
            perguntasRespostas[contQuestao][5] = "12";
            contQuestao++;
            // Pergunta 4
            perguntasRespostas[contQuestao][0] = "Se você dividir uma unidade em 1000 partes iguais, cada parte será...";
            perguntasRespostas[contQuestao][1] = "Um milésimo";
            perguntasRespostas[contQuestao][2] = "Um milionésimo";
            perguntasRespostas[contQuestao][3] = "Um milhar";
            perguntasRespostas[contQuestao][4] = "Um centésimo";
            perguntasRespostas[contQuestao][5] = "Um milésimo";
            contQuestao++;
            // Pergunta 5
            perguntasRespostas[contQuestao][0] = "Quantos zeros tem o número UM BILHÃO?";
            perguntasRespostas[contQuestao][1] = "Nove";
            perguntasRespostas[contQuestao][2] = "Sete";
            perguntasRespostas[contQuestao][3] = "Oito";
            perguntasRespostas[contQuestao][4] = "Dez";
            perguntasRespostas[contQuestao][5] = "Nove";
            contQuestao++;
            // Pergunta 6
            perguntasRespostas[contQuestao][0] = "O famoso matemático Bhaskara nasceu em qual país?";
            perguntasRespostas[contQuestao][1] = "Índia";
            perguntasRespostas[contQuestao][2] = "Espanha";
            perguntasRespostas[contQuestao][3] = "Inglaterra";
            perguntasRespostas[contQuestao][4] = "Romênia";
            perguntasRespostas[contQuestao][5] = "Índia";
            contQuestao++;
            // Pergunta 7
            perguntasRespostas[contQuestao][0] = "O que é um decágono?";
            perguntasRespostas[contQuestao][1] = "Um polígono com 10 lados";
            perguntasRespostas[contQuestao][2] = "Um conjunto com 10 elementos";
            perguntasRespostas[contQuestao][3] = "Uma corrida com 10 participantes";
            perguntasRespostas[contQuestao][4] = "Um combinação entre 10 números";
            perguntasRespostas[contQuestao][5] = "Um polígono com 10 lados";
            contQuestao++;
            // Pergunta 8
            perguntasRespostas[contQuestao][0] = "Um pedreiro diz: \"Se eu tivesse dois tijolos a mais, o dobro deste número seria 100\". Quantos tijolos ele tem?";
            perguntasRespostas[contQuestao][1] = "48";
            perguntasRespostas[contQuestao][2] = "42";
            perguntasRespostas[contQuestao][3] = "44";
            perguntasRespostas[contQuestao][4] = "50";
            perguntasRespostas[contQuestao][5] = "48";
            contQuestao++;
            // Pergunta 9
            perguntasRespostas[contQuestao][0] = "Pedro tem 6 bolas de gude a mais do que Jorge. Os dois juntos têm 54. Quanto tem cada um?";
            perguntasRespostas[contQuestao][1] = "30 e 24";
            perguntasRespostas[contQuestao][2] = "34 e 20";
            perguntasRespostas[contQuestao][3] = "32 e 22";
            perguntasRespostas[contQuestao][4] = "28 e 26";
            perguntasRespostas[contQuestao][5] = "30 e 24";
            contQuestao++;
            // Pergunta 10
            perguntasRespostas[contQuestao][0] = "Se seis latas de leite custam 72 reais, qual o preço de 9 latas?";
            perguntasRespostas[contQuestao][1] = "108 reais";
            perguntasRespostas[contQuestao][2] = "100 reais";
            perguntasRespostas[contQuestao][3] = "90 reais";
            perguntasRespostas[contQuestao][4] = "115 reais";
            perguntasRespostas[contQuestao][5] = "108 reais";
            contQuestao++;
        }

        // Informática
        if (TelaDeTema.temasEscolhidos[4]) {
            // Pergunta 1
            perguntasRespostas[contQuestao][0] = "Qual das alternativas é a incorreta?";
            perguntasRespostas[contQuestao][1] = "Input= Entrada True= Falso For= Para";
            perguntasRespostas[contQuestao][2] = "If= Se Print= Impressão Class= Classe";
            perguntasRespostas[contQuestao][3] = "Print= Impressão Else= Se não While= Enquanto";
            perguntasRespostas[contQuestao][4] = "Title= Título Doctype= Tipo de documento Head= Cabeçalho";
            perguntasRespostas[contQuestao][5] = "Input= Entrada True= Falso For= Para";
            contQuestao++;
            // Pergunta 2
            perguntasRespostas[contQuestao][0] = "Qual das alternativas é a correta?";
            perguntasRespostas[contQuestao][1] = "If= Se Print= Impressão Title= Titúlo";
            perguntasRespostas[contQuestao][2] = "Body= Corpo True= Falso None= Cabeçalho";
            perguntasRespostas[contQuestao][3] = "Input= Saida Print= Titúlo Cody= Corpo";
            perguntasRespostas[contQuestao][4] = "From= A partir de If= Se Else= Se não";
            perguntasRespostas[contQuestao][5] = "If= Se Print= Impressão Title= Titúlo";
            contQuestao++;
            // Pergunta 3
            perguntasRespostas[contQuestao][0] = "Na linguagem de programação Pascal, quando queremos comparar situações ou condições, usamos qual estrutura?";
            perguntasRespostas[contQuestao][1] = "if - then";
            perguntasRespostas[contQuestao][2] = "while - do";
            perguntasRespostas[contQuestao][3] = "for - to";
            perguntasRespostas[contQuestao][4] = "case - do";
            perguntasRespostas[contQuestao][5] = "if - then";
            contQuestao++;
            // Pergunta 4
            perguntasRespostas[contQuestao][0] = "Dos seguintes itens, qual contém uma linguagem de baixo nível?";
            perguntasRespostas[contQuestao][1] = "Assembly";
            perguntasRespostas[contQuestao][2] = "Java";
            perguntasRespostas[contQuestao][3] = "Pascal";
            perguntasRespostas[contQuestao][4] = "C#";
            perguntasRespostas[contQuestao][5] = "Assembly";
            contQuestao++;
            // Pergunta 5
            perguntasRespostas[contQuestao][0] = "Se um profissional está criando um site em HTML e ele quiser colocar uma barra horizontal em sua página, qual tag ele deve usar?";
            perguntasRespostas[contQuestao][1] = "<hr/>";
            perguntasRespostas[contQuestao][2] = "<hr></hr>";
            perguntasRespostas[contQuestao][3] = "<br></br>";
            perguntasRespostas[contQuestao][4] = "<line><line/>";
            perguntasRespostas[contQuestao][5] = "<hr/>";
            contQuestao++;
            // Pergunta 6
            perguntasRespostas[contQuestao][0] = "Assinale a alternativa que não contem uma propriedade de Visual Basic.";
            perguntasRespostas[contQuestao][1] = "Label";
            perguntasRespostas[contQuestao][2] = "Name";
            perguntasRespostas[contQuestao][3] = "Text";
            perguntasRespostas[contQuestao][4] = "BackColor";
            perguntasRespostas[contQuestao][5] = "Label";
            contQuestao++;
            // Pergunta 7
            perguntasRespostas[contQuestao][0] = "HTML é uma linguagem de:";
            perguntasRespostas[contQuestao][1] = "Formatação";
            perguntasRespostas[contQuestao][2] = "Programação";
            perguntasRespostas[contQuestao][3] = "Programação de web";
            perguntasRespostas[contQuestao][4] = "Edição de textos";
            perguntasRespostas[contQuestao][5] = "Formatação";
            contQuestao++;
            // Pergunta 8
            perguntasRespostas[contQuestao][0] = "Qual é a diferença de RAM e ROM?";
            perguntasRespostas[contQuestao][1] = "RAM é volátil, ROM é não-volátil";
            perguntasRespostas[contQuestao][2] = "RAM não é volátil, ROM é volátil";
            perguntasRespostas[contQuestao][3] = "ROM armazena mais memória";
            perguntasRespostas[contQuestao][4] = "RAM armazena mais memória";
            perguntasRespostas[contQuestao][5] = "RAM é volátil, ROM é não-volátil";
            contQuestao++;
            // Pergunta 9
            perguntasRespostas[contQuestao][0] = "Um programador está criando um programa que calcula o valor de delta numa equação de segundo grau. Como ele programaria isso em linguagem de programação do Visual Basic?";
            perguntasRespostas[contQuestao][1] = "d = b^2 - 4*a*c";
            perguntasRespostas[contQuestao][2] = "d = b^2 + 4.a.c";
            perguntasRespostas[contQuestao][3] = "d = b² - 4*a*c";
            perguntasRespostas[contQuestao][4] = "d = b^2 - 4.a.c";
            perguntasRespostas[contQuestao][5] = "d = b^2 - 4*a*c";
            contQuestao++;
            // Pergunta 10
            perguntasRespostas[contQuestao][0] = "Qual das seguintes variáveis só aceita números inteiros?";
            perguntasRespostas[contQuestao][1] = "Long";
            perguntasRespostas[contQuestao][2] = "String";
            perguntasRespostas[contQuestao][3] = "Char";
            perguntasRespostas[contQuestao][4] = "Double";
            perguntasRespostas[contQuestao][5] = "Long";
            contQuestao ++;
        }
        return contQuestao;
    }
}