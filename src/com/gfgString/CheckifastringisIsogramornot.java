package com.gfgString;

import java.util.HashMap;

public class CheckifastringisIsogramornot {

	public static void main(String[] args) {

	}

	public static boolean isIsogram(String data) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : data.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (char c : map.keySet()) {
			if (map.get(c) >= 2) {
				return false;
			}
		}
		return true;

	}
	public static boolean isIsogram1(String data) {
		int arr[]=new int[26];
		for(char c:data.toCharArray()) {
			arr[c-'a']++;
			if(arr[c-'a']>=2)
			{
				return false;
			}
		}
		return true;

	}

}
