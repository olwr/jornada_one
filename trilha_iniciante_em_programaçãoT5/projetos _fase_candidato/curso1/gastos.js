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

// GASTOS
escreveTitulo('Gastos com a viagem');

var gastos = {
    passagem: 400,
    alimentacao: 200,
    hotel: 100,
    entretenimento: 300
};

var gastosTotal = gastos.passagem + gastos.alimentacao + gastos.hotel + gastos.entretenimento;

escreveMensagem("A média do valor gasto com as viagens é: " + gastosTotal / 4);