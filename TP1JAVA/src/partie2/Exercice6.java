package partie2;
import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] T;
		T=new int[5];
		for(int i=0; i<5 ;i++) {
			System.out.println("entrer le nombre d'indice "+ i);
	  		T[i]=input.nextInt();	
		}
		System.out.println("donner un nombre a rechercher:");
		int nombre=input.nextInt();
		int i=0;
		do {
			if(nombre==T[i]) {
				System.out.println("l'indice de nombre rechercher est "+i);
				i=5;
				}
			else {
				i++;
			     }
			if (i==5) {
				System.out.println("le nombre n'existe pas dans le tableau ");
			}
			}while(i<5);
		input.close();
			
		}
		

	}
