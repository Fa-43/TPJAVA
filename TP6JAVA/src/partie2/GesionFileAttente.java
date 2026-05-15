package partie2;
import java.util.*;

public class GesionFileAttente {
	public static void main(String[] args) {
		//
		LinkedList<Client> fileAttente = new LinkedList<>();
		//
		fileAttente.add(new Client(1, "Ahmed"));
	    fileAttente.add(new Client(2, "Sofia"));
	    fileAttente.add(new Client(3, "Karim"));
	    //
	    System.out.println("File d'attente actuelle :");
        for (Client c : fileAttente) {
            System.out.println(c);
        }
        //
        Client servi = fileAttente.removeFirst();
        System.out.println("\n>>> On sert maintenant : " + servi);
        //
        fileAttente.addLast(new Client(4, "Yassine"));
        System.out.println("Un nouveau client (Yassine) vient d'arriver.");

        // 
        System.out.println("\nProchain client à servir : " + fileAttente.getFirst());

        //
        System.out.println("\nÉtat final de la file :");
        for (Client c : fileAttente) {
            System.out.println(c);
        }

	    
	    

	}

}
