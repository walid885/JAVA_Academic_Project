package Project;

public class Seance {
	
	private String classe ; 
	private String jour ; 
	private String heure; 
	private String matiere; 
	private String enseignantMAT ; 
	
	public Seance ( String classe , String jour, String heure, String matiere, String ensignantMAt) {
		this.classe = classe;
		this.jour = jour;
		this.heure = heure;
		this.matiere = matiere;
		this.enseignantMAT = ensignantMAt;
	
	}
	
	
	public String getClasse() {
		return classe;
	}


	public void setClasse(String classe) {
		this.classe = classe;
	}


	public String getJour() {
		return jour;
	}


	public void setJour(String jour) {
		this.jour = jour;
	}


	public String getHeure() {
		return heure;
	}


	public void setHeure(String heure) {
		this.heure = heure;
	}


	public String getMatiere() {
		return matiere;
	}


	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}


	public String getEnseignantMAT() {
		return enseignantMAT;
	}


	public void setEnseignantMAT(String enseignantMAT) {
		this.enseignantMAT = enseignantMAT;
	}

	@Override
	public String toString() {
	    return "Seance: [Classe=" + classe + ", Jour=" + jour + ", Heure=" + heure + ", Matiere=" + matiere + ", EnseignantMAT=" + enseignantMAT + "]";
	}


	public static void main(String[] args) {

        Seance seance1 = new Seance("Math", "Monday", "9:00", "Mathematics", "John Doe");
        Seance seance2 = new Seance("Science", "Tuesday", "10:00", "Physics", "Jane Smith");

        System.out.println("Seance 1: " + seance1.toString());
        System.out.println("Seance 2: " + seance2.toString());

        // Testing the getters and setters
        seance1.setClasse("Mathematics");
        seance1.setJour("Monday");
        seance1.setHeure("9:00");
        seance1.setMatiere("Mathematics");
        seance1.setEnseignantMAT("John Doe");

        System.out.println("Seance 1 after setting values: " + seance1.toString());

        seance2.setClasse("Physics");
        seance2.setJour("Tuesday");
        seance2.setHeure("10:00");
        seance2.setMatiere("Physics");
        seance2.setEnseignantMAT("Jane Smith");

        System.out.println("Seance 2 after setting values: " + seance2.toString());
    }

	}

