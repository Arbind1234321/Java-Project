package geeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternatePositiveNegative {

	public static void main(String[] args) {
		Integer array[] = { 9, 4, -2, -1, 5, 0, -5, -3, 2 };
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(array));
		rearrange(arr);
		System.out.println(arr);
	}

	public static void rearrange(ArrayList<Integer> arr) {
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		for (Integer a : arr) {
			if (a >= 0) {
				pos.add(a);
			} else {
				neg.add(a);
			}
		}
		arr.clear(); // Clear the original array

		int i = 0, j = 0;
		boolean turnPositive = true;

		// Alternate between positive and negative
		while (i < pos.size() && j < neg.size()) {
			if (turnPositive) {
				arr.add(pos.get(i++));
			} else {
				arr.add(neg.get(j++));
			}
			turnPositive = !turnPositive;
		}

		// Append remaining elements
		while (i < pos.size()) {
			arr.add(pos.get(i++));
		}
		while (j < neg.size()) {
			arr.add(neg.get(j++));
		}

	}

}
