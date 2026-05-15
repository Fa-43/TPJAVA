package partie3;
import java.util.*;
public class GestionMatiers {

	public static void main(String[] args) {
        Set<String> matieresHS = new HashSet<>();
        matieresHS.add("Java");
        matieresHS.add("Machine learning");
        matieresHS.add("Anglais");
        matieresHS.add("IoT");

        // 
        boolean estAjoute = matieresHS.add("Java"); 
        System.out.println("Ajout du doublon 'Java' réussi ? " + estAjoute);
        
        System.out.println("\nContenu du HashSet (ordre imprévisible) :");
        System.out.println(matieresHS);

        Set<String> matieresTS = new TreeSet<>(matieresHS);

        System.out.println("\nContenu du TreeSet (trié par défaut) :");
        for (String m : matieresTS) {
            System.out.println(m);
        }
    }

}
