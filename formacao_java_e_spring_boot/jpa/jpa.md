# Java e JPA (temporário)

- [Java e JPA (temporário)](#java-e-jpa-temporário)
  - [JDBC e seus Problemas](#jdbc-e-seus-problemas)
  - [JPA e Hibernate](#jpa-e-hibernate)
  - [Configurações e EntityManager](#configurações-e-entitymanager)
    - [persistence.xml](#persistencexml)
    - [Simplificando entidades com Embeddable](#simplificando-entidades-com-embeddable)
  - [Mapeando Entidades](#mapeando-entidades)
    - [Mapeamento de Relacionamentos](#mapeamento-de-relacionamentos)
    - [Mapeamento de Herança](#mapeamento-de-herança)
    - [Mapeamento de Chaves Compostas](#mapeamento-de-chaves-compostas)
  - [Ciclo de Vida de uma Entidade](#ciclo-de-vida-de-uma-entidade)
  - [Consultas com JPQL](#consultas-com-jpql)
    - [Performance de Consultas](#performance-de-consultas)
  - [Criteria API](#criteria-api)

## JDBC e seus Problemas

Utilizar o JDBC implica em escrever um código de difícil manutenção

JDBC aumenta o acoplamento do código

## JPA e Hibernate

JPA é uma especificação e Hibernate é uma de suas implementações

## Configurações e EntityManager

### persistence.xml

Então, a tag persistence-unit, tem que ficar dentro da tag raiz persistence, e dentro da tag persistence-unit que vão todas as configurações da nossa aplicação. Vamos pensar no persistence-unit como se ele fosse um banco de dados.

Se a nossa aplicação fosse trabalhar com dois, três bancos de dados, deveríamos ter, dentro da tag persistence, duas ou três tags persistence-unit. Ou seja, é um persistence-unit para cada banco de dados.

### Simplificando entidades com Embeddable

## Mapeando Entidades

Entidade é É uma classe que faz o mapeamento de uma tabela do banco de dados.

A partir da versão 2.0 da JPA, podemos fazer tudo via anotações. Então, em cima da classe, podemos colocar uma anotação da JPA que é o @Entity. Assim, é como se disséssemos: JPA, está vendo essa classe Produto? Ela é uma entidade, ou seja, existe uma tabela no banco de dados que está mapeando, e que é o espelho dessa classe. Então, é para isso que serve essa anotação @Entity.

Eventualmente, se o nome da tabela não for o mesmo da entidade, teremos que ensinar isso para a JPA, porque, por padrão, ela considera que o nome da tabela é o mesmo nome da entidade (no nosso caso, não é). Para fazer essa configuração, adicionaremos mais uma anotação em cima da classe que é o @Table. Apertaremos "Ctrl + Shift + O" para importar e, de novo, selecionaremos javax.persistence.Table.

Na anotação @Table, abriremos parênteses, selecionaremos o atributo name:String - Table com a qual passaremos o nome da tabela que é name = "produtos".

Neste caso, nós colocaríamos, em cima do atributo, uma anotação chamada @Column (e apertaríamos "Ctrl + Shift + O" para importar). Da mesma maneira, existe uma atributo chamado name, seguido dele, passaríamos o nome da coluna no banco de dados "desc". Ou seja, "Column(name = "desc"). É como se disséssemos para a JPA: o nome do atributo é descricao, mas o nome da coluna, @Column, é desc.

Só temos mais um detalhe importante para a JPA. No banco de dados, a coluna "id" é a chave primária. Nós precisamos informar qual é a "primary key", a chave primária da tabela no mundo relacional. Também precisamos informar para a JPA que, dos quatro atributos, o primeiro, que se chama id, é a chave primária, já que ele não associa automaticamente.

Em cima do atributo id, colocaremos uma notação chamada @Id e apertamos "Ctrl + Shift + O" para importar. No nosso caso, ele importou diretamente do javax.persistence.Id. Como, geralmente, quem cuida do id, da chave primária é o banco de dados e não a aplicação, também precisamos ensinar para a JPA que quem gerará o identificador não é a aplicação e, sim, o banco de dados.

Quando formos salvar um produto, o id estará nulo. Não tem problema, porque é o banco de dados que vai gerar o próximo id. Podemos configurar isso com outra notação, que colocamos em cima do atributo id, que é o @GeneratedValue, isto é, para dizer como o valor da chave primária é gerado.

Existe um parâmetro que precisamos passar que é a estratégia, strategy, isto é, qual é a estratégia de geração da chave primária. Isso dependerá do banco de dados, alguns usam SEQUENCE, outros não. Então, nas estratégias, temos três opções: IDENTITY; SEQUENCE; e TABLE. Geralmente, utilizamos a IDENTITY, quando não tem SEQUENCE no banco de dados, ou SEQUENCE, quando tem.

Um último detalhe para fecharmos esse vídeo. Pela JPA, em relação a toda entidade, além de precisarmos ir até a classe e adicionar anotações da JPA para fazer o mapeamento, também deveríamos adicionar a classe no persistence.xml. Fora das properties e dentro do persistence-unit, exite outra tag chamada class.

Pela JPA, deveríamos passar todas as classes/entidades do nosso projeto, ou seja, passaríamos o caminho completo da classe, br.com.alura.loja.modelo.Produto. Pela JPA, para cada entidade que mapearmos, além de mapear na classe, temos que adicioná-la no persistence.xml com a tag class.

Porém, se tivermos utilizando o Hibernate, não precisamos adicionar a tag class, porque ele consegue encontrar automaticamente as classes/entidades do nosso projeto. Essa é uma particularidade do Hibernate, pode ser que as outras implementações não façam isso e, portanto, teremos que, manualmente, adicionar o class.

Outro detalhe importante, se adicionarmos uma entidade no class, temos que adicionar todas. Se esquecermos alguma, o Hibernate só olhará para as que estiverem declaradas. Ou mapeamos todas, ou nenhuma.

Quais tipos de atributos podemos mapear sem a necessidade de configurações adicionais via anotações da JPA? Os tipos primitivos, atributos do tipo String e algumas classes do Java, como LocalDate e BigDecimal

Para ensinar isso à JPA, que não é mais o padrão, em cima do atributo Categoria, na classe Produto.java, colocaremos a anotação @Enumerated(). E, nessa anotação, temos como opções os parâmetros "ORDINAL" (que é o padrão, a ordem) ou "STRING". Logo, escolheremos STRING, para que ele cadastre o nome da constante no banco de dados, não a ordem.

### Mapeamento de Relacionamentos

Agora, teremos um problema, porque a JPA detectará que, na entidade Produto, existe um atributo Categoria, e que seu tipo não é mais primitivo do Java, não é mais um enum e nem uma classe do Java. Ela detectará que esse tipo é uma outra classe do nosso projeto e que essa classe é uma entidade ( @Entity). Então, a JPA automaticamente saberá que isso é um relacionamento entre Produto e Categoria, isto é, um relacionamento de duas entidades.

Desta maneira, temos a obrigação de dizer à JPA qual é a cardinalidade desse relacionamento. Se um produto tem uma única categoria ou várias categorias, é um para um, um para muitos, muitos para um, ou seja, qual é a cardinalidade. Se observarmos o desenho do diagrama, veremos que, de produtos para categorias, temos: muitos para um. Isto é, um produto tem uma única categoria, mas uma categoria pode estar vinculada a vários produtos.

Então, de produtos para categorias: asterisco, 1. Que quer dizer: muitos para um. Na JPA, para informarmos que a cardinalidade desse relacionamento é "muitos para um", temos uma anotação, @ManyToOne. Ou seja, muitos produtos estão vinculados com uma Categoria. Uma categoria pode ter vários produtos, mas o produto tem uma única categoria.

### Mapeamento de Herança


### Mapeamento de Chaves Compostas

## Ciclo de Vida de uma Entidade

## Consultas com JPQL

### Performance de Consultas

Eager e Lazy

## Criteria API
