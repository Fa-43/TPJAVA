package classeDérivée;
import classeMére.Vehicule;

public class Moto extends Vehicule{
	//
	private boolean avecCasque;
	//
	public Moto(String matricule, String marque, boolean avecCasque) {
		super(matricule,marque);
		this.avecCasque=avecCasque;
	}
	
	//
	@Override
	public void stationner() {
		System.out.println("la moto se gare dans une place réservée aux deux-roues");
		
	}
	
	//
	@Override
	public void afficher() {
		super.afficher();
		if(avecCasque) {
			System.out.println("le moto est avec casque");
		}
		else {
			System.out.println("le moto n'a pas de casque");

		}
	}
	

}
