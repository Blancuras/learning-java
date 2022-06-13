
SELECT * FROM myguests

INSERT INTO myguests ( firstname, lastname, email, reg_date)
VALUES ('Aileen', 'Alvarado', 'email@hotmail.com', NOW());



CREATE TABLE usuarios (
id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nombre   VARCHAR(100) NOT NULL, 
password VARCHAR(100) NOT NULL
)



INSERT INTO usuarios (nombre, PASSWORD) VALUES ('Luis',  'fghdjsgj');

SELECT * FROM usuarios
SELECT * FROM usuarios WHERE id = 1 
SELECT * FROM usuarios WHERE nombre = 'eliseO'
SELECT * FROM usuarios WHERE nombre = 'Aileen Alvarado' AND PASSWORD = '123456'


UPDATE usuarios SET nombre='Aileen Alvarado' WHERE id = 1 
UPDATE usuarios SET nombre = 'Molly' WHERE id = 3 
UPDATE usuarios SET nombre = 'Eliseo dklf' WHERE nombre = 'eliseo'

DELETE FROM usuarios WHERE nombre = 'Pachita' 

CREATE TABLE productos (
id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nombre   VARCHAR(100) NOT NULL, 
precio FLOAT(7,2) NOT NULL
)ENGINE=InnoDB AUTO_INCREMENT=1000;
INSERT INTO productos (nombre, precio) VALUES ('piedra ', 150.50) 

SELECT * FROM usuarios
SELECT * FROM productos 
SELECT * FROM productos
DROP TABLE producto
INSERT INTO usuarios (nombre, PASSWORD) VALUES ('pachin',  '123456'); 
SELECT * FROM productos  

DROP TABLE ventas
CREATE TABLE ventas (
id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
usuario_fk  INT(6) UNSIGNED NOT NULL, 
producto_fk INT(6) UNSIGNED NOT NULL,
cantidad FLOAT(7,2) NOT NULL,
FOREIGN KEY (usuario_fk) REFERENCES usuarios(id),
FOREIGN KEY (producto_fk) REFERENCES productos(id)
)ENGINE=InnoDB AUTO_INCREMENT=2000;

SELECT * FROM productos
SELECT * FROM usuarios 
SELECT * FROM ventas
INSERT INTO ventas (usuario_fk, producto_fk, cantidad) 
VALUES (1, 1001, 1);
INSERT INTO ventas (usuario_fk, producto_fk, cantidad) 
VALUES (4, 1002, 1); 
INSERT INTO ventas(usuario_fk, producto_fk, cantidad) 
VALUES (2, 1001, 50); 

DROP TABLE casas 
CREATE TABLE casas (
id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
usuario_fk  INT(6) UNSIGNED NOT NULL,  
cantidad INT(3) UNSIGNED NOT NULL, 
FOREIGN KEY (usuario_fk) REFERENCES usuarios(id)
)ENGINE=InnoDB AUTO_INCREMENT=3000; 
SELECT * FROM casas 
SELECT * FROM usuarios

ALTER TABLE casas
ADD COLUMN propiedad VARCHAR(15);

UPDATE casas SET propiedad ='Independencia' WHERE id = 3000;
UPDATE casas SET propiedad = 'San Sebastian' WHERE id = 3001; 
UPDATE casas SET propiedad = 'Cocina' WHERE id = 3002;

ALTER TABLE casas DROP COLUMN cantidad;  

INSERT INTO casas (usuario_fk, cantidad) 
VALUES (1, 1);
INSERT INTO casas (usuario_fk, cantidad)
VALUES (2, 1); 
INSERT INTO casas (usuario_fk, cantidad)
VALUES (4, 2); 
INSERT INTO casas (usuario_fk, propiedad)
VALUES (4, 'patio');

CREATE TABLE ventas (
id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
usuario_fk  INT(6) UNSIGNED NOT NULL, 
producto_fk INT(6) UNSIGNED NOT NULL,
cantidad FLOAT(7,2) NOT NULL,
FOREIGN KEY (usuario_fk) REFERENCES usuarios(id),
FOREIGN KEY (producto_fk) REFERENCES productos(id)
)ENGINE=InnoDB AUTO_INCREMENT=2000;


