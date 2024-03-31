package Project;
import java.sql.*;


import Project.Ensignant;

public class Project {
	
	public static void addEnsignant(Ensignant ensignant) {

	    // Connect to the database
	    Connection conn = null;
	    try {
	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable_management", "root", "PASSword1234!");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    // Create a prepared statement to insert the Ensignant data
	    PreparedStatement ps = null;
	    try {
	        ps = conn.prepareStatement("INSERT INTO enseignants (matricule, nom, contact) VALUES (?, ?, ?)");
	        ps.setInt(1, ensignant.getMatricule());
	        ps.setString(2, ensignant.getNom());
	        ps.setString(3, ensignant.getContact());
	        ps.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        if (ps != null) {
	            try {
	                ps.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        if (conn != null) {
	            try {
	                conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("try phase after the line 50");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	    Ensignant e1 = new Ensignant(10, "test", "jtestes.com");
	    addEnsignant(e1);
	}

}
