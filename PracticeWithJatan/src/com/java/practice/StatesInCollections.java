package com.java.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StatesInCollections {

	public static void main(String[] args) {
		List<String> states = new ArrayList<>();
		
		states.add("New York");
		states.add("New Jersey");
		states.add("New Hampshire");
		states.add("New Mexico");
		states.add("Texas");
		System.out.println("After using ArrayList");
		printCollection(states);


		
		// Using hashset
		System.out.println("After using HashSet");
		Set<String> set = new HashSet<>(); 
		set.addAll(states);
		printCollection(set);
		
		// Using treeSet
				System.out.println("After using TreehSet");
				Set<String> tset = new TreeSet<>(); 
				tset.addAll(states);
				printCollection(tset);
		
	}
	
	public static void printCollection(Collection<String> collection) {
		Iterator<String> itr = collection.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	

}
