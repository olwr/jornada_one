var tela = document.querySelector('canvas');
var pincel = tela.getContext('2d');

function desenhaTexto(texto, cor, x, y) {
    pincel.font='20px MonoSpace' ;
    pincel.fillStyle= cor;
    pincel.fillText(texto, x, y);
}

function desenhaQuadrado(x, y, tamanho, cor) {
    pincel.fillStyle = cor;
    pincel.fillRect(x, y, tamanho, tamanho);
    pincel.strokeStyle = 'black';
    pincel.strokeRect(x, y, tamanho, tamanho);
}

for (let i = 50; i < 350; i+=100) {
    let y = 50;
    desenhaQuadrado(i, y, 100, 'green')
    desenhaQuadrado(i, y, 100, 'green')
    desenhaQuadrado(i, y, 100, 'green')
    desenhaQuadrado(i, y, 100, 'green')
}

desenhaTexto('Qual a função?', 'steelblue', 50, 30);
