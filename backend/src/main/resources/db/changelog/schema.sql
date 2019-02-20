--liquibase formatted sql

--changeset nvoxland:1
--
-- CREATE SEQUENCE serial START 1;

CREATE TABLE IF NOT EXISTS "user" (
  id        SERIAL PRIMARY KEY,
  name      VARCHAR(50),
  surname   VARCHAR(50),
  password  VARCHAR(50),
  password2 VARCHAR(50),
  city      VARCHAR(100),
  country   VARCHAR(100),
  gender    VARCHAR(50),
  birth     VARCHAR(50),
  likes     INT DEFAULT 0,
  hobby     TEXT []

);

CREATE TABLE IF NOT EXISTS "hobby" (
  id        SERIAL PRIMARY KEY,
  name      VARCHAR(50)
);

--rollback drop table user;

--changeset nvoxland:2

insert into "user" (name, surname, password, password2, city, country, gender, birth, likes, hobby)
values ('Anna', 'Grund',  'test', 'netest', 'Tallinn', 'Estonia', 'FEMALE', '23-10-1997', 1, ARRAY [ '(408)-589-5846',
 '(408)-589-5555' ]);

-- insert into "user" (name, surname, password, password2, city, country, gender, birth, likes)
-- values ('Marina', 'Ivanova', 'test', 'netest', 'Tallinn', 'Estonia', 'FEMALE', '2017-04-30', 20);
-- --
-- insert into "user" (name, surname, username, password, password2, city, country, gender, birth, likes)
-- values ('Katarina', 'Piven', 'greymoon', 'test', 'netest', 'Tallinn', 'Estonia', 'FEMALE', '2017-04-30', 13);




