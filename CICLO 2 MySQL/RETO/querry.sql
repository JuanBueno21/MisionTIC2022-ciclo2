create schema reto_4;
use reto_4;

create table proveedor (
	prov_id INT PRIMARY KEY,
    prov_nombre CHAR(20),
    prov_direccion CHAR(45),
    prov_telefono CHAR(20)
    );
    
    INSERT INTO proveedor 
    VALUES (101, "Auteco", "calle 7 No. 45-17", "05713224459");
    INSERT INTO proveedor
    VALUES (102, "Hitachi", "calle 19 No. 108-26", "05714223344");
    INSERT INTO proveedor
    VALUES (103, "Bosch", "carrera 68 No. 26-45", "05715678798");
    INSERT INTO proveedor
    VALUES (104, "Teco", "calle 77 No. 68-33", "05712213243");
    INSERT INTO proveedor
    VALUES (105, "General Electric", "calle 29 No. 26-12", "05717239919");

create table Clientes(
Username char(20) primary key,
Nombre  char(20),
Apellido char(20),
Email varchar(30),
Celular varchar(20),
Contraseña int,
Fecha_nacimiento date);



insert into Clientes values("lucky", "Pedro", "Perez","luisito87@hotmail.com","+573215896321",89562398,"1985-06-23");
insert into Clientes values("malopez", "Maria", "Lopez","marialo79@gmail.com","+573105528974",12365478,"1979-07-14");
insert into Clientes values("diva", "Ana", "Diaz","diva666@hotmail.com","+573158963254",74185296,"1990-05-14");
insert into Clientes values("dreamer", "Luis", "Rojas","rojaslucho@gmail.com","+573102586987",78912365,"1980-12-24");
insert into Clientes values("ninja", "Andres", "Cruz","ninja2000@hotmail.com","+573206987412",79315648,"2000-09-11");
insert into Clientes values("neon", "Nelson", "Ruiz","nelsonruis236@gmail.com","+573213876054",02020203,"1983-07-21");
insert into Clientes values("rose", "Claudia", "Mendez","roseclau87@gmail.com","+573215896321",89578998,"1987-03-17");
insert into Clientes values("green", "Jorge", "Rodriguez","jorgegreen@hotmail.com","+573168974520",85296374,"1992-06-28");


create table fabricantes(
fabricante CHAR(20) PRIMARY KEY
);

INSERT INTO fabricantes VALUES ("Cannondale");
INSERT INTO fabricantes VALUES ("Trek");
INSERT INTO fabricantes VALUES ("Yeti");
INSERT INTO fabricantes VALUES ("Fuji");
INSERT INTO fabricantes VALUES ("Bmc");
INSERT INTO fabricantes VALUES ("Starker");
INSERT INTO fabricantes VALUES ("Lucky Lion");
INSERT INTO fabricantes VALUES ("Be Electric");
INSERT INTO fabricantes VALUES ("Aima");
INSERT INTO fabricantes VALUES ("Mec de Colombia");
INSERT INTO fabricantes VALUES ("Atom Electric");


create table Motocicletas(
id int primary key,
fabricante char(20),
Precio int,
Autonomia int,
id_prov int,
foreign key(fabricante) references fabricantes (fabricante),
foreign key(id_prov) references Proveedor (prov_id));

insert into Motocicletas values (2001, 'Starker', 4200000, 18, 101);
insert into Motocicletas values (2002, 'Lucky Lion', 5600000, 14, 102);
insert into Motocicletas values (2003, 'Be Electric', 4600000, 26, 101);
insert into Motocicletas values (2004, 'Aima', 8000000, 36, 103);
insert into Motocicletas values (2005, 'Mec de Colombia', 5900000, 20, 104);
insert into Motocicletas values (2006, 'Atom Electric', 4500000, 12, 105);
    
    
create table Bicicletas(
id int primary key,
Fabricante char(20),
Precio int,
Año int,
foreign key(Fabricante) references Fabricantes (Fabricante));

insert into Bicicletas values (1001, 'Cannondale', 1200000, 2020);
insert into Bicicletas values (1002, 'Trek', 1450000, 2019);
insert into Bicicletas values (1003, 'Yeti', 2000000, 2020);
insert into Bicicletas values (1004, 'Fuji', 950000, 2021);
insert into Bicicletas values (1005, 'Bmc', 1950000, 1018);


create table Intencion_compras(
id int primary key,
Username char(20),
fabricante char(20),
fecha_hora timestamp,
foreign key (Username) references Clientes (Username),
foreign key (fabricante) references fabricantes (fabricante));

insert into Intencion_compras values (101,"lucky","Cannondale","2017-10-25 20:00:00");
insert into Intencion_compras values (102,"lucky","Trek","2019-03-15 18:30:00");
insert into Intencion_compras values (103,"lucky","Starker",'2019-05-20 20:30:00');
insert into Intencion_compras values (104,"malopez","Cannondale",'2018-05-20 20:30:00');
insert into Intencion_compras values (105,"malopez","Starker",'2020-01-20 20:30:00');
insert into Intencion_compras values (106,"diva","Yeti",'2019-05-20 20:30:00');
insert into Intencion_compras values (107,"diva","Fuji",'2018-06-22 21:30:00');
insert into Intencion_compras values (108,"diva","Lucky Lion",'2020-03-17 15:30:20');
insert into Intencion_compras values (109,"dreamer","Lucky Lion",'2020-03-17 15:30:20');
insert into Intencion_compras values (110,"dreamer","Be Electric",'2020-04-10 18:30:20');
insert into Intencion_compras values (111,"ninja","Aima",'2020-02-17 20:30:20');
insert into Intencion_compras values (112,"ninja","Starker",'2020-02-20 16:30:20');
insert into Intencion_compras values (113,"ninja","Mec de Colombia",'2020-03-27 18:30:20');
insert into Intencion_compras values (114,"rose","Atom Electric",'2020-03-20 21:30:20');
insert into Intencion_compras values (115,"green","Yeti",'2020-01-10 17:30:20');
insert into Intencion_compras values (116,"green","Trek",'2020-02-15 20:30:20');
insert into Intencion_compras values (117,"green","Bmc",'2020-03-17 18:30:20');
    