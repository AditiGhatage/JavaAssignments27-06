package com.assignments;

public class ReverseString 
{
	public void reverseStringByChar()
	{
		String strName = "Java is a popular programming language";  
		int size = strName.length();  
  
		System.out.println("Reverse of the string: " + "'" + strName + "'" + " is");  
  
		for(int intLt = 0; intLt < size; intLt++)  
		{  
			System.out.print(strName.charAt(size - intLt - 1));  
		}  
	}
	
	public StringBuilder reverseStringWords(String strName)
	{
		 	String[] words = strName.split(" ");
	        StringBuilder reverseString = new StringBuilder();

	        for (int i = words.length - 1; i >= 0; i--) {
	            reverseString.append(words[i]).append(" ");
	        }
	        System.out.println("\n=================================================");
	        System.out.println("Original String is: "+strName);
	        System.out.println("Reverse Order Of Words in String is: " + reverseString);
	        return reverseString;
		
	}

}
