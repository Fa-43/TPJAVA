package partie1;
import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("entrer un nomber");
		int n=input.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(n +"x"+i+"="+i*n);
		}
    input.close();
	}

}
