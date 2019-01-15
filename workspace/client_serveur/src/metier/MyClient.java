package metier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class MyClient {
	Socket clientSocket;
	String nomServeur;
	InetAddress adresse;
	String requete;
	BufferedWriter ecriture;
	BufferedReader lecture;
	
	public MyClient(String nom, int port)
	{
		try
		{
			adresse = InetAddress.getByName(nomServeur);
			clientSocket = new Socket(adresse,port);
			clientSocket.setKeepAlive(true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void envoyerMessage(String requete) throws IOException
	{
		ecriture = new BufferedWriter(
				new OutputStreamWriter(clientSocket.getOutputStream()));
		lecture = new BufferedReader(
				new InputStreamReader(clientSocket.getInputStream()));
		System.out.println(requete);
		ecriture.write(requete);
		ecriture.newLine();
		ecriture.flush();
		String reponse = lecture.readLine();
		System.out.println(reponse);		
		ecriture.close();
		lecture.close();
	}
	
	
	public void fermer()
	{
		try {
			clientSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
