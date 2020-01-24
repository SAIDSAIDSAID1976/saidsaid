package thisthis;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public abstract class EtudiantDao1 {
	// crée une connection (lien)vers nue base de données
		Connection cnx;
		// pour envoyer est exécuter des reqûete sql
		Statement st;
		// récuperation des resultats
		ResultSet rst;
		Scanner Sc = new Scanner(System.in);
	protected  String nom ="bougtoub";
	///////////////////////////////////////////////////////////////////////////////
	
	public void afficher1(){
		System.out.println("afficher le nom  = "+nom);
	} ;

	 public  void affichage() {
			cnx=EtudiantDao();
			String aff= "select*from etudiant";
			try {
				st = (Statement) cnx.createStatement();
				rst = st.executeQuery("select*from etudiant");
				while(rst.next()) {
					System.out.print(rst.getString("nom")+"\t");
					System.out.print(rst.getString("prenom")+"\t");
					System.out.print(rst.getDouble("cne")+"\t");
					System.out.print(rst.getDouble("note")+"\t");
					System.out.print(rst.getDouble("moyenne")+"\t");
					System.out.println("\n");
				}
					} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 
	 public Connection EtudiantDao() {
			String chaine = "jdbc:mysql://localhost:3306/gestionetudiant";
			try {
				Class.forName("com.mysql.jdbc.Driver");
							System.out.println("chargemment avec succés");
			} catch (ClassNotFoundException e1) {
				System.out.println("probléme driver");
				e1.printStackTrace();
			} /// catch1
			try {
				cnx = (Connection) DriverManager.getConnection(chaine, "root", "");
				System.out.println("cnx avec sucés");
				return cnx;
			} catch (SQLException e1) {
				System.out.println("probléme de cnx ");
				e1.printStackTrace();
				return null;
			} //// catch2
		}
}
