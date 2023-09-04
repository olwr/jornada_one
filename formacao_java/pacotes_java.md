# Pacotes Java

- [Pacotes Java](#pacotes-java)
  - [Criação de Pacotes](#criação-de-pacotes)
    - [Modificadores de Acesso](#modificadores-de-acesso)
  - [Javadoc](#javadoc)
    - [Sintaxe](#sintaxe)
  - [JAR](#jar)
  - [Maven](#maven)
  - [java.lang](#javalang)
  - [String e Imutabilidade](#string-e-imutabilidade)
    - [StringBuilder](#stringbuilder)
  - [Object](#object)
    - [toString()](#tostring)


## Criação de Pacotes

Os pacotes no Java são uma forma de categorizar as classes e interfaces, sendo um grupo de classes relacionadas, pense em um pacote como uma pasta em um diretório. A declaração de um pacote deve ser a primeira declaração no código e só pode haver uma, após ela segue, as declarações de importação (se houver) e, por fim, as classes.

Ao criar um pacote, é preciso escolher um nome para o pacote e incluir um `package` juntamente com esse nome no topo de cada arquivo de origem que contém as classes, interfaces, enumerações e tipos de anotação que você deseja incluir no pacote.

O seguimento do padrão das nomeações é o endereço web, porém, ao contrário: domínio → sub-domínio → nome da empresa → nome do projeto → nome das pastas específicas.

```java
package NOME_DO_SITE_AO_CONTRARIO.NOME_DO_PROJETO
```

![Alt text](imgs/nomea%C3%A7%C3%A3o_package.png)

São usados principalmente para evitar conflitos de nomeação e escrever um código de fácil manutenção.

São divididos em duas categorias:

- Built-in (pacotes Java API)
- User-defined (criados pelo usuário)

Existem duas maneiras de usar arquivos localizados em um pacote dentro de outro:

- Importando ↓

```java
import nomePacote.Arquivo;   // importa somente um único arquivo
import nomePacote.*;   // importa todo o pacote
```

A instrução de importação é uma maneira de fornecer a localização adequada para o compilador encontrar essa classe específica.

- Full Qualified Name FQN ↓

```java
// inclui o pacote e o nome da classe
nomePacote.NomeSimplesClasse
```

Se um nome totalmente qualificado, o que inclui o nome do pacote e o nome da classe, for fornecido, o compilador pode localizar facilmente o código-fonte ou as classes.

### Modificadores de Acesso

4 principais, na ordem de mais restritivo (menos visibilidade/acesso) para menos restritivo (mais visibilidade/acesso):

- `private`
  - visível apenas na classe
- `default` ou `<<package private>>` 
  - visível na classe E em qualquer outro membro do mesmo pacote
- `protected`
  - visível na classe E em qualquer outro membro do mesmo pacote E para qualquer filho
- `public`
  - visível em qualquer pacote

## Javadoc

É um gerador de documentação criado para documentar a API dos programas em Java, a partir do código-fonte. O resultado é uma expressão em HTML.

Apenas os membros com modificador de acesso público são contemplados, os outros são  considerados detalhes da implementação e não podem ser utilizados por outras classes.

### Sintaxe 

```java
/**
 * texto aqui
 * 
 * @tagespecial
 * @author Oliver 
 * @version 0.1
 */
```

Lista completa de anotações ↓

```java
/**
 * @author (usado na classe ou interface)
 * @version (usado na classe ou interface)
 * @param (usado no método e construtor)
 * @return (usado apenas no método)
 * @exception ou @throws (no método ou construtor)
 * @see
 * @since
 * @serial
 * @deprecated
 */
```

As tags do Javadoc existem apenas para padronizar alguns dados fundamentais do código fonte como o autor e a versão.

## JAR

O jeito mais simples de trabalhar com um conjunto de classes é compactá-lo em um arquivo só. O formato de compactação padrão é o ZIP com a extensão do arquivo compactado JAR.

> O arquivo JAR, ou **J**ava **AR**chive, tem um conjunto de classes (e arquivos de configurações) compactado, no estilo de um arquivo zip. O arquivo jar pode ser criado com qualquer compactador zip disponível no mercado, inclusive com o programa jar que vem junto com o JDK.

Qualquer biblioteca ou projeto vai usar JAR(s) para distribuir o código Java.

## Maven

## java.lang

É um pacote que oferece classes fundamentais para o design da linguagem Java. Nela se encontram interfaces, classes, enums, exceções, erros e anotações.

Como não há como criar um código Java sem este pacote, sua importação é automática, dispensando a declaração dela nos projetos. A declaração de importação é possível, mas não é necessário.

As classes mais importantes são `Object`, que é a raz da hierarquia de classe, e `Class`, instância que representa classes em tempo de execução.

Frequentemente é necessário representar um valor primitivo como se fosse um objeto. As classes `Boolean`, `Character`, `Integer`, `Long`, `Float` e `Double` servem para este propósito. Por exemplo, um objeto do tipo `Integer` contem um campo que o tipo é `int`, representando o valor de tal maneira que uma referência a ela pode ser armazenada em uma variável do tipo de referência.

Essas classes também oferecem diversos métodos de conversão entre valores primitivos.

A classe `Void` é uma classe que não permite instância que guarda uma referência para um objeto da Classe representando o tipo `void`.

A classe `Math` oferece funções matemáticas comumente usadas como seno, cosseno e raiz. As classes `String`, `StringBuffer` e `StringBuilder` similarmente oferecem operações comuns em caracteres de string. 

Classes `ClassLoader`, `Process`, `ProcessBuilder`, `Runtime`, `SecurityManager` e `System` oferecem "operações de sistema" que gerenciam o carregamento dinâmico de classes, a criação de processos externos, consultas de ambientes host como horário do dia, e a aplicação de políticas de segurança.

A classe `Throwable` agrupa objetos que podem usar a declaração `throw`. Suas subclasses representam `erros` e `exceptions`.

## String e Imutabilidade

```java
String nome = "Alura"; // object literal

String outro = new String("Alura"); // funciona, mas é má prática
```

A classe `String` representa uma sequência de caracteres. Todos os literais de sequência de caracteres em programas Java, como "abc", são implementados como instâncias desta classe. Strings são constantes; seus valores não podem ser alterados uma vez criados.

Por serem imutáveis, objetos String podem ser compartilhados.

```java
String str = "abc";

// é equivalente a:

char data[] = {'a', 'b', 'c'};
String str = new String(data);
```

```java
System.out.println("abc");
String cde = "cde";
System.out.println("abc" + cde);
String c = "abc".substring(2,3);
String d = cde.substring(1, 2);
```

A classe inclui métodos para examinar caracteres individuais da sequência, comparação entre strings, pesquisar strings, extrair substrings, e para criar cópias da string com caracteres traduzidos para lowercase ou uppercase.

Alguns métodos importantes:

`replace()` → substitui um caractere ou sequência.

```java
String nome = "Oliver";
// é preciso criar outra variável
String outroNome = nome.replace("r","ro");
System.out.println(outroNome); // Olivero
```

`toLowerCase()` → cópia com caracteres traduzidos para lowercase.

```java
String nome = "Oliver";
// é preciso criar outra variável
String outroNome = nome.toLowerCase();
System.out.println(outroNome); // oliver
```

`toUpperCase()` → cópia com caracteres traduzidos para uppercase.

```java
String nome = "Oliver";
// é preciso criar outra variável
String outroNome = nome.toUpperCase();
System.out.println(outroNome); // OLIVER
```

`isEmpty()` → retorna um boolean dizendo se a string está vazia ou não. Espaços contam como conteúdo.

```java
String vaziaComEspaco = " ";
String vazia = vaziaComEspaco.trim();

// com espaço == false, sem espaço == true
System.out.println(vaziaComEspaco.isEmpty()); // false
System.out.println(vazia.isEmpty()); // true
```

`charAt()` → devolve um char na posição indicada.

```java
String nome = "Oliver";
System.out.println(nome.charAt(2)); // i
```

`indexOf()` → devolve um int com o index/posição do char/substring.

```java
String nome = "Oliver";
System.out.println(nome.indexOf("v")); // 3
```

`substring()` → devolve uma substring que se origina da string.

```java
String nome = "Oliver";
System.out.println(nome.substring(1, 4)); // liv
```

`length()` → devolve um int com o tamanho da string.

```java
String nome = "Oliver";
System.out.println(nome.length()); // 6

for (int i = 0; i < nome.length(); i++) {
  System.out.println(nome.charAt(i));
} // O l i v e r
```

`contains()` → devolve um boolean que diz se um char/substring é contido dentro da string.

```java
String nome = "Oliver";
System.out.println(nome.contains("vero")); // false
System.out.println(nome.contains("r")); // true
```

### StringBuilder

`String` é especial por gerar objetos imutáveis. Pensando no design, isso é algo benéfico, mas acaba perdendo pontos em questão de desempenho. O uso de aspas duplas na criação nasce para que o JVM contorne os problemas de desempenho com otimizações.

Um problema enfrentado por essa classe é que qualquer mudança em uma string precisa ser feito ou no objeto original (o que pode não ser o que o programador quer), ou com a criação de mais um para vários novos objetos.

Como um exemplo, essa concatenação:

```java
String texto = "Socorram"; // objeto original
texto = texto.concat("-"); // nova criação/atribuição
texto = texto.concat("me"); // nova criação/atribuição
texto = texto.concat(", "); // nova criação/atribuição
texto = texto.concat("subi "); // nova criação/atribuição
texto = texto.concat("no "); // nova criação/atribuição
texto = texto.concat("ônibus "); // nova criação/atribuição
texto = texto.concat("em "); // nova criação/atribuição
texto = texto.concat("Marrocos"); // nova criação/atribuição
System.out.println(texto); 
```

Para resolver situações como essa foi criada a classe `StringBuilder` que, por ser mutável, usa a mesma referência, sem novas atribuições. Isso ajuda na concatenação e inserção de caracteres numa sequência

```java
StringBuilder builder = new StringBuilder("Socorram"); // objeto original
builder.append("-"); // mesma referência
builder.append("me"); // mesma referência
builder.append(", "); // mesma referência
builder.append("subi "); // mesma referência
builder.append("no "); // mesma referência
builder.append("ônibus "); // mesma referência
builder.append("em "); // mesma referência
builder.append("Marrocos"); // mesma referência
String texto = builder.toString(); // novo objeto
System.out.println(texto);
```

Ambas classes implementam a interface `CharSequence`, ou seja, tem métodos que recebem o tipo. Dessa forma é possível trabalhar de maneira compatível com as duas classes, baseado numa interface comum.

```java
String nome = "ALURA";
CharSequence cs = new StringBuilder("al");

nome = nome.replace("AL", cs);

System.out.println(nome); // alURA
```

## Object

Analisando `System.out.println("Alura")`:

- `System` → classe, java.lang, acesso público.
- `out` → atributo, público, referência, static.
- `println` → método, público, não estático, sobrecarga, não joga exceções do tipo checked.

Todas as classes estendem automaticamente da classe `Object`, ela é basicamente a classe mãe, o topo da hierarquia de herança. Dessa forma, todas as classes criadas já vem com alguns métodos disponíveis por padrão, eles são os métodos genéticos, como `toString`.

Qualquer objeto pode ser referenciado pelo tipo Object, já que ela é a principal.

### toString()

É boa prática sobrescrever o método para dar um significado maior do que a saída padrão desse método. Mas o método `toString` originalmente devolve informações sobre o estado do objeto. É útil para a depuração no desenvolvimento.