package geeksForGeeks;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Minimumsum {

	public static void main(String[] args) {
		int arr[] = { 6, 8, 4, 5, 2, 3 };
		System.out.println(minSum1(arr));

	}

	public static String minSum3(int[] arr) {
		// Convert all integers to digits and collect them
		List<Integer> digits = new ArrayList<>();
		for (int num : arr) {
			while (num > 0) {
				digits.add(num % 10);
				num /= 10;
			}
		}

		// Edge case: all zeroes
		if (digits.isEmpty())
			return "0";

		// Sort digits to form smallest numbers
		Collections.sort(digits);

		// Distribute alternately to two numbers
		StringBuilder num1 = new StringBuilder();
		StringBuilder num2 = new StringBuilder();
		for (int i = 0; i < digits.size(); i++) {
			if (i % 2 == 0)
				num1.append(digits.get(i));
			else
				num2.append(digits.get(i));
		}

		// Return their sum using custom add function
		return addStrings(num1.toString(), num2.toString());
	}

// Custom string-based addition (faster than BigInteger for this use-case)
	private static String addStrings(String num1, String num2) {
		StringBuilder result = new StringBuilder();

		int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
		
		while (i >= 0 || j >= 0 || carry > 0) {
			int n1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
			int n2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

			int sum = n1 + n2 + carry;
			result.append(sum % 10);
			carry = sum / 10;
		}

		return result.reverse().toString();
	}

	public static String minSum1(int[] arr) {
		int n = arr.length;
		if (n == 1) {
			// return arr[0]+"";
			return Integer.toString(arr[0]);
		}
		Arrays.sort(arr);
		String s = "";
		String s1 = "";
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				s = s + arr[i];
			} else {
				s1 = s1 + arr[i];
			}
		}
		long m = Long.parseLong(s);

		long p = Long.parseLong(s1);
		long sum = m + p;
		return sum + "";

	}

	public static String minSum(int[] arr) {
		if (arr.length == 0) {
			// return arr[0]+"";
			return Integer.toString(arr[0]);
		}
		Arrays.sort(arr);
		StringBuilder sum1 = new StringBuilder();
		StringBuilder sum2 = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				sum1.append(arr[i]);
			} else {
				sum2.append(arr[i]);
			}

		}
		BigInteger num1 = new BigInteger(sum1.toString());
		BigInteger num2 = new BigInteger(sum2.toString());
		return num1.add(num2).toString();

	}

}
