package basic.java.array;

public class CopyArray {

	public static void main(String[] args) {
		
		int[] a = new int[]{1,2,4,7,9,6};
		int[] b = new int[a.length];
		//int temp;
		for(int i = 0 ; i<a.length ; i++) {
			b[i] = a[i];
			//b[i] = temp;
		}
		for(int out : b) {
			System.out.println(out);
		}
	}

}
