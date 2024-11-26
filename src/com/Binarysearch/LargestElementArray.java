package com.Binarysearch;

import java.util.Arrays;

public class LargestElementArray {

	public static void main(String[] args) {
		int []arr= {0,1,0};
		//System.out.println(largestBySort(arr));
		System.out.println(largestBylinerSearch(arr));
		System.out.println(peakIndexInMountainArray(arr));

	}
	public static int largestBySort(int [] arr)
	{
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
   
	public static int largestBylinerSearch(int [] arr)
	{
		int largest=Integer.MIN_VALUE;
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(largest<=arr[i])
			{
				largest=arr[i];
				index=i;
			}
		}
		return index;
	}
   public static int peakIndexInMountainArray(int[] arr) 
   {
	   int start=0;
	   int end=arr.length-1;
	   while(start<end)
	   {
		   int mid=start+(end-start)/2;
		   if(arr[mid]>arr[mid+1])
		   {
			   //decreasing part of array
			  end=mid; 
		   }
		   else {
			   //ascending par of array
			   start=mid+1;
		   }
	   }
	   return start;
        
   }

}
