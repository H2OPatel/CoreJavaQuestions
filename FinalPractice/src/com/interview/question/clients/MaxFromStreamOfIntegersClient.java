package com.interview.question.clients;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxFromStreamOfIntegersClient {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		boolean exit = true;
		while(exit) {
			System.out.println("Press 1 to enter next integer : ");
			System.out.println("Press 2 to get Max : ");
			System.out.println("Press 3 to delete Max : ");
			System.out.println("Press 4 to Exit :");
			int selection = sc.nextInt();
			
			switch (selection) {
			case 1:
				System.out.println("Enter Integer");
				int nextInt = sc.nextInt();
				pq.add(nextInt);
				break;
			case 2:
				System.out.println("The Max So far is : "+pq.peek());
				break;
			case 3:
				System.out.println("Deleting Max : "+pq.poll());
				break;
			case 4:
				exit = false;
				break;
			}
		}
	}
}
