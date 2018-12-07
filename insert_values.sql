delete from dept;
BEGIN;
INSERT INTO dept VALUES (10 , 'Finance' , 'Picardie' ) ;
INSERT INTO dept VALUES (20 , 'Atelier' , 'Alsace' ) ;
INSERT INTO dept VALUES (30 , 'Atelier' , 'Lorraine' ) ;
INSERT INTO dept VALUES (31 , 'Vente' , 'Picardie' ) ;
INSERT INTO dept VALUES (32 , 'Vente' , 'Alsace' ) ;
INSERT INTO dept VALUES (33 , 'Vente' , 'Lorraine' ) ;
INSERT INTO dept VALUES (34 , 'Vente' , 'Provence Alpes Côte d''Azur' ) ;
INSERT INTO dept VALUES (35 , 'Vente' , 'Midi-Pyrénées') ;
INSERT INTO dept VALUES (41 , 'Distribution' , 'Picardie' ) ;
INSERT INTO dept VALUES (42 , 'Distribution' , 'Alsace' ) ;
INSERT INTO dept VALUES (43 , 'Distribution' , 'Lorraine' ) ;
INSERT INTO dept VALUES (44 , 'Distribution' , 'Provence Alpes Côte d''Azur' ) ;
INSERT INTO dept VALUES (45 , 'Distribution' , 'Midi-Pyrénées' ) ;
INSERT INTO dept VALUES (50 , 'Administration' , 'Picardie' ) ;
COMMIT;

delete from emp;

BEGIN;
INSERT INTO emp VALUES (1 , 'Patamob' , 'Adhémar' , to_date('03/26/2000','dd/mm/yyyy') , NULL , 'Président' , 50 , 50000 , NULL) ;
INSERT INTO emp VALUES (2 , 'Zeublouze' , 'Agathe' , to_date('04/15/2000','dd/mm/yyyy') , 1 , 'Dir. Distrib' , 41 , 35000 , NULL) ;
INSERT INTO emp VALUES (3 , 'Kuzbidon' , 'Alex' , to_date('05/05/2000','dd/mm/yyyy') , 1 , 'Dir. Vente' , 31 , 34000 , NULL) ;
INSERT INTO emp VALUES (4 , 'Locale' , 'Anasthasie' , to_date('05/25/2000','dd/mm/yyyy') , 1 , 'Dir. Finance' , 10 , 36000 , NULL) ;
INSERT INTO emp VALUES (5 , 'Teutmaronne' , 'Armand' , to_date('06/14/2000','dd/mm/yyyy') , 1 , 'Dir. Administr' , 50 , 36000 , NULL) ;
INSERT INTO emp VALUES (6 , 'Zoudanlkou' , 'Debbie' , to_date('07/04/2000','dd/mm/yyyy') , 2 , 'Chef Entrepôt' , 41 , 25000 , NULL) ;
INSERT INTO emp VALUES (7 , 'Rivenbusse' , 'Elsa' , to_date('07/24/2000','dd/mm/yyyy') , 2 , 'Chef Entrepôt' , 42 , 24000 , NULL) ;
INSERT INTO emp VALUES (8 , 'Ardelpic' , 'Helmut' , to_date('08/13/2000','dd/mm/yyyy') , 2 , 'Chef Entrepôt' , 43 , 23000 , NULL) ;
INSERT INTO emp VALUES (9 , 'Peursconla' , 'Humphrey' , to_date('09/02/2000','dd/mm/yyyy') , 2 , 'Chef Entrepôt' , 44 , 22000 , NULL) ;
INSERT INTO emp VALUES (10 , 'Vrante' , 'Héléna' , to_date('09/22/2000','dd/mm/yyyy') , 2 , 'Chef Entrepôt' , 45 , 21000 , NULL) ;
INSERT INTO emp VALUES (11 , 'Enfaillite' , 'Mélusine' , to_date('10/12/2000','dd/mm/yyyy') , 3 , 'Représentant' , 31 , 25000 , 10000) ;
INSERT INTO emp VALUES (12 , 'Eurktumeme' , 'Odile' , to_date('11/01/2000','dd/mm/yyyy') , 3 , 'Représentant' , 32 , 26000 , 12500) ;
INSERT INTO emp VALUES (13 , 'Hotdeugou' , 'Olaf' , to_date('11/21/2000','dd/mm/yyyy') , 3 , 'Représentant' , 33 , 27000 , 10000) ;
INSERT INTO emp VALUES (14 , 'Odlavieille' , 'Pacôme' , to_date('12/11/2000','dd/mm/yyyy') , 3 , 'Représentant' , 34 , 25500 , 15000) ;
INSERT INTO emp VALUES (15 , 'Amartakaldire' , 'Quentin' , to_date('12/31/2000','dd/mm/yyyy') , 3 , 'Représentant' , 35 , 23000 , 27500) ;
INSERT INTO emp VALUES (16 , 'Traibien' , 'Samira' , to_date('01/10/2001','dd/mm/yyyy') , 6 , 'Secrétaire' , 41 , 15000 , NULL) ;
INSERT INTO emp VALUES (17 , 'Fonfec' , 'Sophie' , to_date('01/20/2001','dd/mm/yyyy') , 6 , 'Secrétaire' , 41 , 14000 , NULL) ;
INSERT INTO emp VALUES (18 , 'Fairant' , 'Teddy' , to_date('02/09/2001','dd/mm/yyyy') , 7 , 'Secrétaire' , 42 , 13000 , NULL) ;
INSERT INTO emp VALUES (19 , 'Blaireur' , 'Terry' , to_date('02/09/2001','dd/mm/yyyy') , 7 , 'Secrétaire' , 42 , 13000 , NULL) ;
INSERT INTO emp VALUES (20 , 'Ajerre' , 'Tex' , to_date('02/19/2001','dd/mm/yyyy') , 8 , 'Secrétaire' , 43 , 13000 , NULL) ;
INSERT INTO emp VALUES (21 , 'Chmonfisse' , 'Thierry' , to_date('02/19/2001','dd/mm/yyyy') , 8 , 'Secrétaire' , 43 , 12000 , NULL) ;
INSERT INTO emp VALUES (22 , 'Phototetedemort' , 'Thomas' , to_date('03/01/2001','dd/mm/yyyy') , 9 , 'Secrétaire' , 44 , 22500 , NULL) ;
INSERT INTO emp VALUES (23 , 'Kaécouté' , 'Xavier' , to_date('03/11/2001','dd/mm/yyyy') , 9 , 'Secrétaire' , 34 , 11500 , NULL) ;
INSERT INTO emp VALUES (24 , 'Adrouille-Toultan' , 'Yves' , to_date('03/21/2001','dd/mm/yyyy') , 10 , 'Secrétaire' , 45 , 11000 , NULL) ;
INSERT INTO emp VALUES (25 , 'Anchier' , 'Yvon' , to_date('12/31/2000','dd/mm/yyyy') , 10 , 'Secrétaire' , 45 , 10000 , NULL) ;
COMMIT;