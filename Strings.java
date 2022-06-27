package com.assignments;

import java.util.Arrays;

public class Strings 
{
	//Remove space in string both end
	public void getSpacesRemoved()
	{
		String strhello =" Java Inheritance  ";
		System.out.println("String without trim: "+strhello);
		String strtrim = strhello.trim();
		System.out.println("String after trim:"+strtrim);
	}
	
	//Convert all char in string to lower case
	public void changeCase()
	{
		String strDemo="GREAT POWER";    
        StringBuffer newStrong=new StringBuffer(strDemo);  
        
        for(int index = 0; index < strDemo.length(); index++) {    
                   
             if(Character.isUpperCase(strDemo.charAt(index)))
                 newStrong.setCharAt(index, Character.toLowerCase(strDemo.charAt(index)));    
        }    
        System.out.println("String before case conversion : " + strDemo);    
        System.out.println("String after case conversion : " + newStrong); 
	}

	//Split string
	public String splitString(String strSplit)
	{
		String[] result = strSplit.split(" ");
		System.out.println("Before split: " +strSplit);
		System.out.println("After Split:" +Arrays.toString(result));
		return strSplit;
		
	}
}
