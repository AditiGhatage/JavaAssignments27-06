package com.assignments;

public class TestSearchArrayElements {

	public static void main(String[] args) 
	{
		SearchArrayElements objSearchArrayElements = new SearchArrayElements();
		int intarray1[] = {1,4,6,8,9};
		int intarray2[] = {1,3,4,8};
		int intarray3[] = {2,4,7,5,8,8,9};
		
		objSearchArrayElements.searchCommonElements(intarray1, intarray2, intarray3);

	}

}
