package com.gfgString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Minimumindexedcharacter1 {

	public static void main(String[] args) {
		String s1 = "geeksforgeeks", s2 = "geek";
		System.out.println(minIndexChar1(s1, s2));
	}

	public static int minIndexChar(String s1, String s2) {
		int index = Integer.MAX_VALUE;
		char s[] = s2.toCharArray();
		Arrays.sort(s);
		System.out.println(s);
		for (int i = 0; i < s2.length(); i++) {
			for (int j = 0; j < s1.length(); j++) {
				if (s1.charAt(j) == s[i]) {

					index = Math.min(index, j);
				}
			}
		}
		if (index == Integer.MAX_VALUE) {
            return -1;
		}
		return index;

	}

	public static int minIndexChar1(String s1, String s2) {
		int index = Integer.MAX_VALUE;
		char s[] = s2.toCharArray();
		ArrayList<Character> list = new ArrayList<>();
		for (Character c : s1.toCharArray()) {
			list.add(c);
		}
		for (Character ch : s) {
			if (list.contains(ch)) {
				index=Math.min(index, list.indexOf(ch));
			}
		}

		if (index == Integer.MAX_VALUE) {
            return -1;
		}
		return index;
	}

}
