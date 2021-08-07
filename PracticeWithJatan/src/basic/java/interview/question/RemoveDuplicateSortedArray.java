package basic.java.interview.question;

public class RemoveDuplicateSortedArray {

	public static void main(String[] args) {

		int[] num = { 2, 3, 3, 4, 4, 4, 5, 5, 7, 7, 10 };
		int len = num.length;
		int j = 0;

		for (int i = 0; i < len - 1; i++) {
			if (num[i] != num[i + 1]) {

				num[j] = num[i];
				j++;

			}
		}
		num[j] = num[len - 1];
		for (int k = 0; k <= j ; k++) {
			System.out.print(num[k] + " ");
		}

	}

}
