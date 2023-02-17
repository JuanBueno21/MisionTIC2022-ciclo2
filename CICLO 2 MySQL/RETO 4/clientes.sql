CREATE TABLE clientes (
	alias CHAR(20) PRIMARY KEY,
    nombre CHAR(20),
    apellidos CHAR(20),
    email VARCHAR(45),
    celular CHAR(20),
    contrasena INT,
    f_nacimiento DATE
);

INSERT INTO clientes
VALUES ("diva", "Ana", "Diaz", "diva@gmail.com", "234567543", 12345678, "1990-04-29");
INSERT INTO clientes
VALUES ("dreamer", "Luis", "Rojas", "rojas@gmail.com", "23546554", 23456345, "1991-04-25");
INSERT INTO clientes
VALUES ("green", "Jorge", "Rodriguez", "jorge@gmail.com", "32285723959", 67845638, "1992-05-22");
INSERT INTO clientes
VALUES ("lucky", "Pedro", "Perez", "pedro@gmail.com", "4321829503", 78462946, "1993-05-20");
INSERT INTO clientes
VALUES ("malopez", "Maria", "Lopez", "maria@gmail.com", "7656787645", 98285306, "1994-07-22");
INSERT INTO clientes
VALUES ("neon", "Nelson", "Ruiz", "nelson@gmail.com", "783762943", 89678304, "1995-08-26");
INSERT INTO clientes
VALUES ("ninja", "Andres", "Cruz", "andres@gmail.com", "78765467", 98768934, "1996-07-16");
INSERT INTO clientes
VALUES ("rose", "Claudia", "Mendez", "claudia@gmail.com", "4432345676", 78990934, "1997-04-15");