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

escreveTitulo('Convidados e VIPs');

function calculoCV() {
    var convidados = parseInt(prompt('Número de convidados?'));
    var vips = parseInt(prompt('Número de VIPs?'));

    var total = convidados + vips;
    escreveMensagem(total);
}

calculoCV()
