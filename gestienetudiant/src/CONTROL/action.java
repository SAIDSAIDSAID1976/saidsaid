package CONTROL;

import java.awt.Component;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.mysql.jdbc.Statement;

import Main.EtudiantDao;
import entites.etudiant;



public class action implements ActionListener {
	private static final Component controllingFrame = null;
	EtudiantDao dao =new EtudiantDao();
	AjouteEtudiant ae;	
	JButton ajouter;
	JButton afficher ;
	testfram a ;
	Chercher as;
	Vector v1;
	//EtudiantDao dot=new EtudiantDao();
	//////////////////////////////////////////
	public action(testfram e,AjouteEtudiant e1,Chercher e2) {
		a=e;
		ae=e1;
		as=e2;
	                          }
	//////////////////////////////////////////
	/*public action(AjouteEtudiant e1) {
		
		ae=e1;
		// dao =new EtudiantDao();
		
		
	}*/
	
	
	
		public void actionPerformed(ActionEvent e) {
			
			if(a!=null&& as==null) {
				
		String Ll=a.login.getText();	
		String Lm=a.pw.getText();	
		if(dao.authentification(a.login.getText(),a.pw.getText())) 
		{System.out.println(" correcte");
		//a.login.setText("\t ok");
		//a.lb.setText("etudiant a cherche existe !!!!!!");
		
		//a.hide();
		 JOptionPane.showMessageDialog(controllingFrame,"Success! You typed the right password.");	
		marcher();
		////////////////////////////////////////////////////////////
		}
		
		else  JOptionPane.showMessageDialog(controllingFrame,"Invalid password. Try again.","Error Message",JOptionPane.ERROR_MESSAGE);
     
			
			}/////////if(a!=null)
			
			
		
		
		
		}
		void marcher() {
			a.getLayeredPane().removeAll();
		      ajouter =new JButton("ajouter");
		     afficher  =new JButton("afficher");
		     afficher.setBounds(400, 400, 100, 30);
			 ajouter.setBounds(100,400, 100, 30);
			 a.getLayeredPane().add(ajouter);
			 a.getLayeredPane().add(afficher);
			 a.setResizable(false);
			 a.setVisible(true);
			 ajouter.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						AjouteEtudiant ae2 =new AjouteEtudiant();
						
					}
				});
				///////////////////////////////////////////////////////////
				afficher.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						Chercher as =new Chercher();
						
								
					}
				});
		}
		
	
		
}
