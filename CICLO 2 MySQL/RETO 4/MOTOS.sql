CREATE TABLE motocicletas(
	id INT PRIMARY KEY,
    fabricante CHAR(20),
    precio INT,
    autonomia INT,
    FOREIGN KEY (fabricante) REFERENCES fabricantes (fabricante),
    FOREIGN KEY (id_prov) REFERENCES proveedor (prov_id)
    );
INSERT INTO motocicletas VALUES (2001, "Starker", 4200000, 18, 101);
INSERT INTO motocicletas VALUES (2002, "Lucky Lion", 5600000, 14, 102);
INSERT INTO motocicletas VALUES (2003, "Be Electric", 4600000, 26, 101);
INSERT INTO motocicletas VALUES (2004, "Aima", 8000000, 36, 103);
INSERT INTO motocicletas VALUES (2005, "Mec de Colombia", 5900000, 20, 104);
INSERT INTO motocicletas VALUES (2006, "Atom Electric", 4500000, 12, 105);