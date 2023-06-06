/*

ARQUIVO PARA GUARDAR CÓDIGOS DOS EXEMPLOS E ATIVIDADES DO CURSO

*/

// Geral
function pulaLinha() {
    // document.write('<br><br>');
    document.write('<hr>')
}

function escreveMensagem(mensagem) {
    document.write("<p>" + mensagem + "</p>");
    pulaLinha();
}

function escreveTitulo(titulo) {
    document.write('<h3>' + titulo + '</h3>')
}
//

// GASTOS
escreveTitulo('Gastos com a viagem');

var gastos = {
    passagem: 400,
    alimentacao: 200,
    hotel: 100,
    entretenimento: 300
};

var gastosTotal = gastos.passagem + gastos.alimentacao + gastos.hotel + gastos.entretenimento;

escreveMensagem("A média do valor gasto com as viagens é: " + gastosTotal / 4);

// PORCENTAGEM DE ACERTOS
escreveTitulo('<h3>Porcentagem de acertos na prova</h3>')

// var prova = {
//     questoes: 50,
//     acertos: 15,
//     peso: 100
// };

function CalculoProva(acertos) {
    var prova = {
        questoes: 50,
        peso: 100
    }

    var calculo = (acertos / prova.questoes) * prova.peso
    escreveMensagem("Eu acertei: " + calculo + '% da prova');
}
// var calculo = (prova.acertos / prova.questoes) * prova.peso;


var acertos = parseInt(prompt("Quantas questões você acertou?"))
CalculoProva(acertos)


// IDADES
escreveTitulo('<h3>Idades</h3>')

var ano = 2023

var Oliwer = { nome: 'Oliwer', idade: (ano - 2002) };
var Nick = { nome: 'Nick', idade: (ano - 2007) };
var Lucy = { nome: 'Lucy', idade: (ano - 1992) };
var Lena = { nome: 'Lena', idade: (ano - 1973) };
var Mike = { nome: 'Mike', idade: (ano - 1971) };

escreveMensagem('A idade do ' + Oliwer.nome + ' é: ' + Oliwer.idade + ' anos')
escreveMensagem('A idade do ' + Nick.nome + ' é: ' + Nick.idade + ' anos')
escreveMensagem('A idade da ' + Lucy.nome + ' é: ' + Lucy.idade + ' anos')
escreveMensagem('A idade da ' + Lena.nome + ' é: ' + Lena.idade + ' anos')
escreveMensagem('A idade do ' + Mike.nome + ' é: ' + Mike.idade + ' anos')
var mediaDeIdades = ((Oliwer.idade + Nick.idade + Lucy.idade + Lena.idade + Mike.idade) / 5);

escreveMensagem('A média das idades é: ' + Math.round(mediaDeIdades))

// ÁLCOOL OU GASOLINA?
escreveTitulo('<h3>Álcool ou Gasolina?</h3>')

var carro = {
    tanque: 40,
    kmGasolina: 480,
    kmAlcool: 300
};

var consumo = {
    consumoGasolina: carro.kmGasolina / carro.tanque,
    consumoAlcool: carro.kmAlcool / carro.tanque
};

escreveMensagem('O consumo de gasolina é: ' + consumo.consumoGasolina);
escreveMensagem('O consumo de álcool é: ' + consumo.consumoAlcool);

// IDADE IRMÃO
escreveTitulo('Diferença de idade')

// var maisVelho = 18;
// var maisNovo = 15;
// var diferenca = maisVelho - maisNovo;

function calculaDiferencaIdade(maisVelho, maisNovo) {
    var diferenca = maisVelho - maisNovo;
    escreveMensagem('Nossa diferença de idade é: ' + diferenca);
}

var maisVelho = parseInt(prompt('Qual é a idade do mais velho?'));
var maisNovo = parseInt(prompt('Qual é a idade do mais novo?'));

calculaDiferencaIdade(maisVelho, maisNovo);

// GERAÇÕES
escreveTitulo('Quantas gerações desde 1500 a 2023?');

var idadeMediaParaTerFilhos = 28;
var quantidadeGeracoes = (ano - 1500) / idadeMediaParaTerFilhos;

escreveMensagem(Math.round(quantidadeGeracoes));

// IMC
escreveTitulo('IMC')

function calculaIMC(peso, altura) {
    var imc = peso / (altura * altura);
    escreveMensagem('O IMC de ' + nome + ' é ' + imc.toFixed(2));
    
    var limiteBaixo = 18.5;
    var limiteAlto = 35;

    if (imc < limiteBaixo) {
        escreveMensagem('Você está abaixo do recomendado por: ' + (limiteBaixo - imc).toFixed(2));
    } else if (imc > limiteAlto) {
        escreveMensagem('Você está acima do recomendado por: ' + (imc - limiteAlto).toFixed(2));
    } else {
        escreveMensagem('Você está na faixa recomendada com ' + (imc - limiteBaixo).toFixed(2) + ' acima do limite aceitável do menor IMC e com ' + (limiteAlto - imc).toFixed(2) + ' abaixo do limite aceitável do maior IMC');
    }
    
    return imc
}

var nome = prompt("Informe o seu nome");
var seuPeso = prompt("Informe o seu peso");
var suaAltura = prompt("Informe a sua altura");

calculaIMC(seuPeso, suaAltura);

// CONVIDADOS E VIPS
escreveTitulo('Convidados e VIPs');

function calculoCV() {
    var convidados = parseInt(prompt('Número de convidados?'));
    var vips = parseInt(prompt('Número de VIPs?'));

    var total = convidados + vips;
    escreveMensagem(total);
}

