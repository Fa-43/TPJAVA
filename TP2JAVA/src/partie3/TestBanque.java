package partie3;
import partie1.CompteBancaire;
import partie2.Banque;

public class TestBanque {
    public static void main(String[] args) {
        // Création de la banque
        Banque maBanque = new Banque("MarocBank", 1500);

        // création des trois comptes
        CompteBancaire c1 = new CompteBancaire("Ahmed", 1000, 500);
        CompteBancaire c2 = new CompteBancaire("Yassine", 3000, 500);
        CompteBancaire c3 = new CompteBancaire("Sami", 10000, 2000);

        //  Ajout des comptes à la banque
        maBanque.ajouterCompte(c1);
        maBanque.ajouterCompte(c2);
        maBanque.ajouterCompte(c3);

        //  Opérations
        c1.deposer(500);
        c1.retirer(200);
        c2.virementVers(c3, 1000);

        // Affichage de  tous les comptes
        maBanque.afficherTous();

        // Calcul d'intérêts de c2
        System.out.println("Nouveau solde c2 (standard) : " + c2.calculerSoldeAvecInterets());
        System.out.println("Nouveau solde c2 (avec bonus 1.5%) : " + c2.calculerSoldeAvecInterets(0.015));

        // Affichage de nombre totale des comptes créer
        System.out.println("Nombre total de comptes créés : " + CompteBancaire.getNbComptes());
        System.out.println("Taux d'intérêt annuel actuel : " + CompteBancaire.getTauxInteretAnnuel());
    }
}
