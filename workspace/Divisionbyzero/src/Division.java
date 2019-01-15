
public class Division {
	public static void main(String[] args)
	{
		try
		{
			double result = 55/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			e.getMessage();
		}
		finally{
			System.out.println("OK");
		}
	}
}
