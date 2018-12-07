--select nom from emp order by commission/ salaire desc;


--select nom from emp where commission < (salaire*0.05) or commission is null and name='Representant';

--select count(*) as Compteur from emp where nodept=50;

--select count(*) as PossedeCommission from emp where commission is not null;

--select count(distinct titre) as nombre_fonctions_differentes from emp;

--select distinct titre, avg(salaire) from emp group by titre;

--select sum(salaire) as salaire_total_ventes from emp inner join dept using(nodept) 
--	where dept.nom='Vente';

--select emp.nom,dept.nom from emp inner join dept using(nodept);

--select emp.nom, dept.nom, salaire from emp inner join dept using(nodept) 
--	where salaire=(select max(salaire) from emp);

--select nom from emp where salaire > (select salaire from emp where nom='Hotdeugou');

--select nom from emp where titre = (select titre from emp where nom='Hotdeugou');

--Creer des sous tables

--select nom,titre from emp where nosupr=
--	(select nosupr from emp where nom='Hotdeugou');

--select nom from emp where embauche < (select embauche from emp where nodept=10);

