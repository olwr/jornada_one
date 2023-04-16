var tela = document.querySelector('canvas');
var pincel = tela.getContext('2d');

function desenhaCirculo(x, y, raio, cor) {
    pincel.fillStyle = cor;
    pincel.beginPath();
    pincel.arc(x, y, raio, 0, 2 * Math.PI);
    pincel.fill()
}

function desenhaFlor(x, y) {
    desenhaCirculo(x, y+30, 15, 'steelblue');
    desenhaCirculo(x, y, 15, 'gold');
    desenhaCirculo(x, y-30, 15, 'steelblue');
    desenhaCirculo(x - 30, y, 15, 'steelblue');
    desenhaCirculo(x + 30, y, 15, 'steelblue');
}

desenhaFlor(300, 200);