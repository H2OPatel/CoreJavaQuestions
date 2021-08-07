import java.util.Scanner;

public class BasicCalculatorClient {

	public static void main(String[] args) {
		
		BasicCalculator calc1 = new BasicCalculator();
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter variable 1 : ");
		int vara = console.nextInt();
		System.out.println("Enter variable 2  : ");
		int varb = console.nextInt();
		
		System.out.println("Addition of two variables : " + calc1.addition(vara, varb));
		System.out.println("Subtraction of two variables : " + calc1.subtraction(vara, varb));
		System.out.println("Multiplication of two variables : " + calc1.multiplication(vara, varb));
		System.out.println("Division of two variables : " + calc1.division(vara, varb));

	}

}
