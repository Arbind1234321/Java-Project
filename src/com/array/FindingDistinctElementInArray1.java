package com.array;
//using Xor operator
public class FindingDistinctElementInArray1 {
	
	public static int distinct(int [] a)
	{
		int value=0;
		for(int i=0;i<a.length;i++)
		{
			value=value^a[i];
		}
		return value;
	}

	public static void main(String[] args) {
	int [] a= {2,2,1};
	System.out.println(distinct(a));

	}

}
