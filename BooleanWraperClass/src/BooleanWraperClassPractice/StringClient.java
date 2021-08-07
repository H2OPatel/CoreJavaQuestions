package BooleanWraperClassPractice;

import java.util.Scanner;

public class StringClient {

	public static void main(String[] args) {
		
		CheckInteger ci1 = new CheckInteger();
		CheckOddNumber co1 = new CheckOddNumber();
		CheckEvenNumber ce1 = new CheckEvenNumber();
		CheckPrimeNumber cp1 = new CheckPrimeNumber();
		Scanner console = new Scanner(System.in);
		System.out.println("Please provide the string : ");
		String str1 = console.nextLine();
		
		System.out.println("Is the string you provided an Integer? : " + ci1.isInteger(str1));
		System.out.println("Is the string you provided an Odd number? : " + co1.IsOddNumber(str1));
		System.out.println("Is the string you provided an Even number? : " + ce1.IsEvenNumber(str1));
		System.out.println("Is the string you provided a Prime number? : " + cp1.isPrimeNumber1(str1));
		console.close();
}

}
