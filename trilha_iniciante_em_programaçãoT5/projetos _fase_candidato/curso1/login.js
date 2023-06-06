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

escreveTitulo('Login');

var loginCadastrado = 'alura';
var senhaCadastrada = 'alura123';

var loginInformado = prompt('Informe seu login:');
var senhaInformada = prompt('Informe sua senha:');

for (let i = 3;  i > 0; i--) {
    if (loginCadastrado == loginInformado && senhaCadastrada == senhaInformada) {
        escreveMensagem('Bem-vindo ao sistema ' + loginInformado);
        break
    } else if (loginCadastrado != loginInformado) {
        alert('Usuário inválido. Tente novamente');
        alert('Você tem mais ' + i + ' tentativas');
        loginInformado = prompt('Informe seu login:');
        senhaInformada = prompt('Informe sua senha:');
        continue
    } else {
        alert('Senha inválida. Tente novamente');
        alert('Você tem mais ' + i + ' tentativas');
        loginInformado = prompt('Informe seu login:');
        senhaInformada = prompt('Informe sua senha:');
        continue
    }
}