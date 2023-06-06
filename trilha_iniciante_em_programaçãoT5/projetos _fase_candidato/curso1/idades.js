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

escreveTitulo('<h3>Idades</h3>')

var ano = 2023

var Oliwer = { nome: 'Oliwer', idade: (ano - 2002) };
var Nick = { nome: 'Nick', idade: (ano - 2007) };
var Lucy = { nome: 'Lucy', idade: (ano - 1992) };
var Lena = { nome: 'Lena', idade: (ano - 1973) };
var Mike = { nome: 'Mike', idade: (ano - 1971) };

escreveMensagem('A idade do ' + Oliwer.nome + ' é: ' + Oliwer.idade + ' anos')
escreveMensagem('A idade do ' + Nick.nome + ' é: ' + Nick.idade + ' anos')
escreveMensagem('A idade da ' + Lucy.nome + ' é: ' + Lucy.idade + ' anos')
escreveMensagem('A idade da ' + Lena.nome + ' é: ' + Lena.idade + ' anos')
escreveMensagem('A idade do ' + Mike.nome + ' é: ' + Mike.idade + ' anos')
var mediaDeIdades = ((Oliwer.idade + Nick.idade + Lucy.idade + Lena.idade + Mike.idade) / 5);

escreveMensagem('A média das idades é: ' + Math.round(mediaDeIdades));