DROP TABLE IF EXISTS `salas`;
DROP table IF EXISTS `peliculas`;


CREATE TABLE `peliculas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `calificacionedad` INT DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `salas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `pelicula` INT DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `peliculas_fk` FOREIGN KEY (`pelicula`) REFERENCES `peliculas` (`id`)
);


insert into peliculas (nombre,calificacionedad)values('Tomorowland',16);
insert into peliculas (nombre,calificacionedad)values('Gremlins',13);
insert into peliculas (nombre,calificacionedad)values('Pasajero Oculto',14);
insert into peliculas (nombre,calificacionedad)values('Raya',8);
insert into peliculas (nombre,calificacionedad)values('Tiburon',19);

insert into salas (nombre, pelicula) values ('A',1);
insert into salas (nombre, pelicula) values ('B',2);
insert into salas (nombre, pelicula) values ('C',3);
insert into salas (nombre, pelicula) values ('D',4);
insert into salas (nombre, pelicula) values ('E',5);


