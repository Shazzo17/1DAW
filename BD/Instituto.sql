CREATE DATABASE instituto ;
SHOW DATABASES;
USE instituto ;
DROP TABLE ;

CREATE TABLE sillas (
codigo CHAR(4),
descripcion TEXT,
tipo ENUM('con_brazos','sin_brazos','pala','ajustable','gamer') NOT NULL DEFAULT 'pala',
fecha_compra DATE NOT NULL,
CONSTRAINT PK_sillas PRIMARY KEY (codigo)
);

SHOW TABLES;

CREATE TABLE alumnos (
nre CHAR(9),
nombre VARCHAR(100) NOT NULL,
fecha_nac DATE,
telefono CHAR(9) UNIQUE NOT NULL,
silla CHAR(4) NOT NULL,
CONSTRAINT PK_alumnos PRIMARY KEY (nre),
CONSTRAINT FK_alumnos_sillas FOREIGN KEY (silla) REFERENCES sillas(codigo)
);

CREATE TABLE ordenadores (
n_serie CHAR(4),
cpu VARCHAR(20) NOT NULL DEFAULT 'intel',
ram VARCHAR(20) NOT NULL,
discoduro VARCHAR(20) NOT NULL,
fecha_compra DATE NOT NULL,
CONSTRAINT PK_ordenadores PRIMARY KEY (n_serie)
);

