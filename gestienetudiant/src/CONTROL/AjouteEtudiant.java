package CONTROL;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Main.EtudiantDao;

import java.text.SimpleDateFormat;

public class AjouteEtudiant extends JFrame {
	JPanel FP ;
	public  JTextField  note;
	public JTextField  nom1;
	public  JTextField prenom;
	public JLabel lb;
	
	public AjouteEtudiant() {
		

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//format 
	String s = sdf.format(new Date());// date de l'ordinateur
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//On dit à l'application de se fermer lors du clic sur la croix
	
	
	
	   setTitle("bonjour said  2 :) ");
	   setBounds(150,150, 1000, 600);
	   getContentPane().setLayout(null);
	   
	      JButton annule  =new JButton("annule");
	      JButton ok =new JButton("ok");
	      annule.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	     
		 //********************************************
	      
	     note =new JTextField();
	                note.setBackground (Color.YELLOW);
	                note.setCursor(new Cursor(Cursor.HAND_CURSOR));
	      
	       nom1 =new JTextField();
	                nom1.setBackground (Color.YELLOW);
	                nom1.setCursor(new Cursor(Cursor.HAND_CURSOR));
	           // JPasswordField   pw = new JPasswordField(10); 
	                
	       prenom =new JTextField();
	                 prenom.setBackground (Color.YELLOW);
	                 prenom.setCursor(new Cursor(Cursor.HAND_CURSOR));
	                
	      JTextField date1 =new JTextField();
	                 date1.setText("     "+s);
////////////////////////////////////////////
	 
	 JLabel lab1 =new JLabel("         nom");
	 lab1.setBorder (BorderFactory.createRaisedBevelBorder());
	                 //lab1.setBorder(BorderFactory.createEtchedBorder());
	 JLabel lab2 =new JLabel("       prenom");
	 lab2.setBorder (BorderFactory.createRaisedBevelBorder());
	 lab2.setToolTipText ("Bulle d’aide");
	                 //lab2.setBorder(BorderFactory.createEtchedBorder());
	 JLabel lab3 =new JLabel("         date");
	 lab3.setBorder (BorderFactory.createRaisedBevelBorder());
	                 // lab3.setBorder (BorderFactory.createLoweredBevelBorder());
	 JLabel lab4 =new JLabel("         note");
	 lab4.setBorder (BorderFactory.createRaisedBevelBorder());
	                 //lab1.setBorder(BorderFactory.createEtchedBorder());
 
///////////////////////////////////image.gif
	 
	JLabel lf = new JLabel (new ImageIcon("G:/saidd/smiley.gif") );
	 lf.setBorder (BorderFactory.createLoweredBevelBorder());
	 lf.setCursor(new Cursor(Cursor.HAND_CURSOR));
	 lf.setBounds(560, 100,40, 40);
	 
	 
	 /////////////////////////////////////////////////
	 lb = new JLabel();
	 //JLabel lb = new JLabel("<html> <body>Ceci est un texte <br>  <b> en gras </b> \n" + "<br> <i> et ceci en italique </i > </body></html> ");
	 lb.setBorder (BorderFactory.createTitledBorder(" texte en html "));
	 lb.setOpaque (true);
	 lb.setBackground (Color.WHITE);
	 lb.setToolTipText ("survol du JLabel");
	 lb.setBounds(700,80, 200, 150);
	 ////////////////////////////////////////////////
	 
	 annule.setBounds(700, 500, 100, 30);
	 ok.setBounds(200,500, 100, 30);
	 nom1.setBounds(400, 200,200, 30);
	 prenom.setBounds(400, 300,200, 30);
	 note.setBounds(400, 400,200, 30);
	 lab1.setBounds(200, 200, 100, 30);
	 lab2.setBounds(200, 300,100, 30);
	 lab3.setBounds(200, 100,100, 30);
	 lab4.setBounds(200, 400,100, 30);
	 date1.setBounds(400,100,100,30);
     FP = (JPanel) getContentPane();

	//f.add(getParent());
	
     ok.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			EtudiantDao dao = new EtudiantDao();
			dao.AjoutEtudiant(nom1.getText(), prenom.getText(),Double.parseDouble(note.getText()));
			
		}
	});
	// ok.addActionListener(new action(null, this, null));

	 FP.add(lab1);
	 FP.add(nom1);
	 FP.add(lab2);
	 FP.add(lab4);
	 FP.add(prenom);
	 FP.add (ok);
	 FP.add (note);
	 FP.add(annule);
	 FP.add(date1);
	 FP.add(lab3);
	 FP.add (lf);
	 FP.add (lb);
	
setResizable(false);

setVisible(true);	
	}
}