SELECT * FROM casas
SELECT * FROM productos
SELECT * FROM usuarios 
SELECT * FROM ventas
INSERT INTO casas (usuario_fk, propiedad)
VALUES (9, 'tiendita') 
INSERT INTO casas (usuario_fk, propiedad)
VALUES (9, 'casa')

SELECT usuarios.nombre, casas.propiedad   FROM casas 
INNER JOIN usuarios ON casas.usuario_fk = usuarios.id
ORDER BY casas.propiedad desc

SELECT * FROM casas 
INNER JOIN usuarios ON casas.usuario_fk = usuarios.id 

SELECT * FROM usuarios 
LEFT JOIN casas ON usuarios.id = casas.usuario_fk 

SELECT * FROM casas 
SELECT * FROM usuarios 
SELECT * FROM casas 
LEFT JOIN usuarios ON usuarios.id = casas.usuario_fk

SELECT usuarios.nombre, casas.propiedad FROM casas 
INNER JOIN usuarios ON usuarios.id = casas.usuario_fk

SELECT * FROM ventas
SELECT * FROM productos 

SELECT * FROM ventas 
INNER JOIN usuarios ON  ventas.usuario_fk = usuarios.id 
INNER JOIN productos ON ventas.producto_fk =productos.id

SELECT usuarios.nombre,
 productos.nombre, 
ventas.cantidad, productos.precio,
ventas.cantidad * productos.precio  total
FROM ventas 
INNER JOIN usuarios ON ventas.usuario_fk = usuarios.id
INNER JOIN productos ON ventas.producto_fk = productos.id

SELECT * FROM casas
12345,67
ALTER TABLE casas add renta FLOAT(7,2);
SELECT * FROM casas  
UPDATE casas SET renta = 100.00 WHERE id = 3000;
UPDATE casas SET renta = 90.00 WHERE id = 3001;
UPDATE casas SET renta = 920.00 WHERE id = 3002;
UPDATE casas SET renta = 600.00 WHERE id = 3003;
UPDATE casas SET renta = 40.00 WHERE id = 3004;
SELECT * FROM casas 
INNER JOIN usuarios ON casas.usuario_fk = usuarios.id

SELECT usuarios.nombre,  SUM(casas.renta) suma_renta 
FROM casas 
INNER JOIN usuarios ON casas.usuario_fk = usuarios.id
GROUP BY usuarios.nombre 

SELECT * FROM ventas  
INNER JOIN usuarios ON ventas.usuario_fk = usuarios.id 
INNER JOIN productos ON ventas.producto_fk = productos.id

SELECT usuarios.nombre, productos.nombre , ventas.cantidad, productos.precio
, ventas.cantidad * productos.precio total
 FROM ventas 
INNER JOIN usuarios ON ventas.usuario_fk = usuarios.id 
INNER JOIN productos ON ventas.producto_fk = productos.id
ORDER BY usuarios.nombre

INSERT INTO ventas(usuario_fk, producto_fk, cantidad) 
VALUES(3, 1001, 3); 
INSERT INTO ventas(usuario_fk, producto_fk, cantidad) 
VALUES(3, 1002, 3);
INSERT INTO ventas(usuario_fk, producto_fk, cantidad) 
VALUES(3, 1003, 3); 
INSERT INTO ventas(usuario_fk, producto_fk, cantidad) 
VALUES(1, 1003, 3); 
INSERT INTO ventas(usuario_fk, producto_fk, cantidad) 
VALUES(2, 1001, 3); 

SELECT usuarios.nombre, SUM( ventas.cantidad * productos.precio) total
 FROM ventas 
INNER JOIN usuarios ON ventas.usuario_fk = usuarios.id 
INNER JOIN productos ON ventas.producto_fk = productos.id
GROUP BY usuarios.nombre
HAVING total >900
ORDER BY usuarios.nombre 

SELECT * FROM casas 
SELECT * from productos 

SELECT * FROM usuarios 
WHERE PASSWORD = 123456

SELECT PASSWORD, COUNT(password) repetidas FROM usuarios 
GROUP BY PASSWORD 
HAVING repetidas>1 

