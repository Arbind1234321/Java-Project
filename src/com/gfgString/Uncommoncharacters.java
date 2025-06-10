package com.gfgString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Uncommoncharacters {

	public static void main(String[] args) {
		// String s1 = "geeksforgeeks", s2 = "geeksquiz";
		String s1 = "characters", s2 = "alphabets";// "bclpr"
		System.out.println(uncommonChars(s1, s2));
	}

	public static String uncommonChars1(String s1, String s2) {
		String st = "";
		Set<Character> set = new HashSet<>();
		Set<Character> set1 = new HashSet<>();
		for (Character ch : s1.toCharArray()) {
			set.add(ch);
		}
		for (Character c : s2.toCharArray()) {
			set1.add(c);
		}
		Set<Character> result = new TreeSet<>();

		for (char ch : set) {
			if (!set1.contains(ch)) {
				result.add(ch);
			}
		}
		for (char ch : set1) {
			if (!set.contains(ch)) {
				result.add(ch);
			}
		}

		for (char c : result) {
			st = st + c;
		}
		return st;
	}

	public static String uncommonChars(String s1, String s2) {
		String st = "";
		Set<Character> set = new HashSet<>();
		Set<Character> set1 = new HashSet<>();
		for (Character ch : s1.toCharArray()) {
			set.add(ch);
		}
		for (Character c : s2.toCharArray()) {
			set1.add(c);
		}
		for (Character ch : set) {
			if (set1.contains(ch)) {
				set1.remove(ch);
			} else {
				set1.add(ch);
			}
		}
		for (char c : set1) {
			st = st + c;
		}
		char[] c = st.toCharArray();
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		String s = "";
		for (char a : c) {
			s = s + a;
		}

		return s;
	}

}
