CREATE TABLE compras (
	id INT PRIMARY KEY,
    alias CHAR(20),
    fabricante CHAR(20),
    fecha_hora TIMESTAMP,
    FOREIGN KEY (alias) REFERENCES clientes (alias),
    FOREIGN KEY (fabricante) REFERENCES fabricantes (fabricante)
);

INSERT INTO compras VALUES (101, "lucky", "Cannondale", "2017-10-25 20:00:00");
INSERT INTO compras VALUES (102, "lucky", "Trek", "2019-03-15 18:30:00");
INSERT INTO compras VALUES (103, "lucky", "Starker", "2019-05-20 20:30:00");
INSERT INTO compras VALUES (104, "malopez", "Cannondale", "2018-05-20 20:30:00");
INSERT INTO compras VALUES (105, "malopez", "Starker", "2020-01-20 20:30:00");
INSERT INTO compras VALUES (106, "diva", "Yeti", "2019-05-20 20:30:00");
INSERT INTO compras VALUES (107, "diva", "Fuji", "2018-06-22 21:30:00");
INSERT INTO compras VALUES (108, "diva", "Lucky Lion", "2020-03-17 15:30:20");
INSERT INTO compras VALUES (109, "dreamer", "Lucky Lion", "2020-03-17 15:30:20");
INSERT INTO compras VALUES (110, "dreamer", "Be Electric", "2020-04-10 18:30:20");
INSERT INTO compras VALUES (111, "ninja", "Aima", "2020-02-17 20:30:20");
INSERT INTO compras VALUES (112, "ninja", "Starker", "2020-02-20 16:30:20");
INSERT INTO compras VALUES (113, "ninja", "Mec de Colombia", "2020-03-27 18:30:20");
INSERT INTO compras VALUES (114, "rose", "Atom Electric", "2020-03-20 21:30:20");
INSERT INTO compras VALUES (115, "green", "Yeti", "2020-01-10 17:30:20");
INSERT INTO compras VALUES (116, "green", "Trek", "2020-02-15 20:30:20");
INSERT INTO compras VALUES (117, "green", "Bmc", "2020-03-17 18:30:20");