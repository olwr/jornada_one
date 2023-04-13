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

escreveTitulo('Média de idades: Familiares');

var totalParentes = parseInt(prompt('Quantas familiares você tem?'));
var totalIdades = 0;

for (let i = 0; i < totalParentes; i++) {
    var idades = parseInt(prompt('Informe a idade do seu familiar:'));
    totalIdades += idades;
};

var mediaIdadesParentes = totalIdades/totalParentes;
escreveMensagem('A média de idades dos familiares é: ' + mediaIdadesParentes.toFixed(1));