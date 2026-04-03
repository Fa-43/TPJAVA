package partie2;
import partie1.CompteBancaire;

public class Banque {
	//creation d'attributs
	private String nom;
	private CompteBancaire[] comptes;
	private int nbActuels;
	//constructeur paramétré
	public  Banque(String nom, int capacitéMaximale ) {
		this.nom=nom;
		this.comptes= new CompteBancaire[capacitéMaximale];
		this.nbActuels=0;
	}
	public void ajouterCompte(CompteBancaire c) {
		if(nbActuels < comptes.length) {
			comptes[nbActuels] = c;
			nbActuels++;
		}
		else {
			 System.out.println("La banque est pleine, impossible d'ajouter un compte.");
		}
	}
	public void afficherTous() {
		 System.out.println("Banque : " + nom);
		for(int i=0; i< nbActuels;i++) {
			comptes[i].afficher();
		}
	}
	

}
