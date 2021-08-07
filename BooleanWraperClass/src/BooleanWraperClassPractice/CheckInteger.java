package BooleanWraperClassPractice;

public class CheckInteger {
	
	
	
		public  Boolean isInteger(String str) {
		    try {
		        int i = Integer.parseInt(str);
		        return true;
		    } catch (NumberFormatException nfe) {
		      
		    }
		    return false;
		   
		}
}
/*
 * "111" -> parse -> 1, 1, 1 -> Int -> i ->  ??
 * 		Object
 * 				Exception
 * 
 * 				try{
 * 					int x = 1/0;
 * 				} catch (ArithematicException e){
 * 					log.err("cannot divide by 0");
 * 				}
 * 
 * 				catch (Exception e){
 * 					log.err("cannot divide by 0");
 * 				}
 * 
 * 		
 */