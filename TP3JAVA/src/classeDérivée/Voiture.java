package classeDérivée;
import classeMére.Vehicule;
public class Voiture extends Vehicule {
	//
	private int nbPortes;
	
	//
	public Voiture(String matricule,String marque,int nbPortes) {
		super(matricule,marque);
		this.nbPortes=nbPortes;
	}
	
	//
	@Override
	public void stationner() {
		System.out.println("la voiture se gare dans une place standard");
		
	}
	
	//
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("Nombre de portes du voiture: "+nbPortes);
		
	}

}
