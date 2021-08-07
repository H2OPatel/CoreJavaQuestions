package com.java.string;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		
		String s1 = "MotherInLaw";
		String s2 = "HitlerWoman";
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length() != s2.length()) {
			System.out.println("Both the atrings are not anagram because there length do not match");
		}else {
			
			char[] stAr1 = s1.toCharArray();
			char[] stAr2 = s2.toCharArray();
			
			Arrays.sort(stAr1);
			Arrays.sort(stAr2);
			
			if(Arrays.equals(stAr1, stAr2)) {
				System.out.println("Yes, both the Strings are Anagram");
			}else {
				System.out.println("no, both the Strings are not Anagram");
			}
				
			
			
			
		}

	}

}
