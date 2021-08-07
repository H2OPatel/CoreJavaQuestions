package javaOnlinePracticeTpoint;

import java.util.Scanner;

public class PrintFibo {
	
	public static void main(String[] args) {
		
		int n1=1;
		int n2=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("please provide the total numbers which fibonacci you want");
		int count = sc.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		
		for (int i = 3; i<=count ; i++ ) {
			int sum = n1 +n2;
			System.out.println(sum);
			n1 = n2;
			n2 = sum;
		}
		sc.close();
	}

}
