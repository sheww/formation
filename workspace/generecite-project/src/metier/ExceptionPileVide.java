package metier;

public class ExceptionPileVide extends Exception {
	public ExceptionPileVide()
	{
		super();
	}
	
	public String getMessage()
	{
		return "Exception : Pile vide";
		
	}
}
