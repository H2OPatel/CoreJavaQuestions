package CollectionFrameWorkPractice;

import java.util.ArrayList;
//import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Chicago");
		al.add("New York");
		al.add("Atlanta");
		al.add("Miami");
		al.add("Dallas");
		al.add("Boston");
		al.add("Chicago");
		al.add("Chicago");
		
//		Iterator<String> itr = al.iterator();
		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		for(String s : al) {
			System.out.println(s);
		}
		
	}
	
}
