package com.java.string;

public class StringPunctuation {

	public static void main(String[] args) {
		String str = "This is test sting, To find :Punctuations! in the string;.";
		System.out.println(countPunctsInStr(str));
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.' || str.charAt(i) == ',' || str.charAt(i) == ';'
					|| str.charAt(i) == ':') {
				count++;
			}
		}
		System.out.println("The number of punctuations in the string are : " + count);
		
		// Test case 1 : str = "ikbsk;:,.", count = 4
		// Test case 2 : str = "ikbs,.,.,.;:,.", count = 10
		String str2 = "ikbs,.,.,.;:,.";
		System.out.println("Executing tests...");
		String[] testCases = {str, str2};
		int[] validResuts = {4, 10};
		int i = 0;
		for(String testCase : testCases) {
			int actualCount = countPunctsInStr(testCase);
			if(actualCount == validResuts[i]) {
				System.out.println("Test case "+(i+1)+" passed.");
			}
			else {
				System.out.println("Test case "+(i+1)+" failed. Expected value : "+validResuts[i]+" but actual value : "+actualCount);
			}
			i++;
		}
		
	}
	
	public static int countPunctsInStr(String str) {
		if(str == null || str.length()==0)
			return 0;
		
		int count = 0;
		for(int i=0; i<str.length();i++) {
			if(isPunctuation(str.charAt(i)))
				count++;
		}
		return count;
	}

	private static boolean isPunctuation(char c) {
		return c == '.' || c == ',' || c == ';' || c == ':';
	}
	
	private static boolean isPunctuation1(char c) {
		if( c == '.' || c == ',' || c == ';' || c == ':') {
			return true;
		}
		else {
			return false;
		}
	}
}
