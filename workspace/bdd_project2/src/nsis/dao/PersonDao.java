package nsis.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import nsis.metier.City;
import nsis.metier.Person;
import nsis.util.JDBCManager;

public class PersonDao {
	private Connection c;

	public PersonDao() {
		super();
		this.c = JDBCManager.getConnection();
	}

	public void addPerson(Person p) throws PersonDAOException {
		Statement statement;
		try {
			statement = c.createStatement();
			System.out.println("SELECT id_city from city where name=\"" + p.getC().getName() + "\";");
			ResultSet r;
			r = statement.executeQuery("SELECT id_city from city where name=\"" + p.getC().getName() + "\";");
			r.next();
			p.getC().setId(r.getInt(1));
			String ordre = "INSERT INTO `person` " + "(`id_city`,`firstname`, `lastname`, `emails`, `phone`) "
					+ "VALUES (" + p.getC().getId() + ",\"" + p.getPrenom() + "\",\"" + p.getNom() + "\",\""
					+ p.getEmails() + "\",\"" + p.getPhone() + "\");";
			System.out.println(ordre);
			statement.executeUpdate(ordre);
			statement.close();
		} catch (SQLException e) {
			throw new PersonDAOException("Add person failed");
		}

	}

	public void updatePerson(Person p, Person p2) throws PersonDAOException {
		try {
			Statement statement = c.createStatement();
			String ordre = "UPDATE person SET id_city =" + p2.getC().getId() + ", firstname=\"" + p2.getPrenom()
					+ "\", lastname=\"" + p2.getNom() + "\", emails=\"" + p2.getEmails() + "\", phone=\"" + p2.getPhone()
					+ "\" WHERE " + "id_city =" + p.getC().getId() + " AND firstname=\"" + p.getPrenom()
					+ "\" AND lastname=\"" + p.getNom() + "\";";
			statement.executeUpdate(ordre);
			statement.close();
			System.out.println(ordre);
		} catch (SQLException e) {
			throw new PersonDAOException("Update person failed");
		}
	}

	public void deletePerson(Person p) throws PersonDAOException {
		try {
			Statement statement = c.createStatement();
			String ordre = "DELETE FROM person WHERE " + "id_city=" + p.getC().getId() + " AND firstname=\""
					+ p.getPrenom() + "\" AND lastname=\"" + p.getNom() + "\";";
			statement.executeUpdate(ordre);
			statement.close();
			System.out.println(ordre);
		} catch (SQLException s) {
			throw new PersonDAOException("delete person failed");
		}
	}
	
	public Person getPerson(int id) throws PersonDAOException
	{
		try
		{
			Statement statement = c.createStatement();
			String ordre = "SELECT * from person where id_person=" + id +";";
			System.out.println(ordre);
			ResultSet r = statement.executeQuery(ordre);
			r.next();
			Person tmp =new  Person(r.getString(3),r.getString(4),r.getString(5),r.getString(6),null);
			ResultSet r2 = statement.executeQuery("SELECT * from city WHERE id_city=" + r.getString(2) +";");
			r2.next();
			City ctmp = new City(r2.getString(2), r2.getString(3),r2.getInt(4),r2.getInt(5));
			tmp.setC(ctmp);
			statement.close();
			return tmp;
		}
		catch(SQLException e)
		{
			throw new PersonDAOException("getPerson id failed");
		}
	}
	
	
	public ArrayList<Person> getAllPerson() throws PersonDAOException
	{
		try
		{
			ArrayList<Person> p = new ArrayList<Person>();
			Statement statement = c.createStatement();
			Statement st = c.createStatement();
			ResultSet r = statement.executeQuery("SELECT * FROM person;");
			boolean suivant = r.next();
			while(suivant)
			{
				ResultSet r2 = st.executeQuery("SELECT * from city WHERE id_city=" + r.getString(2) +";");
				r2.next();
				City ctmp = new City(r2.getString(2), r2.getString(3),r2.getInt(4),r2.getInt(5));
				p.add(new Person(r.getString(3),r.getString(4),r.getString(5),r.getString(6),ctmp));
				suivant = r.next();
			}
			statement.close();
			st.close();
			return p;
		}
		catch(SQLException e)
		{
			throw new PersonDAOException("get arraylist person failed");
		}
	}
	
	public ArrayList<Person> getAllPerson(String name) throws PersonDAOException
	{
		try
		{
			ArrayList<Person> p = new ArrayList<Person>();
			Statement statement = c.createStatement();
			Statement st = c.createStatement();
			System.out.println("SELECT * FROM person WHERE firstname =\""+ name +"\";");
			ResultSet r = statement.executeQuery("SELECT * FROM person WHERE firstname =\""+ name +"\";");
			boolean suivant = r.next();
			while(suivant)
			{
				ResultSet r2 = st.executeQuery("SELECT * from city WHERE id_city=" + r.getString(2) +";");
				r2.next();
				City ctmp = new City(r2.getString(2), r2.getString(3),r2.getInt(4),r2.getInt(5));
				p.add(new Person(r.getString(3),r.getString(4),r.getString(5),r.getString(6),ctmp));
				suivant = r.next();
			}
			statement.close();
			st.close();
			return p;
		}
		catch(SQLException e)
		{
			throw new PersonDAOException("get arraylist where name failed");
		}
	}
	
	public void PrintJointure() throws PersonDAOException
	{
		try
		{
			Statement statement = c.createStatement();
			Statement st = c.createStatement();
			ArrayList<String> nameCity = new ArrayList<String>();
			ResultSet r = statement.executeQuery("SELECT DISTINCT name from city");
			boolean suivant = r.next();
			while(suivant)
			{
				System.out.println("Added " + r.getString(1));
				nameCity.add(r.getString(1));
				suivant = r.next();
			}
			for(int i = 0; i < nameCity.size(); i++)
			{
				System.out.println("Ville : " + nameCity.get(i));
				ResultSet r2 = statement.executeQuery("SELECT person.lastname, person.firstname from person natural join city where city.name =\"" 
						+ nameCity.get(i) + "\";");
				boolean sui = r2.next();
				while(sui)
				{
					System.out.println("\t habitant : " + r2.getString(1) + " " + r2.getString(2));
					sui = r2.next();
				}
			}
		}
		catch(SQLException e)
		{
			throw new PersonDAOException("print jointure failed");
		}
	}
}
