CREATE TABLE bicicletas (
	id INT PRIMARY KEY,
	fabricante CHAR(20),
	precio INT,
    ano INT,
    FOREIGN KEY (fabricante) REFERENCES fabricantes (fabricante)
    );
    
    INSERT INTO bicicletas VALUES(1001, "Cannondale", 1200000, 2020);
    INSERT INTO bicicletas VALUES(1002, "Trek", 1450000, 2019);
    INSERT INTO bicicletas VALUES(1003, "Yeti", 2000000, 2020);
    INSERT INTO bicicletas VALUES(1004, "Fuji", 950000, 2021);
    INSERT INTO bicicletas VALUES(1005, "Bmc", 1950000, 1018);