package metier;

public class MyThread extends Thread{
	private CompteEnBanque c;
	private String name;
	
	public MyThread(String name, CompteEnBanque c)
	{
		this.c = c;
		this.name = name;
	}
	
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("solde " +c.consulter());
			double credit = Math.random() * ( 500 - 0 );
			System.out.println("Crédit vers le compte d'un montant de : " + credit + " Virement effectuer par " + this.name);
			c.crediter(credit);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
