package com.Binarysearch;

public class CellingOfNumber {

	public static void main(String[] args)
	{
	  int arr[]= {2,4,5,7,15,17,22,35};
	  int target=36;
	  System.out.println(celling(arr, target));

	}
	public static int celling(int [] arr,int target)
	{
		if(target>arr[arr.length-1])
		{
			return -1;
		}
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target<arr[mid])
			{
				end=mid-1;
			}
			else if(target>arr[mid])
			{
				start=mid+1;
			}
			else
			{
				return mid;
			}
		}
		return start;
	}

}
