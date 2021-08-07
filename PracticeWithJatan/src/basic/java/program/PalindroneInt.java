package basic.java.program;

public class PalindroneInt {
	public static void main(String[] args) {
		
		int num = 124521;
		int rem; 
		int reverse = 0;
		int temp = num;
		while(num>0){
			rem = num%10;
			reverse = reverse * 10 + rem;
			num = num/10;
			
		}
		System.out.println("The Reverse of the Number is : " + reverse);
		
		if(temp == reverse) {
			System.out.println("The Number is Palindrome");
		}else {
			System.out.println("The Number is not Palindrome");
			}
		
	}

}
