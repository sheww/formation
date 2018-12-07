DROP TABLE IF EXISTS EMP;
DROP TABLE IF EXISTS DEPT;

CREATE TABLE DEPT
(
        nodept serial primary key not null,
        nom varchar(64),
        region varchar(64)
);


CREATE TABLE EMP
(
        noemp serial primary key not null,
        nom varchar(128),
        prenom varchar(128),
        embauche DATE,
        nosupr integer null,
        titre varchar(64),
        nodept integer references DEPT(nodept),
        salaire float,
        commission float null
);
