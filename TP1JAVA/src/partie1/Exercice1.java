package partie1;
import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("saisir un nombre:");
		int number=input.nextInt();
		if (number>0){
			System.out.println("positif");}
		else if (number<0){
			
			System.out.println("negative");}
	    else {
			System.out.println("null");
				}
		input.close();
				
		// TODO Auto-generated method stub

	}

}
