/* GERAL */
var tela = document.querySelector('canvas');
var pincel = tela.getContext('2d');
var quadroPontos = document.querySelector('#pontuacao');
var pontos = document.querySelector('input[type=number]');
/* */

// pincel.fillStyle = 'steelblue'
// pincel.fillRect(0, 0, 600, 400);

// VARIÁVEIS GLOBAIS
var raio = 10;
var xAleatorio;
var yAleatorio;
// var i = 0;


// DESENHA O ALVO
function desenhaCirculo(x, y, raio, cor) {
    pincel.fillStyle = cor
    pincel.beginPath();
    pincel.arc(x, y, raio, 0, 2 * Math.PI);
    pincel.fill()
}

function desenhaAlvo(x, y) {
    desenhaCirculo(x, y, raio + 20, 'red');
    desenhaCirculo(x, y, raio + 10, 'white');
    desenhaCirculo(x, y, raio, 'red');
}

// MOVE O ALVO
function sorteiaPos(max) {
    return Math.floor(Math.random() * max)
}

function atualizaTela() {
    limpaTela();
    xAleatorio = sorteiaPos(600);
    yAleatorio = sorteiaPos(400);
    desenhaAlvo(xAleatorio, yAleatorio);
}

function limpaTela() {
    pincel.clearRect(0, 0, 600, 400)
}

setInterval(atualizaTela, 1000);

// DISPARA
function dispara(evento) {

    var x = evento.pageX - tela.offsetLeft;
    var y = evento.pageY - tela.offsetTop;

    // lógica de acerto?
    if ((x > xAleatorio - raio) && (x < xAleatorio + raio) && (y > yAleatorio - raio) && (y < yAleatorio + raio)) {
        // alert('acertou')
        // i++;
        quadroPontos.innerHTML = 'Acertou: <br><br>';
        pontos.value++;
    }
}

tela.onclick = dispara;