calculoCV()

//PONTUAÇÃO DO TIME
escreveTitulo("Como anda o seu time?");

var pontuacaoPassado = parseInt(prompt("Entre com a pontuação do ano passado."));
var vitorias = parseInt(prompt("Entre com o número de vitórias."));
var empates = parseInt(prompt("Entre com o número de empates."));
var pontos = (vitorias * 3) + empates;

escreveMensagem("Os pontos do seu time são " + pontos);

if(pontos > pontuacaoPassado) {
    escreveMensagem("Seu time está melhor do que no ano passado por " + (pontos - pontuacaoPassado) + " pontos.");
} else if(pontos < pontuacaoPassado) {
    escreveMensagem("Seu time está pior do que no ano passado por " + (pontuacaoPassado - pontos) + " pontos.");
} else {
    escreveMensagem("Seu time está igual ao ano passado com " + pontos);
}

escreveMensagem("FIM");

// QUÍMICA + PROGRAMAÇÃO
escreveTitulo('São substâncias diferentes?')

var quantidadeCarbono1 = parseInt(prompt("Quantidade de carbono substância 1:"));
var quantidadeCarbono2 = parseInt(prompt("Quantidade de carbono substância 2:"));

quantidadeCarbono2 += 2;

if(quantidadeCarbono1 == quantidadeCarbono2 ) {
    escreveMensagem("Acho que são substâncias parecidas");
} else {
    escreveMensagem("São substâncias bem diferentes");
}

// TEM CARTEIRA?
escreveTitulo('Pode dirigir?')

var suaIdade = parseInt(prompt('Qual é sua idade?'));
var carteira = prompt('Tem carteira? Responda com S ou N');
const podeDirigir = suaIdade >= 18 && carteira == 'S' ? 'Pode dirigir' : 'Não pode dirigir';
escreveMensagem(podeDirigir)

// ANO COPA
escreveTitulo('Ano de Copa');

var limite = parseInt(prompt('Entre com a data limite:'));
var anoCopa = 1930;

while(anoCopa <= limite) {
    escreveMensagem('Teve copa em ' + anoCopa);
    anoCopa += 4;
}

escreveMensagem('FIM')

// PARES 0 - 100, CONTADOR 30 - 40 (SEM 33/37),TODOS DE 20 - 0
escreveTitulo('Roberta não se cansa');

escreveMensagem('*** Pares de 0 - 100');
for (let i = 0; i <= 100;) {
    escreveMensagem(i);
    i += 2;
}
escreveMensagem('fim');

escreveMensagem('Contador 30 - 40, sem 33 e 37');
for (let i = 30; i <= 40; i++) {
    if (i == 33 || i == 37 ) {
        continue
    }
    escreveMensagem(i);
}
escreveMensagem('fim')

escreveMensagem('Todos de 20 - 0');
for (let i = 20; i >= 0; i--) {
    escreveMensagem(i);
}
escreveMensagem('fim')

// IDADE NaN
escreveTitulo('Idade é NaN?')
var idade = parseInt(prompt("Digite sua idade"));

while( isNaN(idade) ) {
    idade = parseInt(prompt("Digite sua idade"));    
}
alert(idade);

// LOGIN
escreveTitulo('Login');

var loginCadastrado = 'alura';
var senhaCadastrada = 'alura123';

var loginInformado = prompt('Informe seu login:');
var senhaInformada = prompt('Informe sua senha:');

for (let i = 3;  i > 0; i--) {
    if (loginCadastrado == loginInformado && senhaCadastrada == senhaInformada) {
        escreveMensagem('Bem-vindo ao sistema ' + loginInformado);
        break
    } else if (loginCadastrado != loginInformado) {
        alert('Usuário inválido. Tente novamente');
        alert('Você tem mais ' + i + ' tentativas');
        loginInformado = prompt('Informe seu login:');
        senhaInformada = prompt('Informe sua senha:');
        continue
    } else {
        alert('Senha inválida. Tente novamente');
        alert('Você tem mais ' + i + ' tentativas');
        loginInformado = prompt('Informe seu login:');
        senhaInformada = prompt('Informe sua senha:');
        continue
    }
}

//MÉDIA DE IDADES FAMILIARES
escreveTitulo('Média de idades: Familiares');

var totalParentes = parseInt(prompt('Quantas familiares você tem?'));
var totalIdades = 0;

for (let i = 0; i < totalParentes; i++) {
    var idades = parseInt(prompt('Informe a idade do seu familiar:'));
    totalIdades += idades;
};

var mediaIdadesParentes = totalIdades/totalParentes;
escreveMensagem('A média de idades dos familiares é: ' + mediaIdadesParentes.toFixed(1));

// MÉDIA GASTOS EVENTOS
escreveTitulo('A média de gastos com eventos')

var totalDeEventos = parseInt(prompt("Informe o total de eventos"));
var contador = 1;
var totalGastoComEventos = 0;

while(contador <= totalDeEventos) {
    var gasto = parseFloat(prompt("Informe total gasto com evento"));
    totalGastoComEventos += gasto;
    contador++;
}

var media = (totalGastoComEventos / totalDeEventos).toFixed(2);
escreveMensagem("A média de gastos é R$" + media);

// ESTRELAS
escreveTitulo('Escreve asteriscos');

for(let linha = 1; linha <= 3; linha++) {
    for(let coluna = 1; coluna <= 10; coluna++) {
        document.write("*");
    }
    pulaLinha();
}