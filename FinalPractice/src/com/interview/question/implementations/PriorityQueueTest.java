package com.interview.question.implementations;

public class PriorityQueueTest {

	public static void main(String[] args) {
		
		PriorirtyQueue pq = new PriorirtyQueue(10);
		pq.add("Jal", 4);
		pq.add("Jatan", 1);
		pq.add("Ghost", 10);
		pq.add("Alex", 5);
		pq.add("Price", 6);
		
		System.out.println(pq.isEmpty());
		System.out.println(pq.isFull());
		pq.printHeap();
		System.out.println("-----------------------------------------------------");
		System.out.println("Removed Head: "+pq.remove());
		pq.printHeap();
		
	}

}
