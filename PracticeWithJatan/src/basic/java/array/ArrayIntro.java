package basic.java.array;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int[] ar1 = new int[5];
		ar1[0] = 10;
		ar1[1] = 20;
		ar1[2] = 30;
		ar1[3] = 40;
		ar1[4] = 50;
		System.out.println("The numbers of elements present in the array are "+ ar1.length);
		for(int i =0;i<ar1.length;i++) {
			System.out.println(ar1[i]);
			
		}
		
		for(int j = ar1.length - 1 ; j >= 0 ; j-- ) {
			System.out.println(ar1[j]);
		}
		
		String ar2[] = {"Joseh","David","John","Jason","James"};
		for(String s : ar2) {
			System.out.println(s);
		}
	}

}
