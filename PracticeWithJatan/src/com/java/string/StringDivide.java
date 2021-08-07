package com.java.string;

public class StringDivide {

	public static void main(String[] args) {
		
		String s = "aaaabbbbccccddddeeee";
		
		
		int len = s.length();
		int n = 4;
		
		System.out.println("Calling divideString method...");
		divideString(s, 4);
		
		int lenOfParts = len/n;
		int temp = 0;
		
		String[] dividedstr = new String[n];
		
		if(len%n != 0) {
			System.out.println("The string cannot be converrted in equal parts");
		}else {
			for(int startIndex = 0, endIndex = lenOfParts ; startIndex < len  ; startIndex = endIndex, endIndex += lenOfParts) {
				String part = s.substring(startIndex, endIndex);
				System.out.println("When index i = "+startIndex+ " and endIndex = "+endIndex+", part = "+part);
				dividedstr[temp] = part;
				temp++;
			}
			for(String s1 : dividedstr) {
				System.out.println(s1);
			}
			// int i = 10;
			// for(i=10; i<100 ; i+=5)
			for(int i = 0 ; i < dividedstr.length ; i++) {
				System.out.println(dividedstr[i]);
			}
		
		}
		

	}
	public static String[] divideString(String str, int totalParts) {
		int len = str.length();
		int lenOfPart =len /totalParts;
		if(len%totalParts!=0) {
			System.out.println("The string cannot be converrted in equal parts");
			return null;
		}
		String[] parts = new String[totalParts];
		int startIndex = 0;
		int endIndex = lenOfPart;
		int count = 0;
		while(startIndex < len) {
			String part = str.substring(startIndex, endIndex);
			parts[count] = part;
			count++;
			startIndex = endIndex;
			endIndex += lenOfPart;
		}
		for(String part : parts) {
			System.out.println(part);
		}
		return parts;
	}

}
