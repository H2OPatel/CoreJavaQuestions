package basic.alien.universe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//import java.util.List;

public class AlientOperations {

	public static void main(String[] args) {

		AlientInfo a1 = new AlientInfo(1234, "K589", "G568", 1357);
		AlientInfo a2 = new AlientInfo(1235, "K678", "G782", 2468);
		AlientInfo a3 = new AlientInfo(1236, "K599", "G362", 1634);
		AlientInfo a4 = new AlientInfo(1237, "K458", "G286", 4967);
		AlientInfo a5 = new AlientInfo(1238, "K256", "G199", 9173);
		
		Collection<Object> alientList = new ArrayList<>();
		
		alientList.add(a1);
		alientList.add(a2);
		alientList.add(a3);
		alientList.add(a4);
		alientList.add(a5);
		
		//Iterator<String> itr = new collection.iterstor();
		Iterator<Object> itr= alientList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("After calling method");
		
		printCollection(alientList);
			
	}
	
	public static void printCollection(Collection<Object> collections) {
		Iterator<Object> itr = collections.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
