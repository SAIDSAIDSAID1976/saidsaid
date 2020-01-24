package Main;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.Spring;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import entites.etudiant;

public  class EtudiantDao {
	// crée une connection (lien)vers nue base de données
	public Connection cnx;
	// pour envoyer est exécuter des reqûete sql
	public Statement st;
	// récuperation des resultats
	public ResultSet rst;
	Scanner Sc = new Scanner(System.in);
	///////////////////////////////////////////////////////this this 
	public Vector v1;
/////////////////////////////////////////////////////////////////////////////////////////	
	public Connection EtudiantDao() {
		String chaine = "jdbc:mysql://localhost:3306/gestionetudiant";
		//String chaine = "jdbc:mysql://192.168.137.134:3306/gestionetudiant";
		try {
			Class.forName("com.mysql.jdbc.Driver");
						//System.out.println("chargemment avec succés");
		} catch (ClassNotFoundException e1) {
			System.out.println("probléme driver");
			e1.printStackTrace();
		} /// catch1
		try {
			cnx = (Connection) DriverManager.getConnection(chaine, "root", "");
			//System.out.println("cnx avec sucés");
			return cnx;
		} catch (SQLException e1) {
			System.out.println("probléme de cnx ");
			e1.printStackTrace();
			return null;
		} //// catch2
	}
////////////////////////////////////////////////////////////////////////////////////////////
	public boolean authentification(String chain,String chain1) {
		String aaa ="";
		String chaine = " select * from etudiant where motpasse ='"+chain+"'";
		
		try {
			st= (Statement) EtudiantDao().createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rst=st.executeQuery(chaine);
			
			while (rst.next()) {
			aaa =rst.getString("password");
			if (chain1.equalsIgnoreCase(aaa))return true;
			else return false;
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
			
		}
		
		return false;
		
	}
	
	
	
	

///////////////////////////////////////////////////////////////////////////////////////////
	public void AjoutEtudiant(String nom,String prenom,double note) {
		cnx=EtudiantDao();
	
		try {
			st = (Statement) EtudiantDao().createStatement();
			int i = st.executeUpdate("insert into etudiant(nom,prenom,note) values('" + nom + "','" + prenom+ "'," + note  + ")");
			//System.out.println("Enregistrement avec sucée : " + i);
		} catch (SQLException e1) {
			System.out.println("prb d'enregistrement ");
			e1.printStackTrace();
		}
	}/// ajoutEtudiant
//////////////////////////////////////////////////////////////////////
	
	public String modifie(String chain) {
		cnx=EtudiantDao();String nomNV;
	// chain=" update etudiant set nom = '"+" + nomNV + "+"' where cne ="+" + z";
		int code;
		//" update etudiant set nom = '" + nomNV + "' where cne =" + z
		//System.out.print("saisir le code Svp :  ");
		//code = Sc.nextInt();
		//System.out.println("");
		System.out.print("entre le nouveau nom : ");
		nomNV = Sc.next();
			try {
			st = (Statement) cnx.createStatement();
			int i = st.executeUpdate(chain);
			//System.out.println("\t    ******* modification avec sucess  ;)*******");
		} catch (SQLException e1) {
			System.out.println("probleme sur la modification ");
			e1.printStackTrace();
		}
			return nomNV;
	}
////////////////////////////////////////////////////////////////////MODIFIER
	
public  Vector affichage(Double s) {
	cnx=EtudiantDao();
 v1= new Vector();
	String aff= "select*from etudiant";
	try {
		st = (Statement) cnx.createStatement();
		rst = st.executeQuery("select * from etudiant where cne ="+s);
		while(rst.next()) {
	
		v1.add(rst.getString("nom"));
		v1.add(rst.getString("prenom"));
		v1.add(rst.getDouble("cne"));
		v1.add(rst.getDouble("note"));
		v1.add(rst.getDouble("moyenne"));
	
			
		}
			} catch (SQLException e) {
		// TsODO Auto-generated catch block
		e.printStackTrace();
	}
	return v1;
}
////////////////////////////////////////////////////////////////////// afficher

public void supprimer() {
	cnx=EtudiantDao();
	String ger="delete from etudiant where cne =";
	int cne;
	System.out.println("entre cne  de  l'etudiant a supptimer : ");
	cne =Sc.nextInt();
	try {
		st = (Statement) cnx.createStatement();
		st.executeUpdate(ger+cne);
		System.out.println("l'etudiant a supprimé !!!!!!!");
	} catch (SQLException e) {
		System.out.println("probleme de supprition ");
		e.printStackTrace();
	}
	}
///////////////////////////////////////////////////////////////////supprimer

public void NoteMax() {
	double notemax=20;
	cnx=EtudiantDao();
	try {
		st = (Statement) cnx.createStatement();
		rst= st.executeQuery("select*from etudiant");
		while (rst.next()) {
			if (rst.getDouble("note")>notemax) {
				notemax=rst.getDouble("note");
			                                   }/////if
			
				        }////////while	
		System.out.println("la valeur de max est  :  " +notemax);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
/////////////////////////////////////////////////////////////////////notemax
public void AjoutEtudiant(JTextField nom1, JTextField prenom, double parseDouble) {
	// TODO Auto-generated method stub
	
}



}
