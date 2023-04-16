var tela = document.querySelector('canvas');
var pincel = tela.getContext('2d');

function desenhaEsquadro(xa, ya, xc, yc, cor) {
    pincel.fillStyle = cor
    pincel.beginPath();
    pincel.moveTo(xa, ya);
    pincel.lineTo(xa, yc);
    pincel.lineTo(xc, yc);
    pincel.fill();
    pincel.fillStyle = 'white'
    pincel.beginPath();
    pincel.moveTo((6 * xa + xc) / 7, (9 * ya + 5 * yc) / 14);
    pincel.lineTo((6 * xa + xc) / 7, (ya + 6 * yc) / 7);
    pincel.lineTo((5 * xa + 9 * xc) / 14, (ya + 6 * yc) / 7);
    pincel.fill();
}

/*
function desenhaEsquadro(xa, ya, xc, yc, cor) {
    pincel.fillStyle = cor;
    pincel.beginPath();
    pincel.moveTo(xa, ya);
    pincel.lineTo(xa, yc);
    pincel.lineTo(xc, yc);
    pincel.fill()
}
*/

desenhaEsquadro(50, 50, 400, 400, 'steelblue');
desenhaEsquadro(100, 175, 275, 350, 'honeydew');

/*
// TRIÂNGULO MAIOR
pincel.fillStyle = 'steelblue'
pincel.beginPath();
pincel.moveTo(50, 50);
pincel.lineTo(400, 400);
pincel.lineTo(50, 400);
pincel.fill();

// TRIÂNGULO MENOR
pincel.fillStyle = 'honeydew';
pincel.beginPath();
pincel.moveTo(100, 175);
pincel.lineTo(275, 350);
pincel.lineTo(100, 350);
pincel.fill()
*/