// ACERTOS POR PROVA CÁLCULO
// let btnProva = document.querySelector('#btn-prova')

document.querySelector('#btn-prova').onclick = function calcularProva() {
    let resultadoProva = document.querySelector('#resultado-prova')

    let inputProvaQ = document.querySelector('#prova-q').value
    let inputProvaA = document.querySelector('#prova-a').value

    const calculo = (inputProvaA / inputProvaQ) * 100
    resultadoProva.innerHTML = 'Você acertou ' + calculo.toFixed(2) + '%'
    return calcularProva
}

// IMC
document.querySelector('#btn-imc').onclick = function calcularIMC() {
    let resultadoImc = document.querySelector('#resultado-imc')

    let inputPeso = document.querySelector('#imc-peso').value
    let inputAltura = document.querySelector('#imc-altura').value

    const imc = inputPeso / (inputAltura * inputAltura)
    resultadoImc.innerHTML = 'O seu IMC É: ' + imc.toFixed(2) + '. '

    let limiteBaixo = 18.5;
    let limiteAlto = 35;

    if (imc < limiteBaixo) {
        resultadoImc.innerHTML += 'Você está abaixo do recomendado por: ' + (limiteBaixo - imc).toFixed(2);
    } else if (imc > limiteAlto) {
        resultadoImc.innerHTML += 'Você está acima do recomendado por: ' + (imc - limiteAlto).toFixed(2);
    } else {
        resultadoImc.innerHTML += 'Você está na faixa recomendada com ' + (imc - limiteBaixo).toFixed(2) + ' acima do limite aceitável do menor IMC e com ' + (limiteAlto - imc).toFixed(2) + ' abaixo do limite aceitável do maior IMC';
    }
    return calcularIMC
}

// INGREDIENTES
document.querySelector('#btn-ingrediente').onclick = function adicionarIngredientes() {
    let listaIngredientes = new Array()
    let inputIngredientes = document.querySelector('#ingrediente').value
    let existe = false

    for (var pos = 0; pos < listaIngredientes.length; pos++) {
        if (listaIngredientes[pos] == inputIngredientes) {
            existe = true;
            break
        }
    }

    if (existe == false) {
        listaIngredientes.push(inputIngredientes)
        inputIngredientes.value = " "
    }

    let resultadoReceita = document.querySelector('#resultado-receita')
    resultadoReceita.innerHTML += listaIngredientes
    // return calcularMediaGastos
}
