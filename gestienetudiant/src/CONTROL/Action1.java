package CONTROL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import Main.EtudiantDao;

public class Action1 implements ActionListener {
	EtudiantDao dao ;
	AjouteEtudiant ae;
	public  Action1(AjouteEtudiant e) {
		ae=e;
		 dao =new EtudiantDao();
	}
	public void actionPerformed(ActionEvent e) {
		
		try {
			dao.st = (Statement) dao.EtudiantDao().createStatement();
			int i = dao.st.executeUpdate("insert into etudiant(nom,prenom,note) values('" + ae.nom1.getText() + "','" + ae.prenom.getText()	+ "'," + ae.note.getText() + ")");
			
		} catch (SQLException e1) {
			System.out.println("prb d'enregistrement ");
			e1.printStackTrace();
		}
}
	}
