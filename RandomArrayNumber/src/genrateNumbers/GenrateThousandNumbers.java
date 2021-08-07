package genrateNumbers;

import java.util.Random;

public class GenrateThousandNumbers {
	public static void main(String[] args) {
		
		Random rand = new Random();
        for (int iCount = 0; iCount< 1000; iCount++){
          int randomNumber = rand.nextInt(10000);
          System.out.println("Random No "+ (iCount+1) + ":" + randomNumber); 
         }
	}

}
