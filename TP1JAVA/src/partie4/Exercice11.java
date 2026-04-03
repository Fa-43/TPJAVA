package partie4;
import java.util.Scanner;

public class Exercice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    System.out.println(" entrer de text ");

		String message=input.nextLine();
	    System.out.println("vous avez entré: "+message);
		int length=message.length();
	    System.out.println("la longueur de text est: "+length);
	    
	    input.close();

		

	}

}
