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

escreveTitulo('<h3>Porcentagem de acertos na prova</h3>')

function CalculoProva(acertos) {
    var prova = {
        questoes: 50,
        peso: 100
    }

    var calculo = (acertos / prova.questoes) * prova.peso
    escreveMensagem("Eu acertei: " + calculo + '% da prova');
}

var acertos = parseInt(prompt("Quantas questões você acertou?"))
CalculoProva(acertos)
