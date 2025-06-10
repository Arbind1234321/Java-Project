package geeksForGeeks;

import java.util.ArrayList;
import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abaaa", s2 = "abbaa";
		System.out.println(areAnagrams1(s1, s2));

	}

	public static boolean areAnagrams1(String s1, String s2) {
		ArrayList<Character> list = new ArrayList<>();
		for (Character ch : s1.toCharArray()) {
			list.add(ch);
		}
		for (Character ch : s2.toCharArray()) {
			if (list.contains(ch))
				list.remove(ch);
			else {
				list.add(ch);
			}
		}
		if (list.isEmpty()) {
			return true;
		} else
			return false;
	}

	public static boolean areAnagrams(String s1, String s2) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (char ch : s1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (char ch : s2.toCharArray()) {
			if (!map.containsKey(ch) || map.get(ch) == 0) {
				return false;
			}
			map.put(ch, map.get(ch) - 1);
		}
		return true;
	}

}
