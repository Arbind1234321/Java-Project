package com.array;

import java.util.HashMap;

//Remove Duplicates from Sorted Array
public class RemoveDuplicateFromArray {
	 public static  int removeDuplicates(int[] nums) {
	        HashMap< Integer, Integer> m=new HashMap<>();
	        int count=0;
	        for(int i=0;i<nums.length;i++)
	        {
	        	if(m.containsKey(nums[i]))
	        	{
	        		
	        	}
	        	else {
					m.put(nums[i], 1);
					nums[count]=nums[i];
					count++;
				}
	        }
	     
		 return count;
	    }
	public static void main(String[] args) {
		int nums[]= {1,1,2};
		int k=removeDuplicates(nums);
		System.out.println(k);
	}

}
