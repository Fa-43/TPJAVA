package partie1;
import java.util.Scanner;

public class Exercice2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("saisir le premier  nombre:");
		int number1=input.nextInt();
		System.out.println("saisir le deuxieme  nombre:");

		int number2=input.nextInt();
		System.out.println("saisir le troisieme  nombre:");

		int number3=input.nextInt();
		
		int max=number1;
		if(number2>max & number2>number3) {
			max=number2;
		}
		else if(number3>max & number3>number2) {
			max=number3;
		}
		System.out.println("Max est"+ max);

    input.close();
		
		// TODO Auto-generated method stub

	}

}
