package com.interview.question.clients;

import java.util.Scanner;

import com.interview.question.methods.ArrangeInOrderOfRepeatation;

public class ArrangeInOrderOfRepeatationClient {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Word : ");
		String str = sc.next();
		String newStr = ArrangeInOrderOfRepeatation.arrangeInOrderOfRepeatation(str);
		System.out.println("The New word if we arrange them in order of there repetation then the new word would be : "+newStr);

	}

}
