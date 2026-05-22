
CREATE TABLE mascotas(
    chip    INT PRIMARY KEY AUTO_INCREMENT,
    nombre  VARCHAR(7) NOT NULL,
    especie VARCHAR(25) NOT NULL,
    raza    VARCHAR(20) NOT NULL,
    edad    INT DEFAULT 0,
    sexo    ENUM('H', 'M') DEFAULT 'M'
) engine=innodb auto_increment=10;


INSERT INTO mascotas(nombre, especie, raza, edad, sexo) VALUES ('pancho','perro', 'labrador', 2, 'H');
INSERT INTO mascotas(nombre, especie, raza, edad, sexo) VALUES ('rayo','gato','siames', 4, 'H');
INSERT INTO mascotas(nombre, especie, raza, edad, sexo) VALUES ('sol','coballa','indu', 1, 'M');
INSERT INTO mascotas(nombre, especie, raza, edad, sexo) VALUES ('anyi','perro','chiguagua', 6, 'M');
INSERT INTO mascotas(nombre, especie, raza, edad, sexo) VALUES ('suki','perro','yorshire', 9, 'H');
INSERT INTO mascotas(nombre, especie, raza, edad, sexo) VALUES ('eden','gato','angora',2, 'H');

