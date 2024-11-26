
package com.kunal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		int[] arr = { -1,0,1 ,2, 4, 7, 9 };
		int target = 5;
		//ans =4
		System.out.println(largest(arr, target));
		// System.out.println(floor(arr, target));
		// System.out.println(celling(arr, target));

	}

	public static int largest(int[] arr, int target) {
		int ans = celling(arr, target);
		int ans1 = floor(arr, target);
		int r = target - Math.abs(ans);
		int r1 = target - Math.abs(ans1);
		if ( Math.abs(r) ==  Math.abs(r1)) {
			return ans;
		} else if ( Math.abs(r) >  Math.abs(r1)) {
			return ans1;
		} else {
			return ans;
		}
	}

	public static int celling(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return arr[start];
	}

	public static int floor(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return arr[mid - 1];
			}

		}
		return arr[end];
	}

}