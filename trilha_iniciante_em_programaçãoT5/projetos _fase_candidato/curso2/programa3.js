var tela = document.querySelector('canvas');
var pincel = tela.getContext('2d');
var paleta = document.querySelector('input')
var btn = document.querySelector('button[type=reset]')

// pincel.fillStyle = 'steelblue';
// pincel.fillRect(0, 0, 600, 400);

// var cores = ['black', 'honeydew', 'gold'];
// var indiceCor = 0;
var raio = 10;
var desenha = false;

tela.onmousemove = function desenhaBolinha(evento) {
    var x = evento.pageX - tela.offsetLeft;
    var y = evento.pageY - tela.offsetTop;

    if (evento.shiftKey && evento.altKey) {
        alert('Só aperte uma tecla por vez')
    } else if (evento.shiftKey && raio + 10 <= 40) {
        raio += 10;
    } else if (evento.altKey && raio - 5 >= 10) {
        raio -= 5;
    }

    if (desenha) {
        pincel.fillStyle = paleta.value;
        pincel.beginPath();
        pincel.arc(x, y, raio, 0, 2 * Math.PI);
        pincel.fill()
    }
}

tela.onmousedown = () => {
    desenha = true;
}

tela.onmouseup = () => {
    desenha = false;
}

btn.onclick = () => {
    pincel.clearRect(0, 0, 600, 400)
}

// tela.oncontextmenu = function mudaCor() {
//     indiceCor++;
//     if (indiceCor >= cores.length) {
//         indiceCor = 0;
//     }
//     return false
// }