package com.assignments;

public class SearchArrayElements 
{
	public void searchCommonElements(int intarray1[], int intarray2[], int intarray3[])
	{
		int intx = 0, inty = 0, intz = 0;
		System.out.println("Common elements are:");
		while(intx < intarray1.length && inty < intarray2.length && intz < intarray3.length) { 
			 
            if(intarray1[intx] == intarray2[inty] && intarray2[inty] == intarray3[intz]) 
            { 
            	
                  System.out.println(intarray1[intx]); 
                  	intx++; 
                  	inty++; 
                  	intz++; 
            } else if (intarray1[intx] > intarray2[inty]) {
                   inty++;

             } else if (intarray2[inty] > intarray3[intz]) {
            	 intz++;

             } else {
            	 intx++;
             }
         }
		
	}

}
