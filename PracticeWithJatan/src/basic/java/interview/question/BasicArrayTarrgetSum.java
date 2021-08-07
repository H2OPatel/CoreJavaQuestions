package basic.java.interview.question;

public class BasicArrayTarrgetSum {

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
	// 9, 5, 3, 6, 7, 4
	// left=0 , right=0
	// first you create a window meeting the condition
	// when you meet condition, you expand (if there is no external limit) window; 
	//if condition is not met, you shrink the window
	
	// while(right<a.length-1){
	//}

}
