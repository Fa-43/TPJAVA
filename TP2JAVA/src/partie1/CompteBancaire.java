package partie1;

public class CompteBancaire {
	//creation des attributs
	
	private int numero;
	private String titulaire;
	private double solde;
	private double decouvertAutorise;
	//creation des variables
	
	static int nbComptes=0;
    static double tauxInteret=0.03;
    
	//constructeur par defaut
	public CompteBancaire() {
		   nbComptes++;
		   this.numero=nbComptes;
		   this.titulaire="Inconnu";
		   this.solde=0;
		   this.decouvertAutorise=0;
		
	}
	
	//constructeur paramétré
	 public CompteBancaire(String nom, double solde, double decouvertAutorise) {
	        nbComptes++;
	        this.numero = nbComptes;
	        this.titulaire = nom;
	        this.solde = solde;
	        this.decouvertAutorise = decouvertAutorise;
	    }
	 //getters de titulaire et decouvertAutorise 
	 public String getTitulaire() {
		 return titulaire;
	 }
	 public double getDecouvertAutorise() {
		 return decouvertAutorise;
	 }
	 //setters de titulaire et decouvertAutorise avec validation

	 public void setTitulaire(String titulaire) {
	        if (titulaire != null && !titulaire.isEmpty()) { 
	            this.titulaire = titulaire;
	        }
	    }

	  public void setDecouvertAutorise(double decouvert) {
	        if (decouvert >= 0) {
	            this.decouvertAutorise = decouvert;
	        }
	    }
	  //method afficher()
	 public void afficher() {
		 System.out.println("nom: "+titulaire);
		 System.out.println("numero de compte: "+numero);
		 System.out.println("solde: "+solde);
		 System.out.println("découvert autorisé "+decouvertAutorise);
	 }
	 //operation deposer()
	public void deposer(double montant) {
		if(montant>0) {
			this.solde+=montant;
		}
		else {
			System.out.println("Montant de dépot invalide ");
		}
		
	}
	//operatio retirer()
	public void retirer(double montant) {
		if (montant>0 && montant<=(this.solde +this.decouvertAutorise)) {
			this.solde-=montant;
		}
		else {
			System.out.println("Retrait refusé");
		}
		
	}  
	//operation virementVers()
	public void virementVers(CompteBancaire autre, double montant) {
		if (montant>0 && montant<=(this.solde +this.decouvertAutorise)) {
			this.retirer(montant);
			autre.deposer(montant);
		}
		else {
			System.out.println("virement impossible: montant ou solde insuffisant");
		}
	}
	//operation calculerSoldeAvecInterets() 
	//sans paramétre
	 public double calculerSoldeAvecInterets() {
	        this.solde = this.solde * (1 + tauxInteret);
	        return this.solde;
	    }
	 //avec paramétre
	 public double calculerSoldeAvecInterets(double bonus) {
	        this.solde = this.solde * (1 + tauxInteret + bonus);
	        return this.solde;
	    }

	 public static int getNbComptes() {
		 return nbComptes;
	 }
	 public static double getTauxInteretAnnuel() {
		 return tauxInteret;
	 }
	 public static void setTauxInteretAnnuel(double nouveauTaux ) {
		 if(nouveauTaux>=0) {
			 tauxInteret=nouveauTaux;
		 }
	 }
	 

}	