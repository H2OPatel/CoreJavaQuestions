package basic.java.interview.question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringOps2 {

	public static void main(String[] args) {
			
		String str ="jal jatan john james john jatan jatan";
		String[] s = str.split(" ");
		
		Map<String,Integer> freq = new HashMap<>();
		
		for(int i = 0; i<s.length;i++) {
			String word = s[i];
			if(!freq.containsKey(s[i])) {
				freq.put(s[i], 1);
			}else {
				freq.put(s[i],freq.get(s[i])+1);
			}
		}
		
		Set<String> keys = new HashSet<>();
		keys = freq.keySet();
		int most_repeated = 0;
		String max_string = " ";
		
		for(String k : keys) {
			if(most_repeated<freq.get(k)) {
				most_repeated = freq.get(k);
				max_string = k;
			}
		}
		
		System.out.println("The word '"+max_string+"' occurs <"+ most_repeated+"> times in the String.");
		
		
		
		
		
		
	}

}
