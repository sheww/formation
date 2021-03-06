package metier;

public class ArrayThread {
	private MyThread[] l;
	
	public ArrayThread(int number, CompteEnBanque c)
	{
		l = new MyThread[number];
		for(int i=0; i < number; i++)
		{
			l[i] =new MyThread("t" + (i+1),c);
			
		}
	}
	
	public void go() throws InterruptedException
	{
		for(int i=0; i < l.length; i++)
		{
			l[i].start();
		}
	}
	
	public void waitThread() throws InterruptedException
	{
		for(int i=0; i < l.length; i++)
		{
			l[i].join();
		}
	}
}
