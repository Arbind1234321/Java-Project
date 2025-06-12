package com.slidingwindow;

public class MaximumSubArray {

	public static void main(String[] args) {
		int arr[]= {2,5,1,8,2,9,1};
		System.out.println(maxSubArray(arr, arr.length, 3));

	}

	public static int maxSubArray(int[] arr, int size, int k) {
		int max = Integer.MIN_VALUE;
		int i = 0, j = 0;
		int sum = 0;
		while (j < size) {
			sum = sum + arr[j];
			if (j - i + 1 < k) {
				j++;
			} else if (j - i + 1 == k) {
				// calculating ans
				max = Math.max(max, sum);
				sum = sum - arr[i];

				i++;
				j++;
			}
		}
		return max;
	}

}
