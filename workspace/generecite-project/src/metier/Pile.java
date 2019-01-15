package metier;

public class Pile<T> {
 private Maillon debut;
 public int size;

 public Pile()
 {
	 this.debut = null;
	 this.size = 0;
 }
 
 public void empiler(T n) {
      debut = new Maillon(n, debut);
      size++;
   }

 public T depiler() throws ExceptionPileVide {
     T cle;

     if (estVide()) throw new ExceptionPileVide();
      cle = (T) debut.getDonnee();
      debut = debut.suivant;
      size--;
     return cle;
   }

 public T getValeur()
 {
	 return (T) debut.getDonnee();
 }
 
 private boolean estVide() {
     if (size == 0)
    	 return true;
     return false;
   }
}