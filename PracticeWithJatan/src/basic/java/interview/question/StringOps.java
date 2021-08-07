package basic.java.interview.question;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringOps {

	public static void main(String[] args) {
		String s ="abcaadebacc";
		/*
		 * []
		 * c = a
		 * [(a, 1)]
		 * c = b
		 * [(a,1), (b,1)]
		 * c = c
		 * [(a,1), (b,1), (c, 1)]
		 * c = a
		 * [(a,2), (b,1), (c, 1)]
		 * ...
		 */
		Map<Character,Integer> freq = new HashMap<>();
		
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(!freq.containsKey(c)) {
				freq.put(c, 1);
			}else {
				freq.put(c, freq.get(c)+1);
			}
			//System.out.println(freq);
		}
		System.out.println(freq);
		Set<Character> keys = freq.keySet();
		int max =0;
		char max_char = ' ';
		for(Character key : keys) {
			if(max<freq.get(key)) {
				max = freq.get(key);
				max_char = key;
			}
		}
		System.out.println("The most repeated character is :" + max_char+" with frequency of : "+ freq.get(max_char));
	}

}






