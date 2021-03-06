CREATE TABLE IF NOT EXISTS users (
  id bigint unsigned NOT NULL AUTO_INCREMENT,
  username varchar(50) NOT NULL,
  password varchar(100) NOT NULL,
  PRIMARY KEY (id)
);




CREATE TABLE `articolo` (
  `id_articolo` bigint NOT NULL AUTO_INCREMENT,
  `titolo` varchar(100) NOT NULL,
  `sottotitolo` varchar(50) NOT NULL,
  `testo` text NOT NULL,
  `id_categoria` bigint NOT NULL,
  `data_pubbl` date NOT NULL,
  `data_modif` date DEFAULT NULL,
  `data_creaz` date NOT NULL,
  `id_autore` bigint NOT NULL,
  `id_tag` bigint NOT NULL,
  PRIMARY KEY (`id_articolo`),
  KEY `articolo_FK` (`id_categoria`),
  KEY `articolo_FK_1` (`id_autore`),
  KEY `articolo_FK_2` (`id_tag`),
  CONSTRAINT `articolo_FK` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`),
  CONSTRAINT `articolo_FK_1` FOREIGN KEY (`id_autore`) REFERENCES `users` (`id`),
  CONSTRAINT `articolo_FK_2` FOREIGN KEY (`id_tag`) REFERENCES `tag` (`id_tag`)
);
 
 


CREATE TABLE `categoria` (
  `id_categoria` bigint NOT NULL AUTO_INCREMENT,
  `categorie` varchar(50) NOT NULL,
  PRIMARY KEY (`id_categoria`)
);

CREATE TABLE `stato` (
  `id_stato` bigint NOT NULL AUTO_INCREMENT,
  `id_articolo` bigint NOT NULL,
  `stato_art` varchar(100) NOT NULL,
  PRIMARY KEY (`id_stato`),
  KEY `stato_FK` (`id_articolo`),
  CONSTRAINT `stato_FK` FOREIGN KEY (`id_articolo`) REFERENCES `articolo` (`id_articolo`)
);

CREATE TABLE `tag` (
  `id_tag` bigint NOT NULL AUTO_INCREMENT,
  `tag` varchar(50) NOT NULL,
  PRIMARY KEY (`id_tag`)
);
--
--
-- ddinuzzo/password02
INSERT INTO users
(username, password)
VALUES('ddinuzzo', '$2a$10$vj3PqvSqQSsLhknZpxU2oOIUOdmm6cpPu1shwcyXHVzba.xBWLe4K');


INSERT INTO blog.categoria (categorie) VALUES('Attualità');
INSERT INTO blog.categoria (categorie) VALUES('Medicina');
INSERT INTO blog.categoria (categorie) VALUES('Letteratura');

INSERT INTO blog.autore (nome) VALUES('Annamaria');

INSERT INTO blog.tag (tag) VALUES('Latino');

INSERT INTO blog.users (username, password) VALUES('Annamaria', 'password');


INSERT INTO blog.stato (id_articolo, stato_art) VALUES(1, 'Pubblicato');
INSERT INTO blog.stato (id_articolo, stato_art) VALUES(2, 'Bozza');




INSERT INTO blog.articolo (id_articolo, titolo, sottotitolo, testo, id_categoria, data_pubbl, data_modif, data_creaz, id_autore, id_tag) VALUES(1, 'De Bello Gallico', 'Resoconto di guerra', "Gallia est omnia divisa in partes tres", 3, '2021/03/21', '2021/03/21', '2021/03/20', 1, 1 );;
INSERT INTO blog.articolo (id_articolo, titolo, sottotitolo, testo, id_categoria, data_pubbl, data_modif, data_creaz, id_autore, id_tag) VALUES(2, 'X Agosto', 'Poesia', "Tornava una rondine al tetto", 3, '2021/03/21', '2021/03/21', '2021/03/20', 1, 1 );
INSERT INTO blog.articolo (id_articolo, titolo, sottotitolo, testo, id_categoria, data_pubbl, data_modif, data_creaz, id_autore, id_tag) VALUES(3, 'Resoconto vaccini', 'Covid', "Aperte Vaccinazioni", 1, '2021/03/21', '2021/03/21', '2021/03/20', 1, 1 );


SELECT id_articolo, testo
FROM articolo a
inner join categoria c on c.id_categoria = a.id_categoria
WHERE c.categorie = 'Attualità'

SELECT a.id_articolo, a.testo
FROM articolo a
inner join stato s on a.id_articolo = s.id_articolo 
WHERE s.stato_art = 'Bozza'
