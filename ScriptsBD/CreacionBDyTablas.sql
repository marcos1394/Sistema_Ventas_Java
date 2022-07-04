-- crear base de datos
create database bd_sistema_ventas;

use bd_sistema_ventas;


-- crear tabla usuarios 
create table tb_usuarios(
idUsuario int (11) auto_increment primary key,
nombre varchar (30) not null,
apellido_paterno varchar (30) not null,
apellido_materno varchar (30) not null,
usuario varchar (15) not null,
password varchar (15) not null,
correo_electronico varchar (50) not null,
telefono int (10) not null,
tipo_usuario int (1) not null,
estado_activacion int (1) not null default 1
);

 -- creacion tabla clientes
create table tb_clientes(
idCliente int(11) auto_increment primary key,
nombre varchar (30) not null,
apellido_paterno varchar (30) not null,
apellido_materno varchar (30) not null,
telefono int (10) not null,
ciudad varchar (30) not null,
estado_republica varchar (30) not null,
pais varchar (30) not null,
estado_activacion int (1) not null default 1
);

-- crear tabla categorias
use bd_sistema_ventas;
create table tb_categoria(
idCategoria int(11) auto_increment primary key,
descripcion varchar (200) not null,
estado int (1) not null
);

-- crear tabla productos
use bd_sistema_ventas;
create table tb_productos(
idProducto int (11) auto_increment primary key,
nombre_producto varchar (100) not null,
cantidad int (11) not null,
precio double(10,2) not null,
descripcion varchar (200) not null,
porcentajeIva int (2) not null,
idCategoria int (11) not null,
estado int (1) not null default 1
);

-- crear tabla registro de venta
use bd_sistema_ventas;
create table tb_registro_venta(
idRegistroVenta int (11) auto_increment primary key,
idCliente int (11) not null,
valorPagar double (10,2) not null,
fechaVenta date not null,
estado int (1) not null
);

-- crear tabla detalle de venta
use bd_sistema_ventas;
create table tb_detalle_venta(
idDetalleVenta int (11) auto_increment primary key,
idRegistroVenta int (11) not null,
idProducto int (11) not null,
cantidad int (11) not null,
precio_unitario double(10,2) not null,
subtotal double(10,2) not null,
descuento double (10,2) not null,
iva double (10,2) not null,
totalPagar double (10,2) not null,
estado int (1) not null default 1
);
show tables;
