package com.interview.question.clients;

import java.util.Scanner;

import com.interview.question.methods.MostRepeatedCharacter;
import com.interview.question.methods.NumberOfRepeatation;

public class NumberOfRepeatationClient {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Plese enter The Word -> ");
		try {
			String word = sc.next();
			NumberOfRepeatation.numberOfRepeataion(word);
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}
		

	}

}
