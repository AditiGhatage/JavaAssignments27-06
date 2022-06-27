package com.assignments;

public class SwapNumbers 
{
	public void swapNumberWithVariable(int intalpha, int intbeta)
	{
		int intTemp;
		 
		System.out.println("Numbers before swapping are:  " +intalpha+" and "+intbeta);
		
		 intTemp = intbeta;
		 intbeta = intalpha;
		 intalpha = intTemp;
		
		System.out.println("Numbers after swapping are: " +intalpha+" and "+intbeta);
		System.out.println("======================================");
	}
	
	public void swapNumberWithoutVariable(int intexp, int intsav)
	{
		System.out.println("Numbers before Swapping:" +intexp+" and "+intsav);
		intexp = intexp +intsav;
		intsav = intexp - intsav;
		intexp = intexp - intsav;
		System.out.println("Numbers after Swapping:" +intexp+" and "+intsav);
		
		
	}

}
