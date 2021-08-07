package basic.java.program;

import java.util.Scanner;

public class FactorialPrac {

	public static void main(String[] args) {
		int fac = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide the number for getting it's factorial");
		int num = sc.nextInt();
		System.out.println("the number you provided is "+ num);
		for(int i=1;i<=num;i++) {
			fac = fac*i;
			
		}
		sc.close();
		System.out.println("The factorial of "+ num + " is "+ fac);
	}

}
