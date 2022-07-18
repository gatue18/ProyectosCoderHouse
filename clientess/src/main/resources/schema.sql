DROP TABLE CLIENTE IF EXISTS ;
DROP TABLE PRODUCTO IF EXISTS ;
DROP TABLE COMPROBANTE IF EXISTS ;


CREATE TABLE CLIENTE (
idcliente INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(50),
apellido VARCHAR(50),
dni INT NOT NULL,
fechanacimiento DATE,
PRIMARY KEY(idcliente)
);

CREATE TABLE PRODUCTO (
idproducto INT NOT NULL AUTO_INCREMENT,
descripcion VARCHAR(100) NOT NULL,
precio FLOAT NOT NULL,
stock INT NOT NULL,
codigo VARCHAR(10)NOT NULL,
PRIMARY KEY(idproducto)
);

CREATE TABLE COMPROBANTE (
idcomprobante INT NOT NULL AUTO_INCREMENT,
cantidad INT NOT NULL,
fecha DATE,
total FLOAT NOT NULL,
PRIMARY KEY(idcomprobante)
);








