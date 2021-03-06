package app;



import metier.ArrayThread;
import metier.CompteEnBanque;

public class CompteEnBanqueApp{
	
	public static void main(String[] args)
	{
		long debut = System.currentTimeMillis();
		CompteEnBanque b = new CompteEnBanque();
		ArrayThread aT = new ArrayThread(10,b);
		// Dans le cas dans ArrayThread
		/*MyThread t1 = new MyThread("t1",b);
		MyThread t2 = new MyThread("t2",b);
		try {
			t1.start();
			t2.start();
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		try {
			aT.go();
			aT.waitThread();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Solde final : " + b.consulter());
		long fin = System.currentTimeMillis();
		System.out.println("Temps total d'execution : " + ((fin - debut) / 1000.0) + " secondes");
	}
}
