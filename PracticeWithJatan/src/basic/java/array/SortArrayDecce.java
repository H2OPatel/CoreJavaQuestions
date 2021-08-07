package basic.java.array;

public class SortArrayDecce {

	public static void main(String[] args) {

		int[] a = new int[] { 15, 64, 11, 23, 60, 35 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				int temp = 0;
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}

	}

}
