package metier;

public class Repetiteur extends Thread {
	 String chaine;

	 public Repetiteur(String chaine) {
	  this.chaine = chaine;
	 }

	 public void run() {
	  System.out.println(chaine);
	 }
	}