SELECT * FROM usuarios WHERE nombre LIKE '%y'


CREATE TABLE clients( 
id INT, 
first_name nvarchar(50), 
last_name nvarchar(50), 
address nvarchar(50), 
birth_date nvarchar(50)
);  
DROP TABLE clients

INSERT INTO clients(id, first_name, last_name, birth_date, address)
VALUES(3, 'Andy', 'Morrison', '12/08/1995', NULL)  
SELECT * FROM clients  

UPDATE clients SET address = 'somewhere in the uk' WHERE id = 3
SELECT * FROM clients 

CREATE TABLE aprendiz(
id VARCHAR(20),
nombre VARCHAR(30), 
apellido VARCHAR(30), 
direccion VARCHAR(60));
 
SELECT * FROM aprendiz 
INSERT INTO aprendiz(id, nombre, apellido, direccion) VALUES('1234','Laura','Lopez','Mexico');

CREATE DATABASE clientes(
id INT(11) NOT NULL AUTO_INCREMENT,
nombre VARCHAR(20) NOT NULL, 
apellido VARCHAR(60) NOT NULL, 
direccion VARCHAR(60), 
PRIMARY KEY (id));
 
SHOW DATABASES 

CREATE table clientes( 
id INT(11) NOT NULL AUTO_INCREMENT,
nombre VARCHAR(20) NOT NULL, 
apellido VARCHAR(60) NOT NULL, 
direccion VARCHAR(60), 
PRIMARY KEY (id))ENGINE=InnoDB AUTO_INCREMENT=12000;

DROP TABLE clientes 


SHOW TABLES

DESCRIBE clientes

INSERT INTO clientes(nombre, apellido, direccion) 
VALUES('Alejandro', 'Perez', 'Independencia 190');

INSERT INTO clientes(nombre, apellido, direccion) 
VALUES('Laura', 'Hernandez', 'null'); 
 
SELECT * FROM clientes

SELECT nombre, apellido FROM clientes

SELECT * FROM clientes WHERE id = 12001; 

SELECT * FROM clientes LIMIT 1; 

UPDATE clientes SET nombre = 'Juan Pablo',
 direccion = 'Av. Avila 123' WHERE id = 12000; 
 
 DELETE FROM clientes WHERE id = 12000; 
 
 DESCRIBE clientes 
 
 ALTER TABLE clientes ADD email VARCHAR(30);
 ALTER TABLE  clientes DROP COLUMN email;
 
 
 
 
 
 
 
 
 
 DROP TABLE IF EXISTS `categoria`;
CREATE TABLE `categoria` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `platillos`;
CREATE TABLE `platillos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `disponible` tinyint(1) DEFAULT NULL,
  `categoriaId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `categoriaId` (`categoriaId`),
  CONSTRAINT `platillos_ibfk_1` FOREIGN KEY (`categoriaId`) REFERENCES `categoria` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 ;

DROP TABLE IF EXISTS `reservaciones`;
CREATE TABLE `reservaciones` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  `apellido` varchar(60) NOT NULL,
  `hora` time DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `cantidadmesa` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4;

INSERT INTO `categoria` (`id`, `nombre`) VALUES ('1', 'Desayunos'),
('2', 'Comida'),
('3', 'Bebidas'),
('4', 'Bebidas con Alcohol'),
('5', 'Postres'),
('6', 'Ensaladas');

