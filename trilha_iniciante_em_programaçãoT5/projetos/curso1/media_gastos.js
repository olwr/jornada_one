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