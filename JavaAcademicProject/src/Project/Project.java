package Project;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
    public static  List<Ensignant> getAllEnsignants() {
        List<Ensignant> enseignants = new ArrayList<>();
        // Connect to the database
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable_management", "root", "PASSword1234!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Create a prepared statement to select all Ensignant data
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM enseignants");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ensignant enseignant = new Ensignant(rs.getInt("matricule"), rs.getString("nom"), rs.getString("contact"));
                enseignants.add(enseignant);
            }
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
        return enseignants;
    }

    public  static Ensignant getEnsignantByNom(String nom) {
        Ensignant enseignant = null;
        // Connect to the database
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable_management", "root", "PASSword1234!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Create a prepared statement to select the Ensignant data by nom
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM enseignants WHERE nom = ?");
            ps.setString(1, nom);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                enseignant = new Ensignant(rs.getInt("matricule"), rs.getString("nom"), rs.getString("contact"));
            }
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
        return enseignant;
    }

    public static  Ensignant getEnsignantByContact(String contact) {
        Ensignant enseignant = null;
        // Connect to the database
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable_management", "root", "PASSword1234!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Create a prepared statement to select the Ensignant data by contact
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM enseignants WHERE contact = ?");
            ps.setString(1, contact);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                enseignant = new Ensignant(rs.getInt("matricule"), rs.getString("nom"), rs.getString("contact"));
            }
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
        return enseignant;
    }

    public  static Ensignant getEnsignantByMatricule(int matricule) {
        Ensignant enseignant = null;
        // Connect to the database
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable_management", "root", "PASSword1234!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Create a prepared statement to select the Ensignant data by matricule
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM enseignants WHERE matricule = ?");
            ps.setInt(1, matricule);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                enseignant = new Ensignant(rs.getInt("matricule"), rs.getString("nom"), rs.getString("contact"));
            }
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
        return enseignant;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub



	    //Ensignant e1 = new Ensignant(15, "testing", "lalaeyy.com");
	    //addEnsignant(e1);
	    Ensignant e2 = getEnsignantByContact("bobsmith@example.com"); 
	    Ensignant e3 = getEnsignantByMatricule(2); 
	    Ensignant e4 = getEnsignantByNom("test");
	    List<Ensignant> allEnsignants = getAllEnsignants();

	    System.out.println("Ensignant 2: " + e2.getMatricule()  +" "+ e2.getContact()+" "+  e2.getNom());
	    System.out.println("Ensignant 3: " + e3.toString());
	    System.out.println("Ensignant 4: " + e4.toString());
	    System.out.println("All Ensignants: " + allEnsignants.toString());


	    
	}

}



/**/
