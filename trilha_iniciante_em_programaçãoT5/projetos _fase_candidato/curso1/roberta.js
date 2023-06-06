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

escreveTitulo('Roberta não se cansa');

escreveMensagem('Pares de 0 - 100');
for (let i = 0; i <= 100;) {
    escreveMensagem(i);
    i += 2;
}
escreveMensagem('fim');

escreveMensagem('Contador 30 - 40, sem 33 e 37');
for (let i = 30; i <= 40; i++) {
    if (i == 33 || i == 37 ) {
        continue
    }
    escreveMensagem(i);
}
escreveMensagem('fim')

escreveMensagem('Todos de 20 - 0');
for (let i = 20; i >= 0; i--) {
    escreveMensagem(i);
}
escreveMensagem('fim')