package app;

import metier.MyClient;

import java.io.IOException;

public class ApplicationClient {
public static void main(String args[]) {
 
  MyClient client = new MyClient("localhost",4048);
  MyClient client2 = new MyClient("localhost",4048);
  MyClient client3 = new MyClient("localhost", 4048);
  try {
	client.envoyerMessage("PUT salut 214145121");
	client2.envoyerMessage("GET nana");
	client3.envoyerMessage("GET salut");
	client3.fermer();
	client.fermer();
	client2.fermer();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 }
}
