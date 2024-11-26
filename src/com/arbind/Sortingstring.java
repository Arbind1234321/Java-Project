package com.arbind;

import java.util.Arrays;

//Write a java program to  to sort String According to length and convert first character to upper case;
public class Sortingstring {
	public static void main(String[] args) {
		String s = "this is cat problem for A rat";
		String ss[] = s.split(" ");
		System.out.println(Arrays.toString(sort(ss)));// [a, is, cat, for, rat, This, problem]
		// Arrays.sort(ss);
		// System.out.println(Arrays.toString(ss));
		// firstUpperCase(ss);

	}

	public static String[] sortedString(String[] ss) {
		for (int i = 0; i < ss.length; i++) {
			for (int j = 1; j < ss.length - i; j++) {
				if (ss[j].length() < ss[j - 1].length()) {
					String temp = ss[j - 1];
					ss[j - 1] = ss[j];
					ss[j] = temp;
				}
			}
		}
		return ss;
	}

	public static void firstUpperCase(String[] ss) {
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i].substring(0, 1).toUpperCase() + ss[i].substring(1));
		}
	}

	public static String[] sort(String[] ss) {
		for (int i = 0; i < ss.length; i++) {

			for (int j = 1; j < ss.length - i; j++) {
				if (ss[j].length() < ss[j - 1].length()) {
					String temp = ss[j - 1];
					ss[j - 1] = ss[j];
					ss[j] = temp;

				}
			}
		}
		
    return ss;
	}

}
