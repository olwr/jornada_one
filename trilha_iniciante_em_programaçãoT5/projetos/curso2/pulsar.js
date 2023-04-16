var tela = document.querySelector('canvas');
var pincel = tela.getContext('2d');
var paleta = document.querySelector('input');
var btn = document.querySelector('button');

pincel.fillStyle = 'steelblue'
pincel.fillRect(0, 0, 600, 400);

function limpaTela() {
    pincel.clearRect(0, 0, 600, 400)
}

function desenhaCirculo(x, y, raio) {
    pincel.fillStyle = paleta.value;
    pincel.beginPath();
    pincel.arc(x, y, raio, 0, 2 * Math.PI);
    pincel.fill()
}

var raio = 19;
var tamanho = 1;

function atualizaTela() {

    if (raio < 20) {
        tamanho = 1;
    } else if (raio > 30) {
        tamanho = -1
    }

    if (cliquei) {
        limpaTela();
        desenhaCirculo(275, 175, raio)
        raio += tamanho;
    }

}

btn.onmousedown = () => {
    cliquei = true;
}

setInterval(atualizaTela, 15);