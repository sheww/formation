package app;

import java.util.HashMap;
import java.util.Set;

public class App {
	public static void main(String[] args)
	{
		HashMap hash = new HashMap();
		hash.put("Jeremy", "0102030405");
		hash.put("Jean","0601020304");
		hash.put("Clara", "0203040506");
		System.out.println("La taille de la map est : " + hash.size());
		Set key = hash.keySet();
		String s;
		System.out.println("Affichage d'une element de la hashmap");
		s = "Nom: " + (String) key.toArray()[0] + " numero: ";
		s += hash.get(key.toArray()[0]);
		System.out.println(s);
		System.out.println("Etat de la hashmap\n" + hash);
		System.out.println("Supression d'un element");
		hash.remove(key.toArray()[1]);
		System.out.println(hash);
	}
}
