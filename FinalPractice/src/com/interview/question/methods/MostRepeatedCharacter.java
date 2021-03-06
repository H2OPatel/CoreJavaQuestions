package com.interview.question.methods;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedCharacter {

	public static char mostRepeatedCharacter(String str) {
		Map<Character, Integer> charMap = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (!charMap.containsKey(str.charAt(i))) {
				charMap.put(str.charAt(i), 1);
			} else {
				charMap.put(str.charAt(i), charMap.get(str.charAt(i)) + 1);
			}
		}
		int maxRepCount = 0;
		char mostRepeatedChar = ' ';
		for (Character key : charMap.keySet()) {
			int tempMaxRepCount = charMap.get(key);
			if (maxRepCount < tempMaxRepCount) {
				maxRepCount = tempMaxRepCount;
				mostRepeatedChar = key;
			}
			
		}
		System.out.println("Most repeated count is : "+maxRepCount);
		return mostRepeatedChar;
	}
}
