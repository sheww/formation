package app;

import metier.MyServeur;
import metier.MyThreadServ;

public class ApplicationServeur{
	 public static void main(String args[]){
		 MyServeur s = new MyServeur(4048);
		 s.serveur_start();
	 }
	}
