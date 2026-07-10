DROP DATABASE IF EXISTS proyecto_ldsm303;
CREATE DATABASE proyecto_ldsm303;
USE proyecto_ldsm303;

CREATE TABLE conferencistas( 
    IdConferencista VARCHAR(10) NOT NULL PRIMARY KEY, 
    Nombre VARCHAR(50) NOT NULL,
    cv VARCHAR(100)
);

CREATE TABLE conferencia(
    IdConferencia VARCHAR(10) NOT NULL PRIMARY KEY,
    Titulo VARCHAR(50) NOT NULL,
    Fecha DATE, 
    Hora TIME,
    Ubicacion VARCHAR(30), 
    IdConferencista VARCHAR(10) NOT NULL,
    CONSTRAINT fkc FOREIGN KEY(IdConferencista) REFERENCES conferencistas(IdConferencista)
);

CREATE TABLE alumno(
    Matricula VARCHAR(8) NOT NULL PRIMARY KEY,
    Nombre VARCHAR(50) NOT NULL,
    Grupo VARCHAR(8)
);

CREATE TABLE registros(
    Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Matricula VARCHAR(8) NOT NULL,
    IdConferencia VARCHAR(10) NOT NULL, 
    Fecha DATETIME DEFAULT NOW(),
    Hora TIME, -- Cambiado de DATETIME a TIME para mejor consistencia
    CONSTRAINT fka FOREIGN KEY(Matricula) REFERENCES alumno(Matricula),
    CONSTRAINT fkareg FOREIGN KEY(IdConferencia) REFERENCES conferencia(IdConferencia) 
);