package classedérivée;

import classemère.Compte;

public class CompteCourant extends Compte {
	private double decouvertAutorise;
	
	public CompteCourant(String numero,String titulaire,double Solde, double decouvertAutorise) {
		super(numero,titulaire,Solde);
		this.decouvertAutorise=decouvertAutorise;
	}
	@Override
	public void retirer(double retrait) {
		if(retrait >0 && retrait<=solde+decouvertAutorise) {
			solde-=retrait;
		}
		else
			System.out.println("Le retrait depasse le decouvert autorisé");

	}
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("le decouvert autoriser:");
		System.out.println( decouvertAutorise );
	}
	
	
}
