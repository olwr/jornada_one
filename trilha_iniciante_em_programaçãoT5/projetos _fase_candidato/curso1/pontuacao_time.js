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