package app;

import java.util.ArrayList;
import java.util.List;

import metier.Visiteur;

public class ApplicationVisiteur {
	 public static void main(String args[]) {
	  Visiteur visiteur = new Visiteur();

	  visiteur.ouvrirConnexion();
	  visiteur.ajouterTypeSociete("Armateur");
	  visiteur.afficherTypeSociete("A");

	  List<String> types = new ArrayList<String>();
	  types.add("Transporteur");
	  types.add("Armateur");
	  visiteur.ajouterListeTypeSociete(types);
	  visiteur.afficherTypeSociete("A");

	  visiteur.fermerConnexion();
	 }
	}