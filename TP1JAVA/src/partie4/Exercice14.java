package partie4;
import java.util.Scanner;

public class Exercice14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    System.out.println(" entrer un mot ");		
		String mots = input.nextLine();
		mots=mots.toLowerCase();
		String inverse=new StringBuilder(mots).reverse().toString();
		if (mots.equals(inverse) ){
			System.out.println("le mots est palindrome");
		}
		else {
			System.out.println("le mots n' est pas palindrome");
		}
		input.close();

	}

}
