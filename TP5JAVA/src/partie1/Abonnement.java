package partie1;

public abstract class Abonnement {
	private String nom;
	private double prixBase;
	private int nbProfils;
	
	public Abonnement(String nom, double prixBase, int nbProfils) {
		this.nom=nom;
		//prix base initialiser a 50
		if(prixBase<=0)
			this.prixBase=50;
		else
			this.prixBase=prixBase;
		//nombre de profils initialisé a 1
		if (nbProfils<=0)
			this.nbProfils=1;
		else
			this.nbProfils=nbProfils;
	}
	//getter pou nom
	public String getNom() {
		return nom;	
	}
	//getter pour prixBase
	public double getPrixBase() {
		return prixBase;
	}
	//getter pour nbProfils
	public int getNbProfils() {
		return nbProfils;
		
	}
	//setter pour nom avec validation
	public void setNom(String nom) {
		if(nom !=null && !nom.isEmpty()) {
			this.nom=nom;
		}
		else {
			System.out.println("invalid nom");
		}
		
	}
	//setter pour prixBase avec validation
	public void setPrixBase(double prixBase) {
		if(prixBase<=0)
			this.prixBase=50;
		else
			this.prixBase=prixBase;
	}
	//setter pour nbProfils
	public void setNbProfils(int nbProfils) {
		if (nbProfils<=0)
			this.nbProfils=1;
		else
			this.nbProfils=nbProfils;
	}
	//method estPartageFamilial
	public boolean estPartageFamilial() {
		if (nbProfils>=3) {
			return true;
		}
		else
			return false;
	}
	//method afficherInfos
	public void afficherInfos() {
		System.out.println("nom:" +nom);
		System.out.println("prix de base: " +prixBase);
		System.out.println("nombre de profils: "+nbProfils);
		System.out.println("l'abonnement peut etre partager par une famail: "+estPartageFamilial());
	}
	//les method abstraite
	public abstract double calculerCoutMensuel();
	public abstract  int calculerScoreSatisfaction();

}
