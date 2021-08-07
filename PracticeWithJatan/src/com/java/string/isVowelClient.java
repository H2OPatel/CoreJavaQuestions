package com.java.string;

public class isVowelClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Apple";
		int count = 0;
		s = s.toLowerCase();
		for(int i = 0 ; i < s.length() ; i++) {
			if (isVowel(s.charAt(i)))
				count++;
			
		}
		System.out.println(count);
		System.out.println(StringUtilities.isPrime(7));
		System.out.println(StringUtilities.isPrime(11));
		System.out.println(StringUtilities.isPrime(17));
		System.out.println(StringUtilities.isPrime(2));
		System.out.println(StringUtilities.isPrime(3));
		System.out.println(StringUtilities.isPrime(1));
		System.out.println(StringUtilities.isPrime(5));
		System.out.println(StringUtilities.isPrime(13));
		System.out.println(StringUtilities.isPrime(121));
		System.out.println(StringUtilities.isPrime(29));
		System.out.println(StringUtilities.isPrime(31));
		//isPrimeWithFlag
		System.out.println(StringUtilities.isPrimeWithFlag(7));
		System.out.println(StringUtilities.isPrimeWithFlag(11));
		System.out.println(StringUtilities.isPrimeWithFlag(17));
		System.out.println(StringUtilities.isPrimeWithFlag(2));
		System.out.println(StringUtilities.isPrimeWithFlag(3));
		System.out.println(StringUtilities.isPrimeWithFlag(1));
		System.out.println(StringUtilities.isPrimeWithFlag(5));
		System.out.println(StringUtilities.isPrimeWithFlag(13));
		System.out.println(StringUtilities.isPrimeWithFlag(121));
		System.out.println(StringUtilities.isPrimeWithFlag(29));
		System.out.println(StringUtilities.isPrimeWithFlag(31));
	}
	
	public static boolean isVowel(char a) {
		if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a  == 'u') {
			return true;
		}
		return false;
	}

}
