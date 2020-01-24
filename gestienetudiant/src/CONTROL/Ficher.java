package CONTROL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.imageio.IIOException;

public class Ficher {

	   public static void main(String[] args) throws IOException {
	File monfile = new File("G:\\txt\\note.txt");
    monfile.createNewFile();
    // System.out.println(monfile.exists());
	File f =monfile.getParentFile();
	System.out.println(f.toString());
	
	listefichier(f);
	
	System.out.println("taille : "+monfile.length()+" octets");

	System.out.println("lecture autorisée : "+(monfile.canRead()?"oui":"non"));

	System.out.println("écriture autorisée : "+(monfile.canWrite()?"oui":"non"));
	Ecrirefile( monfile);
	Lirefile(monfile);
	   }
	   public static void listefichier(File f) {
		if(f.isDirectory()==true) {
			String file []=f.list();
			System.out.println(f.getAbsolutePath()+":");
			for(int i=0;i!=file.length;i++) {
				System.out.println("  \t"+file[i]);
			}////for
			
		}/////if
		else System.out.println("le chemin n'existe pas !!!!!!!!!!!!!");
		   
	}//////liste fichier
	   public static void Ecrirefile(File f)   {
		   Scanner Sc =new Scanner(System.in);
		  System.out.print("entre la chaine  :    "); 
		   String chaine;
		chaine =Sc.nextLine();
		//chaine.split(" ");
		
		try {
			FileOutputStream f1 = new FileOutputStream(f,true);
			f1.write(chaine.getBytes());
			f1.close();
		} catch (IOException e) {
			
			System.out.println("Erreur ecriture");
		}
		
	
	}/////ecrire file
	   public static void Lirefile(File f)  {
		
		   try {
			InputStream i =new FileInputStream(f);
	    	byte buffer [] =new byte[i.available()];
			i.read(buffer);
			for(int i1=0;i1!=buffer.length;i1++) System.out.print((char)buffer[i1]);
				i.close();	
		} catch ( IOException e) {
			
			System.out.println("Erreur lecture");
		} 
}
}