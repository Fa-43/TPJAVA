package partie3;
import java.util.Scanner;

public class Exercice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[][] M;
		M=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("entrer le nombre d'indice: ("+i+","+j+")");
				M[i][j]=input.nextInt();
			}
			
		}
		System.out.println("votre matrice est:");
		for(int i=0;i<3;i++) {
			System.out.println("");

			for(int j=0;j<3;j++) {
				System.out.print(M[i][j]+"  ");
				
			}
		}
			
			
		input.close();
		

	}

}
