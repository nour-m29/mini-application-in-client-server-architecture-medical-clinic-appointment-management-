 drop table RendezVous;
 drop table patient;
 drop table medecin;

 
 create Table Patient ( Num_Patient number primary key, Nom varchar2(15),prenom varchar2(15), Date_Naissance DATE,  Telephone number, Adresse varchar2(20));

 create Table Medecin ( Num_Medecin number primary key  ,Nom varchar2(15),Prenom varchar2(15) ,Specialite varchar2(20) ,Telephone number);

 create Table RendezVous ( Num_RendezVous number primary key ,Date_RendezVous DATE ,Heure_RendezVous timestamp,
 Statut VARCHAR2(20),Num_Patient NUMBER, Num_Medecin NUMBER,
constraint fk_rendezvous_patient foreign key (Num_Patient) references patient (Num_Patient ),
constraint fk_rendezvous_medecin foreign key (Num_medecin) references medecin (Num_medecin ),
CONSTRAINT check_statut CHECK (statut IN ('Planifie', 'Annule', 'Effectue')));

INSERT INTO Patient VALUES (100,'Slimani', 'Ahmed', TO_DATE('2003-05-09', 'YYYY-MM-DD'), 0555040674, 'Kouba');

INSERT INTO Medecin VALUES (213,'Hamdi', 'Islem' , 'Cardiologue', 0666112233);


INSERT INTO RendezVous VALUES (1900, TO_DATE('2026-02-13', 'YYYY-MM-DD'), TO_TIMESTAMP('2026-02-13 13:30:00', 'YYYY-MM-DD HH24:MI:SS'), 'Planifie', 100, 213);
commit;

SELECT * FROM Patient;
SELECT * FROM Medecin;
SELECT * FROM RendezVous;