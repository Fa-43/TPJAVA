package partie4;
import java.util.Scanner;

public class Exercice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    System.out.println(" entrer de text ");		
		String text = input.nextLine();
		String inverse=new StringBuilder(text).reverse().toString();
		System.out.println("le texte inversé est:" +inverse );
		input.close();

	}

}
