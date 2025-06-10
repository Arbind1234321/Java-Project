package geeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;

public class Reversearrayingroups {

	public static void main(String[] args) {

		long arr[] = { 1, 2, 3, 4, 5 };
		int k = 3;

		// Convert primitive array to ArrayList<Long>
		ArrayList<Long> list = new ArrayList<>();
		for (long num : arr) {
			list.add(num);
		}

		System.out.println("Original List: " + list);

		reverseInGroups(list, k);

	}

	public static void reverseInGroups1(ArrayList<Long> arr, int k) {
		int n = arr.size();

		for (int i = 0; i < n; i += k) {
			int left = i;
			int right = Math.min(i + k - 1, n - 1);

			// Reverse sublist in place
			while (left < right) {
				Long temp = arr.get(left);
				arr.set(left, arr.get(right));
				arr.set(right, temp);
				left++;
				right--;
			}
		}

		System.out.println(arr);
	}

	public static void reverseInGroups(ArrayList<Long> arr, int k) {
		int count = 0;

		for (int i = 0; i < k; i++) {
			arr.set(i, arr.get(k - i - 1));

		}
		for (int i = arr.size() - 1; i >= k; i--) {
			count++;
			arr.set(count, arr.get(i));

		}
		System.out.println(arr);

	}

}
