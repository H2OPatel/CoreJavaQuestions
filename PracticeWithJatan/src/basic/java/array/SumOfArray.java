package basic.java.array;

public class SumOfArray {

	public static void main(String[] args) {
		int a[] = {25,55,68,95,47,21,36,59};
		int sum = 0;
		
		for(int i = 0; i<a.length ; i++) {
			
			sum = sum + a[i];
		}
		
		System.out.println(sum);
		
	}

}
