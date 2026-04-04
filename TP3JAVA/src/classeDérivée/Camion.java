package classeDérivée;
import classeMére.Vehicule;

public class Camion extends Vehicule{
	//
	private double chargeMax;
	//
	public Camion(String matricule, String marque, double chargeMax) {
		super(matricule,marque);
		this.chargeMax=chargeMax;
	}
	//
	@Override
	public void stationner() {
		System.out.println("le camion se gare dans une Zone pour vehicules lourds");

	}
	//
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("charge Max de camion: "+chargeMax);

	}

}
