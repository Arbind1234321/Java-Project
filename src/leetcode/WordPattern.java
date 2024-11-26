package leetcode;

import java.util.HashMap;

public class WordPattern {
	public static boolean wordPattern(String pattern, String s) {
		String[] arr = s.split(" ");
		if (pattern.length() != arr.length) {
			return false;
		}
		HashMap<Character, String> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			char ch = pattern.charAt(i);
			if (hm.containsKey(ch)) {
				if (!hm.get(ch).equals(arr[i])) {
					return false;
				}

			} else {
				if(hm.containsValue(arr[i]))
					return false;
				hm.put(ch, arr[i]);
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String pattern = "abba";
		String s = "dog dog dog dog";
		System.out.println(wordPattern(pattern, s));

	}

}
