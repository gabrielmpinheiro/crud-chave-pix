CREATE DATABASE IF NOT EXISTS crudpix;

CREATE TABLE Chaves (
    id INT NOT NULL AUTO_INCREMENT ,
    customer_id INT NOT NULL ,
    chave VARCHAR(200) NOT NULL ,
    account_id INT NOT NULL ,
    PRIMARY KEY ("id")
    ) ENGINE = InnoDB;

CREATE TABLE Customers (
    id INT NOT NULL AUTO_INCREMENT ,
    nome VARCHAR(200) NOT NULL ,
    email VARCHAR(200) NULL ,
    cpf VARCHAR(50) NOT NULL ,
    telefone VARCHAR(30) NULL ,
    PRIMARY KEY ("id")
    ) ENGINE = InnoDB;

CREATE TABLE Accounts (
    id INT NOT NULL AUTO_INCREMENT ,
    banco VARCHAR(50) NOT NULL ,
    conta INT NOT NULL ,
    agencia INT NOT NULL ,
    customer_id INT NOT NULL , PRIMARY KEY (`id`)
    ) ENGINE = InnoDB;