import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class saidtable extends JFrame{
	
	    public saidtable() {
	        super();
	 
	        setTitle("JTable basique dans un JPanel");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        Object[][] donnees = {
	                {"Johnathan", "Sykes", Color.red, true, Sport.TENNIS},
	                {"Nicolas", "Van de Kampf", Color.black, true, Sport.FOOTBALL},
	                {"Damien", "Cuthbert", Color.cyan, true, Sport.RIEN},
	                {"Corinne", "Valance", Color.blue, false, Sport.NATATION},
	                {"Emilie", "Schrödinger", Color.magenta, false, Sport.FOOTBALL},
	                {"Delphine", "Duke", Color.yellow, false, Sport.TENNIS},
	                {"Eric", "Trump", Color.pink, true, Sport.FOOTBALL},
	        };
	 
	        String[] entetes = {"Prénom", "Nom", "Couleur favorite", "Homme", "Sport"};
	 
	        JTable tableau = new JTable(donnees, entetes);
	 
	        getContentPane().add(tableau.getTableHeader(), BorderLayout.NORTH);
	        getContentPane().add(tableau, BorderLayout.CENTER);
	 
	        pack();
	        JPanel FP = (JPanel) getContentPane();
	        JLabel lf = new JLabel (new ImageIcon("G:/saidd/smiley.gif") );
			 lf.setBorder (BorderFactory.createLoweredBevelBorder());
			 lf.setCursor(new Cursor(Cursor.HAND_CURSOR));
			 lf.setBounds(700, 100,40, 40);
			 FP.add (lf);
	    }
	   public enum Sport {
	        TENNIS,
	        FOOTBALL,
	        NATATION,
	        RIEN;
	    	
	    } 
}
