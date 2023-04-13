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

escreveTitulo('Quantas gerações desde 1500 a 2023?');

var ano = parseInt(prompt('Qual o ano?'))
var idadeMediaParaTerFilhos = 28;
var quantidadeGeracoes = (ano - 1500) / idadeMediaParaTerFilhos;

escreveMensagem(Math.round(quantidadeGeracoes));