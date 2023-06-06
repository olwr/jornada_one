var tela = document.querySelector('canvas');
var pincel = tela.getContext('2d');

function desenhaQuadrado(x, y, cor) {
    pincel.fillStyle = cor;
    pincel.fillRect(x, y, 50, 50);
    // pincel.strokeStyle = 'honeydew';
    // pincel.strokeRect(x, y, 50, 50);
}

// var i = 0;
// while (i < 600) {
//     desenhaQuadrado(i, 0, 'steelblue');
//     i += 50;
// }

for (let i = 0; i < 600; i+= 50) {
    desenhaQuadrado(i, 0, 'steelblue');
}


/*
desenhaQuadrado(0, 0, 'steelblue')
desenhaQuadrado(50, 0, 'honeydew')
desenhaQuadrado(100, 0, 'thistle')
desenhaQuadrado(100, 50, 'thistle')
desenhaQuadrado(50, 50, 'honeydew')
desenhaQuadrado(0, 50, 'steelblue')
*/

// pincel.fillStyle = 'steelblue';
// pincel.fillRect(0, 0, 600, 400);

// pincel.fillStyle = 'thistle';
// pincel.fillRect(0, 0, 200, 400);

// pincel.fillStyle = 'darkseagreen';
// pincel.fillRect(400, 0, 200, 400);

// pincel.fillStyle = 'wheat';
// pincel.beginPath();
// pincel.moveTo(300, 200);
// pincel.lineTo(200, 400);
// pincel.lineTo(400, 400);
// pincel.fill()

// pincel.fillStyle = 'honeydew';
// pincel.beginPath();
// pincel.arc(300, 200, 50, 0, 2 * 3.14);
// pincel.fill()