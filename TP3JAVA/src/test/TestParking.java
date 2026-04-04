package test;

import classeMére.Vehicule;
import classeDérivée.Voiture;
import classeDérivée.Camion;
import classeDérivée.Moto;


public class TestParking {

	public static void main(String[] args) {
		//
		Vehicule[] v= new Vehicule[4];
		
		//
		v[0]=new Voiture("33-A-567","Audi",4);
		v[1]=new Voiture("364-Bh-903","Jeep",4);
		v[2]=new Camion("AZ-398","Mercedes",3500);
		v[3]=new Moto("766-VB","BMW",true);
		
		//
		System.out.println("Affichage des vehicule et leurs methodes de stationner");
		for(Vehicule vehicule : v) {
			System.out.println("\n------\n");
			vehicule.afficher();
			vehicule.stationner();
			System.out.println("\n");
		}
		
		//
		System.out.println("--Liste des voiture dans le tableau--");
		for(Vehicule vehicule :v) {
			if(vehicule instanceof Voiture) {
				vehicule.afficher();
				System.out.println("\n------\n");

			}
		}
		//
		System.out.println("test downcasting");
		Vehicule x=new Moto("11C22","yamaha",true);
		if(x instanceof Voiture) {
			Voiture v1=(Voiture) x;
			System.out.println("downcasting réussi");
		}
		else {
			System.out.println("downcasting n'est pas possible car x ne peut pas étre transformer en un voiture");
			
		}
	}

}
