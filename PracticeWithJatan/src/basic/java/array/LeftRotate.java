package basic.java.array;

public class LeftRotate {

	public static void main(String[] args) {
		int[] a = new int[]{1,2,4,7,9,6};
		// 2, 4, 7, 9, 6, 1
		// 4, 7, 9, 6, 1, 2
		
		// right
		// 1, 1, 2, 4, 7, 9
		int n = 4;
		
		System.out.println("The original arraay is : ");
		printArray(a);
		for(int i = 0 ; i < n ; i++) {
			int first,j;
			first = a[0];
			for(j = 0 ; j<a.length - 1 ; j++) {
				a[j] = a[j+1];
				}
			printArray(a);
			a[j] =  first;
			printArray(a);
		}
		System.out.println("The new arraay is : ");
		printArray(a);
		

	}
	public static void printArray(int[] arr) {
		for(int i:arr) {
			System.out.print(i+", ");
		}
		System.out.println();
	}

}
