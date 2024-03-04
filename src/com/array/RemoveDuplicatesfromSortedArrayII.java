package com.array;

public class RemoveDuplicatesfromSortedArrayII {
	public static int removeDuplicates(int[] nums) {

		int count = 1, j = 1, e = nums[0];
		
		for (int i = 1; i<nums.length; i++) {
			if (nums[i]==e && count<2) {
				nums[j] = nums[i];
				j++;
				count++;
			} else if (nums[i] != e){
				e = nums[i];
				count = 1;
				nums[j] = nums[i];
				j++;
			}
		}
		
		for(int i=0;i<j;i++)
		{
			System.out.print(nums[i]);
		}
		// System.out.print(j);
		return j;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 1, 1, 2, 2, 3 };// 11223
		int k = removeDuplicates(nums);
		//System.out.println(k);
	}

}
