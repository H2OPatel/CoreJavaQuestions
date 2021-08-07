package com.as.apex.corejava.datatypes;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	public static void main(String[] args) throws IOException {
		
		char V = 'a';
		CharOccurance co = new CharOccurance();
		File file = new File("C:\\Users\\16309\\OneDrive\\Desktop\\Test.txt");
		  
		  BufferedReader br = new BufferedReader(new FileReader(file));
		  
		  String st;
		  int count = 0;
		  while ((st = br.readLine()) != null) {
			  System.out.println(st);
			  count = co.charOccuredInString(st, V, count);
			  //System.out.println(co.charOccur(st, V));
//			  for(int i=0; i < st.length(); i++)
//			    {    if(st.charAt(i) == V)
//			            count++;
//			    }
 
		  }
		  System.out.println("Total count of " + V + ": " + count);
		    
	}

}
