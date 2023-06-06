var tela = document.querySelector('canvas');
var pincel = tela.getContext('2d');

function desenhaTexto(x, y, texto) {
    pincel.font = '15px MonoSpace';
    pincel.fillStyle = 'black';
    pincel.fillText(texto, x, y);
}

function desenhaRetangulo(x, y, largura, altura, cor) {
    pincel.fillStyle = cor;
    pincel.fillRect(x, y, largura, altura);
    pincel.strokeStyle = 'black';
    pincel.strokeRect(x, y, largura, altura);
}

function desenhaBarra(x, y, serie, cores, texto) {
    desenhaTexto(x, y - 10, texto);

    var somaAltura = 0;
    for (let i = 0; i < serie.length; i++) {
        let altura = serie[i];
        desenhaRetangulo(x, y + somaAltura, 50, altura, cores[i]);
        somaAltura = somaAltura + altura;
    }
}

var cores = ['blue', 'green', 'yellow', 'red'];
var serie2015 = [50, 25, 20, 5];
var serie2016 = [65, 20, 13, 2];

desenhaBarra(50, 50, serie2015, cores, '2015');
desenhaBarra(150, 50, serie2016, cores, '2016');



// function desenhaTexto(x, y, texto) {
//     pincel.font='15px MonoSpace' ;
//     pincel.fillStyle= cor;
//     pincel.fillText(x, y, texto);
// }

// function desenhaRetangulo(x, y, largura, altura, cor) {
//     pincel.fillStyle = cor;
//     pincel.fillRect(x, y, largura, altura);
//     pincel.strokeStyle = 'black';
//     pincel.strokeRect(x, y, largura, altura);
// }

// function desenhaBarra(x, y, serie, cores, texto) {
//     pincel.fillStyle = cores;
//     pincel.fillRect(x, y, serie, texto);

//     desenhaTexto(x, y - 10, texto);

//     var somaAltura = 0;
//     for (let i = 0; i < serie.length; i++) {
//         var altura = serie[i];
//         desenhaRetangulo(x, y + somaAltura, 50, altura, cores[i]);
//         somaAltura = somaAltura + altura;
//     }
// }

// var serie2015 = [50, 25, 20, 5];
// var serie2016 = [65, 20, 13, 2];
// var cores = ['blue', 'green', 'yellow', 'red'];

// desenhaBarra(50, 50, serie2015, cores, '2015');
// desenhaBarra(150, 50, serie2016, cores, '2016');