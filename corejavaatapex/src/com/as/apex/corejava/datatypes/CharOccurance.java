package com.as.apex.corejava.datatypes;

public class CharOccurance {
	public int charOccuredInString(String str, char a, int curretCount)
	{
//	    int count = 0;

	    for(int i=0; i < str.length(); i++)
	    {    if(str.charAt(i) == a)
	    	curretCount++;
	    }

	    return curretCount;
	}

}
