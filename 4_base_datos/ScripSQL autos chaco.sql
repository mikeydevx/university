create database if not exists autos_chachos
character set utf8mb4
collate utf8mb4_spanish_ci;

use autos_chachos;

drop table if exists servicios;
drop table if exists ventas;
drop table if exists taller;
drop table if exists automovil;
drop table if exists clientes;

-- tabla clientes
create table clientes(
    rfc varchar(13) not null,
    nombre varchar(40) not null,
    a_pat varchar(40) not null,
    a_mat varchar(40) not null,
    calle varchar(60) not null,
    numero varchar(6) not null,
    colonia varchar(20) not null,
    cp varchar(5) not null,
    ciudad varchar(25) not null,
    estado varchar(25) not null,
    telefono varchar(10) not null,
    sexo varchar(1) not null,
    f_nac date not null,
    primary key(rfc)
);

-- tabla automovil
create table automovil(
    id_vehiculo varchar(5) not null,
    serie varchar(15) not null,
    marca varchar(15) not null,
    modelo varchar(20) not null,
    color varchar(15) not null,
    anio year not null,
    precio decimal(9,2) not null,
    primary key(id_vehiculo)
);

-- tabla taller
create table taller(
    id_taller varchar(5) not null,
    nombre_t varchar(30) not null,
    domicilio varchar(50) not null,
    j_mecanico varchar(80) not null,
    mail varchar(30) not null,
    telefono varchar(10) not null,
    primary key(id_taller)
);

-- tabla ventas
create table ventas(
    id_vta int auto_increment not null,
    rfc varchar(13) not null,
    id_vehiculo varchar(5) not null,
    f_contrato date not null,
    f_venta date not null,
    factura varchar(6) not null,
    primary key(id_vta),
    foreign key(rfc) references clientes(rfc),
    foreign key(id_vehiculo) references automovil(id_vehiculo)
);

-- tabla servicios
create table servicios(
    id_rev int auto_increment not null,
    id_vehiculo varchar(5) not null,
    id_taller varchar(5) not null,
    f_rev date not null,
    km int not null,
    observaciones varchar(80) not null,
    primary key(id_rev),
    foreign key(id_vehiculo) references automovil(id_vehiculo),
    foreign key(id_taller) references taller(id_taller)
);

