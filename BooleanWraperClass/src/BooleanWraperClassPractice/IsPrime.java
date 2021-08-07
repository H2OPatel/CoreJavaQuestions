package BooleanWraperClassPractice;

public class IsPrime {
	public String isPrime(String str) {
		
		//if(ci.isInteger(str)) {
		String p1 = "Not Prime";
		String p2 = "Prime";
			int num = Integer.parseInt(str);
			for (int i=2; i<=(num/2);i++) {
				if(num % i == 0)
					return p1;
			}return p2;
			//
//			return true;
		//}
		//return false;

}}
