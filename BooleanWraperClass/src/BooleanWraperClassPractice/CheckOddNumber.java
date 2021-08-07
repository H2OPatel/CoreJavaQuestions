package BooleanWraperClassPractice;

public class CheckOddNumber {

		public Boolean IsOddNumber(String str) {
			CheckInteger ci = new CheckInteger();
			if(ci.isInteger(str)) {
				int strInt = Integer.parseInt(str);
				if(strInt % 2 != 0) {
					return true;
				}
			}
			return false;
				
			
			
}
}
