package app;

public class Poids<T> {
	  private T valeur;

	  public Poids(T val) {

	    this.valeur = val;

	  }

	  public void setValeur(T val) {

	    this.valeur = val;

	  }

	  public T getValeur() {

	    return this.valeur;

	  }

	}