package partie1;
import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("entre un nombre N:");
		Scanner input = new Scanner(System.in);
		int N=input.nextInt();
		int i=0;
		int som=0;
		while( i<=N) {
			som+=i;
			i++;
		}
		System.out.println("la somme des "+ N+" premier entiers est :"+som);
		 input.close();
	}

}
