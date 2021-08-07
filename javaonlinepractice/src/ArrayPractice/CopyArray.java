package ArrayPractice;

public class CopyArray {
	
	public static void main(String[] args) {
		

		int[] ar1 = new int [] {11,13,10,8,29,25};
		int ar2[] = new int[ar1.length];
		
		for(int i=0; i<ar1.length;i++) {
			ar2[i] = ar1[i];	
		}
		
		for(int i=0; i<ar1.length;i++) {
			System.out.print(ar1[i] + " ");
		}
		System.out.println();
		for(int i=0; i<ar2.length;i++) {
			System.out.print
			(ar2[i] + " ");
		}
		
	}

}

