package partie6;
import java.util.*;

public class GestionBiblio {

	public static void main(String[] args) {
		// 
        ArrayList<Livre> inventaire = new ArrayList<>();

        //
        Set<String> categories = new HashSet<>();

        // 
        Map<Integer, Livre> emprunts = new HashMap<>();

        // 
        Livre l1 = new Livre("978-1", "les miserables", "victor hugo", 1945);
        Livre l2 = new Livre("978-2", "C++ pour les programmeures C ", "Claude Delannoy", 2007);
        Livre l3 = new Livre("978-3", "Réseaux Mobiles", "Ahmed Sami", 2022);

        inventaire.add(l1);
        inventaire.add(l2);
        inventaire.add(l3);

        categories.add("Informatique");
        categories.add("Télécoms");
        categories.add("Informatique"); 


        // 
        String recherche = "Réseaux Mobiles";
        System.out.println("Recherche de : " + recherche);
        for (Livre l : inventaire) { 
            if (l.getTitre().equalsIgnoreCase(recherche)) {
                System.out.println("Livre trouvé : " + l);
            }
        }
        
        //
        emprunts.put(101, l2); 
        // 
        inventaire.removeIf(l -> l.getISBN().equals("978-3"));

        // 
        System.out.println("\nLivres disponibles :");
        for (Livre l : inventaire) {
            if (!emprunts.containsValue(l)) { //
                System.out.println(l);
            }
        }

        //
        System.out.println("\n--- RAPPORT FINAL DE LA BIBLIOTHÈQUE ---");
        System.out.println("Total de titres référencés : " + inventaire.size());
        System.out.println("Catégories disponibles : " + categories);
        System.out.println("Nombre d'emprunts actifs : " + emprunts.size());
        
        //
        for (Map.Entry<Integer, Livre> entry : emprunts.entrySet()) {
            System.out.println("L'étudiant ID " + entry.getKey() + " a emprunté : " + entry.getValue().getTitre());
        }
		

	}

}
