package com.array;

import java.util.Arrays;

public class TwosumProblem {
	public static int[] twoSum(int[] nums, int target) {
		int n = nums.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (target == nums[i] + nums[j]) {
					int a[] = { i, j };
					return a;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int nums[] = { 2, 7, 11, 15 };
		int []b=twoSum(nums, 9);
		System.out.println(Arrays.toString(b));

	}

}
