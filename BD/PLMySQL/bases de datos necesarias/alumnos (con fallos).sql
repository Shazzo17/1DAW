--
-- TABLA NOTAS_ALUMNOS
--

CREATE TABLE notas_alumnos
 (
   nombre_alumno VARCHAR(25),
   nota1 TINYINT,
   nota2 TINYINT,
   nota3 TINYINT,
   asignatura VARCHAR(25),
   curso VARCHAR(4)
 ) ;
 
INSERT INTO NOTAS_ALUMNOS VALUES ('Alcalde García, M. Luisa',5,5,5,'MATEMÁTICAS','4ESO');
INSERT INTO NOTAS_ALUMNOS VALUES ('Benito Martín, Luis',7,6,8, 'MATEMÁTICAS','3ESO');
INSERT INTO NOTAS_ALUMNOS VALUES ('Casas Martínez, Manuel',7,5,5,'LENGUA','4ESO');
INSERT INTO NOTAS_ALUMNOS VALUES ('Corregidor Sánchez, Ana',6,9,8,'LENGUA','3ESO');
INSERT INTO NOTAS_ALUMNOS VALUES ('Díaz Sánchez, María',NULL,NULL,7, 'LENGUA','4ESO');

--
-- TABLA ALUM2006
--


CREATE TABLE alum2006
(
  dni	        VARCHAR(10),
  nombre	VARCHAR(15),
  apellidos	VARCHAR(20),
  fecha_nac	DATE,
  direccion	VARCHAR(20),
  poblacion	VARCHAR(20),
  provincia	VARCHAR(20),
  curso	        INT,
  nivel	        VARCHAR(3),
  clase	        CHAR(1),
  faltas1	INT,
  faltas2	INT,
  faltas3	INT
 ) ;

INSERT INTO ALUM2006 VALUES('123456789','Juan', 'Cabello Panzano', '1990-08-16', 
 'C/Félix Fernández 12','BERROCALEJO', 'CACERES', 3, 'ESO', 'A', 0,0,0 );

INSERT INTO ALUM2006 VALUES('123456788','Julia', 'Cabello Panzano', '1990-08-16', 
 'C/Félix Fernández 12','BERROCALEJO', 'CACERES', 3, 'ESO', 'A', 4,0,2 );

INSERT INTO ALUM2006 VALUES('123456787','María', 'Martín Pérez', '1989-12-16', 
 'C/Doctor Vazquez 33','GUADALAJARA', 'GUADALAJARA', 4, 'ESO', 'B', 1,0,0 );

INSERT INTO ALUM2006 VALUES('123456786','Manuel', 'Gómez Pérez', '1988-07-06', 
 'C/Segovia 23','MARCHAMALO', 'GUADALAJARA', 1, 'ESI', 'A', NULL,0,0 );

INSERT INTO ALUM2006 VALUES('123456780','Miguel', 'Fernández Gil', '1988-03-11', 
 'C/Las Cañas 7B','YUNQUERA', 'GUADALAJARA', 1, 'ESI', 'A', 3,0,0 );

INSERT INTO ALUM2006 VALUES('123456700','Esther', 'Alía Ramos', NULL, 
 'C/Pilón 10','YUNQUERA', 'GUADALAJARA', 2, 'ESI', 'A', 3,7,2 );