INSERT INTO `platillos` (`id`, `nombre`, `precio`, `disponible`, `categoriaId`) VALUES ('1', 'Pastel de Chocolate', '89', '1', '5'),
('2', '400g de Rib Eye', '199', '1', '2'),
('3', 'Refresco', '25', '1', '3'),
('4', 'Café Americano', '35', '1', '3'),
('5', 'Tequila', '89', '1', '4'),
('6', 'Vodka con Jugo', '119', '1', '4'),
('7', 'Hot Cakes (3)', '119', '1', '1'),
('8', 'Omellete', '89', '0', '1'),
('9', 'Pastel de Zanahoria', '89', '0', '5'),
('10', 'Rol de Canela', '69', '1', '5'),
('11', 'Agua de Naranja', '79', '1', '3'),
('12', 'Chuletas de Cerdo', '179', '1', '2'),
('13', 'Costillas BBQ', '189', '1', '2'),
('14', 'Huevo al Gusto', '49', '1', '1'),
('15', 'Omellete Hiervas Finas y Queso de Cabra', '79', '1', '1'),
('16', 'Jugo de Zanahoria', '49', '0', '3'),
('17', 'Jugo de Narnaja', '49', '1', '3'),
('18', 'Jugo de Toronja', '49', '1', '3'),
('19', 'Ensalada Violeta', '89', '1', '6'),
('20', 'Ensalada de Higo', '89', '1', '6'),
('21', 'Ensalada Cesar', '89', '0', '6'),
('22', 'Club Sandwich', '99', '1', '1'),
('23', 'Sandwich Salami', '119', '1', '1'),
('24', 'Filete de Pescado Róbalo', '179', '0', '2'),
('25', 'Filete de Atún ', '179', '1', '2'),
('26', 'Milanesa de Pollo', '149', '1', '2'),
('27', 'Pierna de Ternera al Horno', '199', '1', '2'),
('28', 'Café Capuchino', '45', '1', '3'),
('29', 'Café Latte', '50', '1', '3'),
('30', 'Café Expresso', '25', '1', '3'),
('31', 'Vino Tinto Francia', '89', '0', '4'),
('32', 'Vino Tinto Chile', '89', '1', '4'),
('33', 'Vino Tinto México', '89', '1', '4'),
('34', 'Vino Tinto España', '89', '0', '4'),
('35', 'Vino Tinto Argentina', '89', '1', '4');

INSERT INTO `reservaciones` (`id`, `nombre`, `apellido`, `hora`, `fecha`, `cantidadmesa`) VALUES ('1', 'Juan', 'De la torre', '10:30:00', '2019-06-28', '3'),
('2', 'Antonio', 'Hernandez', '14:00:00', '2019-07-30', '2'),
('3', 'Pedro', 'Juarez', '20:00:00', '2019-06-25', '5'),
('4', 'Mireya', 'Perez', '19:00:00', '2019-06-25', '2'),
('5', 'Jose', 'Castillo', '14:00:00', '2019-07-30', '3'),
('6', 'Maria', 'Diaz', '14:30:00', '2019-06-25', '2'),
('7', 'Clara', 'Duran', '10:00:00', '2019-07-01', '3'),
('8', 'Miriam', 'Ibañez', '09:00:00', '2019-07-01', '3'),
('9', 'Samuel ', 'Reyes', '10:00:00', '2019-07-02', '2'),
('10', 'Joaquin', 'Muñoz', '19:00:00', '2019-06-28', '3'),
('11', 'Julia', 'Lopez', '08:00:00', '2019-06-25', '3'),
('12', 'Carmen', 'Ruiz', '20:00:00', '2019-07-01', '4'),
('13', 'Isaac', 'Sala', '09:00:00', '2019-07-30', '3'),
('14', 'Ana', 'Preciado', '14:30:00', '2019-06-28', '4'),
('15', 'Sergio', 'Iglesias', '10:00:00', '2019-07-02', '2'),
('16', 'Aina', 'Acosta', '14:00:00', '2019-07-30', '3'),
('17', 'Carlos', 'Ortiz', '20:00:00', '2019-06-25', '2'),
('18', 'Roberto', 'Serrano', '10:00:00', '2019-07-30', '4'),
('19', 'Carlota', 'Perez', '14:00:00', '2019-07-01', '2'),
('20', 'Ana Maria', 'Igleias', '14:00:00', '2019-07-02', '2'),
('21', 'Jaime', 'Jimenez', '14:00:00', '2019-07-01', '4'),
('22', 'Roberto ', 'Torres', '10:00:00', '2019-07-02', '3'),
('23', 'Juan', 'Cano', '09:00:00', '2019-07-02', '5'),
('24', 'Santiago', 'Hernandez', '19:00:00', '2019-06-28', '5'),
('25', 'Berta', 'Gomez', '09:00:00', '2019-07-01', '3'),
('26', 'Miriam', 'Dominguez', '19:00:00', '2019-06-28', '3'),
('27', 'Antonio', 'Castro', '14:30:00', '2019-07-02', '2'),
('28', 'Hugo', 'Alonso', '09:00:00', '2019-06-28', '2'),
('29', 'Victoria', 'Perez', '10:00:00', '2019-07-02', '1'),
('30', 'Jimena', 'Leon', '10:30:00', '2019-07-30', '2'),
('31', 'Raquel ', 'Peña', '20:30:00', '2019-06-25', '3');


