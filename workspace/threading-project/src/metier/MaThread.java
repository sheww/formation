package metier;

public class MaThread implements Runnable{
	private int time;
	private String name;
	
	public MaThread(String name)
	{
		this.name = name;
		time = 300;
	}
	
	public MaThread(String name,int time)
	{
		this.name = name;
		this.time = time;
	}
	 @Override
	 public void run() {
	  int i;
	  for (i = 0; i < 100; i++) {
	   System.out.println(this.name +" " + i);
	   try {
	    Thread.sleep(time);
	   } catch (java.lang.InterruptedException e) {
	    System.out.println("Interrupted !");
	   }
	  }
	  System.out.println(name +" se termine");

	 }
	}