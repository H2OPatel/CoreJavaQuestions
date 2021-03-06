package coa.as.core.java.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListPractice {

	public static void main(String[] args) {

		List<String> stateName = new ArrayList<>();
		Set<String> stateNameSet = new HashSet<>();
		Set<String> stateNametSet = new TreeSet<>();
		stateName.add("New York");
		stateName.add("New Jersy");
		stateName.add("New Mexico");
		stateName.add("New Hampshire");
		stateName.add("Illinois");
		stateName.add("California");
		stateName.add("texas");
		
		
		printCollection.printString(stateName);
		System.out.println("The name of States in USA ArrayList  are as below. ");
		Iterator<String> itr = stateName.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		stateNameSet.addAll(stateName);
		stateName.add("New York");
		System.out.println("The name of States in USA HashSet are as below. ");
		printCollection.printString(stateNameSet);
		
		stateNametSet.addAll(stateName);
		stateName.add("New York");
		System.out.println("The name of States in USA TreeSet are as below. ");
		printCollection.printString(stateNametSet);


		
	}

}
