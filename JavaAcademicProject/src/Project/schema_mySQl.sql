-- the schema of the db is given down below 

--CREATE TABLE enseignants ( matricule integer primary key, nom varchar(50), contact varchar(50));

--CREATE TABLE seances ( id integer AUTO_INCREMENT primary key, classe varchar(20), jour varchar(20), heure varchar(50), matiere varchar(20), enseignantMAT integer NOT NULL, FOREIGN KEY (enseignantMAT) REFERENCES enseignants(matricule));

