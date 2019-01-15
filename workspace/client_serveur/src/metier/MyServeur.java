package metier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServeur {
	ServerSocket serverSocket;
	Socket clientSocket;
	Dico dico;
	BufferedWriter ecriture ;
	BufferedReader lecture;
	
	public MyServeur(int port)
	{
		dico = new Dico("dico.txt");
		try {
			dico.charger();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("Serveur creer");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void serveur_start()
	{
		String requete = "";
		while(true)
		{
			try
			{
				String reponse = "";
				clientSocket = serverSocket.accept();
				System.out.println("Nouveau client est connecte " + clientSocket);
				new MyThreadServ(dico,clientSocket).client_handle(reponse, requete);
			}
			catch(Exception e)
			{
				e.getMessage();
			}
		}
	}
}
