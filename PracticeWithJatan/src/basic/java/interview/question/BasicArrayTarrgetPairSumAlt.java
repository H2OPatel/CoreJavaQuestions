package basic.java.interview.question;

import java.util.HashSet;
import java.util.Set;

public class BasicArrayTarrgetPairSumAlt {

	public static void main(String[] args) {
		int[] nums = {9,5,3,6,7,4};
		int target =13;
		
		Set<Integer> num = new HashSet<>();
		for(int i : nums) {
			num.add(i);
			if(num.contains(target - i)) {
				System.out.println((target-i) + " " + i);
			}
		}


	}

}
