// ELEMENTOS HTML
var canvas = document.querySelector('canvas');
var pincel = canvas.getContext('2d');
var paleta = document.querySelector('#color-picker');
var btnReset = document.querySelector('#reset');
var btnCirculo = document.querySelector('#btn-circulo');
var btnQuadrado = document.querySelector('#btn-quadrado');
var btnFundo = document.querySelector('#btn-fundo');

// VARIÁVEIS
var raio = 10;
var a = 10;
var b = 10;
var desenha = false;
var formato = 'C';


canvas.onmousemove = desenhas

// FUNÇÕES DESENHA
function desenhas(evento) {
    let x = evento.pageX - canvas.offsetLeft;
    let y = evento.pageY - canvas.offsetTop;

    if (evento.shiftKey && evento.altKey) {
        alert('Só aperte uma tecla por vez');
    } else if (evento.shiftKey && raio + 5 <= 35) {
        raio += 5;
    } else if (evento.altKey && raio - 5 >= 10) {
        raio -= 5;
    }

    if (evento.shiftKey && evento.altKey) {
        alert('Só aperte uma tecla por vez');
    } else if (evento.shiftKey && a + b <= 120) {
        a += 5;
        b += 5;
    } else if (evento.altKey && a + b >= 40) {
        a -= 5;
        b -= 5;
    }

    if (desenha && formato == 'C') {
        pincel.fillStyle = paleta.value;
        pincel.beginPath();
        pincel.arc(x, y, raio, 0, 2 * Math.PI);
        pincel.fill();
    } else if (desenha && formato == 'Q') {
        pincel.fillStyle = paleta.value;
        pincel.fillRect(x, y, a, b)
    }
}

/*
function desenhaCirculo(evento) {
    let x = evento.pageX - canvas.offsetLeft;
    let y = evento.pageY - canvas.offsetTop;

    if (evento.shiftKey && evento.altKey) {
        alert('Só aperte uma tecla por vez');
    } else if (evento.shiftKey && raio + 5 <= 35) {
        raio += 5;
    } else if (evento.altKey && raio - 5 >= 10) {
        raio -= 5;
    }

    if (desenha) {
        pincel.fillStyle = paleta.value;
        pincel.beginPath();
        pincel.arc(x, y, raio, 0, 2 * Math.PI);
        pincel.fill();
    }
};

function desenhaQuadrado(evento) {
    let x = evento.pageX - canvas.offsetLeft;
    let y = evento.pageY - canvas.offsetTop;

    if (evento.shiftKey && evento.altKey) {
        alert('Só aperte uma tecla por vez');
    } else if (evento.shiftKey && a + b <= 120) {
        a += 5;
        b += 5;
    } else if (evento.altKey && a + b >= 40) {
        a -= 5;
        b -= 5;
    }

    if (desenha) {
        pincel.fillStyle = paleta.value;
        pincel.fillRect(x, y, a, b)
    }
}
*/

// AÇÕES, FUNÇÕES ARROW
canvas.onmousedown = () => {
    desenha = true;
};

canvas.onmouseup = () => {
    desenha = false;
};

btnReset.onclick = () => {
    pincel.clearRect(0, 0, 700, 500)
};

btnFundo.onclick = () => {
    pincel.fillStyle = paleta.value;
    pincel.fillRect(0, 0, 700, 500);
}

btnCirculo.onclick = () => {
    formato = 'C';
}

btnQuadrado.onclick = () => {
    formato = 'Q';
}