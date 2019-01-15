package nsis.util;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLWarning;

public class JDBCManager {
	static PrintStream so = System.out;
	Connection connexion;

	private JDBCManager() {
		try {
			// chargement du driver
			Class.forName("com.mysql.jdbc.Driver"); // A compléter suivant le type de driver JDBC
			// instanciation d'un objet Connection
			connexion = DriverManager.getConnection("jdbc:mysql://localhost/test", // URLpostgres de connexion à
																						// renseigner suivant le type de
																						// driver JDBC
					"jdo", // login à renseigner
					"jdo"); // password à renseigner
			traiterSQLWarning(connexion.getWarnings());
		} catch (SQLException ex) {
			traiterSQLException(ex);
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	private void traiterSQLException(SQLException expt) {
		so.println("\n SQLException \n");
		while (expt != null) {
			so.println("SQLState: " + expt.getSQLState());
			so.println("Message : " + expt.getMessage());
			so.println("Vendeur : " + expt.getErrorCode());
			expt = expt.getNextException();
		}
	}

	private void traiterSQLWarning(SQLWarning warn) throws SQLException {
		if (warn != null) {
			so.println("\n SQLWarning \n");
			while (warn != null) {
				so.println("SQLState: " + warn.getSQLState());
				so.println("Message : " + warn.getMessage());
				so.println("Vendeur : " + warn.getErrorCode());
				warn = warn.getNextWarning();
			}
		}
	}
	
	public static Connection getConnection()
	{
		return new JDBCManager().connexion;
	}
	
	public void fermer() throws SQLException
	{
		this.connexion.close();
	}
}
