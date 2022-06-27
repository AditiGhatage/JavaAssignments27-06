package com.assignments;

public class ArmstrongNumber 
{
	int intalpha = 153;
	double intcube = 0;
	int intnumber, intbeta;
	
	public void armstrongNumber()
	{
		intnumber = intalpha;
		while (intnumber > 0)
		{
			intbeta = intnumber%10;
			intcube = intcube + Math.pow(intbeta, 3);
			intnumber = intnumber/10;
		}
		if (intcube == intalpha)
            System.out.println("Given Number is Armstrong Number");
        else
            System.out.println("Given number is Not Armstrong Number");
	}

}
