package metier;


public class Maillon<T> {
	 T donnee;
	 Maillon suivant;

	  Maillon(T donnee, Maillon suivant) {
	     this.donnee = donnee;
	     this.suivant = suivant;
	   }
	  
	  public T getDonnee()
	  {
		  return donnee;
	  }
}