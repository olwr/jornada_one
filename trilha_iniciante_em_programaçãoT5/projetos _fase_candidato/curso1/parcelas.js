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

var parcelas = [10.40, 40.00, 100.18, 200];
for(var i = 0; i < parcelas.length; i = i + 1) {
    escreveMensagem(parcelas[i]);
}
escreveMensagem("FIM");