package shopeExpresse;

public class SystemeDeGestion {
	// --- PARTIE 1 : Gestion des erreurs de paiement ---
    public static double effectuerPaiement(double montant, double solde) {
        if (montant <= 0) {
            // 
            throw new IllegalArgumentException("Erreur : Le montant doit être supérieur à zéro.");
        }
        if (montant > solde) {
            // 
            throw new ArithmeticException("Erreur : Solde insuffisant pour effectuer cet achat.");
        }
        return solde - montant;
    }

    // --- PARTIE 2 : Gestion locale des exceptions ---
    public static double lireMontant(String valeur) {
        try {
            double montant = Double.parseDouble(valeur); 
            if (montant < 0) {
                throw new Exception("Le montant ne peut pas être négatif.");
            }
            return montant;
        } catch (NumberFormatException e) {
            System.out.println("Gestion locale : La valeur '" + valeur + "' n'est pas numérique.");
            return 0.0; 
        } catch (Exception e) {
            System.out.println("Gestion locale : " + e.getMessage());
            return 0.0;
        }
    }

    // --- PARTIE 3 : Propagation des exceptions ---
    
    public static double lireMontantPropage(String valeur) throws NumberFormatException, Exception {
        double montant = Double.parseDouble(valeur);
        if (montant < 0) {
            throw new Exception("Erreur métier : Montant négatif interdit.");
        }
        return montant;
    }

    // --- PARTIE 4 : Accès à une ressource (Tableau) ---
    public static double lireTransaction(double[] tab, int index) {
      
        return tab[index];
    }

    // --- PROGRAMME PRINCIPAL  ---
    public static void main(String[] args) {
        System.out.println("=== TEST PARTIE 1 ===");
        try {
            double soldeRestant = effectuerPaiement(150.0, 100.0);
            System.out.println("Paiement réussi !");
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Erreur rencontrée : " + e.getMessage());
        } finally {
           //
            System.out.println("Fin de la transaction.");
        }

        System.out.println("\n=== TEST PARTIE 2 (Local) ===");
        double m1 = lireMontant("abc"); 
        System.out.println("Montant retourné : " + m1);

        System.out.println("\n=== TEST PARTIE 3 (Propagation) ===");
        try {
            double m2 = lireMontantPropage("-50");
        } catch (NumberFormatException e) {
            System.out.println("Main (Gestion centralisée) : Format de nombre invalide.");
        } catch (Exception e) {
            System.out.println("Main (Gestion centralisée) : " + e.getMessage());
        }

        System.out.println("\n=== TEST PARTIE 4 (Ressource) ===");
        try {
            double[] transactions = {10.5, 20.0, 55.0};
            System.out.println("Valeur à l'indice 5 : " + lireTransaction(transactions, 5));
        } catch (NullPointerException e) {
            System.out.println("Erreur : Le tableau de transactions n'est pas initialisé.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : Indice de transaction invalide (Hors limites)."); 
        }
    }

}
    
