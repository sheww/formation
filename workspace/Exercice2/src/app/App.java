package app;
import java.util.InputMismatchException;
import java.util.Scanner;

import metier.*;

public class App {
	public static void main(String args[]) {
		 String nomSaisi= null;
		 int nbSaisi = 0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Saisissez le nom de la ville");
		 nomSaisi = sc.next();
		 try
		 {
			 System.out.println("Saisissez nombre d'habitant");
			 nbSaisi = sc.nextInt();
		 }
		 catch(InputMismatchException e)
		 {
			 e.getMessage();
			 System.out.println(e);
		 }
		 sc.close();
		 Ville v2 = null;
		 try 
		 {
			 v2 = new Ville(nomSaisi, nbSaisi);
		 } 
		 catch (NbHabException nEx) 
		 {
			 System.out.println(nEx);
			 v2 = new Ville(nomSaisi);
		 }
		 finally
		 {
			 System.out.println(v2);
		 }
		}
}
