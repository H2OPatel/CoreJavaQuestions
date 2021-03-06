package com.interview.question.clients;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SortByLongestNamePriorityQueue {

	public static void main(String[] args) {

		Comparator<String> stringLengthComparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() > o2.length()) {
					return -1;
				} else if (o1.length() == o2.length()) {
					return 0;
				}
				return 1;
			}
		};
		PriorityQueue<String> pq = new PriorityQueue<String>(stringLengthComparator);
		pq.offer("Ghost");
		pq.offer("Price");
		pq.offer("Mace");
		pq.offer("Alex");
		pq.offer("Sheperd");
		pq.offer("Adler");
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}

	}

}
