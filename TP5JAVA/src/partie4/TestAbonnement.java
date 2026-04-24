package partie4;

import partie1.Abonnement;
import partie2.AbonnementVideo;
import partie2.AbounnementMusique;
import partie2.Reducible;
import partie2.AbbonnementJeux;

public class TestAbonnement {

	public static void main(String[] args) {
		
		   Abonnement[] abs = new Abonnement[3];
		        
		   
		   abs[0] = new AbonnementVideo("Netflix", 80, 4, true, true);
		        
		   abs[1] = new AbounnementMusique("Spotify", 50, 2, 30, true);
		        
		   abs[2] = new AbbonnementJeux("GamePass", 100, 1, 60, 45);

		       
		   for (Abonnement a : abs) {
		            a.afficherInfos();
		            System.out.println("Coût: " + a.calculerCoutMensuel() + " DH");
		            System.out.println("Satisfaction: " + a.calculerScoreSatisfaction() + "/100");
		        }

		       
		   Reducible[] reducibles = {(Reducible) abs[0], (Reducible) abs[1]};
		        
		   double testPourcent = 20.0;
		        
		        
		   for (Reducible r : reducibles) {
		            if (r.estEligibleReduction(testPourcent)) {
		                System.out.println("Nouveau prix: " + r.appliquerReduction(testPourcent));
		            }
		        }
		    }


}
