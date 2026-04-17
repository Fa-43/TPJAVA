package classemère;

public class Compte {
	protected String numero;
	protected String titulaire;
	protected double solde;
	
	public Compte(String numero, String titulaire, double solde) {
		this.numero=numero;
		this.titulaire=titulaire;
		this.solde=solde;
		
	}
	public void deposer(double montant) {
		this.solde+=montant;
	}
	
	public void retirer(double retrait) {
		if(retrait<=this.solde) {
			this.solde-=retrait;
			
		}
		else {
			System.out.println("solde insuffisant");
		}
	}
	public void afficher() {
		System.out.println("le Numéro de compte:"+this.numero);
		System.out.println("titulaire de compte:"+this.titulaire);
		System.out.println("Solde:"+this.solde);
		
	}

}
