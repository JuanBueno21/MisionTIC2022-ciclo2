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