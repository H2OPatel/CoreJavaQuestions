package com.interview.question.clients;

import java.util.Scanner;

import com.interview.question.methods.ReverseTheString;

public class ReverseTheStringClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Plese enter the word -> ");
		try{
			String word = sc.next();
			String revWord = ReverseTheString.reverseTheString(word);
			String revWordWithBuffer = ReverseTheString.reverseTheStringWithBuffer(word);
			System.out.println("with char[] & in memory operations :" +revWord);
			System.out.println("StringBuffer : " + revWordWithBuffer);
		}catch (Exception e) {
			System.out.println("Invalid Input");
		}
		

	}

}
