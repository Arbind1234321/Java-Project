package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		int n = nums.length;
		HashMap<Integer, Integer> hm = new HashMap();
		for (int i = 0; i < n; i++) {
			int req = target - nums[i];
			if (hm.containsKey(req)) {
				int a[] = { hm.get(req), i };
				return a;
			} else {
				hm.put(nums[i], i);
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(Arrays.toString(twoSum(arr, target)));
	}

}
