package com.demo;

public class Demo {
	public static void main(String[] args)
	{
     int arr[]= {2,4,5,7,10,12,16};
     int target =7;
     System.out.println(indexOfNumber(arr, target));
	}
	public static int indexOfNumber(int []arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(target<arr[mid])
			{
				end=mid-1;
				
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}

	public static boolean isSorted(int []arr)
	{
		int start=0;
		int end=arr.length-1;
		return false;
	}
}
