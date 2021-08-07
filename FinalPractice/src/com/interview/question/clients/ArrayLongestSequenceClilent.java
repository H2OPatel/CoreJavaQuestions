package com.interview.question.clients;

import com.interview.question.methods.ArrayLongestSequence;

public class ArrayLongestSequenceClilent {

	public static void main(String[] args) {
		
		int numbers[] = {2, 3,100, 4, 100, 5, 8, 9,6, 106, 11, 109};
		
		int length = ArrayLongestSequence.lengthOfLongestSequence(numbers);
		System.out.println("The Length for longest consecutive elements is : "+length);
	}

}
