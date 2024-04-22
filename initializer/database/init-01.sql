DROP SCHEMA IF EXISTS myapp CASCADE;
CREATE SCHEMA myapp;


DROP TABLE IF EXISTS myapp.boardservice;
CREATE TABLE myapp.boards (
    id serial4 NOT NULL,
    owner_id BIGINT NULL,
    title varchar(255) NULL,
    description varchar(255) NULL,
    created_at timestamp(6) NULL,
    updated_at timestamp(6) NULL,
    CONSTRAINT pk_boards PRIMARY KEY (id)
    );