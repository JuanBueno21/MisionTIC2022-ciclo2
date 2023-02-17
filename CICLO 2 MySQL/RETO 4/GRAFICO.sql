CREATE TABLE `PROVEEDOR` (
  `prov_id` int,
  `prov_nombre` char(20),
  `prov_direccion` char(45),
  `prov_telefono` char(10),
  KEY `pk` (`prov_id`)
);

CREATE TABLE `FABRICANTE` (
  `nom_fab` char(20),
  KEY `pk` (`nom_fab`)
);

CREATE TABLE `BICICLETA` (
  `bici_id` int,
  `nom_fab` char(20),
  `nic_precio` int,
  `bici_anio_fab` int,
  FOREIGN KEY (`nom_fab`) REFERENCES `FABRICANTE`(`nom_fab`),
  KEY `pk` (`bici_id`),
  KEY `Clave` (`nom_fab`, `nic_precio`, `bici_anio_fab`)
);

CREATE TABLE `MOTOCICLETA` (
  `mot_id` int,
  `nom_fab` char(20),
  `prov_id` int,
  `mot_precio` int,
  `mot_autonomia` int,
  FOREIGN KEY (`mot_precio`) REFERENCES `FABRICANTE`(`nom_fab`),
  KEY `pk` (`mot_id`),
  KEY `fk` (`nom_fab`, `prov_id`)
);

CREATE TABLE `INTENCION_COMPRA` (
  `cli_alias` char(20),
  `bici_id` int,
  `mot_id` int,
  `ic_fecha` date,
  FOREIGN KEY (`bici_id`) REFERENCES `BICICLETA`(`bici_id`),
  FOREIGN KEY (`mot_id`) REFERENCES `MOTOCICLETA`(`mot_id`),
  KEY `Clave` (`cli_alias`, `bici_id`, `mot_id`, `ic_fecha`)
);

CREATE TABLE `CLIENTE` (
  `cli_alias` char(20),
  `cli_nombres` char(25),
  `cli_apellidos` char(25),
  `cli_email` char(50),
  `cli_celular` char(15),
  `cli_contrasenia` int(8),
  `cli_fecnac` date,
  KEY `pk` (`cli_alias`)
);

