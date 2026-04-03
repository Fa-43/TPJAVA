package partie3;

public class Exercice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] S= { 
				{18,52,43},
				{34,51,60},
				{79,18,9},
		};
		int som=0;
		System.out.println("ona la matrice S suivant:");
		for(int i=0;i<3;i++) {
			System.out.println("");
			for(int j=0;j<3;j++) {
				som+=S[i][j];
				System.out.print(S[i][j]+"  ");
			}
			System.out.println("");
		}
		System.out.println("la somme des élement de matrice S est "+som);
	}

}
