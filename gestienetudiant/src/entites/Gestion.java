package entites;
import java.util.Scanner;

import Main.EtudiantDao;
import traitement.gestienetudient;

public class Gestion {
	gestienetudient ge =new gestienetudient();	
	EtudiantDao dao =new EtudiantDao();
public void Menu() {
char reponse;	
int i ;
 boolean fini =true ;
 Scanner Sc = new  Scanner(System.in);
	while (fini) {
		System.out.println("\n ");
		System.out.println("les operation possible  :     \n  \t 1 -  Ajouter \n  \t 2 - Modifier \n  \t 3 - Supprimer \n  \t 4 - afficher \n    \t 5 - afficher Max  \n\t 6 - quitte \n");
		System.out.print("entre votre choix   :   ");
		i =Sc.nextInt();
		switch(i) {
		
		case 1:  {
			
			ge.ajouteetudiant();
		    break;
		         }
		case 2: {
		
			//dao.modifie();
	        break;   	
		        }
		case 3: {
		
			dao.supprimer();
			break;
		        }
		case 4: {
			
            //dao.affichage();
            break;
		        }
		case 5: {
			
            dao.NoteMax();
            break;
		        }
		case 6: {
			fini=false;
			break;
	        	}
		
		
		}//////////switch
		if(fini!=false) {
		System.out.println("");
		System.out.print("\t \t voulez vous continuer  O/N :   ");		
		reponse =Sc.next().toLowerCase().charAt(0);
		if(reponse=='n') {
			fini=false;}
		}//////////if1111
	}////////while

}///menu

}////gestion