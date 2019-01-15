package metier;

import java.util.*;
import java.io.*;

public class Dico extends HashMap<String, String> {
   private static final long serialVersionUID = 1L;
   private String fichierSource;

   public Dico(String chemin){
        fichierSource = chemin;
   }

/**
 * charger() est une fonction qui charge les données d'un fichier dans une hashmap
 * les données doivent être organise selon cette regle : key/value\n 
 * @throws IOException
 */
   public void charger() throws IOException{
	   InputStream f = new FileInputStream(this.fichierSource);
	   InputStreamReader lecture=new InputStreamReader(f);
	   BufferedReader buff=new BufferedReader(lecture);
	   String contenu;
	   while ((contenu=buff.readLine())!=null)
	   {
			StringTokenizer st = new StringTokenizer(contenu,"/");
			this.put(st.nextToken(), st.nextToken());
	   }
	   buff.close();
	   lecture.close();
	   f.close();
   }

/**
 * consulter(String) est une fonction qui retourne un string en prenant en parametre une clef
 * elle consulte la hashmap et retourne la valeur assoscier a la clef
 * si il n'y en a pas elle retourne null
 * @param clef
 * @return
 */
   public String consulter(String clef){
	   String value;
	   value = this.get(clef);
	   return value;
   }


/**
 * creer(String, String) est une fonction qui ajoute une association dans la hashmap
 * elle ajoute aussi l'association dans le fichier afin que les données persiste
 * @param clef
 * @param valeur
 * @throws IOException
 */
   public void creer(String clef,String valeur) throws IOException
   {	
	   File f = new File(this.fichierSource);
	   FileWriter fW = new FileWriter(f);
	   this.put(clef, valeur);
	   Set<String> key = this.keySet();
	   Object[] k = key.toArray();
	   for(int i= 0; i < this.size(); i++)
	   {
		   String s = k[i] + "/" + this.get(k[i]) + "\n";
		   fW.append(s);
		   
	   }
	   fW.close();
   }
   /**
    * listerStout() est une fonction qui permet d'afficher le contenu de la hashmap 
    * dans la sortie standard
    */
   public void listerStdout(){

     Iterator iterator = entrySet().iterator();
    while (iterator.hasNext()) {
      Map.Entry mapEntry = (Map.Entry) iterator.next();
      System.out.println("Clé: " + mapEntry.getKey()
      + ",Valeur :" + mapEntry.getValue());
    }

   }
}