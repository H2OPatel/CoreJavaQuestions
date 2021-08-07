package com.interview.question.clients;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import com.interview.question.methods.MergeSortedList;


public class MergeSortedListClient {

	public static void main(String[] args) {
		
		Integer[] a1 = { 1, 2, 3, 7};
		Integer[] a2 = { 4, 5, 6 };
		List<Integer> list1 = Arrays.asList(a1);
		List<Integer> list2 = Arrays.asList(a2);
		
		List<Integer> mergeList = MergeSortedList.mergeSorted(list1, list2);
		mergeList.stream().forEach(element -> System.out.println(element));
		
	}

}
