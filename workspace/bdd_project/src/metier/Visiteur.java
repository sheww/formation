package metier;

import java.sql.*;
import java.util.List;
import java.io.PrintStream;

public class Visiteur {
 static PrintStream so = System.out;
 Connection connexion;

 public void ouvrirConnexion() {
  try {

   // chargement du driver
   Class.forName("org.postgresql.Driver"); // A compléter suivant le type de driver JDBC

   // instanciation d'un objet Connection
   connexion = DriverManager.getConnection("jdbc:postgresql://localhost/test",  // URLpostgres de connexion à renseigner suivant le type de driver JDBC
                                           "toto",  // login à renseigner
                                           "toto"); // password à renseigner
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

public void fermerConnexion() {
  try {

   // fermeture de la connexion
   connexion.close();

  } catch (SQLException ex) {
   traiterSQLException(ex);
  }
 }

public void ajouterTypeSociete(String typeSociete) {
	  try {
	   String ordre;
	   // Instanciation d'un objet Statement
	   Statement statement = connexion.createStatement();
	   // Construction de l'ordre SQL
	   ordre = "INSERT INTO TypeSociete (libelletypesociete) VALUES " + "('"
	     + typeSociete + "')";
	   so.println(ordre);
	   // Exécution de l'ordre SQL
	   statement.executeUpdate(ordre);
	   statement.close();
	  } catch (SQLException expt) {
	   traiterSQLException(expt);
	  }
	 }

public void afficherTypeSociete(String criteres) {
	  try {
	   String ordre;
	   Statement statement = connexion.createStatement();
	   // Construction de l'ordre SQL
	   ordre = "SELECT libelletypesociete FROM typesociete WHERE libelletypesociete LIKE '"
	     + criteres + "%'";
	   so.println(ordre);
	   // Exécution de l'ordre SQL
	   ResultSet resultSet = statement.executeQuery(ordre);
	   boolean suivant = resultSet.next();
	   while (suivant) {
	    String type = resultSet.getString(1);
	    so.println(type);
	    suivant = resultSet.next();
	   }
	   resultSet.close();
	   statement.close();
	  } catch (SQLException expt) {
	   traiterSQLException(expt);
	  }
	 }

public void ajouterListeTypeSociete(List<String> types) {
	  try {
	   // Construction de l'ordre SQL précompilé
	   String ordre = "INSERT INTO typesociete (libelletypesociete) VALUES (?)";
	   // Instanciation d'un objet PreparedStatement
	   PreparedStatement stmtPrep;
	   stmtPrep = connexion.prepareStatement(ordre);
	   // Exécution de l'ordre SQL
	    for (String unType : types) {
	      // transmition du paramètre IN
	      stmtPrep.setString(1, unType);
	      // exécution de l’ordre SQL
	      stmtPrep.executeUpdate();
	   }
	   stmtPrep.close();
	  } catch (SQLException expt) {
	   traiterSQLException(expt);
	  }
	 }

}
