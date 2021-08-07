package com.interview.question.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedList {

	public static List<Integer> mergeSorted(List<Integer> list1, List<Integer> list2) {
		List<Integer> mergeList = new ArrayList<>();
		int fp = 0;
		int sp = 0;
		//While will check for the smaller element from both the list and add smaller one to new List
		while (fp < list1.size() && sp < list2.size()) {
			if (list1.get(fp) < list2.get(sp)) {
				mergeList.add(list1.get(fp));
				fp++;
			} else {
				mergeList.add(list2.get(sp));
				sp++;
			}
		}
		//if first list is added completely than add the second list as it is
		if (fp == list1.size()) {
			while (sp < list2.size()) {
				mergeList.add(list2.get(sp));
				sp++;
			}
		}
		//if second list is added completely than add the first list as it is
		if (sp == list2.size()) {
			while (fp < list1.size()) {
				mergeList.add(list1.get(fp));
				fp++;
			}

		}


		return mergeList;
	}
}
