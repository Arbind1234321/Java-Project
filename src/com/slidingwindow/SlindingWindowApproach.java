package com.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SlindingWindowApproach {

	public static void main(String[] args) {
		// int[] arr = { -2, 3, 5, 7, 8, 9, -12 };
		// int size = arr.length;
		// int k = 3;
		// System.out.println(maxSumArray(arr, size, k));
		// System.out.println(Arrays.toString(firstNegative(arr, size, k)));

		String text = "forxxorfxdofr";
		String word = "for";

		System.out.println(countAnagrams(text, word));

	}

	public static int maxSumArray(int[] arr, int size, int windowSize) {
		int start = 0;
		int end = 0;
		int sum = 0;
		int max = 0;
		while (end < size) {
			sum = sum + arr[end];
			if ((end - start + 1) < windowSize) {
				end++;
			} else if ((end - start + 1) == windowSize) {
				max = Math.max(max, sum);
				sum = sum - arr[start];
				start++;
				end++;
			}
		}
		return max;
	}

	public static int[] firstNegative(int[] arr, int size, int k) {
		int[] ans = new int[size - k + 1];
		int i = 0, j = 0, t = 0;
		ArrayList<Integer> list = new ArrayList<>();
		while (j < size) {
			
			if (arr[j] < 0) {
				list.add(arr[j]);

			}
			
			if ((j - i + 1) < k) {
				j++;
			} else if ((j - i + 1) == k) {
				if (list.size() == 0) {
					ans[t++] = 0;
				} else {
					ans[t++] = list.get(0);
				}

				if (list.contains(arr[i])) {
					list.remove(0);
				}
				j++;
				i++;
			}
		}

		return ans;
	}

	// Function to find if two strings are anagrams
	public static boolean areAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		HashMap<Character, Integer> freqMap = new HashMap<>();

		// Increment frequency of characters in s1
		for (char c : s1.toCharArray())
			//freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		freqMap.put(c,freqMap.getOrDefault(c, 0)+1 );

		// Decrement frequency of characters in s2
		for (char c : s2.toCharArray()) {
			if (!freqMap.containsKey(c) || freqMap.get(c) == 0)
				return false;
			freqMap.put(c, freqMap.get(c) - 1);
		}

		return true;
	}

	// Function to count occurrences of anagrams of word in text
	public static int countAnagrams(String text, String word) {
		int res = 0;
		int wordLength = word.length();
		int textLength = text.length();

		for (int i = 0; i <= textLength - wordLength; ++i) {
			String sub = text.substring(i, i + wordLength);
			if (areAnagram(sub, word))
				res++;
		}

		return res;
	}

}
