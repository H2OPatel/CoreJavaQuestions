package com.interview.question.clients;

import java.util.NoSuchElementException;
import java.util.Scanner;

import com.interview.question.methods.IsStringPalindrome;



public class IsStringPalindromeClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the Word->  ");
		try {
			String word = sc.next();
			IsStringPalindrome.isStringPalindrome(word);
		} catch (NoSuchElementException nse) {
			//nse.printStackTrace();
			System.out.println("No Word Found");
		} catch (IllegalStateException ise) {
			//ise.printStackTrace();
			System.out.println("Invalid Input");
		}
	}

}
