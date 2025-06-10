package leetcode;

import java.util.HashMap;

public class SingleElementinaSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 3, 7, 7, 10, 11, 11 };
		System.out.println(singleNonDuplicate(nums));
	}

	public static int singleNonDuplicate(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int a : nums) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}
		for (int x : map.keySet()) {
			if (map.get(x) == 1) {
				return x;
			}
		}
		return 0;

	}

	// using binary search
	public static int singleNonDuplicate1(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			// to ensumre mid is even
			if (mid % 2 == 1) {
				mid--;
			}
			if (nums[mid] == nums[mid + 1]) {
				start = mid + 2;
			} else {
				end = mid;
			}

		}
		return nums[start];

	}

}
