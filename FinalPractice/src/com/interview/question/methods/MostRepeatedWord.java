package com.interview.question.methods;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedWord {

		public static String mostRepeatedWord (String line) {
			
			Map<String,Integer> wMap = new HashMap<>();
			String[] words = line.split(" ");
			
			for (int i =0;i<words.length;i++) {
				if(!wMap.containsKey(words[i])) {
					wMap.put(words[i], 1);
				}else {
					wMap.put(words[i], wMap.get(words[i])+1);
				}
			}
			int maxCount = 0;
			String word = "";
			for (String str : wMap.keySet()) {
				int tempCount = wMap.get(str);
				
				if(maxCount < tempCount) {
					maxCount = tempCount;
					word = str;
				}
			} return word;
		}
}
