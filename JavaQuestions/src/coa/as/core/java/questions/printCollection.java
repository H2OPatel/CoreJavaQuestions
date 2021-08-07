package coa.as.core.java.questions;

import java.util.Collection;
import java.util.Iterator;

public class printCollection {
	
	public static void printString(Collection<String> collections) {
		Iterator<String> itr1 = collections.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
		
	}

}
