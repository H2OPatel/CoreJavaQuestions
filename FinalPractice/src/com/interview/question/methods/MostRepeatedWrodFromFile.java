package com.interview.question.methods;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MostRepeatedWrodFromFile {
	
	public static String mostRepeatedWordFromFile () throws IOException {
		
		Map<String,Integer> wordMap = new HashMap<>();
		File file = new File("C:\\Users\\16309\\OneDrive\\Desktop\\Test.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = br.readLine();
		
		while (str != null) {
			String[] line = str.toLowerCase().split(" ");
			for (int i=0;i<line.length;i++) {
				if(!wordMap.containsKey(line[1])) {
					wordMap.put(line[i], 1);
				}else {
					wordMap.put(line[i], wordMap.get(line[1])+1);
				}
			} str = br.readLine();
		}
		int maxCount = 0;
		String mostRepeatedWord = "";
		for (String s : wordMap.keySet()) {
			int tempCount = wordMap.get(s);
			if(maxCount<tempCount) {
				mostRepeatedWord = s;
				maxCount= tempCount;
			}
		}
		return mostRepeatedWord;
	}

}
