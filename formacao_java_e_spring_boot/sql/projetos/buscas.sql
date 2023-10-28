SELECT * FROM cliente;

SELECT * FROM produto;

SELECT * FROM vendedores;

SELECT * FROM vendedores WHERE YEAR(data_admissão) = 2016;

SELECT * FROM vendedores WHERE de_férias = 1 AND YEAR(data_admissão) < 2016;

SELECT CPF AS cpf FROM tbcliente limit 5;

SELECT * FROM tbproduto;

SELECT * FROM tbproduto WHERE produto = '544931';

SELECT * FROM tbproduto WHERE sabor = 'Laranja';

SELECT * FROM vendedores WHERE nome = 'Cláudia Morais';

SELECT * FROM tbcliente WHERE idade >= 22;
SELECT * FROM tbcliente WHERE idade < 22;
SELECT * FROM tbcliente WHERE idade > 22;
SELECT * FROM tbcliente WHERE idade <> 22;
SELECT * FROM tbcliente WHERE idade <= 22;

SELECT * FROM tbcliente WHERE NOME >= 'Fernando Cavalcante';
SELECT * FROM tbcliente WHERE NOME <> 'Fernando Cavalcante';

/* NÃO CONSEGUE ACHAR POR FLOAT NÃO CABER EXATAMENTE NOS CONDICIONAIS
SELECT * FROM tbproduto WHERE preco_lista = 16.008;
ALTERNATIVA É: */
SELECT * FROM tbproduto WHERE preco_lista BETWEEN 16.007 AND 16.009;

SELECT * FROM tbcliente WHERE data_nascimento = '1995-01-13';
SELECT * FROM tbcliente WHERE data_nascimento > '1995-01-13';
SELECT * FROM tbcliente WHERE data_nascimento <= '1995-01-13';
SELECT * FROM tbcliente WHERE YEAR(data_nascimento) = 1995;
SELECT * FROM tbcliente WHERE MONTH(data_nascimento) = 10;

SELECT * FROM tbcliente WHERE (IDADE >= 18 AND IDADE <= 22 AND SEXO = 'M')
OR (cidade = 'Rio de Janeiro' OR BAIRRO = 'Jardins');