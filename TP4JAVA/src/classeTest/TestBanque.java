package classeTest;
import classedérivée.CompteCourant;
import classemère.Compte;
import classedérivée.ComptePremium;
import classedérivée.CompteEpargne;


public class TestBanque {

	public static void main(String[] args) {
		
		Compte[] C=new Compte[4];
		
		C[0] = new CompteCourant("67952","ANNA",67000,500);
		C[1] = new CompteCourant("45698","YASSIN",25000,500);
		C[2] = new ComptePremium("513009","AHMED",67500,100);
		C[3] = new CompteEpargne("24641","FADOUA",47000,0.3);
		
		for (Compte compte: C) {
			System.out.println("\n----------\n");
			compte.afficher();	
			compte.deposer(400);
			compte.retirer(600);
			System.out.println("-----affichage du compte apres les operations-----");
			compte.afficher();	
		}
		
		System.out.println("\n----affichage des comptes Epargne------\n");
		for (Compte compte: C) {
			if(compte instanceof CompteEpargne)
				compte.afficher();
		}
	}
}

