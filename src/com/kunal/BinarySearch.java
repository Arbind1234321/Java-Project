
package com.kunal;

import java.util.ArrayList;

public class BinarySearch {

	public static void main(String[] args) {
		int [] arr= {2,3,5,9,14,16,18};
		int target=9;
		//ArrayList list=new ArrayList();
		System.out.println(binarySearch(arr,target));
	  // int	index=binarySearchIndex(arr, target);
	   //System.out.println(arr[index-1]);
	  // System.out.println(cellingOfNumber(arr, target));
		//System.out.println(floorOfNumber(arr, target));
	}
	public static boolean binarySearch(int []arr,int target)
	{
		System.out.println("hiii");
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
				return true;
			}
		}
		return false;
	}
	
	//find the index of match element
	
	public static int binarySearchIndex(int []arr,int target)
	{
		
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
		return -1;
	}

	public static int cellingOfNumber(int []arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		if(target>arr[end])
		{
			return -1;
		}
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target<arr[mid])
			{
				end=mid-1;
			}else if(target>arr[mid])
			{
				start=mid+1;
			}
			else {
				return arr[mid];
			}
		}
		
		return arr[start];
		
	}

	
	public static int floorOfNumber(int []arr,int target)
	{
		
		int start=0;
		int end=arr.length-1;
		if(target<arr[start])
		{
			return -1;
		}
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
			else {
				return arr[mid];
			}
		}
		return arr[end];
		
	}

}
