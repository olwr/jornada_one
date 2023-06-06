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

escreveTitulo('Diferença de idade')

function calculaDiferencaIdade(maisVelho, maisNovo) {
    var diferenca = maisVelho - maisNovo;
    escreveMensagem('Nossa diferença de idade é: ' + diferenca);
}

var maisVelho = parseInt(prompt('Qual é a idade do mais velho?'));
var maisNovo = parseInt(prompt('Qual é a idade do mais novo?'));

calculaDiferencaIdade(maisVelho, maisNovo);