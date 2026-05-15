package partie6;

public class Livre {
	private String ISBN;
	private String Titre;
	private String Auteur;
	private int Année;
	
	public  Livre(String ISBN, String Titre, String Auteur, int Année) {
		this.ISBN=ISBN;
		this.Titre=Titre;
		this.Auteur=Auteur;
		this.Année=Année;
	}
	
	public String getISBN() { return ISBN;}
		
	public String getTitre() {return Titre;}
	
	@Override
    public String toString() {
        return "ISBN: " + ISBN + " | Titre: " + Titre + " | Auteur: " + Auteur + " (" + Année + ")";
    }
	

}
