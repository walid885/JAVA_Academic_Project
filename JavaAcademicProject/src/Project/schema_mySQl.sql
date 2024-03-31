-- the schema of the db is given down below 

-- sudo mysql -u root // in order 
-- database name : timetable_management
--SHOW DATABASES; in order to show the databases , 
--  use  timetable_management : in order to use that specified database ; 


--CREATE TABLE enseignants ( matricule integer primary key, nom varchar(50), contact varchar(50));

--CREATE TABLE seances ( id integer AUTO_INCREMENT primary key, classe varchar(20), jour varchar(20), heure varchar(50), matiere varchar(20), enseignantMAT integer NOT NULL, FOREIGN KEY (enseignantMAT) REFERENCES enseignants(matricule));

-- populating the enseignants table with various values and  data ; 

/*
INSERT INTO enseignants (matricule, nom, contact)
VALUES (1, 'John Doe', 'johndoe@example.com');
INSERT INTO enseignants (matricule, nom, contact)
VALUES (2, 'Jane Doe', 'janedoe@example.com');
INSERT INTO enseignants (matricule, nom, contact)
VALUES (3, 'Bob Smith', 'bobsmith@example.com');
INSERT INTO enseignants (matricule, nom, contact)
VALUES (4, 'Alice Johnson', 'alicejohnson@example.com');
INSERT INTO enseignants (matricule, nom, contact)
VALUES (5, 'Mike Brown', 'miketbrown@example.com');
 
*/

--- populating the seance table with various values and data 

/*
INSERT INTO seances (classe, jour, heure, matiere, enseignantMAT)
VALUES ('Math', 'Monday', '08:00', 'Math', 1);

INSERT INTO seances (classe, jour, heure, matiere, enseignantMAT)
VALUES ('Math', 'Monday', '09:00', 'Math', 2);

INSERT INTO seances (classe, jour, heure, matiere, enseignantMAT)
VALUES ('Math', 'Tuesday', '08:00', 'Math', 3);

INSERT INTO seances (classe, jour, heure, matiere, enseignantMAT)
VALUES ('Math', 'Tuesday', '09:00', 'Math', 4);

INSERT INTO seances (classe, jour, heure, matiere, enseignantMAT)
VALUES ('Math', 'Wednesday', '08:00', 'Math', 5);

INSERT INTO seances (classe, jour, heure, matiere, enseignantMAT)
VALUES ('Math', 'Wednesday', '09:00', 'Math', 1);

INSERT INTO seances (classe, jour, heure, matiere, enseignantMAT)
VALUES ('Math', 'Thursday', '08:00', 'Math', 2);

INSERT INTO seances (classe, jour, heure, matiere, enseignantMAT)
VALUES ('Math', 'Thursday', '09:00', 'Math', 3);

INSERT INTO seances (classe, jour, heure, matiere, enseignantMAT)
VALUES ('Math', 'Friday', '08:00', 'Math', 4);

INSERT INTO seances (classe, jour, heure, matiere, enseignantMAT)
VALUES ('Math', 'Friday', '09:00', 'Math', 5);

*/
 