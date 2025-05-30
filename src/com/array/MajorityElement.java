package com.array;

public class MajorityElement {
	public static int majorityElement(int[] nums) {

		int count = 0;
		int cand = 0;
		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				cand = nums[i];
			}
			if (cand == nums[i]) {
				count++;
			} else {
				count--;
			}
		}
		return cand;
	}

	public static void main(String[] args) {
		int nums[] = { 2, 2, 2, 4, 4, 6, 77, 77, 23, 56 };
		int k = majorityElement(nums);
		System.out.println(k);
	}

}
