package metier;

public abstract class PileException extends Exception {
	  protected int code;

	  public abstract int getCodeErreur();
	}
