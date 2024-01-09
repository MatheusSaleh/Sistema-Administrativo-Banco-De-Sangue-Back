INSERT INTO enfermeiro (COREN, NOME_COMPLETO, DATA_NASCIMENTO, DATA_CONTRATACAO) VALUES
                                                                                  ('012.345 SP', 'Giovanna Alves Benelli', '1990-01-01', '2022-01-01'),
                                                                                  ('012.354 RJ', 'Gabriela Mazete', '1995-05-15', '2021-06-10'),
                                                                                  ('014.499 PR', 'Maria Bernini', '1988-12-03', '2020-03-20');


INSERT INTO doador (NOME_COMPLETO, EMAIL, DATA_NASCIMENTO, PONTUACAO, NIVEL) VALUES
                                                                               ('Almir Rogério Camolesi', 'camolesi@fema.edu.br', '1992-04-15', 100.5, 2),
                                                                               ('Matheus de Oliveira Rodrigues Saleh', 'matheusxmg2@gmail.com', '1985-08-22', 75.2, 1),
                                                                               ('Luiz Ricardo Begosso', 'begosso@fema.edu.br', '1998-12-10', 120.8, 3);




INSERT INTO doacao (ID_ENFERMEIRO, ID_DOADOR, DATA_DOACAO, TIPO_DOACAO, STATUS_DOACAO) VALUES
                                                                                        (1, 1, '2022-03-10', 'Doação de Sangue', 'Concluída'),
                                                                                        (2, 2, '2023-01-20', 'Doação de Plaquetas', 'Pendente'),
                                                                                        (3, 3, '2022-11-05', 'Doação de Plasma', 'Em Progresso');



-- Inserindo algumas questões na tabela Questoes

-- Questão 1
INSERT INTO QUESTAO (PERGUNTA, OPCAOA, OPCAOB, OPCAOC, OPCAOD, RESPOSTA_CORRETA)
VALUES ('Qual é a quantidade média de sangue que um adulto tem em seu corpo?',
        'A) 4 a 6 litros',
        'B) 8 a 10 litros',
        'C) 2 a 3 litros',
        'D) 12 a 15 litros',
        'A');

-- Questão 2
INSERT INTO QUESTAO (PERGUNTA, OPCAOA, OPCAOB, OPCAOC, OPCAOD, RESPOSTA_CORRETA)
VALUES ('Qual é o tipo sanguíneo considerado doador universal?',
        'A) A+',
        'B) O+',
        'C) AB+',
        'D) B-',
        'B');

-- Questão 3
INSERT INTO QUESTAO (PERGUNTA, OPCAOA, OPCAOB, OPCAOC, OPCAOD, RESPOSTA_CORRETA)
VALUES ('Quanto tempo leva para o corpo repor o volume de sangue doado durante uma doação padrão?',
        'A) 1 dia',
        'B) 1 semana',
        'C) 1 mês',
        'D) 2 meses',
        'C');

-- Questão 4
INSERT INTO QUESTAO (PERGUNTA, OPCAOA, OPCAOB, OPCAOC, OPCAOD, RESPOSTA_CORRETA)
VALUES ('Quais são os tipos de componentes sanguíneos que podem ser doados individualmente?',
        'A) Sangue Total',
        'B) Plasma e Plaquetas',
        'C) Hemácias e Plaquetas',
        'D) Plasma e Hemácias',
        'C');

-- Questão 5
INSERT INTO QUESTAO (PERGUNTA, OPCAOA, OPCAOB, OPCAOC, OPCAOD, RESPOSTA_CORRETA)
VALUES ('O que é necessário para doar sangue?',
        'A) Estar em jejum',
        'B) Ter mais de 60 anos',
        'C) Pesar menos de 50 kg',
        'D) Estar saudável e bem alimentado',
        'D');


-- Inserir as notícias
INSERT INTO NOTICIA (NOME_AUTOR, NOTICIA, RESUMO, TITULO) VALUES
    ('Matheus Saleh', SUBSTRING('Os robôs, equipados com tecnologia de última geração, são capazes de determinar com precisão a quantidade necessária de sangue, escolher a melhor veia para a coleta e administrar anestesia local, garantindo um procedimento praticamente indolor para os doadores.', 1, 255), 'Em uma grande revolução na medicina, a cidade fictícia Futurista inaugurou o primeiro banco de sangue totalmente automatizado do mundo.', 'Banco de Sangue do Futuro: Robôs Iniciam Coleta de Sangue Automatizada');

-- Inserir as perguntas
INSERT INTO PERGUNTA_PARA_ELEGIBILIDADE (TITULO, PERGUNTA, OPCAO1, OPCAO2, RESPOSTA_CORRETA) VALUES
                                                                                                 ('Idade', 'Você tem entre 16 e 69 anos?', 'Sim', 'Não', 'Sim'),
                                                                                                 ('Peso', 'Você pesa pelo menos X quilos?', 'Sim', 'Não', 'Sim'),
                                                                                                 ('Saúde Geral', 'Você está se sentindo bem e saudável hoje?', 'Sim', 'Não', 'Sim'),
                                                                                                 ('Comportamento Sexual', 'Nos últimos 12 meses, você teve mais de um parceiro sexual ou teve relações sexuais com alguém que tem ou suspeita ter HIV/AIDS?', 'Sim', 'Não', 'Não'),
                                                                                                 ('Histórico de Viagem', 'Você viajou para áreas onde há risco de transmissão de doenças transmitidas pelo sangue nos últimos meses?', 'Sim', 'Não', 'Pode variar'),
                                                                                                 ('Exposição a Doenças Infecciosas', 'Você teve hepatite, sífilis ou outra doença transmitida pelo sangue?', 'Sim', 'Não', 'Não'),
                                                                                                 ('Histórico de Transfusões', 'Você recebeu transfusões de sangue ou derivados nos últimos 12 meses?', 'Sim', 'Não', 'Não'),
                                                                                                 ('Doenças Crônicas', 'Você tem alguma condição médica crônica que pode afetar a elegibilidade?', 'Sim', 'Não', 'Pode variar'),
                                                                                                 ('Comportamento de Risco para Doenças Transmissíveis pelo Sangue', 'Você já compartilhou agulhas ou praticou sexo sem proteção nos últimos 12 meses?', 'Sim', 'Não', 'Não'),
                                                                                                 ('Gravidez e Amamentação', 'Se for mulher, está grávida, amamentando ou teve um parto nos últimos seis meses?', 'Sim', 'Não', 'Pode variar');
