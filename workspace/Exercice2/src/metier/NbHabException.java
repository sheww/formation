package metier;

public class NbHabException extends Exception {

	  private int errNb;

	  public NbHabException(int errNb) {

	    this.errNb = errNb;

	  }

	  public String toString() {

	    return new String(" nombre erroné d’habitants : " + errNb);

	  }

	}