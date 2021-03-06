package metier;

import java.util.Calendar;
import java.util.Date;

public class Animal implements java.io.Serializable{

	private static final long serialVersionUID = 2L;
	private String nom;
	private String couleur;
	transient private int age;
	private Date naissance;
	
	public Animal(String nom, String color, int age)
	{
		this.nom = nom;
		this.couleur=color;
		this.age = age;
		this.naissance = new Date();
		this.naissance.setYear(this.naissance.getYear() - age);
		System.out.println(naissance);
	}

	public Date getNaissance() {
		return naissance;
	}

	public void setNaissance(Date naissance) {
		this.naissance = naissance;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
}
