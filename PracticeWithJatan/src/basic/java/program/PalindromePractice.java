package basic.java.program;

import java.util.Scanner;

public class PalindromePractice {

	public static void main(String[] args) {
		
		// n = x;
		// n = 1221 -> ? 
		// 10, reverse = 0;
		
		// rem = n%10 -> reverse = reverse * 10 + rem;
		// n = n/10; -> new n
		
		// 1221%10 = 1 -> reverse = 1
		// 1221/10 = 122 -> n = 122
		
		// 122%10 = 2 -> reverse = reverse * 10 + 2  = 12
		// 122/10 = 12 = n
		
		// 12%10 = 2 -> reverse = reverse * 10 + rem = 122
		// n = 12/10 = 1
		
		// 1%10 = 1 -> reverse = 122 * 10 + 1 = 1221
		// n = 1/10 = 0
		
		
		// if reverse == x ?
		
		String str = "xyzzyx";
		char[] charArr = str.toCharArray();
		char[] revCharArr = new char[charArr.length];
		// approach 1 - brute force - reverse the char array and compare the original charArr
		for(int i = charArr.length-1; i>=0; i--) {
			revCharArr[i] = charArr[i];
		}
		// compare
		for(int i =0; i<charArr.length; i++) {
			if(charArr[i]!=revCharArr[i]) {
				System.out.println(str + " is not palindrome.");
			}
		}
		System.out.println(str + " is palindrome.");
		
		// approach 2 -> left = 0, right = length - 1 
		
		int len = str.length();
		int left = 0;
		int right = len - 1;

		while (left <= right) {
			if (str.charAt(left) == str.charAt(right)) {
				left++;
				right--;
			} else {
				System.out.println("String is not palindrome.");
				break;
			}
		}
		
	}

}
