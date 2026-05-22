--
-- TABLA NOTAS_ALUMNOS
--

CREATE TABLE notas_alumnos
 (
   nombre_alumno VARCHAR(25),
   nota1 TINYINT CHECK (nota1 BETWEEN 0 AND 100),
   nota2 TINYINT CHECK (nota2 BETWEEN 0 AND 100),
   nota3 TINYINT CHECK (nota3 BETWEEN 0 AND 100),
   asignatura VARCHAR(25),
   curso VARCHAR(4),
   PRIMARY KEY (nombre_alumno, asignatura, curso)
 ) engine=innodb;
 
INSERT INTO notas_alumnos VALUES ('Alcalde García, M. Luisa',5,5,5,'MATEMÁTICAS','4ESO');
INSERT INTO notas_alumnos VALUES ('Benito Martín, Luis',7,6,8, 'MATEMÁTICAS','3ESO');
INSERT INTO notas_alumnos VALUES ('Casas Martínez, Manuel',7,5,5,'LENGUA','4ESO');
INSERT INTO notas_alumnos VALUES ('Corregidor Sánchez, Ana',6,9,8,'LENGUA','3ESO');
INSERT INTO notas_alumnos VALUES ('Díaz Sánchez, María',NULL,NULL,7, 'LENGUA','4ESO');

--
-- TABLA ALUM2006
--


CREATE TABLE alum2006
(
  dni VARCHAR(10) PRIMARY KEY,
  nombre VARCHAR(15) NOT NULL,
  apellidos VARCHAR(20) NOT NULL,
  fecha_nac DATE,
  direccion VARCHAR(20),
  poblacion VARCHAR(20),
  provincia VARCHAR(20),
  curso INT CHECK (curso>=1 AND curso<=4) DEFAULT 1,
  nivel VARCHAR(3) CHECK (nivel IN ('ESO', 'BAC', 'DAI', 'ASI', 'ADM', 'COM', 'ESI')),
  clase CHAR(1) CHECK (clase IN ('A','B','C','D','E','F')),
  faltas1 INT,
  faltas2 INT,
  faltas3 INT,
  CHECK (faltas1 BETWEEN 0 AND 100),
  CHECK (faltas2 BETWEEN 0 AND 100),
  CHECK (faltas3 BETWEEN 0 AND 100)
 ) engine=innodb;


INSERT INTO alum2006 VALUES('123456789','Juan', 'Cabello Panzano', '1990-08-16', 
 'C/Félix Fernández 12','BERROCALEJO', 'CACERES', 3, 'ESO', 'A', 0,0,0 );

INSERT INTO alum2006 VALUES('123456788','Julia', 'Cabello Panzano', '1990-08-16', 
 'C/Félix Fernández 12','BERROCALEJO', 'CACERES', 3, 'ESO', 'A', 4,0,2 );

INSERT INTO alum2006 VALUES('123456787','María', 'Martín Pérez', '1989-12-16', 
 'C/Doctor Vazquez 33','GUADALAJARA', 'GUADALAJARA', 4, 'ESO', 'B', 1,0,0 );

INSERT INTO alum2006 VALUES('123456786','Manuel', 'Gómez Pérez', '1988-07-06', 
 'C/Segovia 23','MARCHAMALO', 'GUADALAJARA', 1, 'ESI', 'A', NULL,0,0 );

INSERT INTO alum2006 VALUES('123456780','Miguel', 'Fernández Gil', '1988-03-11', 
 'C/Las Cañas 7B','YUNQUERA', 'GUADALAJARA', 1, 'ESI', 'A', 3,0,0 );

INSERT INTO alum2006 VALUES('123456700','Esther', 'Alía Ramos', NULL, 
 'C/Pilón 10','YUNQUERA', 'GUADALAJARA', 2, 'ESI', 'A', 3,7,2 );
