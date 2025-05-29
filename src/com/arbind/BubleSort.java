package com.arbind;

import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) {
		int[] arr = { 4, 1, 3, 9, 7 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void buble(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j <= arr.length - 1 - i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			
			int last = arr.length - i - 1;
			int getmaxindex = getMaxIndex(arr, 0, last);
			swap(arr, getmaxindex, last);
		}
	}

	public static void swap(int[] arr, int getmaxindex, int last) {
		int temp=arr[last];
		arr[last]=arr[getmaxindex];
		arr[getmaxindex]=temp;

	}

	public static int getMaxIndex(int[] arr, int start, int last) {
		
		int max=start;
		for(int i=0;i<=last;i++)
		{
			if(arr[max]<arr[i])
			{
				max=i;
			}
		}
		return max;
	}

}
