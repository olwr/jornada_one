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
    escreveMensagem('O IMC de ' + nome + ' é ' + Math.round(imc));
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
