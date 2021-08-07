package basic.java.interview.question;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringOpsFileReader {

	public static void main(String[] args) throws IOException {

		Map<String, Integer> freq = new HashMap<>();
		File file = new File("C:\\Users\\16309\\OneDrive\\Desktop\\Test.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = br.readLine();
		while (str != null) {
			String[] s = str.toLowerCase().split(" ");
			for (String word : s) {
				if (freq.containsKey(word)) {
					freq.put(word, freq.get(word) + 1);
				} else {
					freq.put(word, 1);
				}
			}
			str = br.readLine();
		}

		Set<String> keys = new HashSet<>();
		keys = freq.keySet();
		int most_repeated = 0;
		String max_string = " ";

		for (String k : keys) {
			if (most_repeated < freq.get(k)) {
				most_repeated = freq.get(k);
				max_string = k;
			}
		}

		System.out.println("The word '" + max_string + "' occurs <" + most_repeated + "> times in the String.");

	}
}
