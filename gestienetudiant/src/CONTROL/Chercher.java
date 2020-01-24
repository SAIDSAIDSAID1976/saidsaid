package CONTROL;
import java.awt.BorderLayout;
import java.awt.Color;
	import java.awt.Cursor;
	import java.awt.Frame;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.text.SimpleDateFormat;
	import java.util.Date;
import java.util.Vector;

import javax.swing.BorderFactory;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.Caret;

import Main.EtudiantDao;
import entites.etudiant;

import java.text.SimpleDateFormat;
public class Chercher extends JFrame {
	
//////////////////////////////
//////////////////////////////////	

	 
		JPanel FP ;
	
		public JTextField  cne;
		public JTextField  nom;
		public JTextField  prenom;
		public JTextField  note;
		
			public  Chercher()  {
 super();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//format 
		String s = sdf.format(new Date());// date de l'ordinateur
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//On dit à l'application de se fermer lors du clic sur la croix
		
		
		
		   setTitle("bonjour said  2 :) ");
		   setBounds(150,150, 1000, 600);
		 getContentPane().BorderLayout;
		   
		      JButton annule  =new JButton("annule");
		      JButton ok =new JButton("ok");
		      annule.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
					
				}
			});
		     ///*********************************************
		     
		 	 
		        setTitle("JTable basique dans un JPanel");
		      
		      Object[][] donnees = {
		                {"Johnathan", "Sykes", Color.red, true, 3},
		                {"Nicolas", "Van de Kampf", Color.black, true,3},
		                {"Damien", "Cuthbert", Color.cyan, true, 3},
		                {"Corinne", "Valance", Color.blue, false, 3},
		                {"Emilie", "Schrödinger", Color.magenta, false,3},
		                {"Delphine", "Duke", Color.yellow, false, 3},
		                {"Eric", "Trump", Color.pink, true, 3},
		        };
		 
		        String[] entetes = {"Prénom", "Nom", "Couleur favorite", "Homme", "Sport"};
		 
		        JTable tableau = new JTable(donnees, entetes);
		        getContentPane().add(tableau);
		      
		        tableau.setBounds(900, 200,100, 30);
		       tableau.setVisible(true);
		        pack();
			 //********************************************
		      JTextArea ta	=new JTextArea();   	      
		       cne =new JTextField();
		       cne.setBackground (Color.YELLOW);
		       cne.setCursor(new Cursor(Cursor.HAND_CURSOR));
		           
		       nom =new JTextField();
		       nom.setBackground (Color.YELLOW);
		       nom.setCursor(new Cursor(Cursor.HAND_CURSOR));         
		       
		       prenom =new JTextField();
		       prenom.setBackground (Color.YELLOW);
		       prenom.setCursor(new Cursor(Cursor.HAND_CURSOR));
		       
		       note =new JTextField();
		       note.setBackground (Color.YELLOW);
		       note.setCursor(new Cursor(Cursor.HAND_CURSOR));
		                
		      JTextField date1 =new JTextField();
		                 date1.setText("     "+s);
	////////////////////////////////////////////
		JLabel lab2 =new JLabel("         nom");
		lab2.setBorder (BorderFactory.createRaisedBevelBorder());
		JLabel lab4 =new JLabel("         prenom");
		lab4.setBorder (BorderFactory.createRaisedBevelBorder());
		JLabel lab5 =new JLabel("         note");
		lab5.setBorder (BorderFactory.createRaisedBevelBorder());
		 JLabel lab1 =new JLabel("         cne");
		 lab1.setBorder (BorderFactory.createRaisedBevelBorder());
		                 //lab1.setBorder(BorderFactory.createEtchedBorder());
		 
		 JLabel lab3 =new JLabel("         date");
		 lab3.setBorder (BorderFactory.createRaisedBevelBorder());
		                 // lab3.setBorder (BorderFactory.createLoweredBevelBorder());
		
	 
	///////////////////////////////////image.gif
		 
		JLabel lf = new JLabel (new ImageIcon("G:/saidd/smiley.gif") );
		 lf.setBorder (BorderFactory.createLoweredBevelBorder());
		 lf.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 lf.setBounds(700, 100,40, 40);
		 
		 
		 /////////////////////////////////////////////////
		 
		 ////////////////////////////////////////////////
		  date1.setBounds(500,100,100,30);
		  lab3.setBounds(300, 100,100, 30);
		  
		 annule.setBounds(700, 500, 100, 30);
		 ok.setBounds(200,500, 100, 30);
		 
		 lab1.setBounds(300, 200,100, 30);
		 cne.setBounds(500, 200,100, 30);
		 
		 lab2.setBounds(160, 300, 100, 30);
		 nom.setBounds(140, 400, 150, 30);
		 
		 lab4.setBounds(460, 300, 100, 30);
		 prenom.setBounds(440,400,150,30);
		 
		 lab5.setBounds(760, 300, 100, 30);
		 note.setBounds(740, 400, 150, 30);
		 
		 
		 
		 
		 
		
		 
	     FP = (JPanel) getContentPane();

		//f.add(getParent());
		
	 ok.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("as////////");
			EtudiantDao dao = new EtudiantDao();
			
 Vector v = dao.affichage(Double.parseDouble(cne.getText()));

  
 nom.setText( (String) v.get(0));

 prenom.setText( (String) v.get(1));
 			
 note.setText(  v.get(3).toString());		}
	});
		//ok.addActionListener(new action(null, null, this));

		 FP.add(lab1);
		 FP.add(cne);
		 FP.add (nom);
		 FP.add (lab2);
		 FP.add (ok);
		 FP.add (prenom);
		 FP.add (note);
		 FP.add(annule);
		 FP.add(date1);
		 FP.add(lab3);
		 FP.add(lab4);
		 FP.add(lab5);
		 FP.add (lf);
		
		
	setResizable(false);

	setVisible(true);	
		}
	
}
