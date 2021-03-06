package com.interview.question.clients;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.interview.question.methods.RemoveDuplicateFromList;

public class RemoveDuplicateFromListClient {

	public static void main(String[] args) {
		
		Integer[] num = { 2, 3, 3, 4, 4, 4, 5, 5, 7, 7, 10,10 };
		
		//ArrayList<Integer> list = new ArrayList<>();
		List<Integer> list = new ArrayList<>(Arrays.asList(num));
		//list.addAll(Arrays.asList(num));
		RemoveDuplicateFromList.removeDuplicateFromList(list);
		
		list.stream().forEach(element -> System.out.println(element));
		

	}

}
