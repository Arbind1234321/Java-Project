package com.Binarysearch;

public class LargestElementSortedArray {
	public static int pivit(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			//consider 4 case
			int mid = start + (end - start) / 2;
			if (mid<end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (start< mid && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if (arr[start] >= arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			} 

		}
		return -1;

	}

	public static void main(String[] args)
	{
     int []arr= {4,5,6,7,0,1,2};
     System.out.println(pivit(arr));
	}

}
