package Apex;

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
