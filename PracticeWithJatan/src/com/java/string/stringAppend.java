package com.java.string;

import java.util.Scanner;

public class stringAppend {

	public static void main(String[] args) {
		
		String fname;
		String lname;
		String fullName;
		//String test;
		StringBuffer sb = new StringBuffer();
		
		Scanner sc = new Scanner(System.in);
		
		fname = sc.nextLine();
		System.out.println("The provided first name is : " + fname);
		
		lname = sc.nextLine();
		System.out.println("The provided last name is : " + lname);
		
		fullName = sb.append(fname + " " + lname).toString();
		System.out.println(fullName);
		
		StringBuffer sb1 = new StringBuffer(fullName);
		System.out.println(sb1);
		sb1.append(" hello");
		System.out.println(sb1);
		
		sc.close();
		
		
		
	}

}
