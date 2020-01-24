package CONTROL;

import java.util.Vector;

import javax.swing.JTable;

import Main.EtudiantDao;

public class swingNEW {

	

	public static void main(String[] args) {
		double z=123;
		
		//testfram fr = new testfram();
		EtudiantDao dao =new EtudiantDao();
		//dao.authentification(String chain);

       Chercher ta = new Chercher();
		dao.affichage(z);
		
	
		
		
	}

}
