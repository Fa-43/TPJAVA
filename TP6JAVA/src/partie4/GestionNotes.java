package partie4;
import java.util.*;
public class GestionNotes {

	public static void main(String[] args) {
		
        Map<String, Double> notesEtudiant = new HashMap<>();
        notesEtudiant.put("Ahmed", 15.5);
        notesEtudiant.put("Sara", 17.5);
        notesEtudiant.put("Sami", 12.0);
        notesEtudiant.put("Yassine", 14.0);

        System.out.println("Liste des notes :");
        for (Map.Entry<String, Double> entry : notesEtudiant.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        String nom = "Sara";
        if (notesEtudiant.containsKey(nom)) {
            System.out.println("\nNote de " + nom + " : " + notesEtudiant.get(nom));
        }
        //

        notesEtudiant.put("Sami", 13.5);
        //
        notesEtudiant.remove("Yassine");

        // 
        double somme = 0;
        for (double note : notesEtudiant.values()) {
            somme += note;
        }
        double moyenne = somme / notesEtudiant.size();
        System.out.println("\nMoyenne générale de la classe : " + moyenne);
    }

		

}
