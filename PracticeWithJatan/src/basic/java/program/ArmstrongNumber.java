package basic.java.program;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		int a=0;
		int n = 371;
		int b;
		int store = n;
		while(n>0) {
			b = n%10;
			n = n/10;
			a = a +(b*b*b);
			}
		if(store==a) {
			System.out.println("The number is an Armstrong Number");
		}else {
			System.out.println("The number is not an Armstrong Number");
		}
	}
}
//153 = (1*1*1)+(5*5*5)+(3*3*3)
//n=153
//sum =0 
//rem = n%10
//sum = sum + (rem*rem*rem)
//n = n/10 = new n 

