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

escreveTitulo('Ano de Copa');

var limite = parseInt(prompt('Entre com a data limite:'));
var anoCopa = 1930;

while(anoCopa <= limite) {
    escreveMensagem('Teve copa em ' + anoCopa);
    anoCopa += 4;
}

escreveMensagem('FIM')