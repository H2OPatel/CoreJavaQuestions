package basic.java.interview.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSortedList {

	public static void main(String[] args) {
		Integer[] a1 = { 1, 2, 3, 4 };
		Integer[] a2 = { 4, 5, 6 };
		List<Integer> list1 = Arrays.asList(a1);
		List<Integer> list2 = Arrays.asList(a2);
		List<Integer> mergeList = new ArrayList<>();

		int fp = 0;
		int sp = 0;

		while (fp < list1.size() && sp < list2.size()) {
			if (list1.get(fp) <= list2.get(sp)) {
				mergeList.add(list1.get(fp));
				fp++;
			} else {
				mergeList.add(list2.get(sp));
				sp++;
			}
		}
		if(fp == list1.size()) {
			while(sp<list2.size()) {
				mergeList.add(list2.get(sp));
				sp++;
			}
		}
		if(sp == list2.size()) {
			while(fp<list1.size()) {
				mergeList.add(list1.get(fp));
				fp++;
			}
		}
		
		mergeList.stream().forEach(element -> System.out.println(element));
		
		
		// lambda
//		System.out.println("Lambda Filter....");
//		list1.stream().filter(element -> element==3).collect(Collectors.toList()).stream().forEach(element -> {
//			System.out.println(element);
//			System.out.println(element+3);
//		});
	}

}
