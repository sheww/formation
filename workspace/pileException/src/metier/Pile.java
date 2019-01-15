package metier;

public class Pile {
	  private int pile[];
	  private int sommet = 0;
	  public static final int ERR_VIDE = -1;
	  public static final int ERR_PLEINE = -2;

	  public Pile(int taille) {
	    pile = new int[taille];
	  }

	  public void empiler(int val) throws PileException  {
	    if (sommet >= pile.length) {
	        throw new PilePleineException("Pleine", ERR_PLEINE);
	    }
	    pile[sommet] = val;
	    sommet++;
	  }
	  
	  public int depiler() throws PileException {
	   if (sommet < 1) {
	        throw new PileVideException("Vide", ERR_VIDE);
	   }
	   sommet = sommet - 1;
	   return pile[sommet];
	  }
	}
