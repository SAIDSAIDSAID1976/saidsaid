package Traitement;

import java.util.Scanner;
import java.util.Vector;
import Entities.*;
public class GestionEtudiant {
Scanner sc = new Scanner(System.in);
	public Vector v = new Vector();
	
	
public 	Vector ajouterEtudiant()
	{
	while(true)
	{
		Etudiant e = new Etudiant();
		System.out.println("veuillez saisir le nom");
		 e.nom =sc.next();
			System.out.println("veuillez saisir la  note");
				e.note= sc.nextDouble();
						v.add(e);
				System.out.println("Etudaint ajoutée avec succes");
				System.out.println("Quitter O/N");
				if(sc.next().equalsIgnoreCase("o"))
					break;
	}
	for (int i = 0; i < v.size(); i++) {
		Etudiant r = new Etudiant();
		r = (Etudiant)v.get(i);
		
		System.out.println(r.nom + "=====>" + r.note);
	}
	
	
		
		return v;
	}
public	int calculerMoyenne(Vector v)
	{
		// Calculer la moyenne v.get(i).note
	return 11;}
	
}
