USE sucos;

CREATE TABLE IF NOT EXISTS vendedores ( -- se não usar USE, usar sucos.vendedores
    matricula VARCHAR(5),
    nome VARCHAR(100),
    percentual_comissão FLOAT,
    CONSTRAINT pk_vendedor PRIMARY KEY(matricula, nome)
);

/*
ALTER TABLE vendedores
ADD*/ 

INSERT INTO vendedores (
    matricula,
    nome,
    percentual_comissão
) VALUES (
    '00233',
    'João Geraldo da Fonseca',
    0.10
);

INSERT INTO vendedores (
    matricula,
    nome,
    percentual_comissão
) VALUES (
    '00235',
    'Márcio Almeida Silva',
    0.08
);

INSERT INTO vendedores (
    matricula,
    nome,
    percentual_comissão
) VALUES (
    '00236',
    'Cláudia Morais ',
    0.08
);

UPDATE vendedores
SET percentual_comissão = 0.11
WHERE matricula = '00236' AND nome = 'Cláudia Morais';

UPDATE vendedores
SET nome = 'José Geraldo da Fonseca Junior'
WHERE matricula = '00233' AND nome = 'João Geraldo da Fonseca';

DELETE FROM vendedores
WHERE matricula = '00233' AND nome = 'José Geraldo da Fonseca Junior';

ALTER TABLE vendedores
ADD COLUMN (data_admissão DATE);

ALTER TABLE vendedores
ADD COLUMN (de_férias BIT(1));

UPDATE vendedores
SET data_admissão = '2014-08-15', de_férias = 0
WHERE matricula = '00235' AND nome = 'Márcio Almeida Silva';

UPDATE vendedores
SET data_admissão = '2013-09-17', de_férias = 1
WHERE matricula = '00236' AND nome = 'Cláudia Morais';

INSERT INTO vendedores (
    matricula,
    nome,
    percentual_comissão,
    data_admissão,
    de_férias
) VALUES (
    '00237',
    'Roberta Martins',
    0.11,
    '2017-03-18',
    1
);

INSERT INTO vendedores (
    matricula,
    nome,
    percentual_comissão,
    data_admissão,
    de_férias
) VALUES (
    '00238',
    'Péricles Alves',
    0.11,
    '2016-08-21',
    0
);