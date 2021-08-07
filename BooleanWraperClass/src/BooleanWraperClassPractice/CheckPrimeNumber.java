package BooleanWraperClassPractice;

public class CheckPrimeNumber {

//		public Boolean IsPrimeNumber(String str) {
//	
//			int strInt = Integer.parseInt(str);
//			 int  i = 2;
//			    boolean flag = false;
//			    while (i <= strInt / 2) {
//			    
//			      if (strInt % i == 0) {
//			        flag = true;
//			        break;
//			      }
//
//			      ++i;
//			    }
//
//			    if (!flag)
//			    	return true;
//			    else
//			    	return false;
//
//	
//		}
		
		public Boolean isPrimeNumber1(String str) {
			Boolean isPrime;
			CheckInteger ci = new CheckInteger();
			if(ci.isInteger(str)) {
				int num = Integer.parseInt(str);
				for (int i=2; i<=(num/2);i++) {
					if(num % i == 0)
						return true;
				}
				//
				return true;
			}
			return false;
			
		}
}
