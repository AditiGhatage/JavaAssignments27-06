package com.assignments;

public class PrimeFactorials 
{
	int intnumber=0;
	int intextra=0;
	String primeNumbers, Factorials;
	
	public void primeNumber()
	{
		for(intnumber= 1; intnumber<=100; intnumber++)
		{
			int intcounter = 0;
			for(intextra=intnumber; intextra>=1; intextra--)
			{
				if (intnumber%intextra==0) 
					intcounter=intcounter+1;	
			}
		if (intcounter==2)
			primeNumbers = primeNumbers + intnumber + " ";
		}
		System.out.println("Prime Numbers between 1 to 100 are: " +primeNumbers);
		System.out.println("======================================");
	}
	
	public void getfactorial()
	{
		int intnum = 10;
        long factorial = 1;
        for(int i = 1; i <= intnum; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d is = %d", intnum, factorial);
	}
}
