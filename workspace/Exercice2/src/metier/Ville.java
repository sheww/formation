package metier;

public class Ville {
	 // les attributs de la ville
	 private int nbHabitants;
	 private String nomVille;

	 // constructeurs de la classe Ville
	 public Ville(String v){
	     nomVille = v;
	     nbHabitants = 0;
	 }

	 public Ville(String v, int k) throws NbHabException {
	     nomVille = v;
	     this.setNbHabitants(k);
	 }


	 public final void setNbHabitants(int unEntier) throws NbHabException {

	  if (unEntier < 0) {
	     throw new NbHabException(unEntier);
	  }

	  nbHabitants = unEntier;

	 }
	 
	 public String toString()
	 {
		 return "Ville " + this.nomVille + " ,nb habitants : " + this.nbHabitants; 
	 }
	 
	}
