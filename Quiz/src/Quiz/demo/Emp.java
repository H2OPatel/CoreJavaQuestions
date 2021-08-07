package Quiz.demo;

public class Emp {

	public static void main(String[] args) {

		String name = "name";
		String id = "id";

		String ids[] = { "1", "2", "3" };
		String names[] = { "abc", "def", "ghi" };

		int a = ids.length;
		int b = names.length;
		
		if (a!=b) return;

		String out[][] = new String[a][b];

		for (int i = 0; i < out.length; i++) {
			out[0][i] = ids[i];
		}

		for (int j = 0; j < out.length; j++) {
			out[1][j] = names[j];
		}

		for (int column = 0; column < out.length; column++) {
			for (int row = 0; row <= 1; row++) {
				System.out.print(out[row][column] + " ");
			}
			System.out.println("");
		}

	}

}
