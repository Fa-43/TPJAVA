package partie5;
import java.util.*;
public class AutoClassement {

	public static void main(String[] args) {
		
		 // 1.
        TreeMap<Integer, String> classement = new TreeMap<>();

        classement.put(50, "Omar");
        classement.put(120, "Imane");
        classement.put(10, "Samira");
        classement.put(105, "Kaoutar");

        // 
        System.out.println("Liste des étudiants triée par ID :");
        for (Map.Entry<Integer, String> entry : classement.entrySet()) {
            System.out.println("ID : " + entry.getKey() + " | Nom : " + entry.getValue());
        }

        // 
        System.out.println("Premier étudiant (ID min) : " + classement.get(classement.firstKey()));
        System.out.println("Dernier étudiant (ID max) : " + classement.get(classement.lastKey()));

        // 
        System.out.println("Étudiants avec ID > 100 :");
        // 
        SortedMap<Integer, String> idSuperieurs = classement.tailMap(101); 
        for (Map.Entry<Integer, String> entry : idSuperieurs.entrySet()) {
            System.out.println("ID : " + entry.getKey() + " | Nom : " + entry.getValue());
        }
    }


}
