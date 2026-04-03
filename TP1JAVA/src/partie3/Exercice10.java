package partie3;
import java.util.Scanner;

public class Exercice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int[][] B,Bt;
		B=new int[3][2];
		Bt=new int[2][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("entrer le nombre d'indice: ("+i+","+j+")");
				B[i][j]=input.nextInt();//saisi des valeures
				Bt[j][i]=B[i][j];//remplission de matrice transposé
			}
		}
			//affichage de matrice B
		System.out.println("la matrice B");
		for(int i=0;i<3;i++) {
			System.out.println("");
			for(int j=0;j<2;j++) {
				System.out.print(B[i][j]+"  ");
			}
			System.out.println("");
		}
		//affichage de traspose de B
		System.out.println("tronsposé de B");
		for(int i=0;i<2;i++) {
			System.out.println("");
			for(int j=0;j<3;j++) {
				System.out.print(Bt[i][j]+"  ");
			}
		}
		
		input.close();
			

	}


}
