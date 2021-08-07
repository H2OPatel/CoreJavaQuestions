package java.interview.questions;

public class TwoElementsArraySumEqualsTarget {

	public static void main(String[] args) {

		int[] numbers = {9,5,3,6,7,4};
		int target = 13;
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				if(numbers[j] == target - numbers[i]) {
					System.out.println(numbers[i]+" "+numbers[j]);
				}
			}
		}
		
	}

}
