package BooleanWraperClassPractice;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		IsPrime prime = new IsPrime();
		Scanner console1 = new Scanner(System.in);
		System.out.println("Please provide the string : ");
		String str1 = console1.nextLine();
		System.out.println(prime.isPrime(str1));
		console1.close();
	}
}
