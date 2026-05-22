-- 1. CREACION DE LA BASE DE DATOS Y EL USUARIO

-- Primero se creo el usuario y le asigno los permisos sobre la  base de datos ('tiendaOnline') que se creara posteriormente

-- USER "shazzo" IDENTIFIED BY "1234";
--GRANT ALL PRIVILEGES ON tienda.* TO "shazzo";
--FLUSH PRIVILEGES;
--exit;

-- Abro sesión en MySQL con el nuevo usuario

--mysql -u shazzo -p;

-- Ahora creo la base de datos 'tiendaOnline'

CREATE DATABASE mundial;
USE mundial;
--SHOW WARNINGS;

--DROP TABLE equipos;
-- Primero creo las tablas que no tienen FKs

CREATE TABLE equipos (
cod_equipo TINYINT NOT NULL PRIMARY KEY,
seleccion varchar(40) NOT NULL,
grupo CHAR(1) NOT NULL CHECK (grupo IN ("A","B","C","D","E","F","G","H")),
ptos TINYINT DEFAULT 0,
goles_favor TINYINT DEFAULT 0,
goles_contra TINYINT DEFAULT 0
) engine=innodb;

CREATE TABLE arbitros (
cod_arbitro TINYINT UNSIGNED NOT NULL PRIMARY KEY,
nombre varchar(40) UNIQUE NOT NULL,
nacionalidad varchar(30) NOT NULL,
fecha_nac DATE,
partidos_pitados TINYINT UNSIGNED DEFAULT 0
) engine=innodb;

-- Segundo creamos las tablas que tienen FKs

CREATE TABLE jugadores (
cod_jugador INT NOT NULL,
nombre varchar(20) NOT NULL,
alias varchar(30),
fecha_nac DATE,
localidad_nac varchar(50),
cod_seleccion TINYINT NOT NULL,
CONSTRAINT pk_jugadores PRIMARY KEY (cod_jugador),
CONSTRAINT fk_jugadores_equipos FOREIGN KEY (cod_seleccion) REFERENCES equipos(cod_equipo) 
ON DELETE RESTRICT ON UPDATE CASCADE
) engine=innodb;

CREATE TABLE partidos (
cod_partido TINYINT NOT NULL,
cod_equipo1 TINYINT NOT NULL,
cod_equipo2 TINYINT NOT NULL,
nombre varchar(20) NOT NULL,
fecha DATE NOT NULL,
hora time NOT NULL,
goles_eq1 TINYINT,
goles_eq2 TINYINT,
CONSTRAINT pk_partidos PRIMARY KEY (cod_partido),
CONSTRAINT fk_equipo1_equipos FOREIGN KEY (cod_equipo1) REFERENCES equipos(cod_equipo)
ON DELETE RESTRICT ON UPDATE CASCADE,
CONSTRAINT fk_equipo2_equipos FOREIGN KEY (cod_equipo2) REFERENCES equipos(cod_equipo)
ON DELETE RESTRICT ON UPDATE CASCADE
) engine=innodb;

CREATE TABLE juegan (
cod_partido TINYINT NOT NULL,
cod_jugador INT NOT NULL,
minutos_jugados INT DEFAULT 0,
goles INT DEFAULT 0,
titularidad BOOLEAN,
CONSTRAINT pk_juegan PRIMARY KEY (cod_partido,cod_jugador),
CONSTRAINT fk_juegan_partido FOREIGN KEY (cod_partido) REFERENCES partidos(cod_partido)
ON DELETE RESTRICT ON UPDATE CASCADE,
CONSTRAINT fk_juegan_jugadores FOREIGN KEY (cod_jugador) REFERENCES jugadores(cod_jugador)
ON DELETE RESTRICT ON UPDATE CASCADE
) engine=innodb;

--DROP DATABASE mundial;

ALTER TABLE partidos ADD cod_colegiado TINYINT UNSIGNED NOT NULL;

ALTER TABLE partidos ADD CONSTRAINT fk_partidos_arbitro FOREIGN KEY (cod_colegiado) REFERENCES arbitros(cod_arbitro) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE jugadores MODIFY nombre VARCHAR(40) NOT NULL;

ALTER TABLE jugadores MODIFY alias varchar(30) UNIQUE;

ALTER TABLE juegan MODIFY goles TINYINT;

ALTER TABLE juegan ADD CONSTRAINT check_min_jugados CHECK (minutos_jugados BETWEEN 0 AND 90);

DROP TABLE juegan;
DROP TABLE partidos;
DROP TABLE jugadores;
DROP TABLE arbitros;
DROP TABLE equipos;

DROP DATABASE MUNDIAL;