package basic.java.inter.face;

public class Addition implements MathOperation {
	int sum;
	int a = 5;
	int b = 10;
	public static void calculation(int a, int b) {
		System.out.println("The sum of two integers is "+ (a + b));
	}
	
	public static void main(String[] args) {
		Addition a = new Addition();
		a.calculation(15, 25);
	}

}


//// yOu can not override static or private methods.