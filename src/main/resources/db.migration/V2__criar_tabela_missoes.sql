--Migratiopns para adicionar a coluna de RANK na tabela de cadastros

ALTER TABLE tb_cadastro_personagens
    ADD COLUMN rank VARCHAR(255);