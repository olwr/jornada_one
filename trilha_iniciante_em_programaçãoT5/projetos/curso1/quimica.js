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

escreveTitulo('São substâncias diferentes?')

var quantidadeCarbono1 = parseInt(prompt("Quantidade de carbono substância 1:"));
var quantidadeCarbono2 = parseInt(prompt("Quantidade de carbono substância 2:"));

quantidadeCarbono2 += 2;

if(quantidadeCarbono1 == quantidadeCarbono2 ) {
    escreveMensagem("Acho que são substâncias parecidas");
} else {
    escreveMensagem("São substâncias bem diferentes");
}