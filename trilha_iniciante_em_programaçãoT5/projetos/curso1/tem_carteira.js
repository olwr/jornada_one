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

escreveTitulo('Pode dirigir?')

var suaIdade = parseInt(prompt('Qual é sua idade?'));
var carteira = prompt('Tem carteira? Responda com S ou N');
const podeDirigir = suaIdade >= 18 && carteira == 'S' ? 'Pode dirigir' : 'Não pode dirigir';
escreveMensagem(podeDirigir);