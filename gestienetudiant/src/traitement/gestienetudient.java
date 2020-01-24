package traitement;
import entites.*;

import java.util.Scanner;
import java.util.Vector;

import Main.EtudiantDao;

public class gestienetudient {

Vector vect = new Vector();	
Scanner Sc = new  Scanner(System.in);
int h,k,j, i=0; String s;
////////////////////////////////////////////////////////ajouter

 public Vector ajouteetudiant() {
	char bl1='o';char bl2 ='o';int h=1;
	
	while (bl1==bl2) {
		h++;k=i;
	etudiant e =new etudiant();	
		
	System.out.println("ajoute un etudient "+k +" : ");	
	System.out.print("      - entre le nom      :  ");
	e.nom= Sc.next();
	        if(e.nom.length()<=9)
	        {h=9-e.nom.length();for(j=0;j<=h;j++) e.nom=e.nom+" ";}
	System.out.print("      - entre le prenom   :  ");
	e.prenom = Sc.next();
	        if(e.prenom.length()<=9)
	        {h=9-e.prenom.length();for(j=0;j<=h;j++) e.prenom=e.prenom+" ";}
	System.out.print("      - entre le cen      :  ");
    e.cne = Sc.nextInt();
    String k = ""+e.cne; 
 	System.out.print("      - entre la note     :  ");
    e.note= Sc.nextDouble();
 	System.out.print("      - entre la moyenne  :  ");
    e.notemoyenne = Sc.nextDouble();
    EtudiantDao nex =new EtudiantDao();
	 nex.AjoutEtudiant( e.nom,e.prenom,e.note);
  //vect.add(e); 
                                  System.out.println("");
     System.out.print(" \t voulez vous continuer (o/n)  :");
     bl2 =Sc.next().toLowerCase().charAt(0);
     
                         System.out.println("");
     }  // while  
   

    return vect;
    	}//ajoute

	///////////////////////////////////////////////////ajouter eleve
/*	public Vector ajouteetudiant(eleve e2) {
		char bl1='o';char bl2 ='o';
		Vector vect2 =new Vector();
		while (bl1==bl2) {
			i++;k=i;
		eleve e1 =new eleve ();
		System.out.println("ajoute un eleve "+k +" : ");	
		System.out.print("      - entre le nom      :  ");
		e1.nom= Sc.next();
		        if(e1.nom.length()<=9)
		        {h=9-e1.nom.length();for(j=0;j<=h;j++) e1.nom=e1.nom+" ";}
		        ///////////////////1111111111111111
		
		System.out.print("      - entre le prenom   :  ");
		e1.prenom = Sc.next();
		        if(e1.prenom.length()<=9)
		        {h=9-e1.prenom.length();for(j=0;j<=h;j++) e1.prenom=e1.prenom+" ";}
		  	 ///////////////////2222222222222222222222
		
		System.out.print("      - entre le nom pere      :  ");
		e1.pere= Sc.next();
	 		        if(e1.pere.length()<=9)
	 		        {h=9-e1.pere.length();for(j=0;j<=h;j++) e1.pere=e1.pere+" ";}
	 		        ///////////////////////////333333333333333333333
		
	 	System.out.print("      - entre le prenom mere  :  ");
	 	e1.mere= Sc.next();
	 		        if(e1.mere.length()<=9)
	 		        {h=9-e1.mere.length();
	 		        for(j=0;j<=h;j++) e1.mere=e1.mere+" ";}
	 		        /////////////////////////////444444444444444444444
	 	
	 	  System.out.print("      - entre le cen      :  ");
	 		 e1.cne = Sc.nextInt(); ////////////////////////
	 		 
	 			System.out.print("      - entre la note     :  ");
	 			    e1.note= Sc.nextDouble();///////////////////////////////////
	 			    
	 			 	  System.out.print("      - entre la moyenne  :  ");
	 			          e1.notemoyenne = Sc.nextDouble();  
	
	   vect2.add(e1) ; 
	                         System.out.println("");
	     System.out.print(" \t voulez vous continuer (o/n)  :");
	     bl2 =Sc.next().toLowerCase().charAt(0);
	     
	                         System.out.println("");
	     }  // while  
	   

	    return vect2;
	    	}//ajoute eleve        */
	
/////////////////////////////////////////////////////////////////affichage
	public void affichage(Vector vect1) {
	int i,h=0;
	System.out.println("afficher la liste  :"+"\n 1 - etudiant :"+"\n 2 - eleve :");
	h = Sc.nextInt();
	switch (h) {
	case 1:
		etudiant e1 =new etudiant();
		System.out.println("la liste des etudiants enregistries est :");
		System.out.println("");
		System.out.println("|      nom      !     prenom     !     cne    !    note     !     moyenne   |");
			for (i=0;i<vect1.size();i++) {
			 e1= (etudiant)vect1.get(i);
		
		     System.out.println("     "+e1.nom+" " +"       \t"+e1.prenom+" "+"    \t"+e1.cne+" "+"    \t"+e1.note+" "+"    \t"+e1.notemoyenne);
		     }
			//for
		break;
	case 2:
		eleve  e =new eleve ();
		System.out.println("la liste des eleve enregistries est :");
		System.out.println("");
		System.out.println("|      nom      !     prenom     !     pere    !     mere        !     cne       !       note     !     moyenne   |");
		i=0;
		for (i=0;i<vect1.size();i++) {
				
			 e= (eleve)vect1.get(i);
			
		     System.out.println("     "+e.nom+" " +"       \t"+e.prenom+" "+"    \t"+e.pere+" "+"    \t"+e.mere+" "+"    \t" +e.cne+" "+"        \t"+e.note+" "+"        \t"+e.notemoyenne);
		     }
			//for
		break;
	default:
		break;
	}
	
	}//affichage
	
////////////////////////////////////////////////////////////////moyenne	
	public Vector moyenne(Vector vectt) {
		etudiant e =new etudiant();
		
		 int j,m=0;double  moy=0;
		 for (j=0;j<vectt.size();j++) {
			 e=(etudiant)vectt.get(j);
			 moy=moy+e.note;
		
				                      }//for
			m=vectt.size() ; 
			e.notemoyenne= moy/m;
	
		 
		return vectt;
	}//moyenne         


	
	
}//gestien
