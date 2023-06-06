/*

Arquivo usado junto a aula para acompanhar exemplos e testar por conta

*/

function pulaLinha() {
    document.write('<br><hr><br>');
}

function escreveMensagem(mensagem) {
    document.write(mensagem);
    pulaLinha();
}

function sorteia(n) {
    return Math.round(Math.random() * n);
}

function segredosLista(quantidade) {
    var segredos = new Array();
    var i = 0;
    while (i < quantidade) {
        var numeroSecreto = sorteia(10);
        var achou = false;

        for (let pos = 0; pos < segredos.length; pos++) {
            if (segredos[pos] == numeroSecreto) {
                achou == true;
                break
            }
        }

        if (achou == false) {
            segredos.push(numeroSecreto);
            i++
        }
    }
    return segredos;
}

var segredos = segredosLista(5);
console.log(segredos)
// var chute = parseInt(prompt('Digite seu chute:'));
var entrada = document.querySelector('input');
// var saida = document.querySelector('button');

document.querySelector('button').onclick = function verifica(){
    var achou = false;

    for (let i = 0; i <segredos.length; i++) {
        if (entrada.value == segredos[i]) {
            alert('Acertou');
            achou = true;
            break
        }
    }

    if (achou == false) {
        alert('Errou')
    }

    entrada.value = "";
    entrada.focus();
}
