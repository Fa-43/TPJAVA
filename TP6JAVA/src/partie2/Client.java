package partie2;

public class Client {
	 private int numero;
	 private String nom;

	 public Client(int numero, String nom) {
	     this.numero = numero;
	     this.nom = nom;
	 }

	 @Override
	 public String toString() {
	     return "Client n°" + numero + " : " + nom;
	 }	

}
