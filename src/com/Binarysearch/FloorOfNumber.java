package com.Binarysearch;

public class FloorOfNumber {

	public static void main(String[] args)
	{
		int arr[]= {3 ,6 ,6};
		  int target=5;
		  System.out.println(floor(arr, target));

	}
	
	public static int floor(int [] arr,int target)
	{
		
		int start=0;
		int end=arr.length-1;
		int ans=-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target<arr[mid])
			{
				end=mid-1;
			}
			else if(target>arr[mid])
			{
				ans = mid; 
				start=mid+1;
			}
			else
			{
				return mid-1;
			}
		}
		return ans;
	}
}
