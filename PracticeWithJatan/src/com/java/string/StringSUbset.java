package com.java.string;

public class StringSUbset {

	public static void main(String[] args) {

		String str = "JAL";
		int len = str.length();
		String[] subset = new String[len * (len + 1) / 2];
		int total = len * (len + 1) / 2;
		int temp = 0;

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				subset[temp] = str.substring(i, j + 1);
				temp++;
			}

		}
		System.out.println("The total number of susbsets we can get for this string are : " + total);
		for (String a : subset) {
			System.out.println(a);
		}

	}
	
}

