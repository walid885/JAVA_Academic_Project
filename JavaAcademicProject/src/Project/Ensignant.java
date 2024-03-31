package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Ensignant {
    private int matricule;
    private String nom;
    private String contact;

    public Ensignant() {
      
    }

    public Ensignant(int matricule, String nom, String contact) {
        this.matricule = matricule;
        this.nom = nom;
        this.contact = contact;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public static void addEnsignant(Ensignant ensignant) {
        // Connect to the database
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable_management", "username", "password");
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


    public static void updateContact(Ensignant ensignant, String newContact) {
        ensignant.setContact(newContact);
    }

    public static void updateMatricule(Ensignant ensignant, int newMatricule) {
        ensignant.setMatricule(newMatricule);
    }

    public static void updateNom(Ensignant ensignant, String newNom) {
        ensignant.setNom(newNom);
    }

    public static void updateEnsignant(Ensignant ensignant, String newContact, int newMatricule, String newNom) {
        ensignant.setContact(newContact);
        ensignant.setMatricule(newMatricule);
        ensignant.setNom(newNom);
    }
    

    public   Ensignant getEnsignantByMatricule(int matricule) {
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


}
