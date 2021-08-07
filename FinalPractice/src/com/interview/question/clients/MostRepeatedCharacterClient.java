package com.interview.question.clients;

import java.util.Scanner;

import com.interview.question.methods.MostRepeatedCharacter;

public class MostRepeatedCharacterClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Plese enter The Word -> ");
		try {
			String word = sc.next();
			char mostRepChar = MostRepeatedCharacter.mostRepeatedCharacter(word);
			System.out.println("The most repeated charcter from provided word is : "+ mostRepChar);
		} catch (Exception e) {
			System.out.println("Invalid Input");
		}
		

	}

}
