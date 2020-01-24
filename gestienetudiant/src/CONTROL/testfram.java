package CONTROL;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class  testfram extends JFrame {
public JPanel FP ;
public JTextField login ;
public JPasswordField pw;//JTextField pw ;
public  JLabel lb;

public  testfram() {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//format 
	String s = sdf.format(new Date());// date de l'ordinateur
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//On dit à l'application de se fermer lors du clic sur la croix
	//long time1 = (new Date()).getTime();
	//String time2 = toString();
//	setLocation(500, 200);
//	setSize(300, 200);
	
	 
	   setTitle("bonjour said :) ");
	   setBounds(150,150, 600, 500);
	  getContentPane().setLayout(null);
	 //getContentPane().setLayout(new FlowLayout(FlowLayout.LEADING));
	      JButton ok =new JButton("ok");
	      JButton annule  =new JButton("annule");
		 annule.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	      
	      
	            login =new JTextField();
	            login.setBackground (Color.magenta);
	            login.setCursor(new Cursor(Cursor.HAND_CURSOR));
	                 pw = new JPasswordField(10); //pw =new JTextField();
	                 pw.setBackground (Color.YELLOW);
	                 pw.setCursor(new Cursor(Cursor.HAND_CURSOR));
	            JTextField date1 =new JTextField();
	            date1.setText("     "+s);
////////////////////////////////////////////
	 
	 JLabel lab1 =new JLabel("         login");
	 lab1.setBorder (BorderFactory.createRaisedBevelBorder());
	                 //lab1.setBorder(BorderFactory.createEtchedBorder());
	 JLabel lab2 =new JLabel("       password");
	 lab2.setBorder (BorderFactory.createRaisedBevelBorder());
	 lab2.setToolTipText ("Bulle d’aide");
	                 //lab2.setBorder(BorderFactory.createEtchedBorder());
	 JLabel lab3 =new JLabel("         date");
	 lab3.setBorder (BorderFactory.createRaisedBevelBorder());
	                 // lab3.setBorder (BorderFactory.createLoweredBevelBorder());
	 
////////////////////////////////////text.html
	/* 
	lb = new JLabel();
	 //JLabel lb = new JLabel("<html> <body>Ceci est un texte <br>  <b> en gras </b> \n" + "<br> <i> et ceci en italique </i > </body></html> ");
	 lb.setBorder (BorderFactory.createTitledBorder(" texte en html "));
	 lb.setOpaque (true);
	 lb.setBackground (Color.WHITE);
	 lb.setToolTipText ("survol du JLabel");
	 lb.setBounds(700,80, 200, 150);
	 // login.setBorder (BorderFactory.createTitledBorder(" texte en html "));

	 */
///////////////////////////////////image.gif
	 
	JLabel lf = new JLabel (new ImageIcon("G:/saidd/smiley.gif") );
	 lf.setBorder (BorderFactory.createDashedBorder(getBackground()));
	 lf.setCursor(new Cursor(Cursor.HAND_CURSOR));
	 lf.setBounds(460, 100,40, 40);
	 //////////////////////////////////////////////
		JLabel sd = new JLabel (new ImageIcon("G:/said2.jpg") );
		sd.setOpaque(false);

	 
	 
	 
	 /////////////////////////////////////////////////
		sd.setBounds(0,0, 600, 500);
	 annule.setBounds(400, 400, 100, 30);
	 ok.setBounds(100,400, 100, 30);
	 login.setBounds(300, 200,200, 30);
	 pw.setBounds(300, 300,200, 30);
	 lab1.setBounds(100, 200, 100, 30);
	 lab2.setBounds(100, 300,100, 30);
	 lab3.setBounds(100, 100,100, 30);
	 date1.setBounds(300,100,100,30);
     FP = (JPanel) getContentPane();
      
	//f.add(getParent());
	 ok.addActionListener(new action(this, null, null));
	 FP.add(lab1);
	 FP.add(login);
	 FP.add(lab2);
	 FP.add(pw);
	 FP.add (ok);
	 FP.add(annule);
	 FP.add(date1);
	 //FP.add(lb);
	 FP.add(lab3);
	 FP.add (lf);
	 FP.add (sd);
	menu( FP);
	//chek( FP);
	//chek1(FP);
	
setResizable(false);

setVisible(true);	 
}	
	public  JPanel   menu(JPanel FP ) {
		JMenuBar bar =new JMenuBar();
		JMenu men1 =new JMenu("fichier");
		JMenu men2 =new JMenu("editer");
		JMenu men3 =new JMenu("affichager");
		JMenuItem itm1 =new JMenuItem("Ovrire");
		JMenuItem itm2 =new JMenuItem("nouveau");
		JMenuItem itm3 =new JMenuItem("Quit");
		
		men1.add(itm1);
		men1.add(itm2);
		men1.add(itm3);
		
		bar.add(men1);
		bar.add(men2);
		bar.add(men3);
		bar.setBounds(0, 0, 1000, 20);
		setVisible (true);
		FP.add(bar);
		
		return FP;
	}
	public JPanel  chek(JPanel FP) {
		JRadioButton fm =new JRadioButton("femme");
		JRadioButton hm =new JRadioButton("homme");
		ButtonGroup bt =new ButtonGroup();
		bt.add(hm);
		bt.add(fm);
		FP.add(fm);
		FP.add(hm);
		fm.setBounds(450, 350, 100, 30);
		hm.setBounds(450, 400, 100, 30);
		setVisible (true);
		return FP;
	}
	public JPanel chek1(JPanel f) {
		JPanel p = new JPanel (new GridLayout(3, 3));
		p.setBorder(BorderFactory.createTitledBorder("salut said"));
		JCheckBox bx =new JCheckBox("rembre me");
		p.add(bx);	
		JCheckBox bx1 =new JCheckBox("don't forget");
		p.add(bx1);
		JCheckBox bx2 =new JCheckBox("live is great");
		p.add(bx2);
		bx.setSelected(false);	
		p.setBounds(700, 250, 100, 100);
		setVisible(true);
		f.add(p);
	return f;	
	}
	
	
}
