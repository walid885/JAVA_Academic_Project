package Project;

public class Ensignant {
	
	private int matricule;
	private String nom ; 
	private String contact ; 

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


	public static void main(String[] args) {

        Ensignant ensignant1 = new Ensignant(1, "John Doe", "johndoe@example.com");
        Ensignant ensignant2 = new Ensignant(2, "Jane Doe", "janedoe@example.com");

        System.out.println("Ensignant 1: " + ensignant1.getMatricule() + " " + ensignant1.getNom() + " " + ensignant1.getContact());
        System.out.println("Ensignant 2: " + ensignant2.getMatricule() + " " + ensignant2.getNom() + " " + ensignant2.getContact());
    }

}


