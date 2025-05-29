package com.array;
//
public class RemoveElementArray2 {
	 public static  int removeDuplicates(int[] nums) {
	       
	        int count=0;
	        for(int i=0;i<nums.length;i++)
	        {
	        	if(i<nums.length-1&&nums[i]==nums[i+1])
	        	{
	        		continue;
	        	}
	        	else
	        	{
	        		nums[count]=nums[i];
	        		count++;
	        	}
	        	
	        }
		 return count;
	    }
	public static void main(String[] args) {
		int nums[]= {2,2};
		int k=removeDuplicates(nums);
		System.out.println(k);
	}
}
