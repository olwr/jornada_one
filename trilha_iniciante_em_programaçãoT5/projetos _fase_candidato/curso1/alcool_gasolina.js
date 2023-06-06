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

escreveTitulo('<h3>Álcool ou Gasolina?</h3>');

var carro = {
    tanque: 40,
    kmGasolina: 480,
    kmAlcool: 300
};

var consumo = {
    consumoGasolina: carro.kmGasolina / carro.tanque,
    consumoAlcool: carro.kmAlcool / carro.tanque
};

escreveMensagem('O consumo de gasolina é: ' + consumo.consumoGasolina);
escreveMensagem('O consumo de álcool é: ' + consumo.consumoAlcool);