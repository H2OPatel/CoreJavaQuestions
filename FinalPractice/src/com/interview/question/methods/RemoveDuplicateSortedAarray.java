package com.interview.question.methods;

public class RemoveDuplicateSortedAarray {

	public static void removeDuplicateFromSortedArray(int num[]) {
		int newPointer = 0;
		int len = num.length;

		for (int i = 0; i < len - 1; i++) {
			if (num[i] != num[i + 1]) {
				num[newPointer] = num[i];
				newPointer++;
			}
		}
		//This will add the last element to the current place of the pointer
		num[newPointer] = num[len - 1];
		for (int j = 0; j <= newPointer; j++) {
			System.out.print(num[j]+",");
		}

	}

}
