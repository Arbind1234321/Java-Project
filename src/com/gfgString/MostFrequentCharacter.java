package com.gfgString;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class MostFrequentCharacter {

	public static void main(String[] args) {
		System.out.println(getMaxOccuringChar("testsample"));

	}

	public static char getMaxOccuringChar(String s) {
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for (Character ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		Set<Character> set = map.keySet();
		int max = 0;
		for (char key : set) {
			max = Math.max(max, map.get(key));
		}

		int min1 = Integer.MAX_VALUE;
		for (char key : set) {
			if (map.get(key) == max) {
				min1 = Math.min(min1, (int) key);

			}
		}

		return (char) min1;

	}

}