INSERT INTO clientes (rfc, nombre, a_pat, a_mat, calle, numero, colonia, cp, ciudad, estado, telefono, sexo, f_nac) VALUES
('PEGJ750515001', 'Juan', 'Pérez', 'García', 'Av. Reforma', '123', 'Centro', '01000', 'Ciudad de México', 'Ciudad de México', '5512345678', 'M', '1975-05-15'),
('LOMM750320002', 'María', 'López', 'Martínez', 'Calle Juárez', '456', 'Americana', '44100', 'Guadalajara', 'Jalisco', '3323456789', 'F', '1975-03-20'),
('GORJ790415003', 'José', 'González', 'Rodríguez', 'Av. Constitución', '789', 'Centro', '64000', 'Monterrey', 'Nuevo León', '8134567890', 'M', '1979-04-15'),
('FESA850101004', 'Ana', 'Fernández', 'Sánchez', 'Calle 5 de Mayo', '101', 'Histórica', '72000', 'Puebla', 'Puebla', '2245678901', 'F', '1985-01-01'),
('RAFP900505005', 'Pedro', 'Ramírez', 'Flores', 'Av. Independencia', '202', 'Centro', '50000', 'Toluca', 'Estado de México', '7225678901', 'M', '1990-05-05'),
('MOML950815006', 'Luis', 'Morales', 'Ortiz', 'Calle Corregidora', '303', 'Centro', '76000', 'Querétaro', 'Querétaro', '4426789012', 'M', '1995-08-15'),
('CURC851010007', 'Carmen', 'Cruz', 'Reyes', 'Av. Benito Juárez', '404', 'Centro', '37000', 'León', 'Guanajuato', '4777890123', 'F', '1985-10-10'),
('GUMC790505008', 'Carlos', 'Gutiérrez', 'Mendoza', 'Calle Tulum', '505', 'Centro', '77500', 'Cancún', 'Quintana Roo', '9988901234', 'M', '1979-05-05'),
('HESM750808009', 'Martha', 'Herrera', 'Silva', 'Calle 60', '606', 'Centro', '97000', 'Mérida', 'Yucatán', '9999012345', 'F', '1975-08-08'),
('CARM900202010', 'Miguel', 'Castro', 'Romero', 'Av. Serdán', '707', 'Centro', '83000', 'Hermosillo', 'Sonora', '6620123456', 'M', '1990-02-02'),
('RECR850303011', 'Rosa', 'Reyes', 'Castro', 'Calle Victoria', '808', 'Centro', '31000', 'Chihuahua', 'Chihuahua', '6141234567', 'F', '1985-03-03'),
('OIOJ790909012', 'Javier', 'Ortiz', 'Olvera', 'Calle Madrid', '909', 'Roma', '06000', 'Ciudad de México', 'Ciudad de México', '5523456789', 'M', '1979-09-09'),
('MALG750505013', 'Guadalupe', 'Martínez', 'López', 'Av. Vallarta', '111', 'Providencia', '44200', 'Guadalajara', 'Jalisco', '3345678901', 'F', '1975-05-05'),
('GAPA790606014', 'Antonio', 'García', 'Pérez', 'Calle Morelos', '222', 'Centro', '64100', 'Monterrey', 'Nuevo León', '8145678901', 'M', '1979-06-06'),
('ROFP850707015', 'Patricia', 'Rodríguez', 'Fernández', 'Av. Reforma', '333', 'Centro', '72100', 'Puebla', 'Puebla', '2256789012', 'F', '1985-07-07'),
('SARF900808016', 'Francisco', 'Sánchez', 'Ramírez', 'Calle Hidalgo', '444', 'Centro', '50100', 'Toluca', 'Estado de México', '7226789012', 'M', '1990-08-08'),
('FOME950909017', 'Elizabeth', 'Flores', 'Morales', 'Av. Universidad', '555', 'Centro', '76100', 'Querétaro', 'Querétaro', '4427890123', 'F', '1995-09-09'),
('GOGA950505018', 'Alejandro', 'González', 'Gutiérrez', 'Calle López Mateos', '666', 'Centro', '37100', 'León', 'Guanajuato', '4778901234', 'M', '1995-05-05'),
('LOOT790808019', 'Teresa', 'López', 'Ortiz', 'Av. Cobá', '777', 'Centro', '77600', 'Cancún', 'Quintana Roo', '9989012345', 'F', '1979-08-08'),
('HECR750909020', 'Roberto', 'Hernández', 'Cruz', 'Calle 59', '888', 'Centro', '97100', 'Mérida', 'Yucatán', '9990123456', 'M', '1975-09-09'),
('PEGM790101021', 'Manuel', 'Pérez', 'González', 'Av. Veracruz', '999', 'Centro', '83100', 'Hermosillo', 'Sonora', '6621234567', 'M', '1979-01-01'),
('MAGL850202022', 'Laura', 'Martínez', 'García', 'Calle Juárez', '1010', 'Centro', '31100', 'Chihuahua', 'Chihuahua', '6142345678', 'F', '1985-02-02'),
('RARJ900303023', 'Jorge', 'Ramírez', 'Rodríguez', 'Av. Insurgentes', '1111', 'Del Valle', '01000', 'Ciudad de México', 'Ciudad de México', '5534567890', 'M', '1990-03-03'),
('FELV950404024', 'Verónica', 'Fernández', 'López', 'Calle Pedro Moreno', '1212', 'Centro', '44100', 'Guadalajara', 'Jalisco', '3345678901', 'F', '1995-04-04'),
('MOSA790505025', 'Andrés', 'Morales', 'Sánchez', 'Av. Pino Suárez', '1313', 'Centro', '64000', 'Monterrey', 'Nuevo León', '8156789012', 'M', '1979-05-05'),
('CUMD850606026', 'Daniela', 'Cruz', 'Martínez', 'Calle 2 Oriente', '1414', 'Centro', '72000', 'Puebla', 'Puebla', '2267890123', 'F', '1985-06-06'),
('REFR900707027', 'Ricardo', 'Reyes', 'Flores', 'Av. Paseo Tollocan', '1515', 'Centro', '50000', 'Toluca', 'Estado de México', '7227890123', 'M', '1990-07-07'),
('OIHP950808028', 'Paulina', 'Ortiz', 'Herrera', 'Calle Venustiano Carranza', '1616', 'Centro', '76000', 'Querétaro', 'Querétaro', '4428901234', 'F', '1995-08-08'),
('SICE790909029', 'Eduardo', 'Silva', 'Castro', 'Av. Revolución', '1717', 'Centro', '37000', 'León', 'Guanajuato', '4779012345', 'M', '1979-09-09'),
('GURG850101030', 'Gabriela', 'Gutiérrez', 'Reyes', 'Calle Nader', '1818', 'Centro', '77500', 'Cancún', 'Quintana Roo', '9980123456', 'F', '1985-01-01'),
('GOPE900202031', 'Ernesto', 'González', 'Pérez', 'Calle 57', '1919', 'Centro', '97000', 'Mérida', 'Yucatán', '9991234567', 'M', '1990-02-02'),
('ROHM950303032', 'Mariana', 'Rodríguez', 'Hernández', 'Av. De los Ángeles', '2020', 'Centro', '83000', 'Hermosillo', 'Sonora', '6622345678', 'F', '1995-03-03'),
('MAOF790404033', 'Fernando', 'Martínez', 'Ortiz', 'Calle Ocampo', '2121', 'Centro', '31000', 'Chihuahua', 'Chihuahua', '6143456789', 'M', '1979-04-04'),
('SAGC850505034', 'Cecilia', 'Sánchez', 'García', 'Calle Florencia', '2222', 'Zona Rosa', '06000', 'Ciudad de México', 'Ciudad de México', '5545678901', 'F', '1985-05-05'),
('LOFO900606035', 'Oscar', 'López', 'Fernández', 'Av. La Paz', '2323', 'Centro', '44200', 'Guadalajara', 'Jalisco', '3356789012', 'M', '1990-06-06'),
('RAMI950707036', 'Isabel', 'Ramírez', 'Morales', 'Calle Matamoros', '2424', 'Centro', '64100', 'Monterrey', 'Nuevo León', '8167890123', 'F', '1995-07-07'),
('FOCA790808037', 'Alejandro', 'Flores', 'Cruz', 'Av. Juárez', '2525', 'Centro', '72100', 'Puebla', 'Puebla', '2278901234', 'M', '1979-08-08'),
('HEGP850909038', 'Patricia', 'Herrera', 'Gutiérrez', 'Calle Nicolás Bravo', '2626', 'Centro', '50100', 'Toluca', 'Estado de México', '7228901234', 'F', '1985-09-09'),
('CASF901010039', 'Francisco', 'Castro', 'Silva', 'Av. Zaragoza', '2727', 'Centro', '76100', 'Querétaro', 'Querétaro', '4429012345', 'M', '1990-10-10'),
('MEMR951111040','Rosa', 'Mendoza', 'Martínez', 'Calle Poniente', '2828', 'Centro', '37100', 'León', 'Guanajuato', '4770123456', 'F', '1995-11-11');
insert into automovil
(id_vehiculo, serie, marca, modelo, color, anio, precio)
values
('V0001', 'SERIE000000001', 'Nissan', 'Versa', 'Blanco', 2022, 285000.00),
('V0002', 'SERIE000000002', 'Toyota', 'Corolla', 'Gris', 2021, 320000.00),
('V0003', 'SERIE000000003', 'Volkswagen', 'Jetta', 'Negro', 2020, 310000.00),
('V0004', 'SERIE000000004', 'Honda', 'Civic', 'Rojo', 2023, 410000.00),
('V0005', 'SERIE000000005', 'Mazda', 'Mazda 3', 'Azul', 2022, 365000.00),
('V0006', 'SERIE000000006', 'Chevrolet', 'Aveo', 'Plata', 2021, 245000.00),
('V0007', 'SERIE000000007', 'Kia', 'Rio', 'Blanco', 2022, 275000.00),
('V0008', 'SERIE000000008', 'Hyundai', 'Elantra', 'Negro', 2020, 295000.00),
('V0009', 'SERIE000000009', 'Ford', 'Focus', 'Azul', 2019, 260000.00),
('V0010', 'SERIE000000010', 'Seat', 'Ibiza', 'Rojo', 2023, 300000.00),
('V0011', 'SERIE000000011', 'Renault', 'Duster', 'Gris', 2022, 360000.00),
('V0012', 'SERIE000000012', 'Suzuki', 'Swift', 'Amarillo', 2021, 255000.00),
('V0013', 'SERIE000000013', 'Mitsubishi', 'Mirage', 'Blanco', 2020, 220000.00),
('V0014', 'SERIE000000014', 'Peugeot', '208', 'Azul', 2022, 310000.00),
('V0015', 'SERIE000000015', 'Dodge', 'Attitude', 'Plata', 2021, 240000.00),
('V0016', 'SERIE000000016', 'Jeep', 'Renegade', 'Verde', 2023, 430000.00),
('V0017', 'SERIE000000017', 'BMW', 'Serie 1', 'Negro', 2020, 520000.00),
('V0018', 'SERIE000000018', 'Mercedes', 'Clase A', 'Blanco', 2021, 610000.00),
('V0019', 'SERIE000000019', 'Audi', 'A3', 'Gris', 2022, 590000.00),
('V0020', 'SERIE000000020', 'Tesla', 'Model 3', 'Rojo', 2023, 780000.00),
('V0021', 'SERIE000000021', 'Nissan', 'Sentra', 'Azul', 2021, 350000.00),
('V0022', 'SERIE000000022', 'Toyota', 'Yaris', 'Blanco', 2022, 290000.00),
('V0023', 'SERIE000000023', 'Volkswagen', 'Polo', 'Negro', 2020, 250000.00),
('V0024', 'SERIE000000024', 'Honda', 'Accord', 'Gris', 2021, 540000.00),
('V0025', 'SERIE000000025', 'Mazda', 'CX-3', 'Rojo', 2022, 415000.00),
('V0026', 'SERIE000000026', 'Chevrolet', 'Onix', 'Plata', 2023, 285000.00),
('V0027', 'SERIE000000027', 'Kia', 'Forte', 'Azul', 2021, 335000.00),
('V0028', 'SERIE000000028', 'Hyundai', 'Tucson', 'Blanco', 2020, 460000.00),
('V0029', 'SERIE000000029', 'Ford', 'Escape', 'Negro', 2022, 510000.00),
('V0030', 'SERIE000000030', 'Seat', 'Leon', 'Rojo', 2023, 420000.00),
('V0031', 'SERIE000000031', 'Renault', 'Kwid', 'Naranja', 2021, 230000.00),
('V0032', 'SERIE000000032', 'Suzuki', 'Vitara', 'Gris', 2020, 390000.00),
('V0033', 'SERIE000000033', 'Mitsubishi', 'L200', 'Blanco', 2022, 570000.00),
('V0034', 'SERIE000000034', 'Peugeot', '3008', 'Azul', 2023, 620000.00),
('V0035', 'SERIE000000035', 'Dodge', 'Journey', 'Negro', 2020, 430000.00),
('V0036', 'SERIE000000036', 'Jeep', 'Compass', 'Verde', 2021, 550000.00),
('V0037', 'SERIE000000037', 'BMW', 'X1', 'Blanco', 2022, 720000.00),
('V0038', 'SERIE000000038', 'Mercedes', 'GLA', 'Gris', 2023, 820000.00),
('V0039', 'SERIE000000039', 'Audi', 'Q3', 'Azul', 2021, 760000.00),
('V0040', 'SERIE000000040', 'Tesla', 'Model Y', 'Blanco', 2023, 890000.00);
insert into taller
(id_taller, nombre_t, domicilio, j_mecanico, mail, telefono)
values
('T0001', 'Taller Central', 'Av. Juarez 150', 'Roberto Salinas', 'central@gmail.com', '7221112233'),
('T0002', 'Autoservicio Norte', 'Calle Norte 80', 'Miguel Herrera', 'norte@gmail.com', '7222223344'),
('T0003', 'Servicio Express', 'Av. Tecnologico 320', 'Jorge Medina', 'express@gmail.com', '7223334455'),
('T0004', 'Taller Los Pinos', 'Calle Pinos 45', 'Eduardo Cruz', 'pinos@gmail.com', '7224445566'),
('T0005', 'Mecanica Integral', 'Av. Torres 220', 'Ramon Vargas', 'integral@gmail.com', '7225556677'),
('T0006', 'Taller del Valle', 'Av. Valle 100', 'Luis Aguilar', 'valle@gmail.com', '7226667788'),
('T0007', 'Servicio Rapido', 'Calle Sur 210', 'Mario Rojas', 'rapido@gmail.com', '7227778899'),
('T0008', 'Autos Chachos 1', 'Av. Central 55', 'Carlos Peña', 'chachos1@gmail.com', '7228889900'),
('T0009', 'Taller Diamante', 'Calle Diamante 20', 'Hector Leon', 'diamante@gmail.com', '7229990011'),
('T0010', 'Taller Oriente', 'Av. Oriente 500', 'Sergio Paz', 'oriente@gmail.com', '7221011121'),
('T0011', 'Taller Poniente', 'Calle Luna 45', 'Alberto Ruiz', 'poniente@gmail.com', '7221213141'),
('T0012', 'Mecanica Lopez', 'Av. Sol 78', 'David Lopez', 'lopez@gmail.com', '7221415161'),
('T0013', 'Servicio Ruiz', 'Calle Rio 90', 'Rogelio Ruiz', 'ruiz@gmail.com', '7221617181'),
('T0014', 'Taller Castillo', 'Av. Castillo 33', 'Ignacio Mora', 'castillo@gmail.com', '7221819202'),
('T0015', 'Autoservicio Sur', 'Calle Sur 400', 'Daniel Soto', 'sur@gmail.com', '7222021222'),
('T0016', 'Taller Moderno', 'Av. Moderna 88', 'Oscar Vega', 'moderno@gmail.com', '7222223242'),
('T0017', 'Taller Premium', 'Calle Elite 12', 'Raul Nava', 'premium@gmail.com', '7222425262'),
('T0018', 'Mecanica Total', 'Av. Patria 60', 'Pablo Cano', 'total@gmail.com', '7222627282'),
('T0019', 'Servicio Bravo', 'Calle Bravo 51', 'Jaime Bravo', 'bravo@gmail.com', '7222829303'),
('T0020', 'Taller Estrella', 'Av. Estrella 99', 'Adrian Ponce', 'estrella@gmail.com', '7223031323'),
('T0021', 'Taller Hidalgo', 'Calle Hidalgo 7', 'Gerardo Luna', 'hidalgo@gmail.com', '7223233343'),
('T0022', 'Taller Morelos', 'Av. Morelos 44', 'Ivan Reyes', 'morelos@gmail.com', '7223435363'),
('T0023', 'Autos Pro', 'Calle Progreso 19', 'Felipe Silva', 'autospro@gmail.com', '7223637383'),
('T0024', 'Mecanica Garcia', 'Av. Garcia 200', 'Victor Garcia', 'garcia@gmail.com', '7223839404'),
('T0025', 'Servicio Elite', 'Calle Palma 75', 'Leonardo Cruz', 'elite@gmail.com', '7224041424'),
('T0026', 'Taller Express 2', 'Av. Pino 11', 'Martin Mora', 'express2@gmail.com', '7224243444'),
('T0027', 'Taller America', 'Calle America 66', 'Angel Torres', 'america@gmail.com', '7224445464'),
('T0028', 'Autoservicio Plus', 'Av. Plus 120', 'Cristian Ramos', 'plus@gmail.com', '7224647484'),
('T0029', 'Taller Omega', 'Calle Omega 5', 'Nestor Ibarra', 'omega@gmail.com', '7224849505'),
('T0030', 'Servicio Delta', 'Av. Delta 300', 'Bruno Casas', 'delta@gmail.com', '7225051525'),
('T0031', 'Taller Falcon', 'Calle Halcon 22', 'Emilio Franco', 'falcon@gmail.com', '7225253545'),
('T0032', 'Mecanica Rojas', 'Av. Rojas 18', 'Joaquin Rojas', 'rojas@gmail.com', '7225455565'),
('T0033', 'Taller del Sol', 'Calle Sol 40', 'Hugo Campos', 'sol@gmail.com', '7225657585'),
('T0034', 'Servicio Luna', 'Av. Luna 49', 'Diego Prieto', 'luna@gmail.com', '7225859606'),
('T0035', 'Taller Titan', 'Calle Titan 9', 'Mauricio Diaz', 'titan@gmail.com', '7226061626'),
('T0036', 'Mecanica Union', 'Av. Union 70', 'Elias Robles', 'union@gmail.com', '7226263646'),
('T0037', 'Taller Rayo', 'Calle Rayo 77', 'Omar Mejia', 'rayo@gmail.com', '7226465666'),
('T0038', 'Autoservicio Rey', 'Av. Rey 13', 'Marco Lara', 'rey@gmail.com', '7226667686'),
('T0039', 'Taller Sierra', 'Calle Sierra 35', 'Cesar Flores', 'sierra@gmail.com', '7226869707'),
('T0040', 'Servicio Master', 'Av. Master 101', 'Julio Santos', 'master@gmail.com', '7227071727');
insert into ventas
(rfc, id_vehiculo, f_contrato, f_venta, factura)
values
('PEGJ750515001', 'V0001', '2026-01-01', '2026-01-06', 'F00001'),
('LOMM750320002', 'V0002', '2026-02-02', '2026-02-07', 'F00002'),
('GORJ790415003', 'V0003', '2026-03-03', '2026-03-08', 'F00003'),
('FESA850101004', 'V0004', '2026-04-04', '2026-04-09', 'F00004'),
('RAFP900505005', 'V0005', '2026-05-05', '2026-05-10', 'F00005'),
('MOML950815006', 'V0006', '2026-06-06', '2026-06-11', 'F00006'),
('CURC851010007', 'V0007', '2026-07-07', '2026-07-12', 'F00007'),
('GUMC790505008', 'V0008', '2026-08-08', '2026-08-13', 'F00008'),
('HESM750808009', 'V0009', '2026-09-09', '2026-09-14', 'F00009'),
('CARM900202010', 'V0010', '2026-10-10', '2026-10-15', 'F00010'),
('RECR850303011', 'V0011', '2026-11-11', '2026-11-16', 'F00011'),
('OIOJ790909012', 'V0012', '2026-12-12', '2026-12-17', 'F00012'),
('MALG750505013', 'V0013', '2026-01-13', '2026-01-18', 'F00013'),
('GAPA790606014', 'V0014', '2026-02-14', '2026-02-19', 'F00014'),
('ROFP850707015', 'V0015', '2026-03-15', '2026-03-20', 'F00015'),
('SARF900808016', 'V0016', '2026-04-16', '2026-04-21', 'F00016'),
('FOME950909017', 'V0017', '2026-05-17', '2026-05-22', 'F00017'),
('GOGA950505018', 'V0018', '2026-06-18', '2026-06-23', 'F00018'),
('LOOT790808019', 'V0019', '2026-07-19', '2026-07-24', 'F00019'),
('HECR750909020', 'V0020', '2026-08-20', '2026-08-25', 'F00020'),
('PEGM790101021', 'V0021', '2026-09-01', '2026-09-06', 'F00021'),
('MAGL850202022', 'V0022', '2026-10-02', '2026-10-07', 'F00022'),
('RARJ900303023', 'V0023', '2026-11-03', '2026-11-08', 'F00023'),
('FELV950404024', 'V0024', '2026-12-04', '2026-12-09', 'F00024'),
('MOSA790505025', 'V0025', '2026-01-05', '2026-01-10', 'F00025'),
('CUMD850606026', 'V0026', '2026-02-06', '2026-02-11', 'F00026'),
('REFR900707027', 'V0027', '2026-03-07', '2026-03-12', 'F00027'),
('OIHP950808028', 'V0028', '2026-04-08', '2026-04-13', 'F00028'),
('SICE790909029', 'V0029', '2026-05-09', '2026-05-14', 'F00029'),
('GURG850101030', 'V0030', '2026-06-10', '2026-06-15', 'F00030'),
('GOPE900202031', 'V0031', '2026-07-11', '2026-07-16', 'F00031'),
('ROHM950303032', 'V0032', '2026-08-12', '2026-08-17', 'F00032'),
('MAOF790404033', 'V0033', '2026-09-13', '2026-09-18', 'F00033'),
('SAGC850505034', 'V0034', '2026-10-14', '2026-10-19', 'F00034'),
('LOFO900606035', 'V0035', '2026-11-15', '2026-11-20', 'F00035'),
('RAMI950707036', 'V0036', '2026-12-16', '2026-12-21', 'F00036'),
('FOCA790808037', 'V0037', '2026-01-17', '2026-01-22', 'F00037'),
('HEGP850909038', 'V0038', '2026-02-18', '2026-02-23', 'F00038'),
('CASF901010039', 'V0039', '2026-03-19', '2026-03-24', 'F00039'),
('MEMR951111040', 'V0040', '2026-04-20', '2026-04-25', 'F00040');
insert into servicios
(id_vehiculo, id_taller, f_rev, km, observaciones)
values
('V0001', 'T0001', '2026-03-11', 11500, 'Cambio de aceite'),
('V0002', 'T0002', '2026-04-12', 13000, 'Alineacion y balanceo'),
('V0003', 'T0003', '2026-05-13', 14500, 'Cambio de frenos'),
('V0004', 'T0004', '2026-06-14', 16000, 'Servicio preventivo'),
('V0005', 'T0005', '2026-07-15', 17500, 'Cambio de filtros'),
('V0006', 'T0006', '2026-08-16', 19000, 'Revision de motor'),
('V0007', 'T0007', '2026-09-17', 20500, 'Revision electrica'),
('V0008', 'T0008', '2026-10-18', 22000, 'Rotacion de llantas'),
('V0009', 'T0009', '2026-11-19', 23500, 'Cambio de bateria'),
('V0010', 'T0010', '2026-12-20', 25000, 'Revision de suspension'),
('V0011', 'T0011', '2026-01-01', 26500, 'Cambio de bujias'),
('V0012', 'T0012', '2026-02-02', 28000, 'Revision de luces'),
('V0013', 'T0013', '2026-03-03', 29500, 'Cambio de anticongelante'),
('V0014', 'T0014', '2026-04-04', 31000, 'Revision de transmision'),
('V0015', 'T0015', '2026-05-05', 32500, 'Lavado de inyectores'),
('V0016', 'T0016', '2026-06-06', 34000, 'Cambio de llantas'),
('V0017', 'T0017', '2026-07-07', 35500, 'Revision general'),
('V0018', 'T0018', '2026-08-08', 37000, 'Cambio de clutch'),
('V0019', 'T0019', '2026-09-09', 38500, 'Servicio mayor'),
('V0020', 'T0020', '2026-10-10', 40000, 'Revision de aire acondicionado'),
('V0021', 'T0021', '2026-11-11', 41500, 'Cambio de limpiadores'),
('V0022', 'T0022', '2026-12-12', 43000, 'Revision de direccion'),
('V0023', 'T0023', '2026-01-13', 44500, 'Diagnostico completo'),
('V0024', 'T0024', '2026-02-14', 46000, 'Cambio de balatas'),
('V0025', 'T0025', '2026-03-15', 47500, 'Revision de sensores'),
('V0026', 'T0026', '2026-04-16', 49000, 'Cambio de aceite sintetico'),
('V0027', 'T0027', '2026-05-17', 50500, 'Ajuste de freno de mano'),
('V0028', 'T0028', '2026-06-18', 52000, 'Revision de escape'),
('V0029', 'T0029', '2026-07-19', 53500, 'Cambio de banda'),
('V0030', 'T0030', '2026-08-20', 55000, 'Revision de computadora'),
('V0031', 'T0031', '2026-09-01', 56500, 'Cambio de amortiguadores'),
('V0032', 'T0032', '2026-10-02', 58000, 'Revision de niveles'),
('V0033', 'T0033', '2026-11-03', 59500, 'Cambio de filtro de aire'),
('V0034', 'T0034', '2026-12-04', 61000, 'Revision de radiador'),
('V0035', 'T0035', '2026-01-05', 62500, 'Cambio de mangueras'),
('V0036', 'T0036', '2026-02-06', 64000, 'Balanceo de ruedas'),
('V0037', 'T0037', '2026-03-07', 65500, 'Revision de alternador'),
('V0038', 'T0038', '2026-04-08', 67000, 'Cambio de faros'),
('V0039', 'T0039', '2026-05-09', 68500, 'Servicio de afinacion'),
('V0040', 'T0040', '2026-06-10', 70000, 'Revision final');

-- verificar cantidad de registros
select 'clientes' as tabla, count(*) as total from clientes
union all
select 'automovil', count(*) from automovil
union all
select 'taller', count(*) from taller
union all
select 'ventas', count(*) from ventas
union all
select 'servicios', count(*) from servicios;
