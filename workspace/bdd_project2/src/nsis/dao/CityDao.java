package nsis.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import nsis.metier.City;
import nsis.util.JDBCManager;

public class CityDao {
	private Connection c;

	public CityDao() {
		super();
		this.c = JDBCManager.getConnection();
	}


	public void addCity(City ci)
	{
		Statement statement = null;
		try {
			statement = c.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		   // Construction de l'ordre SQL
		   String ordre = "INSERT INTO `city` "
		   		+ "(`name`, `mayor`, `inhabitants`, `postalcode`) "
		   		+ "VALUES ( \""+ ci.getName() +"\",\"" + ci.getMayor() + "\"," + ci.getInhabitants()
		   		+ "," + ci.getPostalcode() + ");";
		   System.out.println(ordre);
		   // Exécution de l'ordre SQL
		   try {
			statement.executeUpdate(ordre);
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		   
	}
}
