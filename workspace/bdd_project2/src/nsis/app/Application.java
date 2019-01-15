package nsis.app;

import java.util.ArrayList;

import nsis.dao.CityDao;
import nsis.dao.PersonDao;
import nsis.metier.City;
import nsis.metier.Person;

public class Application {
	public static void main(String[] args) {
		CityDao cD = new CityDao();
		PersonDao pDao = new PersonDao();
		ArrayList<City> cityL = new ArrayList<City>();
		ArrayList<Person> perL = new ArrayList<Person>();
		try {
			for(int i = 0; i < 10; i++)
			{
				cityL.add(new City("name"+i,"maire"+i,1500+i,i+90));
				cD.addCity(cityL.get(i));
				for(int j = 0; j < 3; j++)
				{
					perL.add(new Person("Name"+j,"Prenom"+j,"mail"+i+"@mail.fr","0101010101",cityL.get(i)));
					pDao.addPerson(new Person("Name"+j,"Prenom"+j,"mail"+(i+j)+"@mail.fr","0101010101",cityL.get(i)));
				}
			}
			System.out.println(pDao.getAllPerson().size());
			System.out.println(pDao.getAllPerson("dos santos").size());
			pDao.PrintJointure();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
