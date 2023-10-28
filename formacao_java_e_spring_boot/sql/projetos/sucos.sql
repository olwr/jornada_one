-- CRIANDO BANCO E TABELAS
CREATE DATABASE IF NOT EXISTS sucos DEFAULT CHARACTER SET utf8;

USE sucos;

CREATE TABLE IF NOT EXISTS cliente (
    cpf VARCHAR(11),
    nome VARCHAR(100),
    endereço1 VARCHAR(150),
    endereço2 VARCHAR(150),
    bairro VARCHAR(50),
    cidade VARCHAR(50),
    estado VARCHAR(50),
    cep VARCHAR(8),
    idade SMALLINT,
    gênero VARCHAR(4),
    limite_crédito FLOAT,
    volume_compra FLOAT,
    primeira_compra BIT(1)
);

CREATE TABLE IF NOT EXISTS produto (
    código VARCHAR(20) PRIMARY KEY,
    nome VARCHAR(150),
    embalagem VARCHAR(50),
    tamanho VARCHAR(50), -- poderia ser enum
    sabor VARCHAR(50),
    preço_lista FLOAT
);

-- INSERINDO REGISTROS
INSERT INTO produto (
    código,
    nome,
    embalagem,
    tamanho,
    sabor,
    preço_lista
) VALUES (
    '1040107',
    'Light - 350ml - Melancia',
    'Lata',
    '350 ml',
    'Melancia',
    4.56
);

INSERT INTO produto (
    código,
    nome,
    embalagem,
    tamanho,
    sabor,
    preço_lista
) VALUES (
    '1037797',
    'Clean - 2l - Laranja',
    'PET',
    '2 l',
    'Laranja',
    16.01
);

INSERT INTO produto (
    código,
    nome,
    embalagem,
    tamanho,
    sabor,
    preço_lista
) VALUES (
    '1000889',
    'Sabor da Montanha - 700ml - Uva',
    'Garrafa',
    '700 ml',
    'Uva',
    6.31
);

INSERT INTO produto (
    código,
    nome,
    embalagem,
    tamanho,
    sabor,
    preço_lista
) VALUES (
    '1004327',
    'Videira do Campo - 1,5l - Melancia',
    'PET',
    '1,5 l',
    'Melancia',
    19.51
);

INSERT INTO produto (
    código,
    nome,
    embalagem,
    tamanho,
    sabor,
    preço_lista
) VALUES (
    '544931',
    'Frescor do Verão - 350ml - Limão',
    'PET',
    '350 ml',
    'Limão',3.20
);

INSERT INTO produto (
    código,
    nome,
    embalagem,
    tamanho,
    sabor,
    preço_lista
) VALUES (
    '1078680',
    'Frescor do Verão - 470ml - Manga',
    'Lata',
    '470 ml',
    'Manga',
    5.18
);

-- MODIFICANDO AS TABELAS
UPDATE produto
SET embalagem = 'Lata', preço_lista = 2.46
WHERE código = ('544931');

UPDATE produto
SET embalagem = 'Garrafa'
WHERE código = ('1078680');

ALTER TABLE cliente
ADD PRIMARY KEY (cpf);

ALTER TABLE cliente
ADD COLUMN (data_nascimento DATE);

INSERT INTO cliente (
    cpf, 
    nome, 
    endereço1, 
    endereço2, 
    bairro, 
    cidade, 
    estado, 
    cep, 
    idade, 
    gênero, 
    limite_crédito, 
    volume_compra, 
    primeira_compra, 
    data_nascimento
) VALUES (
    '00388934505', 
    'João da Silva', 
    'Rua projetada A número 10', 
    '', 
    'Vila Roman', 
    'CARATINGA', 
    'AMAZONAS', 
    '2222222', 
    30, 
    'M', 
    10000.00, 
    2000, 
    0, 
    '1989-10-05'
);