SELECT * FROM platillos; 
SELECT * FROM reservaciones ORDER BY fecha
SELECT * FROM platillos ORDER BY precio DESC; 
SELECT COUNT(id), fecha FROM reservaciones GROUP BY fecha
ORDER BY COUNT(id)DESC; 

SELECT COUNT(id) cantidad, categoriaId FROM platillos GROUP BY categoriaId 
ORDER BY COUNT(id); 

SELECT * FROM platillos
INNER JOIN categoria ON categoria.id = platillos.categoriaId 

SELECT * FROM platillos
SELECT COUNT(platillos.id) cantidad, categoria.nombre FROM platillos 
inner join categoria ON platillos.categoriaId = categoria.id GROUP BY categoria.nombre

SELECT * FROM platillos  
WHERE precio 
BETWEEN 100 
AND 200

SELECT * FROM platillos 
WHERE nombre LIKE 'cafe%' 

SELECT * FROM platillos 
SELECT * FROM reservaciones; 

 
SELECT CONCAT(nombre , ' ', apellido ) 
FROM reservaciones 

SELECT CONCAT(nombre , ' ' , apellido ) nombre_cliente, hora, fecha, cantidadMesa
FROM reservaciones 
WHERE CONCAT (nombre , ' ' , apellido )
LIKE '%Ana Preciado%'  

FROM reservaciones 
SELECT * FROM reservaciones
WHERE cantidadMesa IN(2, 3)

SELECT * FROM clientes 
select * FROM productos
INSERT INTO clientes(nombre, apellido, direccion) 
VALUES('Alejandro', 'Perez', 'Independencia 190');

INSERT INTO clientes(nombre, apellido, direccion) 
VALUES('Rosa', 'Hernandez', 'Av. Cotilla 130'); 



INSERT INTO clientes(nombre, apellido, direccion) 
VALUES('Mario', 'Gonzalez', 'Av. Carrusel 280');

INSERT INTO clientes(nombre, apellido, direccion) 
VALUES('Andrea', 'Gomez', 'Av. Zaragoza 290'); 


INSERT INTO clientes(nombre, apellido, direccion) 
VALUES('Ana', 'Velasco', 'Av. Avila 243'); 

SHOW DATABASES 

CREATE DATABASE salvadora 

USE salvadora; 
CREATE TABLE CLIENT(
curp INT (10) NOT NULL, 
nombre VARCHAR (20), 
apellido VARCHAR (20), 
direccion TEXT (50), 
telefono INT (8)
PRIMARY KEY(curp)); 
DROP TABLE CLIENT;

SHOW TABLES;
 
USE salvadora; 
CREATE TABLE 'salvadora', 'proveedor'(
curp INT (10) NOT NULL, 
nombre VARCHAR (20), 
apellido VARCHAR (20), 
direccion TEXT (50), 
telefono INT (8)
PRIMARY KEY(curp)); 

USE salvadora; 
CREATE TABLE producto( 
codigo_producto INT (13) PRIMARY KEY autoIncrement, 
nombre VARCHAR(22), 
marca VARCHAR(22), 
color VARCHAR(22), 
modelo VARCHAR(22), 
stock INT(100))AUTO_INCREMENT = 100; 

CREATE TABLE compra(
curp INT(13), 
codigo_producto INT(13), 
fecha_compra DATE,
cantidad INT(100), 
PRIMARY KEY(curp, codigo_producto));

CREATE TABLE provee(
id_proveedor INT(10), 
codigo_producto INT(8), 
fecha DATE, 
cantidad INT(10), 
PRIMARY KEY(id_proveedor, codigo_producto));

DESCRIBE provee;

