package com.gfgString;
public class AnagramofString {

	public static void main(String[] args) {
		String s1="basgadhbfgvhads";
        //sjdhgvbjdsbhvbvd
		String s2="sjdhgvbjdsbhvbvd";
		System.out.println(remAnagrams(s1, s2));

	}
	public static int remAnagrams(String s1, String s2) {
		int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Count characters in s1
        for (char ch : s1.toCharArray()) {
            count1[ch - 'a']++;
        }

        // Count characters in s2
        for (char ch : s2.toCharArray()) {
            count2[ch - 'a']++;
        }

        int deletions = 0;

        // Compute total deletions required
        for (int i = 0; i < 26; i++) {
            deletions += Math.abs(count1[i] - count2[i]);
        }

        return deletions;
	}
}
