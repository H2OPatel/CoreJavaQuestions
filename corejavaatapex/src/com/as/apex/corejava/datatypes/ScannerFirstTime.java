package com.as.apex.corejava.datatypes;

import java.util.Scanner;

public class ScannerFirstTime {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("please provide two Numbers");
		int var1 = console.nextInt();
		int var2 = console.nextInt();
		System.out.println("The first number you entered is : " + var1);
		System.out.println("The second number you entered is : " + var2);
		
		System.out.println("What kind of Mathematical Operation you would like to perform on them?");
		String oper = console.next();
		//System.out.println(oper);
		
		switch (oper) {
		case "+" :
			System.out.println("The addition of two numbers is : " + (var1 + var2));
			break;
		case "-" :
			System.out.println("The subtraction of two numbers is : " + (var1 - var2));
			break;
		case "*" :
			System.out.println("The multiplication of two numbers is : " + (var1 * var2));
			break;
		case "/" :
			System.out.println("The division of two numbers is : " + (var1 / var2));
			break;
		case "%" :
			System.out.println("The remainder of two numbers if you divide them is : " + (var1 % var2));
			break;
		}
		
		
		
	}
	
	
	
	


}
