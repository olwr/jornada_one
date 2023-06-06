var tela = document.querySelector('canvas');
var pincel = tela.getContext('2d');
var paleta = document.querySelector('input');
var btn = document.querySelector('button');

// pincel.fillStyle = 'steelblue'
// pincel.fillRect(0, 0, 600, 400);

function limpaTela() {
    pincel.clearRect(0, 0, 600, 400)
}

var x = 20;
y = 20;
var sentido = 1;
var cliquei = false;
var taxa = 10;

/* teclado */

var esquerda = 37;
var cima = 38;
var direita = 39;
var baixo = 40;

// document.onkeydown = function pressionaTecla(evento) {
//     console.log(evento.keyCode)
// }

document.onkeydown = function movimento(evento) {
    if (evento.keyCode == cima) {
        y -= taxa;
    } else if (evento.keyCode == baixo) {
        y += taxa;
    } else if (evento.keyCode == esquerda) {
        x -= taxa;
    } else if (evento.keyCode == direita) {
        x += taxa;
    }
}

/* */

function atualizaTela() {

    if (x > 600) {
        x = 599;
    } else if (x < 0) {
        x = 1
    }

    if (y > 400) {
        y = 399;
    } else if (y < 0) {
        y = 1;
    }

    if (cliquei) {
        limpaTela();
        desenhaCirculo(x, y, 10)
        // x += sentido;
    }

}

function desenhaCirculo(x, y, raio) {
    pincel.fillStyle = paleta.value;
    pincel.beginPath();
    pincel.arc(x, y, raio, 0, 2 * Math.PI);
    pincel.fill()
}

btn.onmousedown = () => {
    cliquei = true;
}
setInterval(atualizaTela, 20);