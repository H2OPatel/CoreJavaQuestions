package basic.java.array;

public class SortArrayalt {
	public static void main(String[] args) {
		
		int[] a = new int[] {15, 64, 11, 23, 60, 35};
		
		for(int i =0;i<a.length;i++) {
			
			for(int j = i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					swapArrayElements(a, i, j);
				}
			}
			System.out.println(a[i]);
		}
		
	}
	public static void swapArrayElements(int[] arr, int i, int j) {
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
