package metier;

import java.io.*;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Hashtable;
import java.util.StringTokenizer;

@SuppressWarnings({ "rawtypes", "serial" })
public class DicoURL extends Hashtable {
	   URLConnection urlConnection;

	   public DicoURL(String unURL) {
	      try {
	          URL url = new URL(unURL);
	          urlConnection = url.openConnection();
	      } catch(IOException e) {
	          System.out.println(e);
	      }
	   }
	   
	   public void info() { 

		   System.out.println("Type de doc : " + urlConnection.getContentType()); 

		   System.out.println("Taille du doc : " + urlConnection.getContentLength()); 

		   System.out.println("Droit lecture : " + urlConnection.getDoInput()); 

		   System.out.println("Droit écriture: " + urlConnection.getDoOutput());

		 }
	   
	   @SuppressWarnings("unchecked")
	public void charger() {
		   try {
		    info();
		    System.out.println("***** Eléments du dictionnaire *****");
		   
		    BufferedReader flux = new BufferedReader(
		    new InputStreamReader(urlConnection.getInputStream()));

		   String elementDuDico;
		   while((elementDuDico = flux.readLine()) != null) {
		     StringTokenizer st ;
		     st = new StringTokenizer(elementDuDico,"/");
		     put(st.nextToken(),st.nextToken());
		   }

		   flux.close();

		   } catch(IOException e) {
		      e.printStackTrace();
		   }
		  }
	}