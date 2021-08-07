package Apex;
import java.util.Scanner;



public class Client {

	public static void main(String[] args) {
		
		CheckInteger ci1 = new CheckInteger();
		CheckPrime cp1 = new CheckPrime();
		Scanner console = new Scanner(System.in);
		System.out.println("Please provide the string : ");
		String str1 = console.nextLine();
		
		System.out.println("Is the string you provided an Integer? : " + ci1.isInteger(str1));
		
		//System.out.println("Is the string you provided a Prime number? : " + cp1.isPrime(str1));
		console.close();
}

}
