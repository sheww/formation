package app;
import metier.*;

public class App {
	public static void main(String[] args)
	{
		Pile<Number> p = new Pile<Number>();
		p.empiler(5.5);
		p.empiler(5);
		p.empiler(546465465);
		p.empiler(5.3245454f);
		System.out.println(p.getValeur());
		try
		{
			p.depiler();
			System.out.println(p.getValeur());
			p.depiler();
			System.out.println(p.getValeur());
			p.depiler();
			System.out.println(p.getValeur());
			p.depiler();
			p.depiler();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
