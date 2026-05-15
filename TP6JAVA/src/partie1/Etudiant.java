package partie1;

public class Etudiant {
	private int Id;
	private String Nom;
	private double Moyenne;
	
	public Etudiant(int Id,String Nom, double Moyenne) {
		this.Id=Id;
		this.Nom=Nom;
		this.Moyenne=Moyenne;
	}
	public int getId() {return Id;}
	public String getNom() { return Nom;}
	public double getMoyenne() { return Moyenne;}
	
	 @Override
	 public String toString() {
	     return "ID: " + Id + " | Nom: " + Nom + " | Moyenne: " + Moyenne;
	 }
	 public void setMoyenne(double d) { Moyenne=d; }
}
