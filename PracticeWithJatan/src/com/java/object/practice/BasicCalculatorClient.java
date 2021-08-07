package com.java.object.practice;

import java.util.Scanner;

public class BasicCalculatorClient {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(AdditionMethod.Addition(a, b));
		
	}

}
