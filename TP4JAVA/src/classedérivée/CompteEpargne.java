package classedérivée;
import classemère.Compte;

public class CompteEpargne extends Compte {
	private double tauxInteret;
	//
	public CompteEpargne(String numero, String titulaire, double solde,double tauxInteret) {
		super(numero,titulaire,solde);
		this.tauxInteret=tauxInteret;
	}
	//
	public void calculerInteret() {
		this.solde = this.solde*this.tauxInteret;
	}
	@Override
	public void retirer(double retrait) {
		if(retrait>0 && retrait<=solde)
			solde-=retrait;
		else
			System.out.println("solde insuffisant");
		
	}
	

}
