package basic.java.array;

public class LargestElementArray {

	public static void main(String[] args) {
		int a[] = {25,55,68,95,47,21,36,59};
		int max = a[0];
		
		for(int i = 0 ; i<a.length ; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("The Largest Element of the array is "+ max);

	}

}
