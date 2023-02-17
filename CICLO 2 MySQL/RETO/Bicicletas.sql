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