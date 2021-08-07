package basic.java.interview.question;


//
//If all the elements of an array are not negative
//
public class ContiguousArrayLargetSumAltr {

	public static void main(String[] args) {

		int[] nums = {-2,-1,4,-1,-2,1,5,-2,-3};
		int max_so_far = 0;
		int max_here = 0;
		
		for(int i = 0; i<nums.length; i++) {
			max_here = max_here + nums[i];
			
		if(max_here<0) {
			max_here = 0;
		}
			
		if(max_so_far<max_here) {
			max_so_far = max_here;
		}
			
		}
		System.out.println("the largest sum of subarray within an array is : " + max_so_far);
		
	}

}
