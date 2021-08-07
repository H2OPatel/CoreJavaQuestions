package javaOnlinePracticeTpoint;

import java.util.Scanner;

public class CheckPrimePrac{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if (isPrime(num)) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}s.close();
	}

	public static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		} else {
			for (int i = 2; i < Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

}
