package leetcode;

import java.util.HashMap;

public class IsomerphicString {
	public static boolean isomerphic(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		HashMap<Character, Character> hm = new HashMap<>();//map
		for (int i = 0; i < s1.length(); i++) {

			if (!hm.containsKey(s1.charAt(i))) {
				if (!hm.containsValue(s2.charAt(i))) {
					hm.put(s1.charAt(i), s2.charAt(i));
				} else {
					return false;
				}
			} else {
				char cm = hm.get(s1.charAt(i));
				if (cm != s2.charAt(i)) {
					return false;
				}
			}

		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "egt";
		String s2 = "adf";
		System.out.println(isomerphic(s1, s2));
	}

}
