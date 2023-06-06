var tela = document.querySelector('canvas');
var pincel = tela.getContext('2d');

// pincel.fillStyle = 'gray';
// pincel.fillRect(0, 0, 600, 400)

// CABEÇA
pincel.fillStyle = 'darkolivegreen';
pincel.fillRect(200, 50, 350, 300);

// OLHOS
pincel.fillStyle = 'black';
pincel.fillRect(250, 110, 90, 90)
pincel.fillRect(410, 110, 90, 90)

// NARIZ
pincel.fillRect(340, 200, 70, 100)

// BOCA
pincel.fillRect(300, 220, 40, 110)
pincel.fillRect(410, 220, 40, 110)


