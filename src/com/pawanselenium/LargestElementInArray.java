package com.pawanselenium;

public class LargestElementInArray {

	public static void main(String[] args) {
		int arr[] = { 13817, 15695, 4474, 8356, 12695, 24341, 8839, 28059, 8337, 3532 };
		System.out.println(largestNumber(arr));

	}
	public static int largestNumber(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;
	}

	}


