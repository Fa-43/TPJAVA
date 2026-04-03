package partie2;
import java.util.Scanner;

public class Exercice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("entrer la taille de tableau:");
		int N=input.nextInt();
		int[] A;
		A = new int[N];
		for(int i=0; i<N ;i++) {
			System.out.println("entrer le nombre d'indice "+ i);
	  		A[i]=input.nextInt();	
		}
		int i=0;
		int max=0;
		while(i<N) {
			if(max<A[i]) {
				max=A[i];
			}
			i++;
		}
		System.out.println("le plus grand nombre est : "+max);
		input.close();

	}

}
