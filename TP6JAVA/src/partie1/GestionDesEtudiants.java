package partie1;
import java.util.*;

public class GestionDesEtudiants {

	public static void main(String[] args) {
		//
		ArrayList<Etudiant> list = new ArrayList<> ();
		//
		list.add(new Etudiant(1, "Fatima" , 17.0));
		list.add(new Etudiant(2, "Sara" , 18.0));
		list.add(new Etudiant(3, "Ahmed" , 15.0));
		list.add(new Etudiant(4, "Marouan" , 14.0));
		list.add(new Etudiant(5, "Yassin" , 17.5));
		//
		System.out.println("liste des étudiants:");
		for(Etudiant e:list) {
			System.out.println(e);
		}
		//
        String etud = "Sara";
        System.out.println("\nRecherche de " + etud + " :");
        for (Etudiant e : list) {
            if (e.getNom().equalsIgnoreCase(etud)) {
                System.out.println("l'etudiant " + e + "est trouvé:");
            }
        }

        //
        list.removeIf(e -> e.getId() == 3);
        //
        Collections.sort(list, new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant e1, Etudiant e2) {
                return Double.compare(e1.getMoyenne(), e2.getMoyenne());
            }
        });
        Etudiant meilleurMoy = list.get(list.size() - 1); 
        System.out.println("\nMajor de promo : " + meilleurMoy);

	}

}
