package app;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import metier.Animal;

public class Deserialisation { 
    public static void main(String argv[]) throws ClassNotFoundException { 
          try { 
                FileInputStream f = new FileInputStream("leChienMédor.serialisation"); 
                ObjectInputStream o = new ObjectInputStream(f); 
                Animal animal = (Animal)o.readObject(); 
                o.close(); 
                System.out.println(animal.getNom()+" est "+animal.getCouleur() + " a " + (119 -(animal.getNaissance().getYear())) + " ans"); 
          } 
          catch (IOException e) { 
                System.out.println(e); 
          } 
    } 
}