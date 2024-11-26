package com.Binarysearch;

public class RotationCount {

	public static void main(String[] args) {
	  int []arr= {2,3,4,5,1};
	  System.out.println(rotation(arr));
	}
	public static int rotation(int []arr)
	{
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid <end &&arr[mid]>arr[mid+1])
			{
				return arr[mid+1];
			}
			if(start<mid&&arr[mid]<arr[mid-1])
			{
				return arr[mid];
			}
			if (arr[start] >= arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			} 
			
		}
		return arr[0];
	}

}
