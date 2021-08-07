package com.java.string;

public class StringFindDuplicateCharacters {
	public static void main(String[] args) {
		
		String st ="jal is learning java";
		char[] stAr = st.toCharArray();
		System.out.println("The duplicate characters in string are : ");
		for(int i = 0 ; i<stAr.length ; i++) {
			int count = 1;
			for(int j = i+1; j<stAr.length ; j++) {
				if(stAr[i] == stAr[j]) {
					count++;
					stAr[j] = 0;
				}
			}
			if(count != 1 && stAr[i] != 0 && stAr[i] != ' ') {
				System.out.println(stAr[i]+ " " + count);
			}
		}
		
	}
}
