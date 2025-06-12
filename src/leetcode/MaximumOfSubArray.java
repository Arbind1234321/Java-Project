package leetcode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MaximumOfSubArray {

	public static void main(String[] args) {
		int[] nums = { 3, 5, 3, 4 };
		int k = 2;
		System.out.println(maximumSubarraySum(nums, k));
	}

	public static long maximumSubarraySum(int[] nums, int k) {

		long max1 = Integer.MIN_VALUE;
		int size = nums.length;
		if (size < k) {
			return 0;
		}
		long sum = 0;
		int i = 0, j = 0;
		HashSet<Integer> set = new HashSet<>();

		while (j < size) {
			// If the element is already in the set, shrink the window
			while (set.contains(nums[j])) {
				sum -= nums[i];
				set.remove(nums[i]);
				i++;
			}

			// Add the current element
			set.add(nums[j]);
			sum += nums[j];

			// Check if the window size is exactly k
			if (j - i + 1 == k) {
				max1 = Math.max(max1, sum);
				// Slide the window
				sum -= nums[i];
				set.remove(nums[i]);
				i++;
			}

			j++;

		}
		return max1;
	}

}
