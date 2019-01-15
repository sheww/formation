package app;
import metier.*;

public class App {
	public static void main(String []args)
	{
		Pile<Number> p = new Pile<Number>(2);
		try
		{
			p.empiler(12);
			p.empiler(5.2);
			p.depiler();
			p.depiler();
			
		}
		catch(PileException e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			p.empiler(12);
			p.empiler(5.2);
			p.empiler(23);
			
		}
		catch(PileException e)
		{
			e.printStackTrace();
		}
		try
		{
			p.depiler();
			p.depiler();
			p.depiler();
			
		}
		catch(PileException e)
		{
			e.printStackTrace();
		}
	}
}
