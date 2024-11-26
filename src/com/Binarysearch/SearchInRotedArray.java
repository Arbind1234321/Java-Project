package com.Binarysearch;

public class SearchInRotedArray {
	public static int search(int []nums,int target)
	{
		int start=0;
		int end=nums.length-1;
		while(start<=end)
		{
			 int mid=start+(end-start)/2;
			 
			 if(target<nums[mid])
			 {
				 end=mid-1;
			 }
			 else if(target>nums[mid])
			 {
				 start=mid+1;
			 }
			 else {
				 return mid;
			 }
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,5,6,7,9,11};
		int target=0;
		System.out.println(search(arr, target));

	}

}
