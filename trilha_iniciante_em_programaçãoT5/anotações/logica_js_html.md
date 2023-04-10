# JavaScript e HTML: desenvolva um jogo e pratique lógica de programação

- [JavaScript e HTML: desenvolva um jogo e pratique lógica de programação](#javascript-e-html-desenvolva-um-jogo-e-pratique-lógica-de-programação)
  - [Primeiros passos](#primeiros-passos)
      - [Convenções (boas práticas)](#convenções-boas-práticas)
  - [Começando com o HTML](#começando-com-o-html)
    - [Sintaxe básica](#sintaxe-básica)
      - [Estrutura do documento](#estrutura-do-documento)
  - [Começando com o JavaScript](#começando-com-o-javascript)
      - [Console do navegador](#console-do-navegador)
    - [Sintaxe básica](#sintaxe-básica-1)
    - [Variáveis](#variáveis)
    - [Operadores principais](#operadores-principais)
    - [Tipos de dados](#tipos-de-dados)
  - [DOM](#dom)
      - [Métodos para selecionar elementos](#métodos-para-selecionar-elementos)
      - [Métodos e propriedades para alterar elementos](#métodos-e-propriedades-para-alterar-elementos)
      - [Adicionando e excluindo elementos](#adicionando-e-excluindo-elementos)
    - [Funções e os eventos do DOM](#funções-e-os-eventos-do-dom)
      - [Tipos de funções](#tipos-de-funções)
      - [Eventos](#eventos)
    - [Hoisting](#hoisting)
  - [Manipulações](#manipulações)
    - [Strings](#strings)
    - [Números](#números)
    - [Concatenações](#concatenações)

## Primeiros passos

Para que o computador e navegador saibam qual a linguagem do arquivo, para que possa executar, ler e escrever de forma eficiente e correta, é preciso informar por meio da sua extensão.

| Tipo de arquivo                  | Extensão |
| -------------------------------- | -------- |
| Hypertext Markup Language (HTML) | .html    |
| Cascading Style Sheets (CSS)     | .css     |
| JavaScript (JS)                  | .js      |
| JavaScript Object Notation (JS)  | .json    |
| PHP                              | .php     |
| Java                             | .java    |
| Python                           | .py      |
| Markdown                         | .md      |
| Arquivo de Texto Simple          | .txt     |

#### Convenções (boas práticas)

O mundo da programação é cheio de convenções, nomear arquivos não é exceção. Nada impede que o programador nomeie da forma que quiser, todavia, será visto como algo fora das boas práticas e também há a possibilidade de que alguns sistemas, bancos de dados e outros softwares não aceitem o arquivo ou retorne erros.

A regra é clara:

- Somente letras minúsculas
  - index.html (bom)
  - INDEX.html (ruim)
- Sem espaços, estes sendo substituídos por hífen "-" ou underline "\_"
  - primeiro arquivo.txt (ruim)
  - primeiro_arquivo.txt (bom)
  - primeiro-arquivo.txt (bom)
- Sem caracteres especiais
  - texto\*dois.txt (ruim)
  - texto/dois.txt (ruim)
- Sem acentos
  - pagina.js (bom)
  - página.js (ruim)
- Evitar nomes muito longos
  - isso_e_curto.html (bom)
  - isso_nao_para_de_crescer_vc_nem_consegue_ler_direito.html (péssimo)

[Artigo Alura: convenções de nomenclatura em linguagens](https://www.alura.com.br/artigos/convencoes-nomenclatura-camel-pascal-kebab-snake-case)

## Começando com o HTML

Linguagem de marcação que funciona como a estrutura, o esqueleto, para construção mais básica de uma página web. É marcada pelo uso de **TAGs** que são instruções especiais a serem interpretadas pelo navegador.

### Sintaxe básica

Toda a TAG começa com `<` e termina com `>`. Por exemplo: `<h1>`, `<a>` e `<br>`. TAGs podem ou nem ter fechamento, muitas vezes para delimitar conteúdo. Todas as TAGs de fechamento acompanham o "/", como: `</h1>` e `</a>`.

```html
<tag-abertura atributo="valor"> conteúdo </tag-fechamento>

<h1 class="meu-titulo">Sintaxe</h1>
```

Algumas TAGs são self-closing, ou seja, não possuem par (abertura + fechamento). Como: `<img src="foto.png" />`, `<input type="number" />` e `<meta>`.

Não é case-sensitive, ou seja, TAGs podem ser escritas tanto em maiúsculo quanto minúsculo e ainda irá funcionar, porém, é de melhor prática que sejam todas em minúsculo. `XY = xy`.

```html
<h2>Funciona, mas é má prática</h2>
<h1>Funciona e é boa prática</h1>
```

Para registros, explicações e outros textos dentro da linguagem que não queremos que sejam executados, basta transforma-los em comentários.

```html
<!-- isso é um comentário -->
```

Por ser uma linguagem estática as modificações na página devem ser feitas diretamente no documento, não há dinamismo. Não é possível, por exemplo, capturar dados de um usuário ou exibir um contador com a passagem do tempo. Para acrescentar esse dinamismo, e começar a programar, é necessário o uso de outras linguagens.

#### Estrutura do documento

```html
<!DOCTYPE html>
<!-- diz ao navegador qual tipo de arquivo está sendo executado -->
<html lang="pt">
  <!-- tag html delimita o conteúdo do documento, atributo lang especifica o idioma do conteúdo -->
  <head>
    <!-- delimita o conteúdo meta do documento, o que é relevante para o navegador, servidor e desenvolvedores -->
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Documento</title>
    <!-- título da página -->
    <link rel="stylesheet" href="style.css" />
    <!-- linka o arquivo de estilos da página -->
    <!-- <style></style> pode ser usado para delimitar códigos de estilo dentro do html -->
    <!-- <link> pode ser usado para conectar com outros arquivos, bases, etc -->
  </head>
  <body>
    <!-- delimita o conteúdo que é visível na página -->
  </body>
  <script src=""></script>
  <!-- linka o arquivo para funcionalidades da página ou delimita o código dentro do html -->
</html>
```

## Começando com o JavaScript

Linguagem de programação (de scripting) que adiciona funcionalidade e comportamentos. Permite ao programador o controle de uma ou mais aplicações de terceiros, pode controlar alguns comportamentos dos navegadores através de trechos de código que são enviados na página HTML.

Outra característica comum nas linguagens de scripting é que normalmente elas são linguagens interpretadas, ou seja, não dependem de compilação para serem executadas. o JavaScript é interpretado e executado conforme é lido pelo navegador, linha a linha, assim como o HTML. Por este motivo, o programador deve ter cuidado ao escrever o código para que siga uma ordem coerente.

Também possui grande tolerância a erros, uma vez que conversões automáticas são realizadas durante operações, mas nem sempre essas conversões resultam em algo esperado, o que pode ser fonte de muitos bugs.

O script do programador é enviado com o HTML para o navegador, sendo ele envolvido dentro da tag `<script></script>` como código ou caminho de um arquivo externo. Pode ser declarada tanto no inicio quanto final no código, porém, é de melhor prática declara-lo no final, o que auxilia no melhor processamento da página, ocasiona uma melhor performance.

```html
<script type="text/javascript" src="script.js"></script>
</body>
</html>
```

É convenção da linguagem nomear variáveis em camelCase → primeiraSegunda.

#### Console do navegador

Existem várias formas de executar códigos JavaScript em uma página. Uma delas é executar códigos no console do navegador. Para usa-lo é só acessar a ferramenta de “developer tools” inspecionando o site, seja pelo mouse (clique direto + inspecionar elemento) ou por atalhos (f12, ctrl + shift + i, ctrl + shift + c).

![](../imgs/console.png)

É comum querermos dar uma olhada no valor de alguma variável ou resultado de alguma operação durante a execução do código. Quando estiver com o console aberto, não é necessário chamar console.log(nomeDaVariável); podemos chamar o nome da variável diretamente que ela será impressa no console.

O mesmo também pode apresentar avisos sobre erros e pode sar usado para analisar e modificar o código na execução sem modificar o arquivo fonte.

### Sintaxe básica

A linguagem lê linha por linha e segue o formato: de cima para baixo, da esquerda para a direita. Cada linha recebe 1 comando terminado em ";", porém, é possível omitir o ponto e vírgula no final de cada declaração. A omissão funciona no JavaScript devido ao mecanismo chamado **_automatic semicolon insertion_** (asi).

Comentários são definidos com `//`.

É case-sensitive, ou seja, compreende a mesma palavra como diferente se for apresentada com maiúsculo e minúsculo. `XY != xy != Xy != xY`.

```js
var a = 6;
alert("total: " + c);
var b = 5;
var c = a + b;  // ordem incorreta

------------------------------

var a = 6;
var b = 5;
var c = a + b;
ALERT"total: " + c; // ordem correta, mas sintaxe incorreta

------------------------------

var a = 6;
var b = 5;
var c = a + b;
alert("total: " + c); // ordem e sintaxe corretas
```

Valores do tipo string (texto) precisam ser rodeadas de aspas simples `''` ou duplas `""`. Valores números ou de outros tipos podem ser inserido sem aspas.

```js
alert("Isto sim é um programa");
```

![](../imgs/document-write.png)

### Variáveis

Armazena valores para uso posterior, é chamado pela palavra reservada `var` e usa o operador de atribuição `=` para receber valores.

Declarar um variável sempre resulta em **undefined**, até que seja “chamada” (usada) em outra parte do código e receba uma atribuição. Pode ser alterada se for declarada de novo com outro valor e/ou usando operações básicas com sintaxe compactada.

```js
> var idade = 20; // undefined
> idade = idade + 1 // 21

> idade
21
```

```js
> var idade = 10; // undefined
> idade += 10; // idade vale 20
> idade -= 5; // idade vale 15
> idade /= 3; // idade vale 5
> idade *= 10; // idade vale 50
```

### Operadores principais

Podemos somar, multiplicar, dividir e realizar comparações como em qualquer outra linguagem.

**Importante**

- = → Atribui valores

  - `x = 21 // x vale 21`
  - `y = '21' // y vale 21`

- == → Igual a algo. Devolve valores boolean

  - `x == y // 21 é igual a 21, retorna true`

- === → Igual em valor e tipo de valor. Devolve boolean
  - `x === y // número 21 é igual a texto 21, retorna false`

| Operador Aritmético | Descrição                  | Exemplo  |
| ------------------- | -------------------------- | -------- |
| +                   | Adição                     | `a + b`  |
| -                   | Subtração                  | `a - b`  |
| \*                  | Multiplicação              | `a * b`  |
| \*\*                | Exponenciação              | `a ** b` |
| /                   | Divisão                    | `a / b`  |
| %                   | Modulus (resto da divisão) | `a % b`  |
| ++                  | Incrementar                | `++a`    |
| --                  | Diminuir                   | `--a`    |

```js
> 13 + 21
34
> 10 - 4
6

> 14 * 3
42
> 25 / 5
5

> 23 % 2
1
```

As operações aritméticas seguem as regras de precedência da matemática para decidir o que é resolvido primeiro. Os parênteses tomam precedência sobre qualquer operador.

| Operador de Atribuição | Descrição                  | Exemplo   | O mesmo que: |
| ---------------------- | -------------------------- | --------- | ------------ |
| =                      | atribui valor              | `x = y`   | `x = y`      |
| +=                     | adiciona e atribui valor   | `x += y`  | `x = x + y`  |
| -=                     | subtrai e atribui valor    | `x -= y`  | `x = x - y`  |
| \*=                    | multiplica e atribui valor | `x *= y`  | `x = x * y`  |
| /=                     | divide e atribui valor     | `x /= y`  | `x = x / y`  |
| %=                     | modulus e atribui valor    | `x %= y`  | `x = x % y`  |
| \*\*=                  | eleva e atribui valor      | `x **= y` | `x = x ** y` |

| Operador de Comparação | Descrição                   | Exemplo                                      |
| ---------------------- | --------------------------- | -------------------------------------------- |
| ==                     | igual a                     | `n == m`                                     |
| ===                    | igual em valor e tipo a     | `n === m`                                    |
| !=                     | diferente a                 | `n != m`                                     |
| !==                    | diferente em valor e tipo a | `n !== m`                                    |
| >                      | maior que                   | `n > m`                                      |
| <                      | menor que                   | `n < m`                                      |
| >=                     | maior que ou igual a        | `n >= m`                                     |
| <=                     | menor que ou igual          | `n <= m`                                     |
| ?                      | operador ternário           | `n ? 'valor-para-true' : 'valor-para-false'` |

```js
x = 24;
y = "24" > x == y;
true > x === y;
false;

const idade = 26;
const bebida = idade >= 21 ? "Cerveja" : "Suco"; // 21 ? true : false
console.log(bebida); // "Cerveja"
```

### Tipos de dados

| Tipo      | O que é                                                                                  | Exemplo                                               |
| --------- | ---------------------------------------------------------------------------------------- | ----------------------------------------------------- |
| String    | texto, acompanhado de de aspas simples `''` ou duplas `""`                               | `nome = "what r u, a cop?"` `idade = "700"`           |
| Number    | números, usados principalmente para executar operações, não são acompanhados de de aspas | `x = 64` `y = 7.5`                                    |
| Null      | valor vazio                                                                              | `vazio = null`                                        |
| Boolean   | verdadeiro ou falso                                                                      | `gamer = true` `exp = false`                          |
| Objet     | contem vários valores, veem em pares de **nome:valor** separados por vírgula             | `pessoa = {primeiroNome:"José", segundoNome:"Silva"}` |
| Array     | lista de valores/elementos, acompanhado de [ ]                                           | `vazio = null`                                        |
| Date      | objeto de data                                                                           | `data = new Date("2022-03-25")`                       |
| Undefined | valor não definido/atribuído                                                             | `var x`                                               |
| NaN       | não é um número                                                                          | `var resultado = 10-"curso"; // retorna NaN`          |

Os tipos de dados do JavaScript são dinâmicos, ou seja, uma variável pode receber valores de tipos diferentes.

```js
let x; // agora x é undefined
x = 5; // agora x é um Number
x = "Jonas"; // agora x é uma String
```

---

## DOM

Para permitir alterações na página, ao carregar o HTML, os navegadores carregam em memória uma estrutura de dados que representa cada uma das nossas tags no JavaScript. Essa estrutura é chamada de DOM (**D**ocument **O**bject **M**odel) e pode ser acessada através da variável global `document`.

O termo “documento” é frequentemente utilizado em referência à nossa página, documento e página são sinônimos. Ao alterar os elementos da página, o navegador sincroniza as mudanças e altera a aplicação em tempo real.

O DOM modifica dinamicamente a estrutura do HTML, sem precisar atualiza-lo, pode:

- Adicionar/modificar/remover tags, textos, imagens e qualquer outro elemento no HTML
- Alterar estilos CSS da página
- Criar novos eventos
- Modificar/receber/mandar valores

#### Métodos para selecionar elementos

```js
// seleciona um elemento pelo seu ID
document.getElementById(#id)
// seleciona um elemento pelo nome da sua CLASSE
document.getElementByClassName(.class)
// seleciona um elemento pelo nome da TAG
document.getElementByTagName(name)
// seleciona um elemento por id, classe ou nome
document.querySelector("name")
// seleciona um ou mais elementos por id, classe ou nome
document.querySelectorAll("name[attr=val]")
```

```js
// seleciona um elemento pelo seu ID
document.getElementById(#formulario)
// seleciona um elemento pelo nome da sua CLASSE
document.getElementByClassName(.numeroTelefone)
// seleciona um elemento pelo nome da TAG
document.getElementByTagName(input)
// seleciona um elemento por id, classe ou nome
document.querySelector("#icon-btn")
// seleciona um ou mais elementos por id, classe ou nome
document.querySelectorAll("input[value=tel]")
```

#### Métodos e propriedades para alterar elementos

```js
// obtém ou altera qualquer elemento no html, inclusive tags
element.innerHTML;
// permite inserir textos no html
element.innerText;
// altera o valor de um elemento
element.attribute;
// altera o valor de um atributo de um elemento
element.setAttribute("atributo", "valor");
```

#### Adicionando e excluindo elementos

```js
// escreve no fluxo de saída
document.write();
// adiciona um elemento
document.appendChild();
// remove um elemento
document.removeChild();
// substitui um elemento
document.replaceChild();
// cria um elemento
document.createElement();
```

### Funções e os eventos do DOM

Apesar de ser interessante a possibilidade de alterar o documento todo por meio do JavaScript, é muito comum que as alterações sejam feitas quando o usuário executa alguma ação, como mudar o conteúdo de um botão ao clicar nele e não quando a página carrega, porém, por padrão, qualquer código no script é executado assim que o navegador o lê.

Para guardar um código que será executado somente quando ocorre um evento, como um de click, é necessário criar uma **função** e guardo-lo dentro dela. Após criada, o código nela só será executado quando a função for chamada, para isso, só é preciso utilizar seu nome seguido de parênteses `funcao()`.

Para que a função seja chamada quando um evento acontece, é preciso:

→ selecionar o elemento → definir o evento → declarar a função que será executada

```js
function enviarArquivo() {
  button.push;
} // cria uma função sem parâmetros que envia o arquivo

enviarArquivo(); // chama a função
```

Há 3 maneiras de chamar uma função quando o evento é executado:

```js
document.querySelector("#botaoEnviar").onclick = function enviarArquivo() {
  button.push;
};

//
var botao = document.querySelector("#botaoEnviar");
botao.onclick = enviarArquivo; // guarda função, +() executa automaticamente

//
<button onclick="enviarArquivo" id="botaoEnviar">
  Enviar
</button>;
```

Uma função pode ser chamada dentro de outra, ela também pode receber parâmetros. Se houver parâmetros, é necessário definir sua funcionalidade dentro da função e definir o seu valor toda vez que a função for chamada.

```js
function pulaLinha() {
  document.write("<br><br>");
}

function escreveMensagem(mensagem) {
  document.write(mensagem);
  pulaLinha();
}

function escreveTitulo(titulo) {
  document.write("<h3>" + titulo + "</h3>");
}

escreveTitulo("<h3>Porcentagem de acertos na prova</h3>");

var prova = {
  questoes: 50,
  acertos: 15,
  peso: 100,
};

var calculo = (prova.acertos / prova.questoes) * prova.peso;

escreveMensagem("Eu acertei: " + calculo + "% da prova");
```

Funções também atribuir valores a variáveis ao retornar dados, para isso, é necessário o uso da keyword `return` dentro da função seguido do que se deseja retornar. O JavaScript processa/executa a função, pega o valor e o retorna para a variável que, quando o recebe, guarda na memória.

```js
function calculaIMC(peso, altura) {
    var imc = peso / (altura * altura);
    console.log('O IMC é: ' + Math.round(imc));
    return imc
}

var meuIMC = calculaIMC(77.2, 1.65)
var seuIMC = calculaIMC(90, 1.71)
```

#### Tipos de funções

```js
// DECLARADA / NOMEADA
function exemplo() {
  // pode ser chamada, executada várias vezes
  console.log("");
}

// ANÔNIMA
element.addEventListener("click", function () {
  // só é executada nesse único momento
  console.log("");
});

// ARROW
element.addEventListener("click", () => {
  // função anônima, só é executada nesse único momento
  console.log("");
});
```

A diferença da função anônima para a declarada é que a declara pode ser chamada mais vezes por ter um nome. Uma função anônima só pode ser executada uma única vez, quando um gatilho for disparado.

#### Eventos

Existem diversos eventos que podem ser utilizados em elementos para que a interação do usuário dispare alguma função, entre eles temos:

```js
> elemento.oninput // quando um elemento input tem seu valor modificado
> elemento.onclick // quando ocorre um click com o mouse
> elemento.ondblclick // quando ocorre click duplo com o mouse
> elemento.onmousemove // quando o mouse é movido em cima do elemento
> elemento.onmousedown // quando aperta o botão do mouse
> elemento.onmouseup // quando solta o botão do mouse (útil com os dois acima para gerenciar drag'n'drop)
> elemento.onkeypress // quando pressionar e soltar uma tecla
> elemento.onkeydown // quando pressionar uma tecla
> elemento.onkeyup // quando soltar uma tecla
> elemento.onblur // quando um elemento perde foco
> elemento.onfocus // quando um elemento ganha foco
> elemento.onchange // quando um input, select ou textarea tem seu valor alterado
> elemento.onload // quando a página é carregada
> elemento.onunload // quando a página é fechada
> elemento.onsubmit // disparado antes de submeter o formulário (útil para realizar validações)
```

Existem também uma série de outros eventos mais avançados, como os que permitem a criação de interações para drag-and-drop, e até mesmo a criação de eventos customizados.

### Hoisting

A função pode ser chamada antes mesmo de ter sido declarada.

Hoisting permite a execução de funções antes das suas declarações, na prática, inicialmente as declarações de funções são colocadas na memória durante a fase de compilação e, mesmo assim, permanecem no mesmo lugar que estão digitadas. A razão pela qual o código funciona é que os mecanismos JavaScript movem a função para o início do escopo.

```js
console.log(soma(2, 5)); // 7
function soma(a, b) {
  return a + b;
}

/*=
function soma(a,b){
    return a + b
}
console.log(soma(2,5))
*/
```

A utilização de hoisting em `var` não é indicada, pois a variável criada é elevada para o escopo, mas sem o seu valor, assim retornando o valor `undefined`. O comportamento é parecido também ao usar var dentro de uma `function`.

```js
console.log(alura) // undefined
var alura = ‘cursos’;
```

Hoisting também não é indicado utilizando `let`, pois acontece outro tipo de comportamento não desejado. É reconhecido que o let existe, porém, não se consegue acessar sua declaração. Esse comportamento de Hoisting com `let` é o mesmo ao utilizar `const`.

````js
console.log(alura)
let alura = ‘cursos’;
// script.js:1 Uncaught ReferenceError: Cannot access 'alura' before initialization```
````

---

## Manipulações

### Strings

Uma variável que armazena uma string faz muito mais que isso, pode, por exemplo, retornar seu tamanho ou transformar seu valor.

```js
> var nome = "Oliver";
> nome.replace("v", "w");
Oliwer
```

String é imutável, ou seja, se a variável for impressa após chamar a função replace, o valor continuará sendo o original. Para obter uma string modificada é necessário que ela seja declarada novamente recebendo o retorno de cada função que a manipula.

```js
var nome = "Oliver";

// substitui a parte "v" por "w"
nome.replace("v", "w");
console.log(nome);
Oliver; // imprime Oliver, não mudou

nome = nome.replace("v", "w");
console.log(nome);
Oliwer; // imprime Oliwer, mudou
```

Strings podem ser convertidas para numbers.

```js
var textoInteiro = "10";
typeof textoInteiro; // "string"
var inteiro = parseInt(textoInteiro);
typeof inteiro; // "number"

var textoFloat = "10.22";
typeof textoFloat; // "string"
var float = parseFloat(textoFloat);
typeof float; // "number"
```

### Números

Number, assim como string, é imutável. O exemplo altera o número de casas decimais com a função `toFixed` e retornará uma string, mas primeiro tem que receber o retorno:

```js
var milNumber = 1000;
var milString = milNumber.toFixed(2); // recebe o retorno da função
console.log(milString); // imprime a string "1000.00"
```

### Concatenações

É possível concatenar tipos diferentes de valores e o JavaScript se encarregará de realizar a conversão entre os tipos, podendo resultar em algo não esperado.

```js
// string + string
var s1 = "Caelum";
var s2 = "Inovação";
console.log(s1 + s2); // imprime CaelumInovação

// string + number
var num1 = 2;
var num2 = 3;
var nome = "Caelum";

// O que ele imprimirá?

// Exemplo 1:
console.log(num1 + nome + num2); // imprime 2Caelum3

// Exemplo 2:
console.log(num1 + num2 + nome); // imprime 5Caelum

// Exemplo 3:
console.log(nome + num1 + num2); // imprime Caelum23

// Exemplo 4:
console.log(nome + (num1 + num2)); // imprime Caelum5

// Exemplo 5:
console.log(nome + num1 * num2); // imprime Caelum6
// A multiplicação tem precedência

var numString = "21";
var numInt = 11;
console.log(numString + numInt); // imprime 2111, conversão implícita do number para string
```
