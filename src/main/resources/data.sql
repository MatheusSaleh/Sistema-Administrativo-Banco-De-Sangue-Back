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

