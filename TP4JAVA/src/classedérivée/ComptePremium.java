package classedérivée;
import classemère.Compte;

public class ComptePremium extends Compte{
	
	private double plafondRetrait;
	
	public ComptePremium(String numero, String titulaire, double solde,double plafondRetrait) {
		super(numero, titulaire, solde);
		this.plafondRetrait=plafondRetrait;
	}
	
	@Override
	public void retirer(double retrait) {
		if(retrait>plafondRetrait)
			System.out.println("Le retrait depasse le plafond autorisé");
		else if(retrait >0 && retrait<=solde)
			solde-=retrait;
		else
			System.out.println("retrait refuser");
			
	}

}
