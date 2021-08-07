package com.as.apex.corejava.datatypes;

import java.util.Scanner;

public class PrintFibonacci {
	
	

	    public static void main(String[] args) {
	    	
	    	Scanner console = new Scanner(System.in);
	    	System.out.println("Please provide the count of the number of which you want as a fibonacci series.");
	    	int count = console.nextInt();
	    	System.out.println("System will provide fibonacci series of first "+ count + " numbers");

	        int  t1 = 0, t2 = 1;
	         for (int i = 1; i <= count; ++i)
	        {
	            System.out.print(t1 + " , ");

	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
	         console.close();
	    }
	}

/*
 * 0, 1, 1
 * if(n==0 || n==1) return n;//base caSE
 * return f(n-1) + f(n-2); n>=2//recursive step
 * 
 * 100! = 100 x 99! = 100 x 99 x 98!  = 100 x 99 x 98 x 97! =  
 * f(n) = n * f(n-1);
 * 0!= 1
 * 1! = 1
 * public int factorial(int n){
 * 		if(n<=1) return 1;
 * 		return n*factorial(n-1);
 * }
 * 10! = 10 x 9 x 8 x 7 x 6 x 5 x 4 x 3 x 2 x 1 = 1 x 2 x 3 x ... x 10
 */

