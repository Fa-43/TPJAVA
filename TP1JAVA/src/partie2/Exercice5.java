package partie2;
import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("entrer la taille de tableau:");
		Scanner input = new Scanner(System.in);
		int N=input.nextInt();
		int[] tab;
		tab=new int[N];
		for(int i=0; i<N ;i++) {
			System.out.println("entrer le nombre numero "+ (i+1));
	  		tab[i]=input.nextInt();	
		}
		for(int i=0; i<N ;i++) {
			System.out.println(" le nombre numero "+ (i+1)+" est "+tab[i]);
			
		}
		
		input.close();

	}

}
