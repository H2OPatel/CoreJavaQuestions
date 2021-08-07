package com.interview.question.methods;

import java.util.HashMap;
import java.util.Map;

public class NumberOfRepeatation {

	public static void numberOfRepeataion (String str) {
		Map<Character, Integer> charMap = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (!charMap.containsKey(str.charAt(i))) {
				charMap.put(str.charAt(i), 1);
			} else {
				charMap.put(str.charAt(i), charMap.get(str.charAt(i)) + 1);
			}
		}
		int count = 0;
		char wordchar = ' ';
		for (Character key : charMap.keySet()) {
			count = charMap.get(key);
			wordchar = key;
			System.out.println("Charcter :"+wordchar+" Count : "+count);
		}
		
		
	}
}
