package com.pawanselenium;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int []arr= {3,4,1,5,8,2,2};
		System.out.println(Arrays.toString(bubleSort(arr)));
	}
	public static int [] bubleSort(int []arr)
	{
		boolean swap=true;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					swap=false;
				}
			}
			if(swap)
			{
				break;
			}
		}
		
		return arr;
	}

}
