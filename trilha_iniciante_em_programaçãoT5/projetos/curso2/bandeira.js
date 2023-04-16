var tela = document.querySelector('canvas');
var pincel = tela.getContext('2d');

var mostraBandeira1 = true;

function desenhaBandeira1() {
    // FUNDO
    pincel.fillStyle = 'olivedrab';
    pincel.fillRect(0, 0, 600, 400);

    // LOSANGO
    pincel.fillStyle = 'khaki'
    pincel.beginPath();
    pincel.moveTo(300, 50);
    pincel.lineTo(50, 200);
    pincel.lineTo(550, 200);
    pincel.fill();

    pincel.fillStyle = 'khaki'
    pincel.beginPath();
    pincel.moveTo(300, 350);
    pincel.lineTo(50, 200);
    pincel.lineTo(550, 200);
    pincel.fill();

    // CÍRCULO
    pincel.fillStyle = 'steelblue';
    pincel.beginPath();
    pincel.arc(300, 200, 100, 0, 2 * Math.PI);
    pincel.fill()
}

function desenhaBandeira2() {
    // FUNDO
    pincel.fillStyle = 'black';
    pincel.fillRect(0, 0, 600, 400);

    // LOSANGO
    pincel.fillStyle = 'crimson'
    pincel.beginPath();
    pincel.moveTo(300, 50);
    pincel.lineTo(50, 200);
    pincel.lineTo(550, 200);
    pincel.fill();

    pincel.fillStyle = 'crimson'
    pincel.beginPath();
    pincel.moveTo(300, 350);
    pincel.lineTo(50, 200);
    pincel.lineTo(550, 200);
    pincel.fill();

    // CÍRCULO
    pincel.fillStyle = 'gold';
    pincel.beginPath();
    pincel.arc(300, 200, 100, 0, 2 * Math.PI);
    pincel.fill()
}

function trocaBandeira() {
    if(mostraBandeira1) {
        desenhaBandeira1();
    } else {
        desenhaBandeira2();
    }
    mostraBandeira1 = !mostraBandeira1; // ! operador lógico NOT
}

setInterval(trocaBandeira, 2500)