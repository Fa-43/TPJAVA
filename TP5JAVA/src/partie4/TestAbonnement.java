package partie4;

import partie1.Abonnement;
import partie2.AbonnementVideo;
import partie2.AbounnementMusique;
import partie2.Reducible;
import partie2.AbbonnementJeux;

public class TestAbonnement {

	public static void main(String[] args) {
		//
		 Abonnement[] abs = new Abonnement[3];
		 abs[0] = new AbonnementVideo("Netflix", 80, 4, true, true);     
		 abs[1] = new AbounnementMusique("Spotify", 50, 2, 30, true);      
		 abs[2] = new AbbonnementJeux("GamePass", 100, 1, 60, 45);
		 
		 //
		 for (Abonnement a : abs) {
			 System.out.println("----------------\n");
		     a.afficherInfos();
		     System.out.println("Coût: " + a.calculerCoutMensuel() + " DH");
		     System.out.println("Satisfaction: " + a.calculerScoreSatisfaction() + "/100");
		 }

		 //declaration d'une table d'interfaces      
		 Reducible[] reducibles = {(Reducible) abs[0], (Reducible) abs[1]};
		 //
		 System.out.println("----test d'application d'une reduction, porcentage 20%---");       
		 double testPourcent = 20.0;  
		 for (Reducible r : reducibles) {
			 System.out.println("--->pour " +r.getClass()+"\n");
		     if (r.estEligibleReduction(testPourcent))
		         System.out.println("Nouveau prix: " + r.appliquerReduction(testPourcent));
		     
		     else 
		         System.out.println("la reduction demandée n'est pas acceptées");
		  }
		 System.out.println("--test d'application d'une reduction, porcentage 50%---");
		 //
	   	 double testPourcent1 = 50.0; 
	   	 for (Reducible r : reducibles) {
	   		 System.out.println("--->pour " +r.getClass()+"\n");
	   		 if (r.estEligibleReduction(testPourcent1)) 
	             System.out.println("Nouveau prix: " + r.appliquerReduction(testPourcent1));
	   		 else 
	   			System.out.println("la reduction demandée n'est pas acceptées");
	   		 }
	   }
	}
