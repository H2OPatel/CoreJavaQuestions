package basic.java.interview.question;

public class ContiguousArrayLargetSum {

	public static void main(String[] args) {

		int[] nums = {-2,-1,4,-1,-2,1,5,-2,-3};
		int max_so_far = nums[0];
		int current_max = nums[0];
		
		for(int i =1; i <nums.length; i++) {
			current_max = Math.max(nums[i], current_max+nums[i]);
			max_so_far = Math.max(current_max, max_so_far);
			
		}
		
		System.out.println(max_so_far);

		
	}

}