CREATE TABLE users(
id INT AUTO_INCREMENT PRIMARY KEY(10), 
username VARCHAR(50) UNIQUE NOT null,
email VARCHAR(100) UNIQUE NOT NULL,
age INT(10) UNSIGNED NOT NULL, 
STATUS ENUM('active', 'inactive') DEFAULT 'inactive',
bio TEXT,
created_at TIMESTAMP DEFAULT current_timestamp
); 

SHOW TABLES;
DESC users; 
DROP TABLE users 

CREATE TABLE users(
id INT(10) AUTO_INCREMENT PRIMARY KEY, 
username VARCHAR(50) UNIQUE NOT null,
email VARCHAR(100) UNIQUE NOT NULL,
age INT(10) UNSIGNED NOT NULL, 
STATUS ENUM('active', 'inactive') DEFAULT 'inactive',
bio TEXT,
created_at TIMESTAMP DEFAULT current_timestamp
); 

DESC users;
SELECT * FROM users;

INSERT INTO users (username, email, age, status, bio) VALUES('user11', 'user11@test.com', 17, 'active', null);
INSERT INTO users (username, email, age, status, bio) VALUES('user2', 'user2@test.com', 22, 'active', NULL);
INSERT INTO users (username, email, age, status, bio) VALUES('user3', 'user3@test.com', 32, 'active', NULL);
INSERT INTO users (username, email, age, status, bio) VALUES('user4', 'user4@test.com', 27, 'active', NULL);
INSERT INTO users (username, email, age, status, bio) VALUES('user5', 'user5@test.com', 13, 'active', NULL);
INSERT INTO users (username, email, age, status, bio) VALUES('user6', 'user6@test.com', 16, 'active','Simle bio');
INSERT INTO users (username, email, age, status, bio) VALUES('user7', 'user7@test.com', 25, 'active', 'Simle bio');
INSERT INTO users (username, email, age, status, bio) VALUES('user8', 'user8@test.com', 24, 'active', 'Simle bio');

SELECT * FROM users WHERE id = 8; 

SELECT * FROM users WHERE id = 9; 

SELECT * FROM users WHERE age > 25 
SELECT * FROM users WHERE age < 30 

SELECT * FROM users bio IS NULL; 
SELECT * FROM users bio IS NOT NULL;  

SELECT * FROM users WHERE created_at > '2022-03-07';

SELECT * FROM users WHERE DATE(created_at) = '2022-03-07'; 

SELECT * FROM users WHERE id = 1 OR id = 2 OR id = 3 OR id = 4; 
 
SELECT age FROM users WHERE age >= 18; 

SELECT * FROM users ORDER BY age ASC; 
SELECT * FROM users ORDER BY age DESC; 

SELECT username, email FROM users ORDER BY age ASC LIMIT 1;  
SELECT username, email, age FROM users WHERE DATE(created_at) = '2022-03-07'; 

SELECT *FROM users WHERE id = 1 OR id = 8 OR id = 9 OR id = 10; 
SELECT * FROM users WHERE id IN (1, 8, 9, 10); 

SELECT username, email, age FROM users WHERE age > 20 AND age < 55; 

SELECT * FROM users WHERE email LIKE '%com'; 
SELECT * FROM users WHERE email LIKE 'user%'; 

UPDATE users SET bio ='Desarrollador de software(Backend)', username = 'Blancuras' WHERE id = 8; 
DELETE FROM users WHERE id = 12; 

SELECT * FROM users; 

SELECT * FROM  users WHERE email LIKE '%com'; 
SELECT * FROM users WHERE email LIKE '%8@%'; 

INSERT INTO users(username, email,) VALUES ('user5', 'user5@test.com');
--un usuario puede poseer multiples comentarios 
--Comentario le pertenece a un usuario
--Comments 

CREATE TABLE comments(
id INT AUTO_INCREMENT PRIMARY KEY, --unico
title VARCHAR(50), 
user_id INT(10), --llave foranea
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
FOREIGN KEY (user_id) REFERENCES users(id)
ON DELETE CASCADE );

DESC comments;
SELECT * from users;
INSERT INTO comments(title, user_id) VALUES ('Titulo 15', 9)
SELECT * FROM comments;
DELETE FROM users WHERE id = 9; 

