package com.gfgString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountOccurencesofAnagrams {

	public static void main(String[] args) {
     String txt = "forxxorfxdofr", pat = "for";
     System.out.println(search(txt, pat));
	}

	public static int search(String s, String p) {
		int ans = 0; // changed from int to List<Integer>

		int k = p.length();
		if (s.length() < k)
			return ans;

		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < k; i++) {
			char ch = p.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		int count = map.size();
		int i = 0, j = 0;

		while (j < s.length()) {
			char ch = s.charAt(j);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) - 1);
				if (map.get(ch) == 0) {
					count--;
				}
			}

			if (j - i + 1 < k) {
				j++;
			} else if (j - i + 1 == k) {
				if (count == 0) {
					ans++; // store index instead of incrementing an int
				}
				char ch1 = s.charAt(i);
				if (map.containsKey(ch1)) {
					map.put(ch1, map.get(ch1) + 1);
					if (map.get(ch1) == 1) {
						count++;
					}
				}
				i++;
				j++;
			}
		}

		return ans;

	}

}
