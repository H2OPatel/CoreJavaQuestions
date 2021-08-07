package basic.java.array;

public class SortArray {

	public static void main(String[] args) {
		int[] a = new int[] {95, 64, 11, 23, 60, 35, -1};
//		System.out.println("The original value of array is ");
//		for(int or : a) {
//			System.out.println(or);
//		}
		//System.out.println("The value of an array after sorting is ");
		for(int i = 0 ; i< a.length ; i++) {
			for(int j = (i+1); j<a.length ; j++) {
				int temp = 0;
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
//		for(int p : a) {
//			System.out.println(p);
//		}

	}

}
