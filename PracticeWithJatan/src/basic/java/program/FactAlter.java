package basic.java.program;

import java.util.Scanner;

public class FactAlter {
	
	
	
	static int  factorial(int n) {
		
		if(n == 0 ) {
			return 1;
		}
		
		n = n * factorial(n-1);
		return n;
	}
	
	public static void main(String[] args) {
		int fact =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide the number for getting it's factorial");
		int num = sc.nextInt();
		System.out.println("the number you provided is "+ num);
		fact = factorial(num);
		System.out.println("The factorial of "+ num + " is "+ fact);
		sc.close();
	}

}

