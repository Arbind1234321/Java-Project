package geeksForGeeks;

import java.util.Arrays;

public class FirstandSecondSmallests {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 5, 6 };
		int[] a = minAnd2ndMin(arr);
		System.out.println(Arrays.toString(a));
	}

	public static int[] minAnd2ndMin(int arr[]) {
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		for (int num : arr) {
			if (num < min) {
				secondMin = min;
				min = num;
			} else if (num > min && num < secondMin) {
				secondMin = num;
			}
		}

		if (secondMin == Integer.MAX_VALUE) {
			return new int[] { -1 };
		}

		return new int[] { min, secondMin };

	}

}
