package Sorting;

import java.util.Arrays;

public class BubbleSort {

	static void bubleSort(int[] arr) {
		boolean swaped;
		// run the step n-1 times
		for (int i = 0; i < arr.length - 1; i++) {
			swaped = false;
			// for each step each max element at last respective index
			for (int j = 1; j < arr.length - i; j++) {
				// swapping
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swaped = true;

				}
			}
			if(!swaped)
			{
				break;
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = {3,1,4,7,2 };
		bubleSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-1]);

	}

}
