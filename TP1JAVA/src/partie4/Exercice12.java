package partie4;
import java.util.Scanner;

public class Exercice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    System.out.println(" entrer de text ");		
		String chaine = input.nextLine();
		String voyelles="aeiouy";
		chaine=chaine.toLowerCase();
		int compt=0;
		for(int j=0;j<voyelles.length();j++) {
			for(int i=0;i<chaine.length();i++) {
				char c = chaine.charAt(i);
				char v = voyelles.charAt(j);
				if(v==c) {
					compt++;
				}

			}
			
		}
		System.out.println("nombre de voyelles est:  "+compt);
		input.close();
	}

}