SELECT * FROM users LEFT JOIN comments ON users.id = comments.user_id 
WHERE comments.user_id IS NOT NULL; 

SELECT * FROM comments

SELECT users.username, users.email, COUNT(*) 'cantidad_comentarios' 
FROM users INNER JOIN comments ON users.id = comments.user_id 
WHERE DATE( comments.created_at ) = '2022-03-08' GROUP BY users.username
ORDER BY cantidad_comentarios DESC
LIMIT 1;

SET @username = 'user3'
SELECT @username 

SELECT @username AS 'valor' 

SELECT * FROM users WHERE username = @username
SET @username = 'user6'
SELECT * FROM users WHERE username = @username; 
SELECT id FROM users WHERE STATUS = 'active' ORDER BY created_at DESC LIMIT 1;
SET @id =(SELECT id FROM users WHERE STATUS = 'active' ORDER BY created_at DESC LIMIT 1);
SELECT @id 

CREATE TABLE 'alumnos'(
'id' INTEGER NOT NULL , 
'nombre' VARCHAR(80) NOT NULL ,
'apellido' VARCHAR(80) NOT NULL, 
'email' VARCHAR(225) NOT NULL, 
'telefono' VARCHAR(45) NOT NULL,
'acedemia_id' INTEGER NOT NULL, 

PRIMARY KEY ('id'), 
KEY 'Ffkix_35'('academia_id'), 
constrain 'Fk_34' FOREIGN key
) 
SELECT * FROM usuario

CREATE TABLE usuario (
id INT(11) NOT NULL AUTO_INCREMENT, 
nombre VARCHAR(80) NOT NULL, 
apellido VARCHAR(80) NOT NULL, 
fecha_nacimiento DATETIME NULL
PRIMARY KEY (id)); 
DROP TABLE pmi.usuario



pmi
CREATE TABLE usuario (
id INT(11) NOT NULL AUTO_INCREMENT, 
nombre VARCHAR(80) NOT NULL, 
apellido VARCHAR(80) NOT NULL, 
fecha_nacimiento DATETIME NULL
PRIMARY KEY (id)); 



CREATE TABLE usuuarios(
id INT(11) NOT NULL AUTO_INCREMENT, 
nombre VARCHAR(80) NOT NULL, 
apellido VARCHAR(80) NOT NULL, 
fecha_nacimiento DATETIME NULL,
PRIMARY KEY (id));  

ALTER TABLE usuuarios ADD COLUMN telefono1 VARCHAR(45) NULL; 
ALTER TABLE usuuarios MODIFY COLUMN telefono1 VARCHAR(30) NULL; 

INSERT INTO usuuarios (
nombre, apellido, fecha_nacimiento, telefono1)
VALUES ('Lucas', 'Moy', '1998-04-04 10:00:00', '12344567'); 

INSERT INTO usuuarios (
nombre, apellido, fecha_nacimiento, telefono1)
VALUES ('Pepe', 'Moy', '19-04-04 10:00:00', '12344567');  

INSERT INTO usuuarios (
nombre, apellido, fecha_nacimiento, telefono1)
VALUES ('Pepe', 'Moy', '19-04-04 10:00:00', '1234477667'); 

SELECT COUNT (*) AS 'cantidad' FROM usuuarios WHERE apellido = 'Moy' and nombre = 'Lucas';

UPDATE usuuarios SET nombre = 'Pepe', apellido = 'Angelini' WHERE id = 2; 

SELECT * FROM usuuarios
SELECT * from usuuarios WHERE apellido LIKE 'Mo%' 

CREATE TABLE publicaciones (
id INT(11) NOT NULL AUTO_INCREMENT, 
autor_id INT(11) NOT NULL, 
titulo VARCHAR(150) NOT NULL, 
texto text(80) NOT NULL, 
PRIMARY KEY(id), 
FOREIGN KEY(autor_id) REFERENCES usuuarios(id)
);  
SELECT * FROM publicaciones

INSERT INTO publicaciones( 
autor_id, titulo, texto
) VALUES (
'3', 'Prueba de Publicacion'
)