package com.as.practice.on.my.own;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArrayList {

	public static void main(String[] args) {
		Integer a[]= {1,4,5,6};
		Integer b[]= {2,3,7};
		List<Integer> l1 = Arrays.asList(a);
		List<Integer> l2 = Arrays.asList(b);
		List<Integer> list = new ArrayList<>();
		
		int fp = 0;
		int sp = 0;
		
		while(fp<l1.size() && sp<l2.size()) {
			if(l1.get(fp)<l2.get(sp)) {
				list.add(l1.get(fp));
				fp++;
			}else{
				list.add(l2.get(sp));
				sp++;
			}
		}
		if(fp==l1.size()) {
			while(sp<l2.size()) {
				list.add(l2.get(sp));
				sp++;
			}
		}if(sp==l2.size()) {
			while(fp<l1.size()) {
				list.add(l1.get(fp));
				fp++;
			}
		}
		list.stream().forEach(element -> System.out.println(element));
				
	}

}
