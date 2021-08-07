package com.java.string;

public class StringVowel {

	public static void main(String[] args) {
		
		String str = "Let's find out how many VOWEL and CONSONENTS are present in the string";
		int vCount = 0;
		int cCount = 0;
		
		str = str.toLowerCase();
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u') {
				vCount++;
			}else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				cCount++;
			}
		}
		System.out.println("The number of vowels in the string are : "+ vCount);
		System.out.println("The number of Consonents in the string are : "+ cCount);    
		countVowelsAndConsonants(str);
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.toString());
		
	}
	
	public static void countVowelsAndConsonants(String str) {
		int vCount = 0;
		int cCount = 0;
		for(int i= 0; i<str.length(); i++) {
			//if(isVowel(str.charAt(i)))
			if(isVowelClient.isVowel(str.charAt(i)))
				vCount++;
			if(isConsonant(str.charAt(i)))
				cCount++;
		}
		System.out.println("Vowel count = "+vCount );
		System.out.println("Consonant count = "+cCount );
	}
	
	public static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c=='i' || c=='o' || c=='u';
	}
	public static boolean isConsonant(char c) {
		return !isVowel(c) && c>='a' && c<='z';
	}
		
}

