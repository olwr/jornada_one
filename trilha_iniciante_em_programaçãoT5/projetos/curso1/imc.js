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