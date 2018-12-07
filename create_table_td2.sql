DROP TABLE IF EXISTS TITRE;

CREATE TABLE TITRE
(
	code int primary key not null,
	titre varchar(64)
);

INSERT into TITRE select row_number() over (order by titre) id, titre titre from emp group by titre;

DROP TABLE IF EXISTS TMP;
CREATE TABLE TMP
(
	nom varchar(64),
	titre varchar(64)
);

INSERT into TMP select nom,titre from emp;

ALTER TABLE emp drop titre;

ALTER TABLE emp add titre integer;

INSERT INTO EMP (titre) select code from emp left join tmp on tmp.nom = emp.nom left join titre on titre.titre = tmp.titre order by noemp;
