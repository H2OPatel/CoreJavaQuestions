package com.interview.question.methods;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromList {
	
	public static List<Integer> removeDuplicateFromList(List<Integer> list) {
		
		int i =0;
		int len = list.size();
		
		while (i < len-1) {
			if(list.get(i) == list.get(i+1)) {
				list.remove(i+1);
				len = list.size();
			}else {
				i++;
			}
		}
		return list;
		
	}

}
