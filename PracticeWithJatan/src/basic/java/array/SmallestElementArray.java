package basic.java.array;

public class SmallestElementArray {

	public static void main(String[] args) {
		int a[] = {25,55,68,95,47,21,36,59};
		int min = a[0];
		
		for(int i = 0 ; i<a.length ; i++) {
			if(min > a[i]) {
				min = a[i];
				System.out.println("The lowest element of an array is "+ min);
			}
		}

	}

}
