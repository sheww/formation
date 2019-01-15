package metier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.StringTokenizer;

public class MyThreadServ extends Thread{
	Dico dico;
	Socket s;
	
	
	public MyThreadServ(Dico d, Socket s)
	{
		dico = d ;
		this.s = s;
	}
	
	public void run()
	{
		System.out.println("Thread taking care of a new client");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
			}
}
	
	public void client_handle(String reponse, String requete) throws IOException
	{
		start();
		do
		{
			BufferedWriter ecriture = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			BufferedReader lecture = new BufferedReader(new InputStreamReader(s.getInputStream()));
			requete = lecture.readLine();
			System.out.println("requete " + requete);
			if ( requete == null) break;
			reponse = traiterRequete(requete);
			System.out.println("reponse : " + reponse);
			ecriture.write(reponse);
			ecriture.newLine();
			ecriture.flush();
			ecriture.close();
			lecture.close();
			
		}while(reponse != null);
	}
	
	public String traiterRequete(String s)
	{
		if ( s.equals("QUIT")) return "erreur";
		StringTokenizer st = new StringTokenizer(s," ");
		String key = "";
		String command = "";
		command = st.nextToken();
		key = st.nextToken();
		if ( command.equals("GET"))
		{
			return dico.consulter(key);
		}
		if ( command.equals("PUT"))
		{
			try {
				dico.creer(key,st.nextToken());
				return "insertion de " + s;
			} catch (IOException e) {
			// TODO Auto-generated catch block
				e.getMessage();
			}
		}
		return "erreur";
	}
}
