package com.interview.question.methods;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Map.Entry;

public class ArrangeInOrderOfRepeatation {

	public static String arrangeInOrderOfRepeatation(String str) {
		//Define Map
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		//Put Characters as a key and repeataion as value
		for (int i = 0; i < str.length(); i++) {
			if (!charMap.containsKey(str.charAt(i))) {
				charMap.put(str.charAt(i), 1);
			} else {
				charMap.put(str.charAt(i), charMap.get(str.charAt(i)) + 1);
			}
		}
		
		//Custom Comparator for Priority queue
		Comparator<Map.Entry<Character, Integer>> customComapareObj = new Comparator<Map.Entry<Character, Integer>>() {
			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				if (o1.getValue() > o2.getValue()) {
					return -1;
				} else if (o1.getValue() < o2.getValue()) {
					return 1;
				} else {
					return 0;
				}
			}
		};
		
		//Define Priority Queue with custom comparator
		PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<Map.Entry<Character, Integer>>(
				customComapareObj);
		
		//Add Map Entry Set to priority queue as whole
		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			pq.add(entry);
		}
		
		//Append them in String Buffer until there Value becomes 0 
		StringBuffer sb = new StringBuffer();
		while (!pq.isEmpty()) {
			Map.Entry<Character, Integer> entry = pq.poll();
			for (int i = 0; i < entry.getValue(); i++) {
				sb.append(entry.getKey());
			}
		}
		//return String
		return sb.toString();
	}
}
