package com.array;

public class MaximumSumOfArray {

	public static void main(String[] args) {
//		int arr[] = { 3, 44, 6, -5, 6, 23, 44 };// 73
//		int n = arr.length;
//		int max = 0;
//
//		for (int i = 0; i < n - 3; i++) {
//			
//			int sum = 0;
//			 
//			for (int k = i; k < 3 + i; k++) {
//			
//				sum = sum + arr[k];
//				
//			}
//			if (max < sum) {
//				max = sum;
//			}
//		}
//		System.out.println(max);
	
		 int[] a = {2, 9, 31, -4, 21,56};
	        int k = 3;
	        int msum = findMaxSumSubarray(a, k);
	        System.out.println("Maximum sum subarray of length " + k + ": " + msum);
	    }

	    private static int findMaxSumSubarray(int[] a, int k) {
	        int n = a.length;
	        int msum = 0;

	        for (int i = 0; i <= n - k; i++) {
	            int csum = 0;
	            for (int j = i; j < i + k; j++) {
	                csum = csum + a[j];
	            }
	            msum = Math.max(csum, msum);
	        }

	        return msum;
	    
		

	}

}
