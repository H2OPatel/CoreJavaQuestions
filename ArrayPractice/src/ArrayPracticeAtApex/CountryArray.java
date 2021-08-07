package ArrayPracticeAtApex;

import java.util.ArrayList;
import java.util.Iterator;

public class CountryArray {

	public static void main(String[] args) {
		
		ArrayList<String> country = new ArrayList<>();
		country.add("India");
		country.add("Usa");
		country.add("Israel");
		country.add("France");
		country.add("Australia");
		country.add("Japan");
		country.add("Germany");
		country.add("Canada");
		country.add("Mexico");
		country.add("Dominican Republic");
		
		System.out.println("The list is: \n"+ country);
	//=========================USING ITERATOR====================================	
		Iterator<String> itr = country.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
